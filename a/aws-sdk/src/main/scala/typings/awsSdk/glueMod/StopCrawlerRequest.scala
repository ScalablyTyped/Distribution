package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopCrawlerRequest extends js.Object {
  /**
    * Name of the crawler to stop.
    */
  var Name: NameString = js.native
}

object StopCrawlerRequest {
  @scala.inline
  def apply(Name: NameString): StopCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopCrawlerRequest]
  }
}

