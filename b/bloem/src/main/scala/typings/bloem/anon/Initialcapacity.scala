package typings.bloem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initialcapacity extends js.Object {
  
  var initial_capacity: js.UndefOr[Double] = js.native
  
  var ratio: js.UndefOr[Double] = js.native
  
  var scaling: js.UndefOr[Double] = js.native
}
object Initialcapacity {
  
  @scala.inline
  def apply(): Initialcapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initialcapacity]
  }
  
  @scala.inline
  implicit class InitialcapacityOps[Self <: Initialcapacity] (val x: Self) extends AnyVal {
    
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
    def setInitial_capacity(value: Double): Self = this.set("initial_capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial_capacity: Self = this.set("initial_capacity", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    
    @scala.inline
    def setScaling(value: Double): Self = this.set("scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaling: Self = this.set("scaling", js.undefined)
  }
}
