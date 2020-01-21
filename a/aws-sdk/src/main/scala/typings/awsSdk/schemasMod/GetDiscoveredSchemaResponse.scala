package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiscoveredSchemaResponse extends js.Object {
  var Content: js.UndefOr[string] = js.native
}

object GetDiscoveredSchemaResponse {
  @scala.inline
  def apply(Content: string = null): GetDiscoveredSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiscoveredSchemaResponse]
  }
}

