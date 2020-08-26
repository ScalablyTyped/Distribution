package typings.awsSdkClientLambdaNode.typesListVersionsByFunctionOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVersionsByFunctionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>A string, present if there are more function versions.</p>
    */
  var NextMarker: js.UndefOr[String] = js.native
  /**
    * <p>A list of Lambda function versions.</p>
    */
  var Versions: js.UndefOr[js.Array[UnmarshalledFunctionConfiguration]] = js.native
}

object ListVersionsByFunctionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListVersionsByFunctionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVersionsByFunctionOutput]
  }
  @scala.inline
  implicit class ListVersionsByFunctionOutputOps[Self <: ListVersionsByFunctionOutput] (val x: Self) extends AnyVal {
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
    def setNextMarker(value: String): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: UnmarshalledFunctionConfiguration*): Self = this.set("Versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[UnmarshalledFunctionConfiguration]): Self = this.set("Versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("Versions", js.undefined)
  }
  
}

