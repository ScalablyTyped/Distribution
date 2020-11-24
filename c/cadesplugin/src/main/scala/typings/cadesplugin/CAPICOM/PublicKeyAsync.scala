package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon._Unpacked
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
  implicit class PublicKeyAsyncOps[Self <: PublicKeyAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlgorithmFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Algorithm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAlgorithm(value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[OID]]) | PromisifiedFunction[OID]): Self = this.set("Algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedKeyFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("EncodedKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodedKey(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[EncodedData]]) | PromisifiedFunction[EncodedData]
    ): Self = this.set("EncodedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedParametersFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("EncodedParameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodedParameters(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[EncodedData]]) | PromisifiedFunction[EncodedData]
    ): Self = this.set("EncodedParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Length", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = this.set("Length", value.asInstanceOf[js.Any])
  }
}
