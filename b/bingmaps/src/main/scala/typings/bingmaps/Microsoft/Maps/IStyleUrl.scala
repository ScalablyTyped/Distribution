package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStyleUrl extends js.Object {
  /** List of style css urls o be downloaded */
  var styleURLs: js.Array[String] = js.native
}

object IStyleUrl {
  @scala.inline
  def apply(styleURLs: js.Array[String]): IStyleUrl = {
    val __obj = js.Dynamic.literal(styleURLs = styleURLs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleUrl]
  }
  @scala.inline
  implicit class IStyleUrlOps[Self <: IStyleUrl] (val x: Self) extends AnyVal {
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
    def setStyleURLsVarargs(value: String*): Self = this.set("styleURLs", js.Array(value :_*))
    @scala.inline
    def setStyleURLs(value: js.Array[String]): Self = this.set("styleURLs", value.asInstanceOf[js.Any])
  }
  
}

