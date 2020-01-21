package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detector extends js.Object {
  /**
    * Timestamp of when the detector was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The detector description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  /**
    * Timestamp of when the detector was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
}

object Detector {
  @scala.inline
  def apply(
    createdTime: time = null,
    description: description = null,
    detectorId: identifier = null,
    lastUpdatedTime: time = null
  ): Detector = {
    val __obj = js.Dynamic.literal()
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (detectorId != null) __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detector]
  }
}

