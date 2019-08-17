package typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketAclOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreGrantMod._UnmarshalledGrant
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreOwnerMod._UnmarshalledOwner
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketAclOutput
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
}

object GetBucketAclOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Grants: js.Array[_UnmarshalledGrant] = null,
    Owner: _UnmarshalledOwner = null
  ): GetBucketAclOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (Grants != null) __obj.updateDynamic("Grants")(Grants)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    __obj.asInstanceOf[GetBucketAclOutput]
  }
}

