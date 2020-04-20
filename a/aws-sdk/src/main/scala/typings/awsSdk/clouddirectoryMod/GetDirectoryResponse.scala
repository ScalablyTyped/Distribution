package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDirectoryResponse extends js.Object {
  /**
    * Metadata about the directory.
    */
  var Directory: typings.awsSdk.clouddirectoryMod.Directory = js.native
}

object GetDirectoryResponse {
  @scala.inline
  def apply(Directory: Directory): GetDirectoryResponse = {
    val __obj = js.Dynamic.literal(Directory = Directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectoryResponse]
  }
}

