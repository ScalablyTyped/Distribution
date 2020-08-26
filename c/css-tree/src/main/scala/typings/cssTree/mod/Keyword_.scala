package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyword_ extends js.Object {
  val basename: String = js.native
  val custom: Boolean = js.native
  val name: String = js.native
  val prefix: String = js.native
  val vendor: String = js.native
}

object Keyword_ {
  @scala.inline
  def apply(basename: String, custom: Boolean, name: String, prefix: String, vendor: String): Keyword_ = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword_]
  }
  @scala.inline
  implicit class Keyword_Ops[Self <: Keyword_] (val x: Self) extends AnyVal {
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustom(value: Boolean): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
  }
  
}

