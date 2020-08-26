package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumesResult extends js.Object {
  /**
    * The NextToken value to include in a future DescribeVolumes request. When the results of a DescribeVolumes request exceed MaxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the volumes.
    */
  var Volumes: js.UndefOr[VolumeList] = js.native
}

object DescribeVolumesResult {
  @scala.inline
  def apply(): DescribeVolumesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesResult]
  }
  @scala.inline
  implicit class DescribeVolumesResultOps[Self <: DescribeVolumesResult] (val x: Self) extends AnyVal {
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
    def setVolumesVarargs(value: Volume*): Self = this.set("Volumes", js.Array(value :_*))
    @scala.inline
    def setVolumes(value: VolumeList): Self = this.set("Volumes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumes: Self = this.set("Volumes", js.undefined)
  }
  
}

