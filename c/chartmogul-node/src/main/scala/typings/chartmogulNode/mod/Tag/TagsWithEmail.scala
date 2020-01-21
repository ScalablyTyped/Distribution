package typings.chartmogulNode.mod.Tag

import typings.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsWithEmail extends js.Object {
  var email: String
  var tags: Strings
}

object TagsWithEmail {
  @scala.inline
  def apply(email: String, tags: Strings): TagsWithEmail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagsWithEmail]
  }
}

