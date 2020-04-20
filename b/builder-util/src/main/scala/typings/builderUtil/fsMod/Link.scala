package typings.builderUtil.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  val file: String
  val link: String
}

object Link {
  @scala.inline
  def apply(file: String, link: String): Link = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

