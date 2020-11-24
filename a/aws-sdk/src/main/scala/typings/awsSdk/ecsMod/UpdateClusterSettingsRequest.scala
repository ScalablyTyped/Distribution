package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClusterSettingsRequest extends js.Object {
  
  /**
    * The name of the cluster to modify the settings for.
    */
  var cluster: String = js.native
  
  /**
    * The setting to use by default for a cluster. This parameter is used to enable CloudWatch Container Insights for a cluster. If this value is specified, it will override the containerInsights value set with PutAccountSetting or PutAccountSettingDefault.
    */
  var settings: ClusterSettings = js.native
}
object UpdateClusterSettingsRequest {
  
  @scala.inline
  def apply(cluster: String, settings: ClusterSettings): UpdateClusterSettingsRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateClusterSettingsRequestOps[Self <: UpdateClusterSettingsRequest] (val x: Self) extends AnyVal {
    
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
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsVarargs(value: ClusterSetting*): Self = this.set("settings", js.Array(value :_*))
    
    @scala.inline
    def setSettings(value: ClusterSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
}
