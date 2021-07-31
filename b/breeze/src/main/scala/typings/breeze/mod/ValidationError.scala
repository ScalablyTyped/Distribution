package typings.breeze.mod

import typings.breeze.breeze.IProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "ValidationError")
@js.native
class ValidationError protected ()
  extends StObject
     with typings.breeze.breeze.ValidationError {
  def this(validator: typings.breeze.breeze.Validator, context: js.Any, errorMessage: String, key: String) = this()
  
  /* CompleteClass */
  var context: js.Any = js.native
  
  /* CompleteClass */
  var errorMessage: String = js.native
  
  /* CompleteClass */
  override def getKey(validator: typings.breeze.breeze.Validator, property: String): String = js.native
  
  /* CompleteClass */
  var key: String = js.native
  
  /* CompleteClass */
  var property: IProperty = js.native
  
  /* CompleteClass */
  var propertyName: String = js.native
  
  /* CompleteClass */
  var validator: typings.breeze.breeze.Validator = js.native
}
