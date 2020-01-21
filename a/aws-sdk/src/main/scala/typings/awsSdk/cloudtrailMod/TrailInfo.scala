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
  def apply(HomeRegion: String = null, Name: String = null, TrailARN: String = null): TrailInfo = {
    val __obj = js.Dynamic.literal()
    if (HomeRegion != null) __obj.updateDynamic("HomeRegion")(HomeRegion.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (TrailARN != null) __obj.updateDynamic("TrailARN")(TrailARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailInfo]
  }
}

