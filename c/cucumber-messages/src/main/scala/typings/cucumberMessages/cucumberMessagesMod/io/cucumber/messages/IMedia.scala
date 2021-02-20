package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Media.Encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Media. */
@js.native
trait IMedia extends StObject {
  
  /**
    * The content type of the data. This can be any valid
    * [IANA Media Type](https://www.iana.org/assignments/media-types/media-types.xhtml)
    * as well as Cucumber-specific media types such as `text/x.cucumber.gherkin+plain`
    * and `text/x.cucumber.stacktrace+plain`
    */
  var contentType: js.UndefOr[String | Null] = js.native
  
  /** Media encoding */
  var encoding: js.UndefOr[Encoding | Null] = js.native
}
object IMedia {
  
  @scala.inline
  def apply(): IMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMedia]
  }
  
  @scala.inline
  implicit class IMediaMutableBuilder[Self <: IMedia] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setEncoding(value: Encoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
