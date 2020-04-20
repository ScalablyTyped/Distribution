package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationResponse extends js.Object {
  /**
    * In response to your CreateApplication request, Kinesis Data Analytics returns a response with details of the application it created.
    */
  var ApplicationDetail: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationDetail = js.native
}

object CreateApplicationResponse {
  @scala.inline
  def apply(ApplicationDetail: ApplicationDetail): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal(ApplicationDetail = ApplicationDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationResponse]
  }
}

