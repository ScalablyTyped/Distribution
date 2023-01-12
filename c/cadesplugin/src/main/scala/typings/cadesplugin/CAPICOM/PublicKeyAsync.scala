package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.PublicKey> */
trait PublicKeyAsync extends StObject {
  
  val Algorithm: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.OID extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.OID> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.OID>> */ js.Any
  
  val EncodedKey: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.EncodedData extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.EncodedData> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.EncodedData>> */ js.Any
  
  val EncodedParameters: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.EncodedData extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.EncodedData> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.EncodedData>> */ js.Any
  
  val Length: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
}
object PublicKeyAsync {
  
  inline def apply(
    Algorithm: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.OID extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.OID> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.OID>> */ js.Any,
    EncodedKey: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.EncodedData extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.EncodedData> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.EncodedData>> */ js.Any,
    EncodedParameters: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.EncodedData extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.EncodedData> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.EncodedData>> */ js.Any,
    Length: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
  ): PublicKeyAsync = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], EncodedParameters = EncodedParameters.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyAsync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyAsync] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.OID extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.OID> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.OID>> */ js.Any
    ): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    inline def setEncodedKey(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.EncodedData extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.EncodedData> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.EncodedData>> */ js.Any
    ): Self = StObject.set(x, "EncodedKey", value.asInstanceOf[js.Any])
    
    inline def setEncodedParameters(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.EncodedData extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.EncodedData> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.EncodedData>> */ js.Any
    ): Self = StObject.set(x, "EncodedParameters", value.asInstanceOf[js.Any])
    
    inline def setLength(
      value: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
    ): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
  }
}
