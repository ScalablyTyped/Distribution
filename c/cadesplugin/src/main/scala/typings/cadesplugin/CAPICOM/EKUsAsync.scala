package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAPICOM.EKUs> */
trait EKUsAsync extends StObject {
  
  val Count: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
  
  val Item: /* import warning: importer.ImportType#apply Failed type conversion: (index : number): cadesplugin.CAPICOM.EKU extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(index : number): cadesplugin.CAPICOM.EKU> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(index : number): cadesplugin.CAPICOM.EKU>> */ js.Any
}
object EKUsAsync {
  
  inline def apply(
    Count: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any,
    Item: /* import warning: importer.ImportType#apply Failed type conversion: (index : number): cadesplugin.CAPICOM.EKU extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(index : number): cadesplugin.CAPICOM.EKU> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(index : number): cadesplugin.CAPICOM.EKU>> */ js.Any
  ): EKUsAsync = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EKUsAsync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EKUsAsync] (val x: Self) extends AnyVal {
    
    inline def setCount(
      value: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
    ): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (index : number): cadesplugin.CAPICOM.EKU extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(index : number): cadesplugin.CAPICOM.EKU> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(index : number): cadesplugin.CAPICOM.EKU>> */ js.Any
    ): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
