package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportSourceCredentialsOutput extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the token. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
}

object ImportSourceCredentialsOutput {
  @scala.inline
  def apply(arn: NonEmptyString = null): ImportSourceCredentialsOutput = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSourceCredentialsOutput]
  }
}

