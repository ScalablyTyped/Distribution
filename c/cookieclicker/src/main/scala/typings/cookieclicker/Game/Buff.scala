package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerNumbers.`1`
import typings.cookieclicker.cookieclickerNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buff extends StObject {
  
  /**
    * If true, when a buff it gained when it already exists, adds the buff times together
    */
  var add: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If 1, show the good aura, if 2, show the bad aura
    */
  var aura: js.UndefOr[`1` | `2`] = js.undefined
  
  var desc: String
  
  var icon: Icon
  
  /**
    * If true, when a buff it gained when it already exists, use the maximum buff time of the two
    */
  var max: js.UndefOr[Boolean] = js.undefined
  
  var multClick: js.UndefOr[Double] = js.undefined
  
  var multCpS: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var onDie: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Rarely used, as of v2.031 only Cursed Finger uses this
    */
  var pow: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of time this buff exists for, in frames
    */
  var time: Double
  
  /** @deprecated */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Buff {
  
  @scala.inline
  def apply(desc: String, icon: Icon, name: String, time: Double): Buff = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buff]
  }
  
  @scala.inline
  implicit class BuffMutableBuilder[Self <: Buff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    @scala.inline
    def setAura(value: `1` | `2`): Self = StObject.set(x, "aura", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuraUndefined: Self = StObject.set(x, "aura", js.undefined)
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Boolean): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMultClick(value: Double): Self = StObject.set(x, "multClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultClickUndefined: Self = StObject.set(x, "multClick", js.undefined)
    
    @scala.inline
    def setMultCpS(value: Double): Self = StObject.set(x, "multCpS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultCpSUndefined: Self = StObject.set(x, "multCpS", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDie(value: () => Unit): Self = StObject.set(x, "onDie", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDieUndefined: Self = StObject.set(x, "onDie", js.undefined)
    
    @scala.inline
    def setPow(value: Double): Self = StObject.set(x, "pow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowUndefined: Self = StObject.set(x, "pow", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
