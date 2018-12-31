package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractValidationRule[T] extends js.Object {
  var Children: org.scalablytyped.runtime.StringDictionary[IAbstractValidationRule[_]]
  var Rules: org.scalablytyped.runtime.StringDictionary[IPropertyValidationRule[T]]
  var ValidationResult: IValidationResult
  var Validators: org.scalablytyped.runtime.StringDictionary[IValidator]
  def Validate(context: T): IValidationResult
  def ValidateAll(context: T): qLib.qMod.QNs.Promise[IValidationResult]
  def ValidateAsync(context: T): qLib.qMod.QNs.Promise[IValidationResult]
  def ValidateProperty(context: T, propName: java.lang.String): scala.Unit
}

