package typings.cfb

import typings.cfb.cfbMod.CFB$Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Header extends js.Object {
  var header: CFB$Blob
  var sectors: js.Array[CFB$Blob]
}

object Anon_Header {
  @scala.inline
  def apply(header: CFB$Blob, sectors: js.Array[CFB$Blob]): Anon_Header = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], sectors = sectors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Header]
  }
}

