package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon._Unpacked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.EncodedData> */
@js.native
trait EncodedDataAsync
  extends _Unpacked[js.Any] {
  
  val Format: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String] = js.native
  
  val Value: (// tslint:disable-line ban-types
  js.Promise[
    Unpacked[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]]
  ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]]) = js.native
}
object EncodedDataAsync {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class EncodedDataAsyncOps[Self <: EncodedDataAsync] (val x: Self) extends AnyVal {
    
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
    def setFormatFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFunction1(
      value: js.UndefOr[
          (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any]) | CAPICOM_ENCODING_TYPE
        ] => js.Promise[Unpacked[js.Any]] | String
    ): Self = this.set("Value", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(
      value: (// tslint:disable-line ban-types
    js.Promise[
          Unpacked[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]]
        ]) | (PromisifiedFunction[js.Function1[/* EncodingType */ js.UndefOr[CAPICOM_ENCODING_TYPE], String]])
    ): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
