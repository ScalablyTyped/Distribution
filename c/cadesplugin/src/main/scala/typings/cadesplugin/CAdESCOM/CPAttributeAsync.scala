package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPAttribute> */
trait CPAttributeAsync extends StObject {
  
  val Name: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE>>> */ js.Any
  
  val Value: /* import warning: importer.ImportType#apply Failed type conversion: any extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<any> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<any>> */ js.Any
  
  val ValueEncoding: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE>>> */ js.Any
  
  def propset_Name(name: ValuesOf[CADESCOM_ATTRIBUTE]): js.Promise[Unit]
  
  def propset_Value(value: Any): js.Promise[Unit]
  
  def propset_ValueEncoding(valueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE]): js.Promise[Unit]
}
object CPAttributeAsync {
  
  inline def apply(
    Name: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE>>> */ js.Any,
    Value: /* import warning: importer.ImportType#apply Failed type conversion: any extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<any> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<any>> */ js.Any,
    ValueEncoding: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE>> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE>>> */ js.Any,
    propset_Name: ValuesOf[CADESCOM_ATTRIBUTE] => js.Promise[Unit],
    propset_Value: Any => js.Promise[Unit],
    propset_ValueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE] => js.Promise[Unit]
  ): CPAttributeAsync = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueEncoding = ValueEncoding.asInstanceOf[js.Any], propset_Name = js.Any.fromFunction1(propset_Name), propset_Value = js.Any.fromFunction1(propset_Value), propset_ValueEncoding = js.Any.fromFunction1(propset_ValueEncoding))
    __obj.asInstanceOf[CPAttributeAsync]
  }
  
  extension [Self <: CPAttributeAsync](x: Self) {
    
    inline def setName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE>> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE>>> */ js.Any
    ): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPropset_Name(value: ValuesOf[CADESCOM_ATTRIBUTE] => js.Promise[Unit]): Self = StObject.set(x, "propset_Name", js.Any.fromFunction1(value))
    
    inline def setPropset_Value(value: Any => js.Promise[Unit]): Self = StObject.set(x, "propset_Value", js.Any.fromFunction1(value))
    
    inline def setPropset_ValueEncoding(value: ValuesOf[CAPICOM_ENCODING_TYPE] => js.Promise[Unit]): Self = StObject.set(x, "propset_ValueEncoding", js.Any.fromFunction1(value))
    
    inline def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: any extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<any> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<any>> */ js.Any
    ): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueEncoding(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE> extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE>> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CADES_Common.ValuesOf<cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE>>> */ js.Any
    ): Self = StObject.set(x, "ValueEncoding", value.asInstanceOf[js.Any])
  }
}
