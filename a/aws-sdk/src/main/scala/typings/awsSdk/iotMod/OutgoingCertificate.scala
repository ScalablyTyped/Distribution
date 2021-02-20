package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutgoingCertificate extends StObject {
  
  /**
    * The certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  
  /**
    * The certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  
  /**
    * The certificate creation date.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  
  /**
    * The date the transfer was initiated.
    */
  var transferDate: js.UndefOr[DateType] = js.native
  
  /**
    * The transfer message.
    */
  var transferMessage: js.UndefOr[Message] = js.native
  
  /**
    * The AWS account to which the transfer was made.
    */
  var transferredTo: js.UndefOr[AwsAccountId] = js.native
}
object OutgoingCertificate {
  
  @scala.inline
  def apply(): OutgoingCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutgoingCertificate]
  }
  
  @scala.inline
  implicit class OutgoingCertificateMutableBuilder[Self <: OutgoingCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setTransferDate(value: DateType): Self = StObject.set(x, "transferDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferDateUndefined: Self = StObject.set(x, "transferDate", js.undefined)
    
    @scala.inline
    def setTransferMessage(value: Message): Self = StObject.set(x, "transferMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferMessageUndefined: Self = StObject.set(x, "transferMessage", js.undefined)
    
    @scala.inline
    def setTransferredTo(value: AwsAccountId): Self = StObject.set(x, "transferredTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferredToUndefined: Self = StObject.set(x, "transferredTo", js.undefined)
  }
}
