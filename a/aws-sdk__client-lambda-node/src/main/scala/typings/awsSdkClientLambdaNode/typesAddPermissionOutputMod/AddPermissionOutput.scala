package typings.awsSdkClientLambdaNode.typesAddPermissionOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddPermissionOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>The permission statement you specified in the request. The response returns the same as a string using a backslash ("\") as an escape character in the JSON.</p>
    */
  var Statement: js.UndefOr[String] = js.native
}

object AddPermissionOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): AddPermissionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionOutput]
  }
  @scala.inline
  implicit class AddPermissionOutputOps[Self <: AddPermissionOutput] (val x: Self) extends AnyVal {
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
    def setStatement(value: String): Self = this.set("Statement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement: Self = this.set("Statement", js.undefined)
  }
  
}

