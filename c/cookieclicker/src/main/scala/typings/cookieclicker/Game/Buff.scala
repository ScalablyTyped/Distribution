package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerNumbers.`1`
import typings.cookieclicker.cookieclickerNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Buff extends js.Object {
  
  /**
    * If true, when a buff it gained when it already exists, adds the buff times together
    */
  var add: js.UndefOr[Boolean] = js.native
  
  /**
    * If 1, show the good aura, if 2, show the bad aura
    */
  var aura: js.UndefOr[`1` | `2`] = js.native
  
  var desc: String = js.native
  
  var icon: Icon = js.native
  
  /**
    * If true, when a buff it gained when it already exists, use the maximum buff time of the two
    */
  var max: js.UndefOr[Boolean] = js.native
  
  var multClick: js.UndefOr[Double] = js.native
  
  var multCpS: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var onDie: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Rarely used, as of v2.031 only Cursed Finger uses this
    */
  var pow: js.UndefOr[Double] = js.native
  
  /**
    * The amount of time this buff exists for, in frames
    */
  var time: Double = js.native
  
  /** @deprecated */
  var visible: js.UndefOr[Boolean] = js.native
}
object Buff {
  
  @scala.inline
  def apply(desc: String, icon: Icon, name: String, time: Double): Buff = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buff]
  }
  
  @scala.inline
  implicit class BuffOps[Self <: Buff] (val x: Self) extends AnyVal {
    
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
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdd(value: Boolean): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAura(value: `1` | `2`): Self = this.set("aura", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAura: Self = this.set("aura", js.undefined)
    
    @scala.inline
    def setMax(value: Boolean): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMultClick(value: Double): Self = this.set("multClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultClick: Self = this.set("multClick", js.undefined)
    
    @scala.inline
    def setMultCpS(value: Double): Self = this.set("multCpS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultCpS: Self = this.set("multCpS", js.undefined)
    
    @scala.inline
    def setOnDie(value: () => Unit): Self = this.set("onDie", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnDie: Self = this.set("onDie", js.undefined)
    
    @scala.inline
    def setPow(value: Double): Self = this.set("pow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePow: Self = this.set("pow", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
