package typings.cadesplugin.CAPICOM

import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CADESCommon.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends js.Object {
  
  def Display(): Unit = js.native
  
  def Export(EncodingType: ValuesOf[CAPICOM_ENCODING_TYPE]): String = js.native
  
  def GetInfo(infoType: CAPICOM_CERT_INFO_TYPE): String = js.native
  
  def HasPrivateKey(): Boolean = js.native
  
  def IsValid(): CertificateStatus = js.native
  
  val IssuerName: String = js.native
  
  def PublicKey(): typings.cadesplugin.CAPICOM.PublicKey = js.native
  
  val SerialNumber: String = js.native
  
  val SubjectName: String = js.native
  
  val Thumbprint: String = js.native
  
  val ValidFromDate: VarDate = js.native
  
  val ValidToDate: VarDate = js.native
  
  val Version: Double = js.native
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
  implicit class CertificateOps[Self <: Certificate] (val x: Self) extends AnyVal {
    
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
    def setDisplay(value: () => Unit): Self = this.set("Display", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExport(value: ValuesOf[CAPICOM_ENCODING_TYPE] => String): Self = this.set("Export", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInfo(value: CAPICOM_CERT_INFO_TYPE => String): Self = this.set("GetInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPrivateKey(value: () => Boolean): Self = this.set("HasPrivateKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValid(value: () => CertificateStatus): Self = this.set("IsValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIssuerName(value: String): Self = this.set("IssuerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: () => PublicKey): Self = this.set("PublicKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectName(value: String): Self = this.set("SubjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbprint(value: String): Self = this.set("Thumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFromDate(value: VarDate): Self = this.set("ValidFromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidToDate(value: VarDate): Self = this.set("ValidToDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
}
