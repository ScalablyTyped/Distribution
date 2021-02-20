package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileValidationMessage extends StObject {
  
  /**
    * The message content.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * The message title.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The message type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object FileValidationMessage {
  
  @scala.inline
  def apply(): FileValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileValidationMessage]
  }
  
  @scala.inline
  implicit class FileValidationMessageMutableBuilder[Self <: FileValidationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
