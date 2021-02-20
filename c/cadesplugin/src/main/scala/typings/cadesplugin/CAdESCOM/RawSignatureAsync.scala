package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CAPICOM.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.RawSignature> */
@js.native
trait RawSignatureAsync extends StObject {
  
  val SignHash: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function2[/* hash */ CPHashedData, /* certificate */ js.UndefOr[String], String]
    ]
  ]) | (PromisifiedFunction[
    js.Function2[/* hash */ CPHashedData, /* certificate */ js.UndefOr[String], String]
  ]) = js.native
  
  val VerifyHash: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[
      js.Function3[/* hash */ CPHashedData, /* certificate */ Certificate, /* signature */ String, Unit]
    ]
  ]) | (PromisifiedFunction[
    js.Function3[/* hash */ CPHashedData, /* certificate */ Certificate, /* signature */ String, Unit]
  ]) = js.native
}
object RawSignatureAsync {
  
  @scala.inline
  def apply(
    SignHash: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function2[/* hash */ CPHashedData, /* certificate */ js.UndefOr[String], String]
      ]
    ]) | (PromisifiedFunction[
      js.Function2[/* hash */ CPHashedData, /* certificate */ js.UndefOr[String], String]
    ]),
    VerifyHash: (// tslint:disable-line ban-types
  js.Promise[
      Unpacked[
        js.Function3[/* hash */ CPHashedData, /* certificate */ Certificate, /* signature */ String, Unit]
      ]
    ]) | (PromisifiedFunction[
      js.Function3[/* hash */ CPHashedData, /* certificate */ Certificate, /* signature */ String, Unit]
    ])
  ): RawSignatureAsync = {
    val __obj = js.Dynamic.literal(SignHash = SignHash.asInstanceOf[js.Any], VerifyHash = VerifyHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawSignatureAsync]
  }
  
  @scala.inline
  implicit class RawSignatureAsyncMutableBuilder[Self <: RawSignatureAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignHash(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function2[/* hash */ CPHashedData, /* certificate */ js.UndefOr[String], String]
          ]
        ]) | (PromisifiedFunction[
          js.Function2[/* hash */ CPHashedData, /* certificate */ js.UndefOr[String], String]
        ])
    ): Self = StObject.set(x, "SignHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignHashFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "SignHash", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignHashFunction2(value: (/* hash */ CPHashedData, /* certificate */ js.UndefOr[String]) => String): Self = StObject.set(x, "SignHash", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVerifyHash(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[
            js.Function3[/* hash */ CPHashedData, /* certificate */ Certificate, /* signature */ String, Unit]
          ]
        ]) | (PromisifiedFunction[
          js.Function3[/* hash */ CPHashedData, /* certificate */ Certificate, /* signature */ String, Unit]
        ])
    ): Self = StObject.set(x, "VerifyHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifyHashFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "VerifyHash", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerifyHashFunction3(value: (/* hash */ CPHashedData, /* certificate */ Certificate, /* signature */ String) => Unit): Self = StObject.set(x, "VerifyHash", js.Any.fromFunction3(value))
  }
}
