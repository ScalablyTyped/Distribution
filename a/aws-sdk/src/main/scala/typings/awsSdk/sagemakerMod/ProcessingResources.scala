package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingResources extends js.Object {
  /**
    * The configuration for the resources in a cluster used to run the processing job.
    */
  var ClusterConfig: ProcessingClusterConfig = js.native
}

object ProcessingResources {
  @scala.inline
  def apply(ClusterConfig: ProcessingClusterConfig): ProcessingResources = {
    val __obj = js.Dynamic.literal(ClusterConfig = ClusterConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingResources]
  }
  @scala.inline
  implicit class ProcessingResourcesOps[Self <: ProcessingResources] (val x: Self) extends AnyVal {
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
    def setClusterConfig(value: ProcessingClusterConfig): Self = this.set("ClusterConfig", value.asInstanceOf[js.Any])
  }
  
}

