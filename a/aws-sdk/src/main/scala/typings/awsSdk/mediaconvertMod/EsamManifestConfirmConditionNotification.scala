package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EsamManifestConfirmConditionNotification extends StObject {
  
  /**
    * Provide your ESAM ManifestConfirmConditionNotification XML document inside your JSON job settings. Form the XML document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest Conditioning instructions in the message that you supply.
    */
  var MccXml: js.UndefOr[stringPatternSNManifestConfirmConditionNotificationNS] = js.native
}
object EsamManifestConfirmConditionNotification {
  
  @scala.inline
  def apply(): EsamManifestConfirmConditionNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EsamManifestConfirmConditionNotification]
  }
  
  @scala.inline
  implicit class EsamManifestConfirmConditionNotificationMutableBuilder[Self <: EsamManifestConfirmConditionNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMccXml(value: stringPatternSNManifestConfirmConditionNotificationNS): Self = StObject.set(x, "MccXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMccXmlUndefined: Self = StObject.set(x, "MccXml", js.undefined)
  }
}
