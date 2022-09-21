package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import typings.cadesplugin.CADESCommon._Unpacked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.ExtendedKeyUsage> */
trait ExtendedKeyUsageAsync
  extends StObject
     with _Unpacked[Any] {
  
  val EKUs: (// tslint:disable-line ban-types
  js.Promise[Unpacked[typings.cadesplugin.CAPICOM.EKUs]]) | PromisifiedFunction[typings.cadesplugin.CAPICOM.EKUs]
  
  val IsCritical: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
  
  val IsPresent: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
}
object ExtendedKeyUsageAsync {
  
  inline def apply(
    EKUs: (// tslint:disable-line ban-types
  js.Promise[Unpacked[EKUs]]) | PromisifiedFunction[EKUs],
    IsCritical: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]],
    IsPresent: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
  ): ExtendedKeyUsageAsync = {
    val __obj = js.Dynamic.literal(EKUs = EKUs.asInstanceOf[js.Any], IsCritical = IsCritical.asInstanceOf[js.Any], IsPresent = IsPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedKeyUsageAsync]
  }
  
  extension [Self <: ExtendedKeyUsageAsync](x: Self) {
    
    inline def setEKUs(value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[EKUs]]) | PromisifiedFunction[EKUs]): Self = StObject.set(x, "EKUs", value.asInstanceOf[js.Any])
    
    inline def setEKUsFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "EKUs", js.Any.fromFunction1(value))
    
    inline def setIsCritical(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
    ): Self = StObject.set(x, "IsCritical", value.asInstanceOf[js.Any])
    
    inline def setIsCriticalFunction0(value: () => Boolean): Self = StObject.set(x, "IsCritical", js.Any.fromFunction0(value))
    
    inline def setIsCriticalFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "IsCritical", js.Any.fromFunction1(value))
    
    inline def setIsPresent(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function0[Boolean]]]) | PromisifiedFunction[js.Function0[Boolean]]
    ): Self = StObject.set(x, "IsPresent", value.asInstanceOf[js.Any])
    
    inline def setIsPresentFunction0(value: () => Boolean): Self = StObject.set(x, "IsPresent", js.Any.fromFunction0(value))
    
    inline def setIsPresentFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction & TopLevel[Any] => js.Promise[Unpacked[Any]]
    ): Self = StObject.set(x, "IsPresent", js.Any.fromFunction1(value))
  }
}
