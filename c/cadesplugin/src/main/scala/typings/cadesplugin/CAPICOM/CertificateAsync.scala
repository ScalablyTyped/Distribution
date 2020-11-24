package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CADESCommon.VarDate
import typings.cadesplugin.CADESCommon._Unpacked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.Certificate> */
@js.native
trait CertificateAsync
  extends _Unpacked[js.Any] {
  
  val Display: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]] = js.native
  
  val Export: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]]
  ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]]) = js.native
  
  val GetInfo: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]]]) | (PromisifiedFunction[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]]) = js.native
  
  val HasPrivateKey: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]] = js.native
  
  val IsValid: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[CertificateStatus]]]) | PromisifiedFunction[js.Function0[CertificateStatus]] = js.native
  
  val IssuerName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val PublicKey: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[typings.cadesplugin.CAPICOM.PublicKey]]]) | PromisifiedFunction[js.Function0[typings.cadesplugin.CAPICOM.PublicKey]] = js.native
  
  val SerialNumber: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val SubjectName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val Thumbprint: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val ValidFromDate: (// tslint:disable-line ban-types
  js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate] = js.native
  
  val ValidToDate: (// tslint:disable-line ban-types
  js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate] = js.native
  
  val Version: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double] = js.native
}
object CertificateAsync {
  
  @scala.inline
  def apply(
    Display: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]],
    Export: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]]
    ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]]),
    GetInfo: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]]]) | (PromisifiedFunction[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]]),
    HasPrivateKey: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]],
    IsValid: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[CertificateStatus]]]) | PromisifiedFunction[js.Function0[CertificateStatus]],
    IssuerName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    PublicKey: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[PublicKey]]]) | PromisifiedFunction[js.Function0[PublicKey]],
    SerialNumber: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    SubjectName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    Thumbprint: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    ValidFromDate: (// tslint:disable-line ban-types
  js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate],
    ValidToDate: (// tslint:disable-line ban-types
  js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate],
    Version: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
  ): CertificateAsync = {
    val __obj = js.Dynamic.literal(Display = Display.asInstanceOf[js.Any], Export = Export.asInstanceOf[js.Any], GetInfo = GetInfo.asInstanceOf[js.Any], HasPrivateKey = HasPrivateKey.asInstanceOf[js.Any], IsValid = IsValid.asInstanceOf[js.Any], IssuerName = IssuerName.asInstanceOf[js.Any], PublicKey = PublicKey.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], SubjectName = SubjectName.asInstanceOf[js.Any], Thumbprint = Thumbprint.asInstanceOf[js.Any], ValidFromDate = ValidFromDate.asInstanceOf[js.Any], ValidToDate = ValidToDate.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAsync]
  }
  
  @scala.inline
  implicit class CertificateAsyncOps[Self <: CertificateAsync] (val x: Self) extends AnyVal {
    
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
    def setDisplayFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Display", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayFunction0(value: () => Unit): Self = this.set("Display", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplay(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]]
    ): Self = this.set("Display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any]) | (/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE]) => js.Promise[Unpacked[js.Any]] | String
    ): Self = this.set("Export", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExport(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]]
        ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]])
    ): Self = this.set("Export", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInfoFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any]) | (/* infoType */ CAPICOM_CERT_INFO_TYPE) => js.Promise[Unpacked[js.Any]] | String
    ): Self = this.set("GetInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInfo(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]]]) | (PromisifiedFunction[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]])
    ): Self = this.set("GetInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPrivateKeyFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("HasPrivateKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasPrivateKeyFunction0(value: () => Boolean): Self = this.set("HasPrivateKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasPrivateKey(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
    ): Self = this.set("HasPrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValidFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("IsValid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValidFunction0(value: () => CertificateStatus): Self = this.set("IsValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValid(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[CertificateStatus]]]) | PromisifiedFunction[js.Function0[CertificateStatus]]
    ): Self = this.set("IsValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("IssuerName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIssuerName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = this.set("IssuerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("PublicKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPublicKeyFunction0(value: () => PublicKey): Self = this.set("PublicKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPublicKey(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[PublicKey]]]) | PromisifiedFunction[js.Function0[PublicKey]]
    ): Self = this.set("PublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("SerialNumber", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerialNumber(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = this.set("SerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("SubjectName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubjectName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = this.set("SubjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbprintFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Thumbprint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThumbprint(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = this.set("Thumbprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFromDateFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("ValidFromDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidFromDate(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate]
    ): Self = this.set("ValidFromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidToDateFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("ValidToDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidToDate(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate]
    ): Self = this.set("ValidToDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Version", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
}
