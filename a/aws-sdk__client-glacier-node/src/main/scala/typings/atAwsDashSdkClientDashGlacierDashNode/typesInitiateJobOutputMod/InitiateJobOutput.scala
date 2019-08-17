package typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateJobOutputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateJobOutput extends _OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The ID of the job.</p>
    */
  var jobId: js.UndefOr[String] = js.undefined
  /**
    * <p>The path to the location of where the select results are stored.</p>
    */
  var jobOutputPath: js.UndefOr[String] = js.undefined
  /**
    * <p>The relative URI path of the job.</p>
    */
  var location: js.UndefOr[String] = js.undefined
}

object InitiateJobOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    jobId: String = null,
    jobOutputPath: String = null,
    location: String = null
  ): InitiateJobOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (jobOutputPath != null) __obj.updateDynamic("jobOutputPath")(jobOutputPath)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[InitiateJobOutput]
  }
}

