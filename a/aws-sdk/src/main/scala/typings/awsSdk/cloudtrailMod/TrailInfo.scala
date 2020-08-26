package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrailInfo extends js.Object {
  /**
    * The AWS region in which a trail was created.
    */
  var HomeRegion: js.UndefOr[String] = js.native
  /**
    * The name of a trail.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The ARN of a trail.
    */
  var TrailARN: js.UndefOr[String] = js.native
}

object TrailInfo {
  @scala.inline
  def apply(): TrailInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrailInfo]
  }
  @scala.inline
  implicit class TrailInfoOps[Self <: TrailInfo] (val x: Self) extends AnyVal {
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
    def setHomeRegion(value: String): Self = this.set("HomeRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeRegion: Self = this.set("HomeRegion", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setTrailARN(value: String): Self = this.set("TrailARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailARN: Self = this.set("TrailARN", js.undefined)
  }
  
}

