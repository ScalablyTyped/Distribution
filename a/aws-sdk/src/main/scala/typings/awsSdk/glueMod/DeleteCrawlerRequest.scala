package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCrawlerRequest extends js.Object {
  /**
    * The name of the crawler to remove.
    */
  var Name: NameString = js.native
}

object DeleteCrawlerRequest {
  @scala.inline
  def apply(Name: NameString): DeleteCrawlerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteCrawlerRequest]
  }
}

