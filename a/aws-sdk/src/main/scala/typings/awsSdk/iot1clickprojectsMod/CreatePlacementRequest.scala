package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlacementRequest extends js.Object {
  /**
    * Optional user-defined key/value pairs providing contextual data (such as location or function) for the placement.
    */
  var attributes: js.UndefOr[PlacementAttributeMap] = js.native
  /**
    * The name of the placement to be created.
    */
  var placementName: PlacementName = js.native
  /**
    * The name of the project in which to create the placement.
    */
  var projectName: ProjectName = js.native
}

object CreatePlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName, attributes: PlacementAttributeMap = null): CreatePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlacementRequest]
  }
}

