package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@chevrotain/types", "NotAllInputParsedException")
@js.native
open class NotAllInputParsedException protected ()
  extends StObject
     with IRecognitionException {
  def this(message: String, token: IToken) = this()
  
  /* CompleteClass */
  var context: IRecognizerContext = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Additional tokens which have been re-synced in error recovery due to the original error.
    * This information can be used the calculate the whole text area which has been skipped due to an error.
    * For example for displaying with a red underline in a text editor.
    */
  /* CompleteClass */
  var resyncedTokens: js.Array[IToken] = js.native
  
  /**
    * The token which caused the parser error.
    */
  /* CompleteClass */
  var token: IToken = js.native
}
