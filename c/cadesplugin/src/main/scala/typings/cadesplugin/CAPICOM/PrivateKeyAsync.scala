package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon._Unpacked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.PrivateKey> */
trait PrivateKeyAsync
  extends StObject
     with _Unpacked[Any] {
  
  val CachePin: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Boolean]]) | PromisifiedFunction[Boolean]
  
  val ChangePin: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]]
  
  val ContainerName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val KeyPin: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val KeySpec: (// tslint:disable-line ban-types
  js.Promise[Unpacked[CAPICOM_KEY_SPEC]]) | PromisifiedFunction[CAPICOM_KEY_SPEC]
  
  val ProviderName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  val ProviderType: (// tslint:disable-line ban-types
  js.Promise[Unpacked[CAPICOM_PROV_TYPE]]) | PromisifiedFunction[CAPICOM_PROV_TYPE]
  
  val UniqueContainerName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
  
  def propset_CachePin(cachePin: Boolean): js.Promise[Boolean]
}
object PrivateKeyAsync {
  
  inline def apply(
    CachePin: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Boolean]]) | PromisifiedFunction[Boolean],
    ChangePin: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]],
    ContainerName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    KeyPin: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    KeySpec: (// tslint:disable-line ban-types
  js.Promise[Unpacked[CAPICOM_KEY_SPEC]]) | PromisifiedFunction[CAPICOM_KEY_SPEC],
    ProviderName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    ProviderType: (// tslint:disable-line ban-types
  js.Promise[Unpacked[CAPICOM_PROV_TYPE]]) | PromisifiedFunction[CAPICOM_PROV_TYPE],
    UniqueContainerName: (// tslint:disable-line ban-types
  js.Promise[Unpacked[String]]) | PromisifiedFunction[String],
    propset_CachePin: Boolean => js.Promise[Boolean]
  ): PrivateKeyAsync = {
    val __obj = js.Dynamic.literal(CachePin = CachePin.asInstanceOf[js.Any], ChangePin = ChangePin.asInstanceOf[js.Any], ContainerName = ContainerName.asInstanceOf[js.Any], KeyPin = KeyPin.asInstanceOf[js.Any], KeySpec = KeySpec.asInstanceOf[js.Any], ProviderName = ProviderName.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any], UniqueContainerName = UniqueContainerName.asInstanceOf[js.Any], propset_CachePin = js.Any.fromFunction1(propset_CachePin))
    __obj.asInstanceOf[PrivateKeyAsync]
  }
  
  extension [Self <: PrivateKeyAsync](x: Self) {
    
    inline def setCachePin(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Boolean]]) | PromisifiedFunction[Boolean]
    ): Self = StObject.set(x, "CachePin", value.asInstanceOf[js.Any])
    
    inline def setCachePinFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "CachePin", js.Any.fromFunction1(value))
    
    inline def setChangePin(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Unit]]]) | PromisifiedFunction[js.Function0[Unit]]
    ): Self = StObject.set(x, "ChangePin", value.asInstanceOf[js.Any])
    
    inline def setChangePinFunction0(value: () => Unit): Self = StObject.set(x, "ChangePin", js.Any.fromFunction0(value))
    
    inline def setChangePinFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "ChangePin", js.Any.fromFunction1(value))
    
    inline def setContainerName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    inline def setContainerNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "ContainerName", js.Any.fromFunction1(value))
    
    inline def setKeyPin(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "KeyPin", value.asInstanceOf[js.Any])
    
    inline def setKeyPinFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "KeyPin", js.Any.fromFunction1(value))
    
    inline def setKeySpec(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[CAPICOM_KEY_SPEC]]) | PromisifiedFunction[CAPICOM_KEY_SPEC]
    ): Self = StObject.set(x, "KeySpec", value.asInstanceOf[js.Any])
    
    inline def setKeySpecFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "KeySpec", js.Any.fromFunction1(value))
    
    inline def setPropset_CachePin(value: Boolean => js.Promise[Boolean]): Self = StObject.set(x, "propset_CachePin", js.Any.fromFunction1(value))
    
    inline def setProviderName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "ProviderName", js.Any.fromFunction1(value))
    
    inline def setProviderType(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[CAPICOM_PROV_TYPE]]) | PromisifiedFunction[CAPICOM_PROV_TYPE]
    ): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "ProviderType", js.Any.fromFunction1(value))
    
    inline def setUniqueContainerName(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[String]]) | PromisifiedFunction[String]
    ): Self = StObject.set(x, "UniqueContainerName", value.asInstanceOf[js.Any])
    
    inline def setUniqueContainerNameFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "UniqueContainerName", js.Any.fromFunction1(value))
  }
}
