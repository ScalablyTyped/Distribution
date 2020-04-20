package typings.builderUtilRuntime.bintrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var name: String
  var path: String
  var sha1: String
  var sha256: String
}

object File {
  @scala.inline
  def apply(name: String, path: String, sha1: String, sha256: String): File = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

