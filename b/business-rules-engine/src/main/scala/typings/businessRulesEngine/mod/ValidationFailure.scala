package typings.businessRulesEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("business-rules-engine", "ValidationFailure")
@js.native
class ValidationFailure protected ()
  extends StObject
     with IError {
  def this(Error: IError, IsAsync: Boolean) = this()
  
  var Error: IError = js.native
  
  /* CompleteClass */
  var ErrorMessage: String = js.native
  
  /* CompleteClass */
  var HasError: Boolean = js.native
  
  var IsAsync: Boolean = js.native
  
  @JSName("TranslateArgs")
  var TranslateArgs_ValidationFailure: IErrorTranslateArgs = js.native
}
