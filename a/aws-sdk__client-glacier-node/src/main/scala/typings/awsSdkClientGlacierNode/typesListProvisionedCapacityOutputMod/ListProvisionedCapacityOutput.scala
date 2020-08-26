package typings.awsSdkClientGlacierNode.typesListProvisionedCapacityOutputMod

import typings.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientGlacierNode.typesProvisionedCapacityDescriptionMod.UnmarshalledProvisionedCapacityDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProvisionedCapacityOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The response body contains the following JSON fields.</p>
    */
  var ProvisionedCapacityList: js.UndefOr[js.Array[UnmarshalledProvisionedCapacityDescription]] = js.native
}

object ListProvisionedCapacityOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProvisionedCapacityOutput]
  }
  @scala.inline
  implicit class ListProvisionedCapacityOutputOps[Self <: ListProvisionedCapacityOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvisionedCapacityListVarargs(value: UnmarshalledProvisionedCapacityDescription*): Self = this.set("ProvisionedCapacityList", js.Array(value :_*))
    @scala.inline
    def setProvisionedCapacityList(value: js.Array[UnmarshalledProvisionedCapacityDescription]): Self = this.set("ProvisionedCapacityList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedCapacityList: Self = this.set("ProvisionedCapacityList", js.undefined)
  }
  
}

