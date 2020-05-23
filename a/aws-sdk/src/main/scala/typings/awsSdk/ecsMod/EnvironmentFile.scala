package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentFile extends js.Object {
  /**
    * The file type to use. The only supported value is s3.
    */
  var `type`: EnvironmentFileType = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon S3 object containing the environment variable file.
    */
  var value: String = js.native
}

object EnvironmentFile {
  @scala.inline
  def apply(`type`: EnvironmentFileType, value: String): EnvironmentFile = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentFile]
  }
}

