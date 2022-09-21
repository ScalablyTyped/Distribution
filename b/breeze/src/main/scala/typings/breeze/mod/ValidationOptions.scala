package typings.breeze.mod

import typings.breeze.breeze.ValidationOptionsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "ValidationOptions")
@js.native
open class ValidationOptions ()
  extends StObject
     with typings.breeze.breeze.ValidationOptions {
  def this(config: ValidationOptionsConfiguration) = this()
  
  /* CompleteClass */
  override def setAsDefault(): typings.breeze.breeze.ValidationOptions = js.native
  
  /* CompleteClass */
  override def `using`(config: ValidationOptionsConfiguration): typings.breeze.breeze.ValidationOptions = js.native
  
  /* CompleteClass */
  var validateOnAttach: Boolean = js.native
  
  /* CompleteClass */
  var validateOnPropertyChange: Boolean = js.native
  
  /* CompleteClass */
  var validateOnQuery: Boolean = js.native
  
  /* CompleteClass */
  var validateOnSave: Boolean = js.native
}
/* static members */
object ValidationOptions {
  
  @JSImport("breeze", "ValidationOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "ValidationOptions.defaultInstance")
  @js.native
  def defaultInstance: typings.breeze.breeze.ValidationOptions = js.native
  inline def defaultInstance_=(x: typings.breeze.breeze.ValidationOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
}
