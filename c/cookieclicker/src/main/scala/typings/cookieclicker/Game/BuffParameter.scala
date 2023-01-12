package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerInts.`1`
import typings.cookieclicker.cookieclickerInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuffParameter extends StObject {
  
  /**
    * If true, when a buff it gained when it already exists, adds the buff times together
    */
  var add: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If 1, show the good aura, if 2, show the bad aura
    */
  var aura: js.UndefOr[`1` | `2`] = js.undefined
  
  var desc: js.UndefOr[String] = js.undefined
  
  var dname: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[Icon] = js.undefined
  
  /**
    * If true, when a buff it gained when it already exists, use the maximum buff time of the two
    */
  var max: js.UndefOr[Boolean] = js.undefined
  
  var multClick: js.UndefOr[Double] = js.undefined
  
  var multCpS: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onDie: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Rarely used, as of v2.031 only Cursed Finger uses this
    */
  var pow: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount of frames this buff will exist for
    * Decremented by 1 each frame
    */
  var time: js.UndefOr[Double] = js.undefined
  
  /** @deprecated */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object BuffParameter {
  
  inline def apply(): BuffParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuffParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuffParameter] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAura(value: `1` | `2`): Self = StObject.set(x, "aura", value.asInstanceOf[js.Any])
    
    inline def setAuraUndefined: Self = StObject.set(x, "aura", js.undefined)
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    inline def setDname(value: String): Self = StObject.set(x, "dname", value.asInstanceOf[js.Any])
    
    inline def setDnameUndefined: Self = StObject.set(x, "dname", js.undefined)
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setMax(value: Boolean): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMultClick(value: Double): Self = StObject.set(x, "multClick", value.asInstanceOf[js.Any])
    
    inline def setMultClickUndefined: Self = StObject.set(x, "multClick", js.undefined)
    
    inline def setMultCpS(value: Double): Self = StObject.set(x, "multCpS", value.asInstanceOf[js.Any])
    
    inline def setMultCpSUndefined: Self = StObject.set(x, "multCpS", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnDie(value: () => Unit): Self = StObject.set(x, "onDie", js.Any.fromFunction0(value))
    
    inline def setOnDieUndefined: Self = StObject.set(x, "onDie", js.undefined)
    
    inline def setPow(value: Double): Self = StObject.set(x, "pow", value.asInstanceOf[js.Any])
    
    inline def setPowUndefined: Self = StObject.set(x, "pow", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
