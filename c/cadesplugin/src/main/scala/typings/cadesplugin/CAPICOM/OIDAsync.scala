package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon._Unpacked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.OID> */
trait OIDAsync
  extends StObject
     with _Unpacked[js.Any] {
  
  val FriendlyName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[CAPICOM_OID]]) | PromisifiedFunction[CAPICOM_OID]
  
  val Value: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
}
object OIDAsync {
  
  @scala.inline
  def apply(
    FriendlyName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    Name: (// tslint:disable-line ban-types
  js.Promise[Unpacked[CAPICOM_OID]]) | PromisifiedFunction[CAPICOM_OID],
    Value: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  ): OIDAsync = {
    val __obj = js.Dynamic.literal(FriendlyName = FriendlyName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OIDAsync]
  }
  
  @scala.inline
  implicit class OIDAsyncMutableBuilder[Self <: OIDAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendlyName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "FriendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "FriendlyName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[CAPICOM_OID]]) | PromisifiedFunction[CAPICOM_OID]
    ): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Name", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Value", js.Any.fromFunction1(value))
  }
}
