package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCrawlerRequest extends js.Object {
  /**
    * The name of the crawler to retrieve metadata for.
    */
  var Name: NameString = js.native
}

object GetCrawlerRequest {
  @scala.inline
  def apply(Name: NameString): GetCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCrawlerRequest]
  }
}

