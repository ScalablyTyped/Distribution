package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPSigners> */
trait CPSignersAsync extends StObject {
  
  val Count: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
  
  val Item: /* import warning: importer.ImportType#apply Failed type conversion: (index : number): cadesplugin.CAdESCOM.CPSigner extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(index : number): cadesplugin.CAdESCOM.CPSigner> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(index : number): cadesplugin.CAdESCOM.CPSigner>> */ js.Any
}
object CPSignersAsync {
  
  inline def apply(
    Count: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any,
    Item: /* import warning: importer.ImportType#apply Failed type conversion: (index : number): cadesplugin.CAdESCOM.CPSigner extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(index : number): cadesplugin.CAdESCOM.CPSigner> : // tslint:disable-line ban-types
  std.Promise<cadesplugin.CADES_Common.Unpacked<(index : number): cadesplugin.CAdESCOM.CPSigner>> */ js.Any
  ): CPSignersAsync = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPSignersAsync]
  }
  
  extension [Self <: CPSignersAsync](x: Self) {
    
    inline def setCount(
      value: /* import warning: importer.ImportType#apply Failed type conversion: number extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<number> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<number>> */ js.Any
    ): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(
      value: /* import warning: importer.ImportType#apply Failed type conversion: (index : number): cadesplugin.CAdESCOM.CPSigner extends std.Function ? cadesplugin.CADES_Common.PromisifiedFunction<(index : number): cadesplugin.CAdESCOM.CPSigner> : // tslint:disable-line ban-types
    std.Promise<cadesplugin.CADES_Common.Unpacked<(index : number): cadesplugin.CAdESCOM.CPSigner>> */ js.Any
    ): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
  }
}
