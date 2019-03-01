package typings
package cfbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  var header: cfbLib.cfbMod.CFB$Blob
  var sectors: js.Array[cfbLib.cfbMod.CFB$Blob]
}

object Anon_Header {
  @scala.inline
  def apply(header: cfbLib.cfbMod.CFB$Blob, sectors: js.Array[cfbLib.cfbMod.CFB$Blob]): Anon_Header = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.updateDynamic("sectors")(sectors)
    __obj.asInstanceOf[Anon_Header]
  }
}

