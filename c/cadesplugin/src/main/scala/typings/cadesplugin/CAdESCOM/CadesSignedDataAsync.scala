package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CADESCommon.ValuesOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CadesSignedData> */
trait CadesSignedDataAsync extends StObject {
  
  val Certificates: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.Certificates extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.Certificates> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.Certificates>> */ js.Any
  
  val Content: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  val ContentEncoding: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>>> */ js.Any
  
  val Display: /* import warning: importer.ImportType#apply Failed type conversion: (hwndParent : number | undefined, title : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hwndParent : number | undefined, title : string | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hwndParent : number | undefined, title : string | undefined): void>> */ js.Any
  
  val DisplayData: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA>>> */ js.Any
  
  val EnhanceCades: /* import warning: importer.ImportType#apply Failed type conversion: (cadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, TSAAddress : string | undefined, encodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(cadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, TSAAddress : string | undefined, encodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(cadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, TSAAddress : string | undefined, encodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string>> */ js.Any
  
  val SignCades: /* import warning: importer.ImportType#apply Failed type conversion: (signer : cadesplugin.CAdESCOM.CPSigner | undefined, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string>> */ js.Any
  
  val SignHash: /* import warning: importer.ImportType#apply Failed type conversion: (hashedData : cadesplugin.CAdESCOM.CPHashedData, signer : cadesplugin.CAdESCOM.CPSigner, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE>, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hashedData : cadesplugin.CAdESCOM.CPHashedData, signer : cadesplugin.CAdESCOM.CPSigner, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE>, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hashedData : cadesplugin.CAdESCOM.CPHashedData, signer : cadesplugin.CAdESCOM.CPSigner, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE>, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string>> */ js.Any
  
  val VerifyCades: /* import warning: importer.ImportType#apply Failed type conversion: (SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined): void>> */ js.Any
  
  val VerifyHash: /* import warning: importer.ImportType#apply Failed type conversion: (hashedData : cadesplugin.CAdESCOM.CPHashedData, SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hashedData : cadesplugin.CAdESCOM.CPHashedData, SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hashedData : cadesplugin.CAdESCOM.CPHashedData, SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined): void>> */ js.Any
  
  def propset_Content(content: String): js.Promise[Unit]
  
  def propset_ContentEncoding(contentEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]): js.Promise[Unit]
  
  def propset_DisplayData(displayData: ValuesOf[CADESCOM_DISPLAY_DATA]): js.Promise[Unit]
}
object CadesSignedDataAsync {
  
