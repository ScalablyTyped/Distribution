package typings.crossStorage.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubDomain extends js.Object {
  var allow: js.Array[CrossStorageMethod]
  var origin: RegExp
}

object SubDomain {
  @scala.inline
  def apply(allow: js.Array[CrossStorageMethod], origin: RegExp): SubDomain = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDomain]
  }
}

