package typings.config.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfigSource extends js.Object {
  var name: String = js.native
  var original: js.UndefOr[String] = js.native
  var parsed: js.Any = js.native
}

object IConfigSource {
  @scala.inline
  def apply(name: String, parsed: js.Any): IConfigSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigSource]
  }
  @scala.inline
  implicit class IConfigSourceOps[Self <: IConfigSource] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsed(value: js.Any): Self = this.set("parsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal(value: String): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginal: Self = this.set("original", js.undefined)
  }
  
}

