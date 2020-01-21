package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticGpuAssociation extends js.Object {
  /**
    * The ID of the association.
    */
  var ElasticGpuAssociationId: js.UndefOr[String] = js.native
  /**
    * The state of the association between the instance and the Elastic Graphics accelerator.
    */
  var ElasticGpuAssociationState: js.UndefOr[String] = js.native
  /**
    * The time the Elastic Graphics accelerator was associated with the instance.
    */
  var ElasticGpuAssociationTime: js.UndefOr[String] = js.native
  /**
    * The ID of the Elastic Graphics accelerator.
    */
  var ElasticGpuId: js.UndefOr[String] = js.native
}

object ElasticGpuAssociation {
  @scala.inline
  def apply(
    ElasticGpuAssociationId: String = null,
    ElasticGpuAssociationState: String = null,
    ElasticGpuAssociationTime: String = null,
    ElasticGpuId: String = null
  ): ElasticGpuAssociation = {
    val __obj = js.Dynamic.literal()
    if (ElasticGpuAssociationId != null) __obj.updateDynamic("ElasticGpuAssociationId")(ElasticGpuAssociationId.asInstanceOf[js.Any])
    if (ElasticGpuAssociationState != null) __obj.updateDynamic("ElasticGpuAssociationState")(ElasticGpuAssociationState.asInstanceOf[js.Any])
    if (ElasticGpuAssociationTime != null) __obj.updateDynamic("ElasticGpuAssociationTime")(ElasticGpuAssociationTime.asInstanceOf[js.Any])
    if (ElasticGpuId != null) __obj.updateDynamic("ElasticGpuId")(ElasticGpuId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticGpuAssociation]
  }
}

