package typings.convertUnits.anon

import typings.convertUnits.mod.measure
import typings.convertUnits.mod.system
import typings.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abbr[T /* <: unit */] extends js.Object {
  
  var abbr: T = js.native
  
  var measure: typings.convertUnits.mod.measure = js.native
  
  var system: typings.convertUnits.mod.system = js.native
  
  var unit: Name = js.native
}
object Abbr {
  
  @scala.inline
  def apply[T /* <: unit */](abbr: T, measure: measure, system: system, unit: Name): Abbr[T] = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abbr[T]]
  }
  
  @scala.inline
  implicit class AbbrOps[Self <: Abbr[_], T /* <: unit */] (val x: Self with Abbr[T]) extends AnyVal {
    
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
    def setAbbr(value: T): Self = this.set("abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasure(value: measure): Self = this.set("measure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: system): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: Name): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
}
