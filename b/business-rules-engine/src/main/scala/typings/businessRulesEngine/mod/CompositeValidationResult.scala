package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("business-rules-engine", "CompositeValidationResult")
@js.native
class CompositeValidationResult protected () extends IValidationResult {
  def this(Name: String) = this()
  var Errors: StringDictionary[IValidationResult] = js.native
  var FlattenErros: js.Any = js.native
  @JSName("Optional")
  var Optional_Original: IOptional = js.native
  @JSName("TranslateArgs")
  var TranslateArgs_CompositeValidationResult: js.Array[IErrorTranslateArgs] = js.native
  def AddFirst(error: IValidationResult): Unit = js.native
  def LogErrors(): Unit = js.native
  def LogErrors(headerMessage: String): Unit = js.native
  @JSName("Optional")
  def Optional_MCompositeValidationResult(): Boolean = js.native
  def SetDirty(): Unit = js.native
  /* private */ def SetDirtyEx(node: js.Any, dirty: js.Any): js.Any = js.native
  def SetPristine(): Unit = js.native
  /* private */ def flattenErrors(node: js.Any, errorCollection: js.Any): js.Any = js.native
  /* private */ def traverse(node: js.Any, indent: js.Any): js.Any = js.native
}

