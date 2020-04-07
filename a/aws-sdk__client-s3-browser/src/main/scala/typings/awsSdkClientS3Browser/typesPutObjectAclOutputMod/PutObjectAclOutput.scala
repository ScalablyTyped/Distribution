package typings.awsSdkClientS3Browser.typesPutObjectAclOutputMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.requester_
import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectAclOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>If present, indicates that the requester was successfully charged for the request.</p>
    */
  var RequestCharged: js.UndefOr[requester_ | String] = js.undefined
}

object PutObjectAclOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, RequestCharged: requester_ | String = null): PutObjectAclOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectAclOutput]
  }
}

