package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMountTargetsResponse extends js.Object {
  /**
    * If the request included the Marker, the response returns that value in this field.
    */
  var Marker: js.UndefOr[typings.awsSdk.efsMod.Marker] = js.native
  /**
    * Returns the file system's mount targets as an array of MountTargetDescription objects.
    */
  var MountTargets: js.UndefOr[MountTargetDescriptions] = js.native
  /**
    * If a value is present, there are more mount targets to return. In a subsequent request, you can provide Marker in your request with this value to retrieve the next set of mount targets.
    */
  var NextMarker: js.UndefOr[Marker] = js.native
}

object DescribeMountTargetsResponse {
  @scala.inline
  def apply(): DescribeMountTargetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMountTargetsResponse]
  }
  @scala.inline
  implicit class DescribeMountTargetsResponseOps[Self <: DescribeMountTargetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMountTargetsVarargs(value: MountTargetDescription*): Self = this.set("MountTargets", js.Array(value :_*))
    @scala.inline
    def setMountTargets(value: MountTargetDescriptions): Self = this.set("MountTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountTargets: Self = this.set("MountTargets", js.undefined)
    @scala.inline
    def setNextMarker(value: Marker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

