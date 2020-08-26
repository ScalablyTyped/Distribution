package typings.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderFilter extends js.Object {
  var nameContains: js.UndefOr[js.Any] = js.native
  var nameEquals: js.UndefOr[String] = js.native
  var namePrefix: js.UndefOr[String] = js.native
  var nameSuffix: js.UndefOr[String] = js.native
  var valueContains: js.UndefOr[js.Any] = js.native
  var valueEquals: js.UndefOr[String] = js.native
  var valuePrefix: js.UndefOr[String] = js.native
  var valueSuffix: js.UndefOr[String] = js.native
}

object HeaderFilter {
  @scala.inline
  def apply(): HeaderFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderFilter]
  }
  @scala.inline
  implicit class HeaderFilterOps[Self <: HeaderFilter] (val x: Self) extends AnyVal {
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
    def setNameContains(value: js.Any): Self = this.set("nameContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameContains: Self = this.set("nameContains", js.undefined)
    @scala.inline
    def setNameEquals(value: String): Self = this.set("nameEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameEquals: Self = this.set("nameEquals", js.undefined)
    @scala.inline
    def setNamePrefix(value: String): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    @scala.inline
    def setNameSuffix(value: String): Self = this.set("nameSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameSuffix: Self = this.set("nameSuffix", js.undefined)
    @scala.inline
    def setValueContains(value: js.Any): Self = this.set("valueContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueContains: Self = this.set("valueContains", js.undefined)
    @scala.inline
    def setValueEquals(value: String): Self = this.set("valueEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueEquals: Self = this.set("valueEquals", js.undefined)
    @scala.inline
    def setValuePrefix(value: String): Self = this.set("valuePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuePrefix: Self = this.set("valuePrefix", js.undefined)
    @scala.inline
    def setValueSuffix(value: String): Self = this.set("valueSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSuffix: Self = this.set("valueSuffix", js.undefined)
  }
  
}

