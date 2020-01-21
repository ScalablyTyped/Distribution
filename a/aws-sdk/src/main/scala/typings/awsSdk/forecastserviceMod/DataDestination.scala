package typings.awsSdk.forecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataDestination extends js.Object {
  /**
    * The path to an Amazon Simple Storage Service (Amazon S3) bucket along with the credentials to access the bucket.
    */
  var S3Config: typings.awsSdk.forecastserviceMod.S3Config = js.native
}

object DataDestination {
  @scala.inline
  def apply(S3Config: S3Config): DataDestination = {
    val __obj = js.Dynamic.literal(S3Config = S3Config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataDestination]
  }
}

