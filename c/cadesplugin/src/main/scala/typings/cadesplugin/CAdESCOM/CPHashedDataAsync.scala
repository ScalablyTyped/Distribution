package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPHashedData> */
trait CPHashedDataAsync extends StObject {
  
  val Algorithm: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM & cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM & cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM & cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM>>> */ js.Any
  
  val DataEncoding: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>>> */ js.Any
  
  val Hash: /* import warning: importer.ImportType#apply Failed type conversion: (newVal : string): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(newVal : string): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(newVal : string): void>> */ js.Any
  
  val SetHashValue: /* import warning: importer.ImportType#apply Failed type conversion: (newVal : string): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(newVal : string): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(newVal : string): void>> */ js.Any
  
  val Value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  def propset_Algorithm(algorithm: ValuesOf[CADESCOM_HASH_ALGORITHM & CAPICOM_HASH_ALGORITHM]): js.Promise[Unit]
  
  def propset_DataEncoding(dataEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]): js.Promise[Unit]
}
object CPHashedDataAsync {
  
  inline def apply(
    Algorithm: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM & cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM & cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM & cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM>>> */ js.Any,
    DataEncoding: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>>> */ js.Any,
    Hash: /* import warning: importer.ImportType#apply Failed type conversion: (newVal : string): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(newVal : string): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(newVal : string): void>> */ js.Any,
    SetHashValue: /* import warning: importer.ImportType#apply Failed type conversion: (newVal : string): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(newVal : string): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(newVal : string): void>> */ js.Any,
    Value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    propset_Algorithm: ValuesOf[CADESCOM_HASH_ALGORITHM & CAPICOM_HASH_ALGORITHM] => js.Promise[Unit],
    propset_DataEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] => js.Promise[Unit]
  ): CPHashedDataAsync = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], DataEncoding = DataEncoding.asInstanceOf[js.Any], Hash = Hash.asInstanceOf[js.Any], SetHashValue = SetHashValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], propset_Algorithm = js.Any.fromFunction1(propset_Algorithm), propset_DataEncoding = js.Any.fromFunction1(propset_DataEncoding))
    __obj.asInstanceOf[CPHashedDataAsync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CPHashedDataAsync] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM & cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM & cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM>> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM & cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM>>> */ js.Any
    ): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    inline def setDataEncoding(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE>>> */ js.Any
    ): Self = StObject.set(x, "DataEncoding", value.asInstanceOf[js.Any])
    
    inline def setHash(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (newVal : string): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(newVal : string): void> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(newVal : string): void>> */ js.Any
    ): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
    
    inline def setPropset_Algorithm(value: ValuesOf[CADESCOM_HASH_ALGORITHM & CAPICOM_HASH_ALGORITHM] => js.Promise[Unit]): Self = StObject.set(x, "propset_Algorithm", js.Any.fromFunction1(value))
    
    inline def setPropset_DataEncoding(value: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] => js.Promise[Unit]): Self = StObject.set(x, "propset_DataEncoding", js.Any.fromFunction1(value))
    
    inline def setSetHashValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (newVal : string): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(newVal : string): void> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(newVal : string): void>> */ js.Any
    ): Self = StObject.set(x, "SetHashValue", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
