package typings.cfb.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CFBEntry extends js.Object {
  /** Class ID represented as hex string */
  var clsid: String = js.native
  /** Red/Black Tree color: 0 = red, 1 = black */
  var color: Double = js.native
  /** Raw Content (Buffer when available, Array of bytes otherwise) */
  var content: CFBBlob = js.native
  /** Creation Time */
  var ct: js.UndefOr[Date] = js.native
  /** Content Type (used for MAD) */
  var ctype: js.UndefOr[String] = js.native
  /** Modification Time */
  var mt: js.UndefOr[Date] = js.native
  /** Case-sensitive internal name */
  var name: String = js.native
  /** Data Size */
  var size: Double = js.native
  /** Starting Sector */
  var start: Double = js.native
  /** User-Defined State Bits */
  var state: Double = js.native
  /** Storage location -- see CFB$StorageType */
  var storage: js.UndefOr[String] = js.native
  /** CFB type (salient types: stream, storage) -- see CFB$EntryType */
  var `type`: Double = js.native
}

object CFBEntry {
  @scala.inline
  def apply(
    clsid: String,
    color: Double,
    content: CFBBlob,
    name: String,
    size: Double,
    start: Double,
    state: Double,
    `type`: Double
  ): CFBEntry = {
    val __obj = js.Dynamic.literal(clsid = clsid.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFBEntry]
  }
  @scala.inline
  implicit class CFBEntryOps[Self <: CFBEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClsid(value: String): Self = this.set("clsid", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentVarargs(value: Double*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: CFBBlob): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: Double): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCt(value: Date): Self = this.set("ct", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCt: Self = this.set("ct", js.undefined)
    @scala.inline
    def setCtype(value: String): Self = this.set("ctype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtype: Self = this.set("ctype", js.undefined)
    @scala.inline
    def setMt(value: Date): Self = this.set("mt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMt: Self = this.set("mt", js.undefined)
    @scala.inline
    def setStorage(value: String): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
  
}

