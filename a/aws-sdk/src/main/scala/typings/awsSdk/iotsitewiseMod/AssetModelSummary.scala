package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetModelSummary extends js.Object {
  /**
    * The ARN of the asset model, which has the following format.  arn:${Partition}:iotsitewise:${Region}:${Account}:asset-model/${AssetModelId} 
    */
  var arn: ARN = js.native
  /**
    * The date the asset model was created, in Unix epoch time.
    */
  var creationDate: Timestamp = js.native
  /**
    * The asset model description.
    */
  var description: Description = js.native
  /**
    * The ID of the asset model (used with AWS IoT SiteWise APIs).
    */
  var id: ID = js.native
  /**
    * The date the asset model was last updated, in Unix epoch time.
    */
  var lastUpdateDate: Timestamp = js.native
  /**
    * The name of the asset model.
    */
  var name: Name = js.native
  /**
    * The current status of the asset model.
    */
  var status: AssetModelStatus = js.native
}

object AssetModelSummary {
  @scala.inline
  def apply(
    arn: ARN,
    creationDate: Timestamp,
    description: Description,
    id: ID,
    lastUpdateDate: Timestamp,
    name: Name,
    status: AssetModelStatus
  ): AssetModelSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdateDate = lastUpdateDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelSummary]
  }
}

