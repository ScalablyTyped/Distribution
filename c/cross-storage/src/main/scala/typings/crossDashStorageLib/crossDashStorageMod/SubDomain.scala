package typings
package crossDashStorageLib.crossDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubDomain extends js.Object {
  var allow: js.Array[crossDashStorageLib.CrossStorageMethod]
  var origin: stdLib.RegExp
}

object SubDomain {
  @scala.inline
  def apply(allow: js.Array[crossDashStorageLib.CrossStorageMethod], origin: stdLib.RegExp): SubDomain = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allow")(allow)
    __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[SubDomain]
  }
}

