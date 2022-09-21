package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon.ValuesOf
import typings.cadesplugin.CADESCommon._Unpacked
import typings.cadesplugin.CAPICOM.CAPICOM_ENCODING_TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPAttribute> */
trait CPAttributeAsync
  extends StObject
     with _Unpacked[Any] {
  
  val Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_ATTRIBUTE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_ATTRIBUTE]]
  
  val Value: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Any]]) | PromisifiedFunction[Any]
  
  val ValueEncoding: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CAPICOM_ENCODING_TYPE]]
  
  def propset_Name(name: ValuesOf[CADESCOM_ATTRIBUTE]): js.Promise[Unit]
  
  def propset_Value(value: Any): js.Promise[Unit]
  
  def propset_ValueEncoding(valueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE]): js.Promise[Unit]
}
object CPAttributeAsync {
  
  inline def apply(
    Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CADESCOM_ATTRIBUTE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_ATTRIBUTE]],
    Value: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Any]]) | PromisifiedFunction[Any],
    ValueEncoding: (// tslint:disable-line ban-types
  js.Promise[Unpacked[ValuesOf[CAPICOM_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CAPICOM_ENCODING_TYPE]],
    propset_Name: ValuesOf[CADESCOM_ATTRIBUTE] => js.Promise[Unit],
    propset_Value: Any => js.Promise[Unit],
    propset_ValueEncoding: ValuesOf[CAPICOM_ENCODING_TYPE] => js.Promise[Unit]
  ): CPAttributeAsync = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueEncoding = ValueEncoding.asInstanceOf[js.Any], propset_Name = js.Any.fromFunction1(propset_Name), propset_Value = js.Any.fromFunction1(propset_Value), propset_ValueEncoding = js.Any.fromFunction1(propset_ValueEncoding))
    __obj.asInstanceOf[CPAttributeAsync]
  }
  
  extension [Self <: CPAttributeAsync](x: Self) {
    
    inline def setName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CADESCOM_ATTRIBUTE]]]) | PromisifiedFunction[ValuesOf[CADESCOM_ATTRIBUTE]]
    ): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Name", js.Any.fromFunction1(value))
    
    inline def setPropset_Name(value: ValuesOf[CADESCOM_ATTRIBUTE] => js.Promise[Unit]): Self = StObject.set(x, "propset_Name", js.Any.fromFunction1(value))
    
    inline def setPropset_Value(value: Any => js.Promise[Unit]): Self = StObject.set(x, "propset_Value", js.Any.fromFunction1(value))
    
    inline def setPropset_ValueEncoding(value: ValuesOf[CAPICOM_ENCODING_TYPE] => js.Promise[Unit]): Self = StObject.set(x, "propset_ValueEncoding", js.Any.fromFunction1(value))
    
    inline def setValue(value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Any]]) | PromisifiedFunction[Any]): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueEncoding(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[ValuesOf[CAPICOM_ENCODING_TYPE]]]) | PromisifiedFunction[ValuesOf[CAPICOM_ENCODING_TYPE]]
    ): Self = StObject.set(x, "ValueEncoding", value.asInstanceOf[js.Any])
    
    inline def setValueEncodingFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "ValueEncoding", js.Any.fromFunction1(value))
    
    inline def setValueFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "Value", js.Any.fromFunction1(value))
  }
}
