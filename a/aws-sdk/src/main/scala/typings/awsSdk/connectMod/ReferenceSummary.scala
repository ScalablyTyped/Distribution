package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferenceSummary extends StObject {
  
  /**
    * Information about the reference when the referenceType is ATTACHMENT. Otherwise, null.
    */
  var Attachment: js.UndefOr[AttachmentReference] = js.undefined
  
  /**
    * Information about a reference when the referenceType is DATE. Otherwise, null.
    */
  var Date: js.UndefOr[DateReference] = js.undefined
  
  /**
    * Information about a reference when the referenceType is EMAIL. Otherwise, null.
    */
  var Email: js.UndefOr[EmailReference] = js.undefined
  
  /**
    * Information about a reference when the referenceType is NUMBER. Otherwise, null.
    */
  var Number: js.UndefOr[NumberReference] = js.undefined
  
  /**
    * Information about a reference when the referenceType is STRING. Otherwise, null.
    */
  var String: js.UndefOr[StringReference] = js.undefined
  
  /**
    * Information about the reference when the referenceType is URL. Otherwise, null.
    */
  var Url: js.UndefOr[UrlReference] = js.undefined
}
object ReferenceSummary {
  
  inline def apply(): ReferenceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferenceSummary]
  }
  
  extension [Self <: ReferenceSummary](x: Self) {
    
    inline def setAttachment(value: AttachmentReference): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    inline def setDate(value: DateReference): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    inline def setEmail(value: EmailReference): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setNumber(value: NumberReference): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "Number", js.undefined)
    
    inline def setString(value: StringReference): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "String", js.undefined)
    
    inline def setUrl(value: UrlReference): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
