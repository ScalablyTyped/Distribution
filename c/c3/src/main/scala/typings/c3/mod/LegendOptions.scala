package typings.c3.mod

import typings.c3.anon.Anchor
import typings.c3.anon.Onclick
import typings.c3.c3Strings.bottom
import typings.c3.c3Strings.inset
import typings.c3.c3Strings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendOptions extends js.Object {
  
  /**
    * Defaults to `false`.
    */
  var equally: js.UndefOr[Boolean] = js.native
  
  /**
    * Hide legend
    * If true given, all legend will be hidden. If string or array given, only the legend that has the id will be hidden.
    * Defaults to `false`.
    */
  var hide: js.UndefOr[Boolean | ArrayOrString] = js.native
  
  /**
    * Change inset legend attributes. Ignored unless `legend.position` is `"inset"`.
    */
  var inset: js.UndefOr[Anchor] = js.native
  
  var item: js.UndefOr[Onclick] = js.native
  
  /**
    * Padding between legend elements.
    * Defaults to `0`.
    */
  var padding: js.UndefOr[Double] = js.native
  
  /**
    * Change the position of legend.
    */
  var position: js.UndefOr[bottom | right | inset] = js.native
  
  /**
    * Show or hide legend.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.native
}
object LegendOptions {
  
  @scala.inline
  def apply(): LegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendOptions]
  }
  
  @scala.inline
  implicit class LegendOptionsOps[Self <: LegendOptions] (val x: Self) extends AnyVal {
    
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
    def setEqually(value: Boolean): Self = this.set("equally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEqually: Self = this.set("equally", js.undefined)
    
    @scala.inline
    def setHideVarargs(value: String*): Self = this.set("hide", js.Array(value :_*))
    
    @scala.inline
    def setHide(value: Boolean | ArrayOrString): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setInset(value: Anchor): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    
    @scala.inline
    def setItem(value: Onclick): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPosition(value: bottom | right | inset): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
