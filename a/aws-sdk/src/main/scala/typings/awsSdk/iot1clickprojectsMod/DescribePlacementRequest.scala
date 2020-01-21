package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePlacementRequest extends js.Object {
  /**
    * The name of the placement within a project.
    */
  var placementName: PlacementName = js.native
  /**
    * The project containing the placement to be described.
    */
  var projectName: ProjectName = js.native
}

object DescribePlacementRequest {
  @scala.inline
  def apply(placementName: PlacementName, projectName: ProjectName): DescribePlacementRequest = {
    val __obj = js.Dynamic.literal(placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribePlacementRequest]
  }
}

