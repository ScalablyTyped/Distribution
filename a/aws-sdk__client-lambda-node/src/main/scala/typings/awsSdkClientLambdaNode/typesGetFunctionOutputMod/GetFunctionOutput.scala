package typings.awsSdkClientLambdaNode.typesGetFunctionOutputMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesConcurrencyMod.UnmarshalledConcurrency
import typings.awsSdkClientLambdaNode.typesFunctionCodeLocationMod.UnmarshalledFunctionCodeLocation
import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The function's code.</p>
    */
  var Code: js.UndefOr[UnmarshalledFunctionCodeLocation] = js.native
  /**
    * <p>The concurrent execution limit set for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
    */
  var Concurrency: js.UndefOr[UnmarshalledConcurrency] = js.native
  /**
    * <p>The function's configuration.</p>
    */
  var Configuration: js.UndefOr[UnmarshalledFunctionConfiguration] = js.native
  /**
    * <p>Returns the list of tags associated with the function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda Developer Guide</b>.</p>
    */
  var Tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetFunctionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetFunctionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionOutput]
  }
  @scala.inline
  implicit class GetFunctionOutputOps[Self <: GetFunctionOutput] (val x: Self) extends AnyVal {
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
    def setCode(value: UnmarshalledFunctionCodeLocation): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setConcurrency(value: UnmarshalledConcurrency): Self = this.set("Concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("Concurrency", js.undefined)
    @scala.inline
    def setConfiguration(value: UnmarshalledFunctionConfiguration): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfiguration: Self = this.set("Configuration", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

