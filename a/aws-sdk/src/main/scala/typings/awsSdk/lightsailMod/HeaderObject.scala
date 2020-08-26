package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderObject extends js.Object {
  /**
    * The specific headers to forward to your distribution's origin.
    */
  var headersAllowList: js.UndefOr[HeaderForwardList] = js.native
  /**
    * The headers that you want your distribution to forward to your origin and base caching on. You can configure your distribution to do one of the following:     all  - Forward all headers to your origin.     none  - Forward only the default headers.     allow-list  - Forward only the headers you specify using the headersAllowList parameter.  
    */
  var option: js.UndefOr[ForwardValues] = js.native
}

object HeaderObject {
  @scala.inline
  def apply(): HeaderObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderObject]
  }
  @scala.inline
  implicit class HeaderObjectOps[Self <: HeaderObject] (val x: Self) extends AnyVal {
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
    def setHeadersAllowListVarargs(value: HeaderEnum*): Self = this.set("headersAllowList", js.Array(value :_*))
    @scala.inline
    def setHeadersAllowList(value: HeaderForwardList): Self = this.set("headersAllowList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadersAllowList: Self = this.set("headersAllowList", js.undefined)
    @scala.inline
    def setOption(value: ForwardValues): Self = this.set("option", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
  }
  
}

