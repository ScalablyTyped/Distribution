package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPSigners> */
@js.native
trait CPSignersAsync extends StObject {
  
  val Count: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double] = js.native
  
  val Item: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* index */ Double, CPSigner]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, CPSigner]]) = js.native
}
object CPSignersAsync {
  
  @scala.inline
  def apply(
    Count: (// tslint:disable-line ban-types
  js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double],
    Item: (// tslint:disable-line ban-types
  js.Promise[Unpacked[js.Function1[/* index */ Double, CPSigner]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, CPSigner]])
  ): CPSignersAsync = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPSignersAsync]
  }
  
  @scala.inline
  implicit class CPSignersAsyncMutableBuilder[Self <: CPSignersAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Count", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* index */ Double, CPSigner]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, CPSigner]])
    ): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any]) | (/* index */ Double) => CPSigner | js.Promise[Unpacked[js.Any]]
    ): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
