package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CADESCommon.VarDate
import typings.cadesplugin.CADESCommon._Unpacked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.Certificate> */
trait CertificateAsync
  extends StObject
     with _Unpacked[Any] {
  
  val Display: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]]
  
  val Export: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]]
  ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]])
  
  val ExtendedKeyUsage: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[typings.cadesplugin.CAPICOM.ExtendedKeyUsage]]]) | PromisifiedFunction[js.Function0[typings.cadesplugin.CAPICOM.ExtendedKeyUsage]]
  
  val GetInfo: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]]]) | (PromisifiedFunction[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]])
  
  val HasPrivateKey: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
  
  val IsValid: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[CertificateStatus]]]) | PromisifiedFunction[js.Function0[CertificateStatus]]
  
  val IssuerName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val PrivateKey: (// tslint:disable-line ban-types
  js.Promise[Unpacked[typings.cadesplugin.CAPICOM.PrivateKey]]) | PromisifiedFunction[typings.cadesplugin.CAPICOM.PrivateKey]
  
  val PublicKey: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[typings.cadesplugin.CAPICOM.PublicKey]]]) | PromisifiedFunction[js.Function0[typings.cadesplugin.CAPICOM.PublicKey]]
  
  val SerialNumber: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val SubjectName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val Thumbprint: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val ValidFromDate: (// tslint:disable-line ban-types
  js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate]
  
  val ValidToDate: (// tslint:disable-line ban-types
  js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate]
  
  val Version: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
}
object CertificateAsync {
  
  inline def apply(
    Display: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]],
    Export: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]]
    ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]]),
    ExtendedKeyUsage: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[ExtendedKeyUsage]]]) | PromisifiedFunction[js.Function0[ExtendedKeyUsage]],
    GetInfo: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]]]) | (PromisifiedFunction[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]]),
    HasPrivateKey: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]],
    IsValid: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[CertificateStatus]]]) | PromisifiedFunction[js.Function0[CertificateStatus]],
    IssuerName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    PrivateKey: (// tslint:disable-line ban-types
  js.Promise[Unpacked[PrivateKey]]) | PromisifiedFunction[PrivateKey],
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
    val __obj = js.Dynamic.literal(Display = Display.asInstanceOf[js.Any], Export = Export.asInstanceOf[js.Any], ExtendedKeyUsage = ExtendedKeyUsage.asInstanceOf[js.Any], GetInfo = GetInfo.asInstanceOf[js.Any], HasPrivateKey = HasPrivateKey.asInstanceOf[js.Any], IsValid = IsValid.asInstanceOf[js.Any], IssuerName = IssuerName.asInstanceOf[js.Any], PrivateKey = PrivateKey.asInstanceOf[js.Any], PublicKey = PublicKey.asInstanceOf[js.Any], SerialNumber = SerialNumber.asInstanceOf[js.Any], SubjectName = SubjectName.asInstanceOf[js.Any], Thumbprint = Thumbprint.asInstanceOf[js.Any], ValidFromDate = ValidFromDate.asInstanceOf[js.Any], ValidToDate = ValidToDate.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateAsync]
  }
  
  extension [Self <: CertificateAsync](x: Self) {
    
    inline def setDisplay(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]]
    ): Self = StObject.set(x, "Display", value.asInstanceOf[js.Any])
    
    inline def setDisplayFunction0(value: () => Unit): Self = StObject.set(x, "Display", js.Any.fromFunction0(value))
    
    inline def setDisplayFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Display", js.Any.fromFunction1(value))
    
    inline def setExport(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]]
        ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE], String]])
    ): Self = StObject.set(x, "Export", value.asInstanceOf[js.Any])
    
    inline def setExportFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any]) | (/* EncodingType */ ValuesOf[CAPICOM_ENCODING_TYPE]) => js.Promise[Unpacked[Any]] | String
    ): Self = StObject.set(x, "Export", js.Any.fromFunction1(value))
    
    inline def setExtendedKeyUsage(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[ExtendedKeyUsage]]]) | PromisifiedFunction[js.Function0[ExtendedKeyUsage]]
    ): Self = StObject.set(x, "ExtendedKeyUsage", value.asInstanceOf[js.Any])
    
    inline def setExtendedKeyUsageFunction0(value: () => ExtendedKeyUsage): Self = StObject.set(x, "ExtendedKeyUsage", js.Any.fromFunction0(value))
    
    inline def setExtendedKeyUsageFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "ExtendedKeyUsage", js.Any.fromFunction1(value))
    
    inline def setGetInfo(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]]]) | (PromisifiedFunction[js.Function1[/* infoType */ CAPICOM_CERT_INFO_TYPE, String]])
    ): Self = StObject.set(x, "GetInfo", value.asInstanceOf[js.Any])
    
    inline def setGetInfoFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any]) | (/* infoType */ CAPICOM_CERT_INFO_TYPE) => js.Promise[Unpacked[Any]] | String
    ): Self = StObject.set(x, "GetInfo", js.Any.fromFunction1(value))
    
    inline def setHasPrivateKey(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
    ): Self = StObject.set(x, "HasPrivateKey", value.asInstanceOf[js.Any])
    
    inline def setHasPrivateKeyFunction0(value: () => Boolean): Self = StObject.set(x, "HasPrivateKey", js.Any.fromFunction0(value))
    
    inline def setHasPrivateKeyFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "HasPrivateKey", js.Any.fromFunction1(value))
    
    inline def setIsValid(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[CertificateStatus]]]) | PromisifiedFunction[js.Function0[CertificateStatus]]
    ): Self = StObject.set(x, "IsValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidFunction0(value: () => CertificateStatus): Self = StObject.set(x, "IsValid", js.Any.fromFunction0(value))
    
    inline def setIsValidFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "IsValid", js.Any.fromFunction1(value))
    
    inline def setIssuerName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "IssuerName", value.asInstanceOf[js.Any])
    
    inline def setIssuerNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "IssuerName", js.Any.fromFunction1(value))
    
    inline def setPrivateKey(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[PrivateKey]]) | PromisifiedFunction[PrivateKey]
    ): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "PrivateKey", js.Any.fromFunction1(value))
    
    inline def setPublicKey(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[PublicKey]]]) | PromisifiedFunction[js.Function0[PublicKey]]
    ): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyFunction0(value: () => PublicKey): Self = StObject.set(x, "PublicKey", js.Any.fromFunction0(value))
    
    inline def setPublicKeyFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "PublicKey", js.Any.fromFunction1(value))
    
    inline def setSerialNumber(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "SerialNumber", js.Any.fromFunction1(value))
    
    inline def setSubjectName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "SubjectName", value.asInstanceOf[js.Any])
    
    inline def setSubjectNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "SubjectName", js.Any.fromFunction1(value))
    
    inline def setThumbprint(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "Thumbprint", value.asInstanceOf[js.Any])
    
    inline def setThumbprintFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Thumbprint", js.Any.fromFunction1(value))
    
    inline def setValidFromDate(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate]
    ): Self = StObject.set(x, "ValidFromDate", value.asInstanceOf[js.Any])
    
    inline def setValidFromDateFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "ValidFromDate", js.Any.fromFunction1(value))
    
    inline def setValidToDate(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[VarDate]]) | PromisifiedFunction[VarDate]
    ): Self = StObject.set(x, "ValidToDate", value.asInstanceOf[js.Any])
    
    inline def setValidToDateFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "ValidToDate", js.Any.fromFunction1(value))
    
    inline def setVersion(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Version", js.Any.fromFunction1(value))
  }
}
