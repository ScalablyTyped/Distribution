package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlobOutput extends js.Object {
  /**
    * The content of the blob, usually a file.
    */
  var content: blob = js.native
}

object GetBlobOutput {
  @scala.inline
  def apply(content: blob): GetBlobOutput = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlobOutput]
  }
}

