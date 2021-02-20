package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitTextParameters extends StObject {
  
  /** ID of the context where the text will be committed */
  var contextID: Double = js.native
  
  /** The text to commit */
  var text: String = js.native
}
object CommitTextParameters {
  
  @scala.inline
  def apply(contextID: Double, text: String): CommitTextParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitTextParameters]
  }
  
  @scala.inline
  implicit class CommitTextParametersMutableBuilder[Self <: CommitTextParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
