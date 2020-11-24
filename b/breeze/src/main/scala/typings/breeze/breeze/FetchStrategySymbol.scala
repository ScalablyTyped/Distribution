package typings.breeze.breeze

import typings.breeze.breeze.core.EnumSymbol
import typings.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchStrategySymbol extends EnumSymbol {
  
  var foo: js.Any = js.native
}
object FetchStrategySymbol {
  
  @scala.inline
  def apply(foo: js.Any, getName: () => String, parentEnum: IEnum): FetchStrategySymbol = {
    val __obj = js.Dynamic.literal(foo = foo.asInstanceOf[js.Any], getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchStrategySymbol]
  }
  
  @scala.inline
  implicit class FetchStrategySymbolOps[Self <: FetchStrategySymbol] (val x: Self) extends AnyVal {
    
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
    def setFoo(value: js.Any): Self = this.set("foo", value.asInstanceOf[js.Any])
  }
}
