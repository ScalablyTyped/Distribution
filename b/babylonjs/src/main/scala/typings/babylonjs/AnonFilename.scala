package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilename extends js.Object {
  var filename: String
  var path: String
}

object AnonFilename {
  @scala.inline
  def apply(filename: String, path: String): AnonFilename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilename]
  }
}

