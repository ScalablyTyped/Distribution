package typings.chance.anon

import typings.chance.chanceStrings.lower
import typings.chance.chanceStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.StringOptions> */
@js.native
trait PartialStringOptions extends js.Object {
  
  var alpha: js.UndefOr[Boolean] = js.native
  
  var casing: js.UndefOr[upper | lower] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var numeric: js.UndefOr[Boolean] = js.native
  
  var pool: js.UndefOr[String] = js.native
  
  var symbols: js.UndefOr[Boolean] = js.native
}
object PartialStringOptions {
  
  @scala.inline
  def apply(): PartialStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStringOptions]
  }
  
  @scala.inline
  implicit class PartialStringOptionsOps[Self <: PartialStringOptions] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Boolean): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setCasing(value: upper | lower): Self = this.set("casing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCasing: Self = this.set("casing", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setNumeric(value: Boolean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    
    @scala.inline
    def setPool(value: String): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    
    @scala.inline
    def setSymbols(value: Boolean): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
  }
}
