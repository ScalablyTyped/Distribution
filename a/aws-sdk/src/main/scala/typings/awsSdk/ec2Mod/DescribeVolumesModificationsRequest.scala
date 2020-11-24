package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVolumesModificationsRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The filters.    modification-state - The current modification state (modifying | optimizing | completed | failed).    original-iops - The original IOPS rate of the volume.    original-size - The original size of the volume, in GiB.    original-volume-type - The original volume type of the volume (standard | io1 | io2 | gp2 | sc1 | st1).    originalMultiAttachEnabled - Indicates whether Multi-Attach support was enabled (true | false).    start-time - The modification start time.    target-iops - The target IOPS rate of the volume.    target-size - The target size of the volume, in GiB.    target-volume-type - The target volume type of the volume (standard | io1 | io2 | gp2 | sc1 | st1).    targetMultiAttachEnabled - Indicates whether Multi-Attach support is to be enabled (true | false).    volume-id - The ID of the volume.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The maximum number of results (up to a limit of 500) to be returned in a paginated request.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The nextToken value returned by a previous paginated request.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The IDs of the volumes.
    */
  var VolumeIds: js.UndefOr[VolumeIdStringList] = js.native
}
object DescribeVolumesModificationsRequest {
  
  @scala.inline
  def apply(): DescribeVolumesModificationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesModificationsRequest]
  }
  
  @scala.inline
  implicit class DescribeVolumesModificationsRequestOps[Self <: DescribeVolumesModificationsRequest] (val x: Self) extends AnyVal {
    
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
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setVolumeIdsVarargs(value: VolumeId*): Self = this.set("VolumeIds", js.Array(value :_*))
    
    @scala.inline
    def setVolumeIds(value: VolumeIdStringList): Self = this.set("VolumeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeIds: Self = this.set("VolumeIds", js.undefined)
  }
}
