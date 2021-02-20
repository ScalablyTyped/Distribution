package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentInformation extends StObject {
  
  /**
    * The name of the attachment.
    */
  var Name: js.UndefOr[AttachmentName] = js.native
}
object AttachmentInformation {
  
  @scala.inline
  def apply(): AttachmentInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentInformation]
  }
  
  @scala.inline
  implicit class AttachmentInformationMutableBuilder[Self <: AttachmentInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: AttachmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
