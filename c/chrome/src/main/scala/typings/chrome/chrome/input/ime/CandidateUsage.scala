package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CandidateUsage extends StObject {
  
  /** The body string of detail description. */
  var body: String = js.native
  
  /** The title string of details description. */
  var title: String = js.native
}
object CandidateUsage {
  
  @scala.inline
  def apply(body: String, title: String): CandidateUsage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidateUsage]
  }
  
  @scala.inline
  implicit class CandidateUsageMutableBuilder[Self <: CandidateUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
