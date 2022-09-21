package typings.cesium.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "RuntimeError")
@js.native
open class RuntimeError ()
  extends StObject
     with Error {
  def this(message: String) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * The stack trace of this exception, if available.
    */
  @JSName("stack")
  val stack_RuntimeError: String = js.native
}
