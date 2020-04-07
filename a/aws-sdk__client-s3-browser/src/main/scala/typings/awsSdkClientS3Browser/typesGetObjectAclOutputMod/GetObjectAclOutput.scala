package typings.awsSdkClientS3Browser.typesGetObjectAclOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesGrantMod.UnmarshalledGrant
import typings.awsSdkClientS3Browser.typesOwnerMod.UnmarshalledOwner
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectAclOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>A list of grants.</p>
    */
  var Grants: js.UndefOr[js.Array[UnmarshalledGrant]] = js.undefined
  /**
    * _Owner shape
    */
  var Owner: js.UndefOr[UnmarshalledOwner] = js.undefined
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
}

object GetObjectAclOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    Grants: js.Array[UnmarshalledGrant] = null,
    Owner: UnmarshalledOwner = null,
    RequestCharged: requester_ | String = null
  ): GetObjectAclOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Grants != null) __obj.updateDynamic("Grants")(Grants.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectAclOutput]
  }
}

