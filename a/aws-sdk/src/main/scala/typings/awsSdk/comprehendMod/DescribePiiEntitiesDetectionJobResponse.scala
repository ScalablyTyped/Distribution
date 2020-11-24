package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePiiEntitiesDetectionJobResponse extends js.Object {
  
  var PiiEntitiesDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.PiiEntitiesDetectionJobProperties] = js.native
}
object DescribePiiEntitiesDetectionJobResponse {
  
  @scala.inline
  def apply(): DescribePiiEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePiiEntitiesDetectionJobResponse]
  }
  
  @scala.inline
  implicit class DescribePiiEntitiesDetectionJobResponseOps[Self <: DescribePiiEntitiesDetectionJobResponse] (val x: Self) extends AnyVal {
    
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
    def setPiiEntitiesDetectionJobProperties(value: PiiEntitiesDetectionJobProperties): Self = this.set("PiiEntitiesDetectionJobProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePiiEntitiesDetectionJobProperties: Self = this.set("PiiEntitiesDetectionJobProperties", js.undefined)
  }
}
