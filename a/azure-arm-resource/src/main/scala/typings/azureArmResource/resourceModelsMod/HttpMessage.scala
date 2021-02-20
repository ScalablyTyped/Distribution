package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpMessage extends StObject {
  
  /**
    * HTTP message content.
    */
  var content: js.UndefOr[js.Any] = js.native
}
object HttpMessage {
  
  @scala.inline
  def apply(): HttpMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpMessage]
  }
  
  @scala.inline
  implicit class HttpMessageMutableBuilder[Self <: HttpMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
