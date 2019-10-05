package typings.chartmogulDashNode.chartmogulDashNodeMod.Tag

import typings.chartmogulDashNode.commonMod.Strings
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
    val __obj = js.Dynamic.literal(email = email, tags = tags)
  
    __obj.asInstanceOf[TagsWithEmail]
  }
}

