package typings.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.TopLevel
import typings.cadesplugin.CADESCommon.PromisifiedFunction
import typings.cadesplugin.CADESCommon.Unpacked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent cadesplugin.CADES_Common.Async<cadesplugin.CAdESCOM.CPSigners> */
@js.native
trait CPSignersAsync extends js.Object {
  
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
  implicit class CPSignersAsyncOps[Self <: CPSignersAsync] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCountFunction1(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any] => js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Count", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCount(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[Double]]) | PromisifiedFunction[Double]
    ): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemFunction1(
      value: (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof any ]: cadesplugin.CADES_Common.Unpacked<any[K]>}
      */ /* args */ typings.cadesplugin.cadespluginStrings.PromisifiedFunction with TopLevel[js.Any]) | (/* index */ Double) => CPSigner | js.Promise[Unpacked[js.Any]]
    ): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(
      value: (// tslint:disable-line ban-types
    js.Promise[Unpacked[js.Function1[/* index */ Double, CPSigner]]]) | (PromisifiedFunction[js.Function1[/* index */ Double, CPSigner]])
    ): Self = this.set("Item", value.asInstanceOf[js.Any])
  }
}
