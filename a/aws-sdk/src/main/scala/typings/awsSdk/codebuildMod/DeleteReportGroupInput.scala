package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReportGroupInput extends js.Object {
  /**
    *  The ARN of the report group to delete. 
    */
  var arn: NonEmptyString = js.native
}

object DeleteReportGroupInput {
  @scala.inline
  def apply(arn: NonEmptyString): DeleteReportGroupInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReportGroupInput]
  }
}

