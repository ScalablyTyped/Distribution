package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("business-rules-engine", "AbstractValidator")
@js.native
class AbstractValidator[T] () extends IAbstractValidator[T] {
  
  var AbstractValidators: StringDictionary[IAbstractValidator[_]] = js.native
  
  var ValidationFunctions: StringDictionary[js.Array[IValidatorFce]] = js.native
  
  def ValidatorFor[K](prop: String, validator: IAbstractValidator[K], forList: Boolean): Unit = js.native
  
  var Validators: StringDictionary[js.Array[IPropertyValidator]] = js.native
}
