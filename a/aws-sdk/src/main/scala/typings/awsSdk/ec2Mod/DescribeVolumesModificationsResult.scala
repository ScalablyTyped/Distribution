package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumesModificationsResult extends js.Object {
  /**
    * Token for pagination, null if there are no more results 
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the volume modifications.
    */
  var VolumesModifications: js.UndefOr[VolumeModificationList] = js.native
}

object DescribeVolumesModificationsResult {
  @scala.inline
  def apply(): DescribeVolumesModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesModificationsResult]
  }
  @scala.inline
  implicit class DescribeVolumesModificationsResultOps[Self <: DescribeVolumesModificationsResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setVolumesModificationsVarargs(value: VolumeModification*): Self = this.set("VolumesModifications", js.Array(value :_*))
    @scala.inline
    def setVolumesModifications(value: VolumeModificationList): Self = this.set("VolumesModifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumesModifications: Self = this.set("VolumesModifications", js.undefined)
  }
  
}

