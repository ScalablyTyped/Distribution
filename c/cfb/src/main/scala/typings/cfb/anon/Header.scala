package typings.cfb.anon

import typings.cfb.mod.CFBBlob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var header: CFBBlob
  var sectors: js.Array[CFBBlob]
}

object Header {
  @scala.inline
  def apply(header: CFBBlob, sectors: js.Array[CFBBlob]): Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], sectors = sectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

