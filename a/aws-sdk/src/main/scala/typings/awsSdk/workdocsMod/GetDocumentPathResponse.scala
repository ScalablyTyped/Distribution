package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentPathResponse extends js.Object {
  /**
    * The path information.
    */
  var Path: js.UndefOr[ResourcePath] = js.native
}

object GetDocumentPathResponse {
  @scala.inline
  def apply(Path: ResourcePath = null): GetDocumentPathResponse = {
    val __obj = js.Dynamic.literal()
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentPathResponse]
  }
}

