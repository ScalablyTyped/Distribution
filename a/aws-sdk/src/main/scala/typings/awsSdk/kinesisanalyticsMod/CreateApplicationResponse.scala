package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationResponse extends js.Object {
  /**
    * In response to your CreateApplication request, Amazon Kinesis Analytics returns a response with a summary of the application it created, including the application Amazon Resource Name (ARN), name, and status.
    */
  var ApplicationSummary: typings.awsSdk.kinesisanalyticsMod.ApplicationSummary = js.native
}

object CreateApplicationResponse {
  @scala.inline
  def apply(ApplicationSummary: ApplicationSummary): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationSummary = ApplicationSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationResponse]
  }
}

