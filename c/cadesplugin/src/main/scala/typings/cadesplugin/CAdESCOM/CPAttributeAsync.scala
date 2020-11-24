package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPAttribute> */
@js.native
trait CPAttributeAsync extends js.Object {
  
  val Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_ATTRIBUTE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_ATTRIBUTE]] = js.native
  
  val Value: (// tslint:disable-line ban-types
  js.Promise[Unpacked[_]]) | PromisifiedFunction[_] = js.native
  
  val ValueEncoding: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CAPICOM_ENCODING_TYPE]] = js.native
  
  def propset_Name(name: ValuesOf[CADESCOM_ATTRIBUTE]): js.Promise[Unit] = js.native
  
  def propset_Value(value: js.Any): js.Promise[Unit] = js.native
  
  def propset_ValueEncoding(valueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE]): js.Promise[Unit] = js.native
}
object CPAttributeAsync {
  
  @scala.inline
  def apply(
    Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_ATTRIBUTE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_ATTRIBUTE]],
    Value: (// tslint:disable-line ban-types
  js.Promise[Unpacked[_]]) | PromisifiedFunction[_],
    ValueEncoding: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CAPICOM_ENCODING_TYPE]],
    propset_Name: ValuesOf[CADESCOM_ATTRIBUTE] => js.Promise[Unit],
    propset_Value: js.Any => js.Promise[Unit],
    propset_ValueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE] => js.Promise[Unit]
  ): CPAttributeAsync = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueEncoding = ValueEncoding.asInstanceOf[js.Any], propset_Name = js.Any.fromFunction1(propset_Name), propset_Value = js.Any.fromFunction1(propset_Value), propset_ValueEncoding = js.Any.fromFunction1(propset_ValueEncoding))
    __obj.asInstanceOf[CPAttributeAsync]
  }
  
  @scala.inline
  implicit class CPAttributeAsyncOps[Self <: CPAttributeAsync] (val x: Self) extends AnyVal {
    
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
    def setNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CADESCOM_ATTRIBUTE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_ATTRIBUTE]]
    ): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Value", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[_]]) | PromisifiedFunction[_]): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueEncodingFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("ValueEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueEncoding(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CAPICOM_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CAPICOM_ENCODING_TYPE]]
    ): Self = this.set("ValueEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropset_Name(value: ValuesOf[CADESCOM_ATTRIBUTE] => js.Promise[Unit]): Self = this.set("propset_Name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_Value(value: js.Any => js.Promise[Unit]): Self = this.set("propset_Value", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPropset_ValueEncoding(value: ValuesOf[CAPICOM_ENCODING_TYPE] => js.Promise[Unit]): Self = this.set("propset_ValueEncoding", js.Any.fromFunction1(value))
  }
}
