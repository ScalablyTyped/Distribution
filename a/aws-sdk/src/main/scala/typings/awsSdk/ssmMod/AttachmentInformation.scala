package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentInformation extends StObject {
  
  /**
    * The name of the attachment.
    */
  var Name: js.UndefOr[AttachmentName] = js.undefined
}
object AttachmentInformation {
  
  inline def apply(): AttachmentInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentInformation]
  }
  
  extension [Self <: AttachmentInformation](x: Self) {
    
    inline def setName(value: AttachmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
