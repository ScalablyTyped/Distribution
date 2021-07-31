package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CACertificate extends StObject {
  
  /**
    * The ARN of the CA certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The ID of the CA certificate.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
  
  /**
    * The date the CA certificate was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The status of the CA certificate. The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var status: js.UndefOr[CACertificateStatus] = js.undefined
}
object CACertificate {
  
  @scala.inline
  def apply(): CACertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CACertificate]
  }
  
  @scala.inline
  implicit class CACertificateMutableBuilder[Self <: CACertificate] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: CACertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
