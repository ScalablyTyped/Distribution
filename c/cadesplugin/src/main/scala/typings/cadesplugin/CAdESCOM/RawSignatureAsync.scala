package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.RawSignature> */
trait RawSignatureAsync extends StObject {
  
  val SignHash: /* import warning: importer.ImportType#apply Failed type conversion: (hash : cadesplugin.CAdESCOM.CPHashedData, certificate : string | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : string | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : string | undefined): string>> */ js.Any
  
  val VerifyHash: /* import warning: importer.ImportType#apply Failed type conversion: (hash : cadesplugin.CAdESCOM.CPHashedData, certificate : cadesplugin.CAPICOM.Certificate, signature : string): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : cadesplugin.CAPICOM.Certificate, signature : string): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : cadesplugin.CAPICOM.Certificate, signature : string): void>> */ js.Any
}
object RawSignatureAsync {
  
  inline def apply(
    SignHash: /* import warning: importer.ImportType#apply Failed type conversion: (hash : cadesplugin.CAdESCOM.CPHashedData, certificate : string | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : string | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : string | undefined): string>> */ js.Any,
    VerifyHash: /* import warning: importer.ImportType#apply Failed type conversion: (hash : cadesplugin.CAdESCOM.CPHashedData, certificate : cadesplugin.CAPICOM.Certificate, signature : string): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : cadesplugin.CAPICOM.Certificate, signature : string): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : cadesplugin.CAPICOM.Certificate, signature : string): void>> */ js.Any
  ): RawSignatureAsync = {
    val __obj = js.Dynamic.literal(SignHash = SignHash.asInstanceOf[js.Any], VerifyHash = VerifyHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawSignatureAsync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawSignatureAsync] (val x: Self) extends AnyVal {
    
    inline def setSignHash(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (hash : cadesplugin.CAdESCOM.CPHashedData, certificate : string | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : string | undefined): string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : string | undefined): string>> */ js.Any
    ): Self = StObject.set(x, "SignHash", value.asInstanceOf[js.Any])
    
    inline def setVerifyHash(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (hash : cadesplugin.CAdESCOM.CPHashedData, certificate : cadesplugin.CAPICOM.Certificate, signature : string): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : cadesplugin.CAPICOM.Certificate, signature : string): void> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(hash : cadesplugin.CAdESCOM.CPHashedData, certificate : cadesplugin.CAPICOM.Certificate, signature : string): void>> */ js.Any
    ): Self = StObject.set(x, "VerifyHash", value.asInstanceOf[js.Any])
  }
}
