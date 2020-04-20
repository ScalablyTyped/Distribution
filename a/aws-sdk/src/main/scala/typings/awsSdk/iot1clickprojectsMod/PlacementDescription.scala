package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementDescription extends js.Object {
  /**
    * The user-defined attributes associated with the placement.
    */
  var attributes: PlacementAttributeMap = js.native
  /**
    * The date when the placement was initially created, in UNIX epoch time format.
    */
  var createdDate: Time = js.native
  /**
    * The name of the placement.
    */
  var placementName: PlacementName = js.native
  /**
    * The name of the project containing the placement.
    */
  var projectName: ProjectName = js.native
  /**
    * The date when the placement was last updated, in UNIX epoch time format. If the placement was not updated, then createdDate and updatedDate are the same.
    */
  var updatedDate: Time = js.native
}

object PlacementDescription {
  @scala.inline
  def apply(
    attributes: PlacementAttributeMap,
    createdDate: Time,
    placementName: PlacementName,
    projectName: ProjectName,
    updatedDate: Time
  ): PlacementDescription = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementDescription]
  }
}

