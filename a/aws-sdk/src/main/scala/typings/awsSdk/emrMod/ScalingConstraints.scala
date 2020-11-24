package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingConstraints extends js.Object {
  
  /**
    * The upper boundary of EC2 instances in an instance group beyond which scaling activities are not allowed to grow. Scale-out activities will not add instances beyond this boundary.
    */
  var MaxCapacity: Integer = js.native
  
  /**
    * The lower boundary of EC2 instances in an instance group below which scaling activities are not allowed to shrink. Scale-in activities will not terminate instances below this boundary.
    */
  var MinCapacity: Integer = js.native
}
object ScalingConstraints {
  
  @scala.inline
  def apply(MaxCapacity: Integer, MinCapacity: Integer): ScalingConstraints = {
    val __obj = js.Dynamic.literal(MaxCapacity = MaxCapacity.asInstanceOf[js.Any], MinCapacity = MinCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingConstraints]
  }
  
  @scala.inline
  implicit class ScalingConstraintsOps[Self <: ScalingConstraints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxCapacity(value: Integer): Self = this.set("MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCapacity(value: Integer): Self = this.set("MinCapacity", value.asInstanceOf[js.Any])
  }
}
