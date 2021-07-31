package typings.cadesplugin.CAPICOM

import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CADESCommon.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  def Display(): Unit
  
  def Export(EncodingType: ValuesOf[CAPICOM_ENCODING_TYPE]): String
  
  def GetInfo(infoType: CAPICOM_CERT_INFO_TYPE): String
  
  def HasPrivateKey(): Boolean
  
  def IsValid(): CertificateStatus
  
  val IssuerName: String
  
  def PublicKey(): typings.cadesplugin.CAPICOM.PublicKey
  
  val SerialNumber: String
  
  val SubjectName: String
  
  val Thumbprint: String
  
  val ValidFromDate: VarDate
  
  val ValidToDate: VarDate
  
  val Version: Double
}
object Certificate {
  
  @scala.inline
  def apply(
    Display: () => Unit,
    Export: ValuesOf[CAPICOM_ENCODING_TYPE] => String,
    GetInfo: CAPICOM_CERT_INFO_TYPE => String,
    HasPrivateKey: () => Boolean,
    IsValid: () => CertificateStatus,
    IssuerName: String,
    PublicKey: () => PublicKey,
    SerialNumber: String,
    SubjectName: String,
    Thumbprint: String,
    ValidFromDate: VarDate,
    ValidToDate: VarDate,
    Version: Double
  ): Certificate = {
    val __obj = js.Dynamic.literal(Display = js.Any.fromFunction0(Display), Export = js.Any.fromFunction1(Export), GetInfo = js.Any.fromFunction1(GetInfo), HasPrivateKey = js.Any.fromFunction0(HasPrivateKey), IsValid = js.Any.fromFunction0(IsValid), IssuerName = IssuerName.asInstanceOf[js.Any], PublicKey = js.Any.fromFunction0(PublicKey), SerialNumber = SerialNumber.asInstanceOf[js.Any], SubjectName = SubjectName.asInstanceOf[js.Any], Thumbprint = Thumbprint.asInstanceOf[js.Any], ValidFromDate = ValidFromDate.asInstanceOf[js.Any], ValidToDate = ValidToDate.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: () => Unit): Self = StObject.set(x, "Display", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExport(value: ValuesOf[CAPICOM_ENCODING_TYPE] => String): Self = StObject.set(x, "Export", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInfo(value: CAPICOM_CERT_INFO_TYPE => String): Self = StObject.set(x, "GetInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPrivateKey(value: () => Boolean): Self = StObject.set(x, "HasPrivateKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValid(value: () => CertificateStatus): Self = StObject.set(x, "IsValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIssuerName(value: String): Self = StObject.set(x, "IssuerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: () => PublicKey): Self = StObject.set(x, "PublicKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectName(value: String): Self = StObject.set(x, "SubjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbprint(value: String): Self = StObject.set(x, "Thumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFromDate(value: VarDate): Self = StObject.set(x, "ValidFromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidToDate(value: VarDate): Self = StObject.set(x, "ValidToDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
