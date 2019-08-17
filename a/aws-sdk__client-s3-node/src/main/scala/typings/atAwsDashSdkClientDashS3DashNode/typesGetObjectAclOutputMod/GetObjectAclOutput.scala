package typings.atAwsDashSdkClientDashS3DashNode.typesGetObjectAclOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.requester
import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGrantMod._UnmarshalledGrant
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOwnerMod._UnmarshalledOwner
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectAclOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>A list of grants.</p>
    */
  var Grants: js.UndefOr[js.Array[_UnmarshalledGrant]] = js.undefined
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[_UnmarshalledOwner] = js.undefined
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester | String] = js.undefined
}

object GetObjectAclOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Grants: js.Array[_UnmarshalledGrant] = null,
    Owner: _UnmarshalledOwner = null,
    RequestCharged: requester | String = null
  ): GetObjectAclOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Grants != null) __obj.updateDynamic("Grants")(Grants)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectAclOutput]
  }
}

