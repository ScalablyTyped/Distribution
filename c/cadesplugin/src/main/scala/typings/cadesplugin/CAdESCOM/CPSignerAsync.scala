package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION
import typings.cadesplugin.CAPICOM.CertificateAsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPSigner> */
trait CPSignerAsync extends StObject {
  
  val AuthenticatedAttributes2: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAdESCOM.CPAuthenticatedAttributes2 extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAdESCOM.CPAuthenticatedAttributes2> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAdESCOM.CPAuthenticatedAttributes2>> */ js.Any
  
  val Certificate: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.Certificate extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.Certificate> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.Certificate>> */ js.Any
  
  val CheckCertificate: /* import warning: importer.ImportType#apply Failed type conversion: boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<boolean> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<boolean>> */ js.Any
  
  val Display: /* import warning: importer.ImportType#apply Failed type conversion: (hwndParent : number | undefined, title : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hwndParent : number | undefined, title : string | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hwndParent : number | undefined, title : string | undefined): void>> */ js.Any
  
  val KeyPin: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  val Load: /* import warning: importer.ImportType#apply Failed type conversion: (fileName : string, password : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(fileName : string, password : string | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(fileName : string, password : string | undefined): void>> */ js.Any
  
  val Options: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION>>> */ js.Any
  
  val SignatureTimeStampTime: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.VarDate extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.VarDate> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.VarDate>> */ js.Any
  
  val SigningTime: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.VarDate extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.VarDate> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.VarDate>> */ js.Any
  
  val TSAAddress: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  def propset_Certificate(certificate: CertificateAsync): js.Promise[Unit]
  
  def propset_CheckCertificate(checkCertificate: Boolean): js.Promise[Unit]
  
  def propset_KeyPin(keyPin: String): js.Promise[Unit]
  
  def propset_Options(options: ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION]): js.Promise[Unit]
  
  def propset_TSAAddress(TSAAddress: String): js.Promise[Unit]
}
object CPSignerAsync {
  
  inline def apply(
    AuthenticatedAttributes2: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAdESCOM.CPAuthenticatedAttributes2 extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAdESCOM.CPAuthenticatedAttributes2> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAdESCOM.CPAuthenticatedAttributes2>> */ js.Any,
    Certificate: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.Certificate extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.Certificate> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.Certificate>> */ js.Any,
    CheckCertificate: /* import warning: importer.ImportType#apply Failed type conversion: boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<boolean> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<boolean>> */ js.Any,
    Display: /* import warning: importer.ImportType#apply Failed type conversion: (hwndParent : number | undefined, title : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hwndParent : number | undefined, title : string | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hwndParent : number | undefined, title : string | undefined): void>> */ js.Any,
    KeyPin: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    Load: /* import warning: importer.ImportType#apply Failed type conversion: (fileName : string, password : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(fileName : string, password : string | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(fileName : string, password : string | undefined): void>> */ js.Any,
    Options: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION>>> */ js.Any,
    SignatureTimeStampTime: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.VarDate extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.VarDate> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.VarDate>> */ js.Any,
    SigningTime: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.VarDate extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.VarDate> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.VarDate>> */ js.Any,
    TSAAddress: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    propset_Certificate: CertificateAsync => js.Promise[Unit],
    propset_CheckCertificate: Boolean => js.Promise[Unit],
    propset_KeyPin: String => js.Promise[Unit],
    propset_Options: ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION] => js.Promise[Unit],
    propset_TSAAddress: String => js.Promise[Unit]
  ): CPSignerAsync = {
    val __obj = js.Dynamic.literal(AuthenticatedAttributes2 = AuthenticatedAttributes2.asInstanceOf[js.Any], Certificate = Certificate.asInstanceOf[js.Any], CheckCertificate = CheckCertificate.asInstanceOf[js.Any], Display = Display.asInstanceOf[js.Any], KeyPin = KeyPin.asInstanceOf[js.Any], Load = Load.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any], SignatureTimeStampTime = SignatureTimeStampTime.asInstanceOf[js.Any], SigningTime = SigningTime.asInstanceOf[js.Any], TSAAddress = TSAAddress.asInstanceOf[js.Any], propset_Certificate = js.Any.fromFunction1(propset_Certificate), propset_CheckCertificate = js.Any.fromFunction1(propset_CheckCertificate), propset_KeyPin = js.Any.fromFunction1(propset_KeyPin), propset_Options = js.Any.fromFunction1(propset_Options), propset_TSAAddress = js.Any.fromFunction1(propset_TSAAddress))
    __obj.asInstanceOf[CPSignerAsync]
  }
  
  extension [Self <: CPSignerAsync](x: Self) {
    
    inline def setAuthenticatedAttributes2(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAdESCOM.CPAuthenticatedAttributes2 extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAdESCOM.CPAuthenticatedAttributes2> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAdESCOM.CPAuthenticatedAttributes2>> */ js.Any
    ): Self = StObject.set(x, "AuthenticatedAttributes2", value.asInstanceOf[js.Any])
    
    inline def setCertificate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.Certificate extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.Certificate> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.Certificate>> */ js.Any
    ): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCheckCertificate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<boolean> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<boolean>> */ js.Any
    ): Self = StObject.set(x, "CheckCertificate", value.asInstanceOf[js.Any])
    
    inline def setDisplay(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (hwndParent : number | undefined, title : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hwndParent : number | undefined, title : string | undefined): void> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(hwndParent : number | undefined, title : string | undefined): void>> */ js.Any
    ): Self = StObject.set(x, "Display", value.asInstanceOf[js.Any])
    
    inline def setKeyPin(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "KeyPin", value.asInstanceOf[js.Any])
    
    inline def setLoad(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (fileName : string, password : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(fileName : string, password : string | undefined): void> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(fileName : string, password : string | undefined): void>> */ js.Any
    ): Self = StObject.set(x, "Load", value.asInstanceOf[js.Any])
    
    inline def setOptions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION>> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION>>> */ js.Any
    ): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setPropset_Certificate(value: CertificateAsync => js.Promise[Unit]): Self = StObject.set(x, "propset_Certificate", js.Any.fromFunction1(value))
    
    inline def setPropset_CheckCertificate(value: Boolean => js.Promise[Unit]): Self = StObject.set(x, "propset_CheckCertificate", js.Any.fromFunction1(value))
    
    inline def setPropset_KeyPin(value: String => js.Promise[Unit]): Self = StObject.set(x, "propset_KeyPin", js.Any.fromFunction1(value))
    
    inline def setPropset_Options(value: ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION] => js.Promise[Unit]): Self = StObject.set(x, "propset_Options", js.Any.fromFunction1(value))
    
    inline def setPropset_TSAAddress(value: String => js.Promise[Unit]): Self = StObject.set(x, "propset_TSAAddress", js.Any.fromFunction1(value))
    
    inline def setSignatureTimeStampTime(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.VarDate extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.VarDate> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.VarDate>> */ js.Any
    ): Self = StObject.set(x, "SignatureTimeStampTime", value.asInstanceOf[js.Any])
    
    inline def setSigningTime(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.VarDate extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.VarDate> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.VarDate>> */ js.Any
    ): Self = StObject.set(x, "SigningTime", value.asInstanceOf[js.Any])
    
    inline def setTSAAddress(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "TSAAddress", value.asInstanceOf[js.Any])
  }
}
