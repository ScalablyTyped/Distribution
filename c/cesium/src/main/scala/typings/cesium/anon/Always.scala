package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Always extends js.Object {
  
  def always(e: js.Any, t: js.Any): js.Any = js.native
  
  def otherwise(e: js.Any): js.Any = js.native
  
  def spread(t: js.Any): js.Any = js.native
  
  def `then`(e: js.Any): js.Any = js.native
  
  def `yield`(e: js.Any): js.Any = js.native
}
object Always {
  
  @scala.inline
  def apply(
    always: (js.Any, js.Any) => js.Any,
    otherwise: js.Any => js.Any,
    spread: js.Any => js.Any,
    `then`: js.Any => js.Any,
    `yield`: js.Any => js.Any
  ): Always = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction2(always), otherwise = js.Any.fromFunction1(otherwise), spread = js.Any.fromFunction1(spread))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.updateDynamic("yield")(js.Any.fromFunction1(`yield`))
    __obj.asInstanceOf[Always]
  }
  
  @scala.inline
  implicit class AlwaysOps[Self <: Always] (val x: Self) extends AnyVal {
    
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
    def setAlways(value: (js.Any, js.Any) => js.Any): Self = this.set("always", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOtherwise(value: js.Any => js.Any): Self = this.set("otherwise", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpread(value: js.Any => js.Any): Self = this.set("spread", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThen(value: js.Any => js.Any): Self = this.set("then", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYield(value: js.Any => js.Any): Self = this.set("yield", js.Any.fromFunction1(value))
  }
}
