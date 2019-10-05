package typings.cacache.enMod.get

import typings.cacache.Anon_Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasContentObject extends js.Object {
  var size: Double
  var sri: Anon_Algorithm
}

object HasContentObject {
  @scala.inline
  def apply(size: Double, sri: Anon_Algorithm): HasContentObject = {
    val __obj = js.Dynamic.literal(size = size, sri = sri)
  
    __obj.asInstanceOf[HasContentObject]
  }
}

