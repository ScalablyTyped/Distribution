package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationResponse extends js.Object {
  /**
    * Provides a description of the application, such as the application Amazon Resource Name (ARN), status, latest version, and input and output configuration details.
    */
  var ApplicationDetail: typings.awsSdk.kinesisanalyticsMod.ApplicationDetail = js.native
}

object DescribeApplicationResponse {
  @scala.inline
  def apply(ApplicationDetail: ApplicationDetail): DescribeApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeApplicationResponse]
  }
}

