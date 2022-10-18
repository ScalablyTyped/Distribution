package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.EncodedData> */
trait EncodedDataAsync extends StObject {
  
  val Format: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  val Value: /* import warning: importer.ImportType#apply Failed type conversion: (EncodingType : cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(EncodingType : cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(EncodingType : cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE | undefined): string>> */ js.Any
}
object EncodedDataAsync {
  
  inline def apply(
    Format: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    Value: /* import warning: importer.ImportType#apply Failed type conversion: (EncodingType : cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(EncodingType : cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE | undefined): string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(EncodingType : cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE | undefined): string>> */ js.Any
  ): EncodedDataAsync = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedDataAsync]
  }
  
  extension [Self <: EncodedDataAsync](x: Self) {
    
    inline def setFormat(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (EncodingType : cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE | undefined): string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(EncodingType : cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE | undefined): string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(EncodingType : cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE | undefined): string>> */ js.Any
    ): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
