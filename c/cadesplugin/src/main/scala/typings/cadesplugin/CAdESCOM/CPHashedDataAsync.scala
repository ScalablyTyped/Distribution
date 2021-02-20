package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CADESCommon._Unpacked
import typings.cadesplugin.CAPICOM.CAPICOM_HASH_ALGORITHM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPHashedData> */
@js.native
trait CPHashedDataAsync
  extends _Unpacked[js.Any] {
  
  val Algorithm: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_HASH_ALGORITHM]]]) | PromisifiedFunction[ValuesOf[CAPICOM_HASH_ALGORITHM]] = js.native
  
  val DataEncoding: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]] = js.native
  
  val Hash: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* newVal */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* newVal */ String, Unit]]) = js.native
  
  val SetHashValue: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* newVal */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* newVal */ String, Unit]]) = js.native
  
  val Value: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  def propset_Algorithm(algorithm: ValuesOf[CAPICOM_HASH_ALGORITHM]): js.Promise[Unit] = js.native
  
  def propset_DataEncoding(dataEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]): js.Promise[Unit] = js.native
}
object CPHashedDataAsync {
  
  @scala.inline
  def apply(
    Algorithm: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_HASH_ALGORITHM]]]) | PromisifiedFunction[ValuesOf[CAPICOM_HASH_ALGORITHM]],
    DataEncoding: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]],
    Hash: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* newVal */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* newVal */ String, Unit]]),
    SetHashValue: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* newVal */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* newVal */ String, Unit]]),
    Value: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    propset_Algorithm: ValuesOf[CAPICOM_HASH_ALGORITHM] => js.Promise[Unit],
    propset_DataEncoding: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] => js.Promise[Unit]
  ): CPHashedDataAsync = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], DataEncoding = DataEncoding.asInstanceOf[js.Any], Hash = Hash.asInstanceOf[js.Any], SetHashValue = SetHashValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], propset_Algorithm = js.Any.fromFunction1(propset_Algorithm), propset_DataEncoding = js.Any.fromFunction1(propset_DataEncoding))
    __obj.asInstanceOf[CPHashedDataAsync]
  }
  
  @scala.inline
  implicit class CPHashedDataAsyncMutableBuilder[Self <: CPHashedDataAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CAPICOM_HASH_ALGORITHM]]]) | PromisifiedFunction[ValuesOf[CAPICOM_HASH_ALGORITHM]]
    ): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Algorithm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataEncoding(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE]]
    ): Self = StObject.set(x, "DataEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataEncodingFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "DataEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHash(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* newVal */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* newVal */ String, Unit]])
    ): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any]) | (/* newVal */ String) => js.Promise[Unpacked[js.Any]] | Unit
    ): Self = StObject.set(x, "Hash", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_Algorithm(value: ValuesOf[CAPICOM_HASH_ALGORITHM] => js.Promise[Unit]): Self = StObject.set(x, "propset_Algorithm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_DataEncoding(value: ValuesOf[CADESCOM_CONTENT_ENCODING_TYPE] => js.Promise[Unit]): Self = StObject.set(x, "propset_DataEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHashValue(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* newVal */ String, Unit]]]) | (PromisifiedFunction[js.Function1[/* newVal */ String, Unit]])
    ): Self = StObject.set(x, "SetHashValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetHashValueFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any]) | (/* newVal */ String) => js.Promise[Unpacked[js.Any]] | Unit
    ): Self = StObject.set(x, "SetHashValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Value", js.Any.fromFunction1(value))
  }
}
