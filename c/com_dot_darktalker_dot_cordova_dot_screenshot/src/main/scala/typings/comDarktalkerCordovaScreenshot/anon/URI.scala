package typings.comDarktalkerCordovaScreenshot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait URI extends js.Object {
  var URI: String = js.native
}

object URI {
  @scala.inline
  def apply(URI: String): URI = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[URI]
  }
  @scala.inline
  implicit class URIOps[Self <: URI] (val x: Self) extends AnyVal {
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
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
  }
  
}

