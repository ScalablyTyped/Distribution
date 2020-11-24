package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ind extends js.Object {
  
  var ind: Double = js.native
  
  var sqDistance: Double = js.native
}
object Ind {
  
  @scala.inline
  def apply(ind: Double, sqDistance: Double): Ind = {
    val __obj = js.Dynamic.literal(ind = ind.asInstanceOf[js.Any], sqDistance = sqDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ind]
  }
  
  @scala.inline
  implicit class IndOps[Self <: Ind] (val x: Self) extends AnyVal {
    
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
    def setInd(value: Double): Self = this.set("ind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqDistance(value: Double): Self = this.set("sqDistance", value.asInstanceOf[js.Any])
  }
}
