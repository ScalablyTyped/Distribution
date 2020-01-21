package typings.awsSdk.codestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolchainSource extends js.Object {
  /**
    * The Amazon S3 bucket where the toolchain template file provided with the project request is stored.
    */
  var s3: S3Location = js.native
}

object ToolchainSource {
  @scala.inline
  def apply(s3: S3Location): ToolchainSource = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToolchainSource]
  }
}

