package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("business-rules-engine", "ValidationResult")
@js.native
open class ValidationResult protected ()
  extends StObject
     with IValidationResult {
  def this(Name: String) = this()
  
  /* CompleteClass */
  override def Add(validationResult: IValidationResult): Unit = js.native
  
  /* CompleteClass */
  var Children: js.Array[IValidationResult] = js.native
  
  /* CompleteClass */
  var ErrorCount: Double = js.native
  
  /* CompleteClass */
  var ErrorMessage: String = js.native
  
  /* CompleteClass */
  var HasErrors: Boolean = js.native
  
  /* CompleteClass */
  var HasErrorsDirty: Boolean = js.native
  
  var IsDirty: Boolean = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  @JSName("Optional")
  def Optional_MValidationResult(): Boolean = js.native
  @JSName("Optional")
  var Optional_Original: IOptional = js.native
  
  /* CompleteClass */
  override def Remove(index: Double): Unit = js.native
  
  @JSName("TranslateArgs")
  var TranslateArgs_ValidationResult: js.Array[IErrorTranslateArgs] = js.native
}
