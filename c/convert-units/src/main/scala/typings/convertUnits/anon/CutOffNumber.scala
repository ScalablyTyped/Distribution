package typings.convertUnits.anon

import typings.convertUnits.mod.unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CutOffNumber extends js.Object {
  
  var cutOffNumber: js.UndefOr[Double] = js.native
  
  var exclude: js.UndefOr[js.Array[unit]] = js.native
}
object CutOffNumber {
  
  @scala.inline
  def apply(): CutOffNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CutOffNumber]
  }
  
  @scala.inline
  implicit class CutOffNumberOps[Self <: CutOffNumber] (val x: Self) extends AnyVal {
    
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
    def setCutOffNumber(value: Double): Self = this.set("cutOffNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCutOffNumber: Self = this.set("cutOffNumber", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: unit*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[unit]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
  }
}
