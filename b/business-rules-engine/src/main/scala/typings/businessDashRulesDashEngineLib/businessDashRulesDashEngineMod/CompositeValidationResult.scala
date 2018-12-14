package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine", "CompositeValidationResult")
@js.native
class CompositeValidationResult protected () extends IValidationResult {
  def this(Name: java.lang.String) = this()
  /* CompleteClass */
  override var Children: js.Array[IValidationResult] = js.native
  /* CompleteClass */
  override var ErrorCount: scala.Double = js.native
  /* CompleteClass */
  override var ErrorMessage: java.lang.String = js.native
  var Errors: org.scalablytyped.runtime.StringDictionary[IValidationResult] = js.native
  var FlattenErros: js.Any = js.native
  /* CompleteClass */
  override var HasErrors: scala.Boolean = js.native
  /* CompleteClass */
  override var HasErrorsDirty: scala.Boolean = js.native
  /* CompleteClass */
  override var Name: java.lang.String = js.native
  @JSName("Optional")
  var Optional_Original: IOptional = js.native
  @JSName("TranslateArgs")
  var TranslateArgs_CompositeValidationResult: js.Array[IErrorTranslateArgs] = js.native
  /* CompleteClass */
  override def Add(validationResult: IValidationResult): scala.Unit = js.native
  def AddFirst(error: IValidationResult): scala.Unit = js.native
  def LogErrors(): scala.Unit = js.native
  def LogErrors(headerMessage: java.lang.String): scala.Unit = js.native
  @JSName("Optional")
  def Optional_MCompositeValidationResult(): scala.Boolean = js.native
  /* CompleteClass */
  override def Remove(index: scala.Double): scala.Unit = js.native
  def SetDirty(): scala.Unit = js.native
  /* private */ def SetDirtyEx(node: js.Any, dirty: js.Any): js.Any = js.native
  def SetPristine(): scala.Unit = js.native
  /* private */ def flattenErrors(node: js.Any, errorCollection: js.Any): js.Any = js.native
  /* private */ def traverse(node: js.Any, indent: js.Any): js.Any = js.native
}

