package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClustersInput extends js.Object {
  /**
    * The cluster state filters to apply when listing clusters.
    */
  var ClusterStates: js.UndefOr[ClusterStateList] = js.native
  /**
    * The creation date and time beginning value filter for listing clusters.
    */
  var CreatedAfter: js.UndefOr[Date] = js.native
  /**
    * The creation date and time end value filter for listing clusters.
    */
  var CreatedBefore: js.UndefOr[Date] = js.native
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}

object ListClustersInput {
  @scala.inline
  def apply(): ListClustersInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersInput]
  }
  @scala.inline
  implicit class ListClustersInputOps[Self <: ListClustersInput] (val x: Self) extends AnyVal {
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
    def setClusterStatesVarargs(value: ClusterState*): Self = this.set("ClusterStates", js.Array(value :_*))
    @scala.inline
    def setClusterStates(value: ClusterStateList): Self = this.set("ClusterStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterStates: Self = this.set("ClusterStates", js.undefined)
    @scala.inline
    def setCreatedAfter(value: Date): Self = this.set("CreatedAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAfter: Self = this.set("CreatedAfter", js.undefined)
    @scala.inline
    def setCreatedBefore(value: Date): Self = this.set("CreatedBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBefore: Self = this.set("CreatedBefore", js.undefined)
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

