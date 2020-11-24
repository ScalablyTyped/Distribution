package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClusterSettingsResponse extends js.Object {
  
  var cluster: js.UndefOr[Cluster] = js.native
}
object UpdateClusterSettingsResponse {
  
  @scala.inline
  def apply(): UpdateClusterSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterSettingsResponse]
  }
  
  @scala.inline
  implicit class UpdateClusterSettingsResponseOps[Self <: UpdateClusterSettingsResponse] (val x: Self) extends AnyVal {
    
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
    def setCluster(value: Cluster): Self = this.set("cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
  }
}
