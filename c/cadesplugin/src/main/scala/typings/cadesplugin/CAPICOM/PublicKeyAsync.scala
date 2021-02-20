package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon._Unpacked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.PublicKey> */
@js.native
trait PublicKeyAsync
  extends _Unpacked[js.Any] {
  
  val Algorithm: (// tslint:disable-line ban-types
  js.Promise[Unpacked[OID]]) | PromisifiedFunction[OID] = js.native
  
  val EncodedKey: (// tslint:disable-line ban-types
  js.Promise[Unpacked[EncodedData]]) | PromisifiedFunction[EncodedData] = js.native
  
  val EncodedParameters: (// tslint:disable-line ban-types
  js.Promise[Unpacked[EncodedData]]) | PromisifiedFunction[EncodedData] = js.native
  
  val Length: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double] = js.native
}
object PublicKeyAsync {
  
  @scala.inline
  def apply(
    Algorithm: (// tslint:disable-line ban-types
  js.Promise[Unpacked[OID]]) | PromisifiedFunction[OID],
    EncodedKey: (// tslint:disable-line ban-types
  js.Promise[Unpacked[EncodedData]]) | PromisifiedFunction[EncodedData],
    EncodedParameters: (// tslint:disable-line ban-types
  js.Promise[Unpacked[EncodedData]]) | PromisifiedFunction[EncodedData],
    Length: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
  ): PublicKeyAsync = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], EncodedKey = EncodedKey.asInstanceOf[js.Any], EncodedParameters = EncodedParameters.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyAsync]
  }
  
  @scala.inline
  implicit class PublicKeyAsyncMutableBuilder[Self <: PublicKeyAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[OID]]) | PromisifiedFunction[OID]): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Algorithm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodedKey(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[EncodedData]]) | PromisifiedFunction[EncodedData]
    ): Self = StObject.set(x, "EncodedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedKeyFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "EncodedKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodedParameters(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[EncodedData]]) | PromisifiedFunction[EncodedData]
    ): Self = StObject.set(x, "EncodedParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedParametersFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "EncodedParameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Length", js.Any.fromFunction1(value))
  }
}
