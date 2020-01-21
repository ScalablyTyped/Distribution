package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartCrawlerRequest extends js.Object {
  /**
    * Name of the crawler to start.
    */
  var Name: NameString = js.native
}

object StartCrawlerRequest {
  @scala.inline
  def apply(Name: NameString): StartCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartCrawlerRequest]
  }
}

