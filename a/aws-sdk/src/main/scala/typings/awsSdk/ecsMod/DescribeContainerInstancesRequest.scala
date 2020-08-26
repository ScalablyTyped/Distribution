package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContainerInstancesRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the container instances to describe. If you do not specify a cluster, the default cluster is assumed. This parameter is required if the container instance or container instances you are describing were launched in any cluster other than the default cluster.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * A list of up to 100 container instance IDs or full Amazon Resource Name (ARN) entries.
    */
  var containerInstances: StringList = js.native
  /**
    * Specifies whether you want to see the resource tags for the container instance. If TAGS is specified, the tags are included in the response. If this field is omitted, tags are not included in the response.
    */
  var include: js.UndefOr[ContainerInstanceFieldList] = js.native
}

object DescribeContainerInstancesRequest {
  @scala.inline
  def apply(containerInstances: StringList): DescribeContainerInstancesRequest = {
    val __obj = js.Dynamic.literal(containerInstances = containerInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContainerInstancesRequest]
  }
  @scala.inline
  implicit class DescribeContainerInstancesRequestOps[Self <: DescribeContainerInstancesRequest] (val x: Self) extends AnyVal {
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
    def setContainerInstancesVarargs(value: String*): Self = this.set("containerInstances", js.Array(value :_*))
    @scala.inline
    def setContainerInstances(value: StringList): Self = this.set("containerInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    @scala.inline
    def setIncludeVarargs(value: ContainerInstanceField*): Self = this.set("include", js.Array(value :_*))
    @scala.inline
    def setInclude(value: ContainerInstanceFieldList): Self = this.set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
  }
  
}

