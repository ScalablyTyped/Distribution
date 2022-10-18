package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CADESCommon.ValuesOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.SignedXML> */
trait SignedXMLAsync extends StObject {
  
  val Content: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  val DigestMethod: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  val Sign: /* import warning: importer.ImportType#apply Failed type conversion: (signer : cadesplugin.CAdESCOM.CPSigner | undefined, XPath : string | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, XPath : string | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, XPath : string | undefined): string>> */ js.Any
  
  val SignatureMethod: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  val SignatureType: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE>>> */ js.Any
  
  val Signers: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.Signers extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.Signers> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.Signers>> */ js.Any
  
  val Verify: /* import warning: importer.ImportType#apply Failed type conversion: (SignedMessage : string, XPath : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(SignedMessage : string, XPath : string | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(SignedMessage : string, XPath : string | undefined): void>> */ js.Any
  
  def propset_Content(content: String): js.Promise[Unit]
  
  def propset_DigestMethod(digestMethod: String): js.Promise[Unit]
  
  def propset_SignatureMethod(signatureMethod: String): js.Promise[Unit]
  
  def propset_SignatureType(signatureType: ValuesOf[CADESCOM_XML_SIGNATURE_TYPE]): js.Promise[Unit]
}
object SignedXMLAsync {
  
  inline def apply(
    Content: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    DigestMethod: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    Sign: /* import warning: importer.ImportType#apply Failed type conversion: (signer : cadesplugin.CAdESCOM.CPSigner | undefined, XPath : string | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, XPath : string | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, XPath : string | undefined): string>> */ js.Any,
    SignatureMethod: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    SignatureType: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE>>> */ js.Any,
    Signers: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.Signers extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.Signers> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.Signers>> */ js.Any,
    Verify: /* import warning: importer.ImportType#apply Failed type conversion: (SignedMessage : string, XPath : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(SignedMessage : string, XPath : string | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(SignedMessage : string, XPath : string | undefined): void>> */ js.Any,
    propset_Content: String => js.Promise[Unit],
    propset_DigestMethod: String => js.Promise[Unit],
    propset_SignatureMethod: String => js.Promise[Unit],
    propset_SignatureType: ValuesOf[CADESCOM_XML_SIGNATURE_TYPE] => js.Promise[Unit]
  ): SignedXMLAsync = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], DigestMethod = DigestMethod.asInstanceOf[js.Any], Sign = Sign.asInstanceOf[js.Any], SignatureMethod = SignatureMethod.asInstanceOf[js.Any], SignatureType = SignatureType.asInstanceOf[js.Any], Signers = Signers.asInstanceOf[js.Any], Verify = Verify.asInstanceOf[js.Any], propset_Content = js.Any.fromFunction1(propset_Content), propset_DigestMethod = js.Any.fromFunction1(propset_DigestMethod), propset_SignatureMethod = js.Any.fromFunction1(propset_SignatureMethod), propset_SignatureType = js.Any.fromFunction1(propset_SignatureType))
    __obj.asInstanceOf[SignedXMLAsync]
  }
  
  extension [Self <: SignedXMLAsync](x: Self) {
    
    inline def setContent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setDigestMethod(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "DigestMethod", value.asInstanceOf[js.Any])
    
    inline def setPropset_Content(value: String => js.Promise[Unit]): Self = StObject.set(x, "propset_Content", js.Any.fromFunction1(value))
    
    inline def setPropset_DigestMethod(value: String => js.Promise[Unit]): Self = StObject.set(x, "propset_DigestMethod", js.Any.fromFunction1(value))
    
    inline def setPropset_SignatureMethod(value: String => js.Promise[Unit]): Self = StObject.set(x, "propset_SignatureMethod", js.Any.fromFunction1(value))
    
    inline def setPropset_SignatureType(value: ValuesOf[CADESCOM_XML_SIGNATURE_TYPE] => js.Promise[Unit]): Self = StObject.set(x, "propset_SignatureType", js.Any.fromFunction1(value))
    
    inline def setSign(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (signer : cadesplugin.CAdESCOM.CPSigner | undefined, XPath : string | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, XPath : string | undefined): string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, XPath : string | undefined): string>> */ js.Any
    ): Self = StObject.set(x, "Sign", value.asInstanceOf[js.Any])
    
    inline def setSignatureMethod(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "SignatureMethod", value.asInstanceOf[js.Any])
    
    inline def setSignatureType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE>> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE>>> */ js.Any
    ): Self = StObject.set(x, "SignatureType", value.asInstanceOf[js.Any])
    
    inline def setSigners(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.Signers extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.Signers> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.Signers>> */ js.Any
    ): Self = StObject.set(x, "Signers", value.asInstanceOf[js.Any])
    
    inline def setVerify(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (SignedMessage : string, XPath : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(SignedMessage : string, XPath : string | undefined): void> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(SignedMessage : string, XPath : string | undefined): void>> */ js.Any
    ): Self = StObject.set(x, "Verify", value.asInstanceOf[js.Any])
  }
}
