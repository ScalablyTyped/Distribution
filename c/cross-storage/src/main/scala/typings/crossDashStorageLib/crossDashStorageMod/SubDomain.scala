package typings
package crossDashStorageLib.crossDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubDomain extends js.Object {
  var allow: js.Array[CrossStorageMethod]
  var origin: stdLib.RegExp
}

object SubDomain {
  @scala.inline
  def apply(allow: js.Array[CrossStorageMethod], origin: stdLib.RegExp): SubDomain = {
    val __obj = js.Dynamic.literal(allow = allow, origin = origin)
  
    __obj.asInstanceOf[SubDomain]
  }
}

