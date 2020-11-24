package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListInstanceFleetsOutput extends js.Object {
  
  /**
    * The list of instance fleets for the cluster and given filters.
    */
  var InstanceFleets: js.UndefOr[InstanceFleetList] = js.native
  
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[typings.awsSdk.emrMod.Marker] = js.native
}
object ListInstanceFleetsOutput {
  
  @scala.inline
  def apply(): ListInstanceFleetsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceFleetsOutput]
  }
  
  @scala.inline
  implicit class ListInstanceFleetsOutputOps[Self <: ListInstanceFleetsOutput] (val x: Self) extends AnyVal {
    
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
    def setInstanceFleetsVarargs(value: InstanceFleet*): Self = this.set("InstanceFleets", js.Array(value :_*))
    
    @scala.inline
    def setInstanceFleets(value: InstanceFleetList): Self = this.set("InstanceFleets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFleets: Self = this.set("InstanceFleets", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
}
