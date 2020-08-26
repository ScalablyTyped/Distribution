package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicePartitions extends js.Object {
  var radius: js.UndefOr[Double] = js.native
  var slicePartitions: js.UndefOr[Double] = js.native
  var stackPartitions: js.UndefOr[Double] = js.native
  var subdivisions: js.UndefOr[Double] = js.native
}

object SlicePartitions {
  @scala.inline
  def apply(): SlicePartitions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicePartitions]
  }
  @scala.inline
  implicit class SlicePartitionsOps[Self <: SlicePartitions] (val x: Self) extends AnyVal {
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
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setSlicePartitions(value: Double): Self = this.set("slicePartitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlicePartitions: Self = this.set("slicePartitions", js.undefined)
    @scala.inline
    def setStackPartitions(value: Double): Self = this.set("stackPartitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackPartitions: Self = this.set("stackPartitions", js.undefined)
    @scala.inline
    def setSubdivisions(value: Double): Self = this.set("subdivisions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubdivisions: Self = this.set("subdivisions", js.undefined)
  }
  
}

