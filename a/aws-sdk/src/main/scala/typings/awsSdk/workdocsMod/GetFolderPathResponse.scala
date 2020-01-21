package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFolderPathResponse extends js.Object {
  /**
    * The path information.
    */
  var Path: js.UndefOr[ResourcePath] = js.native
}

object GetFolderPathResponse {
  @scala.inline
  def apply(Path: ResourcePath = null): GetFolderPathResponse = {
    val __obj = js.Dynamic.literal()
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderPathResponse]
  }
}

