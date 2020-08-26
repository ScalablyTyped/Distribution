package typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesGlobalTableDescriptionMod.UnmarshalledGlobalTableDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalTableOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>Contains the details of the global table.</p>
    */
  var GlobalTableDescription: js.UndefOr[UnmarshalledGlobalTableDescription] = js.native
}

object UpdateGlobalTableOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): UpdateGlobalTableOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableOutput]
  }
  @scala.inline
  implicit class UpdateGlobalTableOutputOps[Self <: UpdateGlobalTableOutput] (val x: Self) extends AnyVal {
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
    def setGlobalTableDescription(value: UnmarshalledGlobalTableDescription): Self = this.set("GlobalTableDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalTableDescription: Self = this.set("GlobalTableDescription", js.undefined)
  }
  
}

