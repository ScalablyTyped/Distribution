package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroup extends js.Object {
  /**
    * The description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the cluster parameter group family that this cluster parameter group is compatible with.
    */
  var ParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The list of tags for the cluster parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ClusterParameterGroup {
  @scala.inline
  def apply(): ClusterParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterGroup]
  }
  @scala.inline
  implicit class ClusterParameterGroupOps[Self <: ClusterParameterGroup] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setParameterGroupFamily(value: String): Self = this.set("ParameterGroupFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterGroupFamily: Self = this.set("ParameterGroupFamily", js.undefined)
    @scala.inline
    def setParameterGroupName(value: String): Self = this.set("ParameterGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterGroupName: Self = this.set("ParameterGroupName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

