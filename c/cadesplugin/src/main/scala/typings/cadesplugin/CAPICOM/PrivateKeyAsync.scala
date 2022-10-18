package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.PrivateKey> */
trait PrivateKeyAsync extends StObject {
  
  val CachePin: /* import warning: importer.ImportType#apply Failed type conversion: boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<boolean> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<boolean>> */ js.Any
  
  val ChangePin: /* import warning: importer.ImportType#apply Failed type conversion: (): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(): void>> */ js.Any
  
  val ContainerName: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  val KeyPin: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  val KeySpec: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.CAPICOM_KEY_SPEC extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.CAPICOM_KEY_SPEC> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.CAPICOM_KEY_SPEC>> */ js.Any
  
  val ProviderName: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  val ProviderType: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.CAPICOM_PROV_TYPE extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.CAPICOM_PROV_TYPE> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.CAPICOM_PROV_TYPE>> */ js.Any
  
  val UniqueContainerName: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
  
  def propset_CachePin(cachePin: Boolean): js.Promise[Boolean]
}
object PrivateKeyAsync {
  
  inline def apply(
    CachePin: /* import warning: importer.ImportType#apply Failed type conversion: boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<boolean> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<boolean>> */ js.Any,
    ChangePin: /* import warning: importer.ImportType#apply Failed type conversion: (): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): void> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(): void>> */ js.Any,
    ContainerName: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    KeyPin: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    KeySpec: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.CAPICOM_KEY_SPEC extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.CAPICOM_KEY_SPEC> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.CAPICOM_KEY_SPEC>> */ js.Any,
    ProviderName: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    ProviderType: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.CAPICOM_PROV_TYPE extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.CAPICOM_PROV_TYPE> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.CAPICOM_PROV_TYPE>> */ js.Any,
    UniqueContainerName: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any,
    propset_CachePin: Boolean => js.Promise[Boolean]
  ): PrivateKeyAsync = {
    val __obj = js.Dynamic.literal(CachePin = CachePin.asInstanceOf[js.Any], ChangePin = ChangePin.asInstanceOf[js.Any], ContainerName = ContainerName.asInstanceOf[js.Any], KeyPin = KeyPin.asInstanceOf[js.Any], KeySpec = KeySpec.asInstanceOf[js.Any], ProviderName = ProviderName.asInstanceOf[js.Any], ProviderType = ProviderType.asInstanceOf[js.Any], UniqueContainerName = UniqueContainerName.asInstanceOf[js.Any], propset_CachePin = js.Any.fromFunction1(propset_CachePin))
    __obj.asInstanceOf[PrivateKeyAsync]
  }
  
  extension [Self <: PrivateKeyAsync](x: Self) {
    
    inline def setCachePin(
      value: /* import warning: importer.ImportType#apply Failed type conversion: boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<boolean> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<boolean>> */ js.Any
    ): Self = StObject.set(x, "CachePin", value.asInstanceOf[js.Any])
    
    inline def setChangePin(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (): void extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): void> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(): void>> */ js.Any
    ): Self = StObject.set(x, "ChangePin", value.asInstanceOf[js.Any])
    
    inline def setContainerName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
    
    inline def setKeyPin(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "KeyPin", value.asInstanceOf[js.Any])
    
    inline def setKeySpec(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.CAPICOM_KEY_SPEC extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.CAPICOM_KEY_SPEC> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.CAPICOM_KEY_SPEC>> */ js.Any
    ): Self = StObject.set(x, "KeySpec", value.asInstanceOf[js.Any])
    
    inline def setPropset_CachePin(value: Boolean => js.Promise[Boolean]): Self = StObject.set(x, "propset_CachePin", js.Any.fromFunction1(value))
    
    inline def setProviderName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "ProviderName", value.asInstanceOf[js.Any])
    
    inline def setProviderType(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.CAPICOM_PROV_TYPE extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.CAPICOM_PROV_TYPE> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.CAPICOM_PROV_TYPE>> */ js.Any
    ): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setUniqueContainerName(
      value: /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<string> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<string>> */ js.Any
    ): Self = StObject.set(x, "UniqueContainerName", value.asInstanceOf[js.Any])
  }
}