  inline def apply(
    Certificates: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.Certificates extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.Certificates> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.Certificates>> */ js.Any,
    Content: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    ContentEncoding: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>>> */ js.Any,
    Display: /* import warning: importer.ImportType#apply Failed type conversion: (hwndParent : number | undefined, title : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hwndParent : number | undefined, title : string | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hwndParent : number | undefined, title : string | undefined): void>> */ js.Any,
    DisplayData: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA>>> */ js.Any,
    EnhanceCades: /* import warning: importer.ImportType#apply Failed type conversion: (cadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, TSAAddress : string | undefined, encodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(cadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, TSAAddress : string | undefined, encodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(cadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, TSAAddress : string | undefined, encodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string>> */ js.Any,
    SignCades: /* import warning: importer.ImportType#apply Failed type conversion: (signer : cadesplugin.CAdESCOM.CPSigner | undefined, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string>> */ js.Any,
    SignHash: /* import warning: importer.ImportType#apply Failed type conversion: (hashedData : cadesplugin.CAdESCOM.CPHashedData, signer : cadesplugin.CAdESCOM.CPSigner, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE>, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hashedData : cadesplugin.CAdESCOM.CPHashedData, signer : cadesplugin.CAdESCOM.CPSigner, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE>, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hashedData : cadesplugin.CAdESCOM.CPHashedData, signer : cadesplugin.CAdESCOM.CPSigner, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE>, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string>> */ js.Any,
    VerifyCades: /* import warning: importer.ImportType#apply Failed type conversion: (SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined): void>> */ js.Any,
    VerifyHash: /* import warning: importer.ImportType#apply Failed type conversion: (hashedData : cadesplugin.CAdESCOM.CPHashedData, SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hashedData : cadesplugin.CAdESCOM.CPHashedData, SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hashedData : cadesplugin.CAdESCOM.CPHashedData, SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined): void>> */ js.Any,
    propset_Content: String => js.Promise[Unit],
    propset_ContentEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] => js.Promise[Unit],
    propset_DisplayData: ValuesOf[CADESCOM_DISPLAY_DATA] => js.Promise[Unit]
  ): CadesSignedDataAsync = {
    val __obj = js.Dynamic.literal(Certificates = Certificates.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], ContentEncoding = ContentEncoding.asInstanceOf[js.Any], Display = Display.asInstanceOf[js.Any], DisplayData = DisplayData.asInstanceOf[js.Any], EnhanceCades = EnhanceCades.asInstanceOf[js.Any], SignCades = SignCades.asInstanceOf[js.Any], SignHash = SignHash.asInstanceOf[js.Any], VerifyCades = VerifyCades.asInstanceOf[js.Any], VerifyHash = VerifyHash.asInstanceOf[js.Any], propset_Content = js.Any.fromFunction1(propset_Content), propset_ContentEncoding = js.Any.fromFunction1(propset_ContentEncoding), propset_DisplayData = js.Any.fromFunction1(propset_DisplayData))
    __obj.asInstanceOf[CadesSignedDataAsync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CadesSignedDataAsync] (val x: Self) extends AnyVal {
    
    inline def setCertificates(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.Certificates extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.Certificates> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.Certificates>> */ js.Any
    ): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setContent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentEncoding(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>>> */ js.Any
    ): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    inline def setDisplay(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (hwndParent : number | undefined, title : string | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hwndParent : number | undefined, title : string | undefined): void> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(hwndParent : number | undefined, title : string | undefined): void>> */ js.Any
    ): Self = StObject.set(x, "Display", value.asInstanceOf[js.Any])
    
    inline def setDisplayData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA>> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA>>> */ js.Any
    ): Self = StObject.set(x, "DisplayData", value.asInstanceOf[js.Any])
    
    inline def setEnhanceCades(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (cadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, TSAAddress : string | undefined, encodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(cadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, TSAAddress : string | undefined, encodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(cadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, TSAAddress : string | undefined, encodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string>> */ js.Any
    ): Self = StObject.set(x, "EnhanceCades", value.asInstanceOf[js.Any])
    
    inline def setPropset_Content(value: String => js.Promise[Unit]): Self = StObject.set(x, "propset_Content", js.Any.fromFunction1(value))
    
    inline def setPropset_ContentEncoding(value: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] => js.Promise[Unit]): Self = StObject.set(x, "propset_ContentEncoding", js.Any.fromFunction1(value))
    
    inline def setPropset_DisplayData(value: ValuesOf[CADESCOM_DISPLAY_DATA] => js.Promise[Unit]): Self = StObject.set(x, "propset_DisplayData", js.Any.fromFunction1(value))
    
    inline def setSignCades(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (signer : cadesplugin.CAdESCOM.CPSigner | undefined, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(signer : cadesplugin.CAdESCOM.CPSigner | undefined, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string>> */ js.Any
    ): Self = StObject.set(x, "SignCades", value.asInstanceOf[js.Any])
    
    inline def setSignHash(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (hashedData : cadesplugin.CAdESCOM.CPHashedData, signer : cadesplugin.CAdESCOM.CPSigner, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE>, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hashedData : cadesplugin.CAdESCOM.CPHashedData, signer : cadesplugin.CAdESCOM.CPSigner, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE>, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(hashedData : cadesplugin.CAdESCOM.CPHashedData, signer : cadesplugin.CAdESCOM.CPSigner, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE>, EncodingType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> | undefined): string>> */ js.Any
    ): Self = StObject.set(x, "SignHash", value.asInstanceOf[js.Any])
    
    inline def setVerifyCades(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined): void> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined, bDetached : boolean | undefined): void>> */ js.Any
    ): Self = StObject.set(x, "VerifyCades", value.asInstanceOf[js.Any])
    
    inline def setVerifyHash(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (hashedData : cadesplugin.CAdESCOM.CPHashedData, SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hashedData : cadesplugin.CAdESCOM.CPHashedData, SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined): void> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(hashedData : cadesplugin.CAdESCOM.CPHashedData, SignedMessage : string, CadesType : cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE> | undefined): void>> */ js.Any
    ): Self = StObject.set(x, "VerifyHash", value.asInstanceOf[js.Any])
  }
}
