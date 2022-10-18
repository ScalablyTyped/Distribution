package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.ExtendedKeyUsage> */
trait ExtendedKeyUsageAsync extends StObject {
  
  val EKUs: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.EKUs extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.EKUs> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.EKUs>> */ js.Any
  
  val IsCritical: /* import warning: importer.ImportType#apply Failed type conversion: (): boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): boolean> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(): boolean>> */ js.Any
  
  val IsPresent: /* import warning: importer.ImportType#apply Failed type conversion: (): boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): boolean> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(): boolean>> */ js.Any
}
object ExtendedKeyUsageAsync {
  
  inline def apply(
    EKUs: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.EKUs extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.EKUs> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.EKUs>> */ js.Any,
    IsCritical: /* import warning: importer.ImportType#apply Failed type conversion: (): boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): boolean> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(): boolean>> */ js.Any,
    IsPresent: /* import warning: importer.ImportType#apply Failed type conversion: (): boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): boolean> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(): boolean>> */ js.Any
  ): ExtendedKeyUsageAsync = {
    val __obj = js.Dynamic.literal(EKUs = EKUs.asInstanceOf[js.Any], IsCritical = IsCritical.asInstanceOf[js.Any], IsPresent = IsPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedKeyUsageAsync]
  }
  
  extension [Self <: ExtendedKeyUsageAsync](x: Self) {
    
    inline def setEKUs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: cadesplugin.CAPICOM.EKUs extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<cadesplugin.CAPICOM.EKUs> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<cadesplugin.CAPICOM.EKUs>> */ js.Any
    ): Self = StObject.set(x, "EKUs", value.asInstanceOf[js.Any])
    
    inline def setIsCritical(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (): boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): boolean> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(): boolean>> */ js.Any
    ): Self = StObject.set(x, "IsCritical", value.asInstanceOf[js.Any])
    
    inline def setIsPresent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (): boolean extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(): boolean> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(): boolean>> */ js.Any
    ): Self = StObject.set(x, "IsPresent", value.asInstanceOf[js.Any])
  }
}
