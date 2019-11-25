package typings.atAwsDashSdkClientDashLambdaDashNode.typesAddPermissionOutputMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPermissionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The permission statement you specified in the request. The response returns the same as a string using a backslash ("\") as an escape character in the JSON.</p>
    */
  var Statement: js.UndefOr[String] = js.undefined
}

object AddPermissionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, Statement: String = null): AddPermissionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (Statement != null) __obj.updateDynamic("Statement")(Statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionOutput]
  }
}

