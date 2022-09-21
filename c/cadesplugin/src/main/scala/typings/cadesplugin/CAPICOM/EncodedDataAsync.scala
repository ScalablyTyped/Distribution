package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon._Unpacked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.EncodedData> */
trait EncodedDataAsync
  extends StObject
     with _Unpacked[Any] {
  
  val Format: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val Value: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]]
  ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]])
}
object EncodedDataAsync {
  
  inline def apply(
    Format: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    Value: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]]
    ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]])
  ): EncodedDataAsync = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedDataAsync]
  }
  
  extension [Self <: EncodedDataAsync](x: Self) {
    
    inline def setFormat(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Format", js.Any.fromFunction1(value))
    
    inline def setValue(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]]
        ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]])
    ): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueFunction1(
      value: js.UndefOr[
          (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any]) | CAPICOM_ENCODING_TYPE
        ] => js.Promise[Unpacked[Any]] | String
    ): Self = StObject.set(x, "Value", js.Any.fromFunction1(value))
  }
}
