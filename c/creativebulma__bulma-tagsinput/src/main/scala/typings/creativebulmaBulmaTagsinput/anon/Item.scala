package typings.creativebulmaBulmaTagsinput.anon

import typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInputItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var item: String | BulmaTagsInputItem
  var tag: String
}

object Item {
  @scala.inline
  def apply(item: String | BulmaTagsInputItem, tag: String): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

