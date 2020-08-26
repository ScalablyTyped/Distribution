package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoringResources extends js.Object {
  /**
    * The configuration for the cluster resources used to run the processing job.
    */
  var ClusterConfig: MonitoringClusterConfig = js.native
}

object MonitoringResources {
  @scala.inline
  def apply(ClusterConfig: MonitoringClusterConfig): MonitoringResources = {
    val __obj = js.Dynamic.literal(ClusterConfig = ClusterConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringResources]
  }
  @scala.inline
  implicit class MonitoringResourcesOps[Self <: MonitoringResources] (val x: Self) extends AnyVal {
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
    def setClusterConfig(value: MonitoringClusterConfig): Self = this.set("ClusterConfig", value.asInstanceOf[js.Any])
  }
  
}

