package typings.bson.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "BSONError")
@js.native
open class BSONError protected ()
  extends StObject
     with Error {
  def this(message: String) = this()
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  @JSName("name")
  def name_MBSONError: String = js.native
}
