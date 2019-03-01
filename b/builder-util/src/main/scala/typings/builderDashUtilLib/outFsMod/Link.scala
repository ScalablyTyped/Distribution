package typings
package builderDashUtilLib.outFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  val file: java.lang.String
  val link: java.lang.String
}

object Link {
  @scala.inline
  def apply(file: java.lang.String, link: java.lang.String): Link = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("file")(file)
    __obj.updateDynamic("link")(link)
    __obj.asInstanceOf[Link]
  }
}

