package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EsamSignalProcessingNotification extends js.Object {
  
  /**
    * Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. Form the XML document as per OC-SP-ESAM-API-I03-131025. The transcoder will use the signal processing instructions in the message that you supply. Provide your ESAM SignalProcessingNotification XML document inside your JSON job settings. For your MPEG2-TS file outputs, if you want the service to place SCTE-35 markers at the insertion points you specify in the XML document, you must also enable SCTE-35 ESAM (scte35Esam). Note that you can either specify an ESAM XML document or enable SCTE-35 passthrough. You can't do both.
    */
  var SccXml: js.UndefOr[stringPatternSNSignalProcessingNotificationNS] = js.native
}
object EsamSignalProcessingNotification {
  
  @scala.inline
  def apply(): EsamSignalProcessingNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EsamSignalProcessingNotification]
  }
  
  @scala.inline
  implicit class EsamSignalProcessingNotificationOps[Self <: EsamSignalProcessingNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSccXml(value: stringPatternSNSignalProcessingNotificationNS): Self = this.set("SccXml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSccXml: Self = this.set("SccXml", js.undefined)
  }
}
