package typings.cacache.enMod.get

import typings.cacache.anon.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasContentObject extends js.Object {
  var size: Double
  var sri: Algorithm
}

object HasContentObject {
  @scala.inline
  def apply(size: Double, sri: Algorithm): HasContentObject = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], sri = sri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasContentObject]
  }
}

