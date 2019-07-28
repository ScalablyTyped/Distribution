package typings.builderDashUtil.outFsMod

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
    val __obj = js.Dynamic.literal(file = file, link = link)
  
    __obj.asInstanceOf[Link]
  }
}

