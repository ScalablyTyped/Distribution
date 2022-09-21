package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("business-rules-engine", "CompositeValidationResult")
@js.native
open class CompositeValidationResult protected ()
  extends StObject
     with IValidationResult {
  def this(Name: String) = this()
  
  /* CompleteClass */
  override def Add(validationResult: IValidationResult): Unit = js.native
  
  def AddFirst(error: IValidationResult): Unit = js.native
  
  /* CompleteClass */
  var Children: js.Array[IValidationResult] = js.native
  
  /* CompleteClass */
  var ErrorCount: Double = js.native
  
  /* CompleteClass */
  var ErrorMessage: String = js.native
  
  var Errors: StringDictionary[IValidationResult] = js.native
  
  /* private */ var FlattenErros: Any = js.native
  
  /* CompleteClass */
  var HasErrors: Boolean = js.native
  
  /* CompleteClass */
  var HasErrorsDirty: Boolean = js.native
  
  def LogErrors(): Unit = js.native
  def LogErrors(headerMessage: String): Unit = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  @JSName("Optional")
  def Optional_MCompositeValidationResult(): Boolean = js.native
  @JSName("Optional")
  var Optional_Original: IOptional = js.native
  
  /* CompleteClass */
  override def Remove(index: Double): Unit = js.native
  
  def SetDirty(): Unit = js.native
  
  /* private */ def SetDirtyEx(node: Any, dirty: Any): Any = js.native
  
  def SetPristine(): Unit = js.native
  
  @JSName("TranslateArgs")
  var TranslateArgs_CompositeValidationResult: js.Array[IErrorTranslateArgs] = js.native
  
  /* private */ def flattenErrors(node: Any, errorCollection: Any): Any = js.native
  
  /* private */ def traverse(node: Any, indent: Any): Any = js.native
}
