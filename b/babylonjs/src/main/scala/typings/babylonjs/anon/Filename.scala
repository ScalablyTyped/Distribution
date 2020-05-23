package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filename extends js.Object {
  var filename: String
  var path: String
}

object Filename {
  @scala.inline
  def apply(filename: String, path: String): Filename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
}

