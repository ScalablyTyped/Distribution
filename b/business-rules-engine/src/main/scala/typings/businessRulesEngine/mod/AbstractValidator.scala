package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("business-rules-engine", "AbstractValidator")
@js.native
open class AbstractValidator[T] ()
  extends StObject
     with IAbstractValidator[T] {
  
  var AbstractValidators: StringDictionary[IAbstractValidator[Any]] = js.native
  
  /* CompleteClass */
  override def CreateAbstractListRule(name: String): IAbstractValidationRule[Any] = js.native
  
  /* CompleteClass */
  override def CreateAbstractRule(name: String): IAbstractValidationRule[Any] = js.native
  
  /* CompleteClass */
  override def CreateRule(name: String): IAbstractValidationRule[Any] = js.native
  
  /* CompleteClass */
  var ForList: Boolean = js.native
  
  /* CompleteClass */
  override def RuleFor(prop: String, validator: IPropertyValidator): Any = js.native
  
  /* CompleteClass */
  override def Validation(validatorFce: IValidatorFce): Any = js.native
  
  /* CompleteClass */
  override def ValidationFor(prop: String, validatorFce: IValidatorFce): Any = js.native
  
  var ValidationFunctions: StringDictionary[js.Array[IValidatorFce]] = js.native
  
  /* CompleteClass */
  override def ValidatorFor[K](prop: String, validator: IAbstractValidator[K]): Any = js.native
  def ValidatorFor[K](prop: String, validator: IAbstractValidator[K], forList: Boolean): Unit = js.native
  
  var Validators: StringDictionary[js.Array[IPropertyValidator]] = js.native
}
