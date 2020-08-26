package typings.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined dav.dav.Partial<dav.dav.Calendar> */
@js.native
trait CalendarOptions extends js.Object {
  var account: js.UndefOr[Account] = js.native
  var components: js.UndefOr[js.Array[String]] = js.native
  var constructor: js.UndefOr[js.Function1[/* options */ js.UndefOr[this.type], js.Any]] = js.native
  var ctag: js.UndefOr[String] = js.native
  var data: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var displayName: js.UndefOr[String] = js.native
  var objects: js.UndefOr[js.Array[CalendarObject]] = js.native
  var reports: js.UndefOr[js.Array[String]] = js.native
  var resourcetype: js.UndefOr[String] = js.native
  var syncToken: js.UndefOr[String] = js.native
  var timezone: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object CalendarOptions {
  @scala.inline
  def apply(): CalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarOptions]
  }
  @scala.inline
  implicit class CalendarOptionsOps[Self <: CalendarOptions] (val x: Self) extends AnyVal {
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
    def setAccount(value: Account): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    @scala.inline
    def setComponentsVarargs(value: String*): Self = this.set("components", js.Array(value :_*))
    @scala.inline
    def setComponents(value: js.Array[String]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    @scala.inline
    def setConstructor(value: /* options */ js.UndefOr[CalendarOptions] => js.Any): Self = this.set("constructor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteConstructor: Self = this.set("constructor", js.undefined)
    @scala.inline
    def setCtag(value: String): Self = this.set("ctag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtag: Self = this.set("ctag", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setObjectsVarargs(value: CalendarObject*): Self = this.set("objects", js.Array(value :_*))
    @scala.inline
    def setObjects(value: js.Array[CalendarObject]): Self = this.set("objects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    @scala.inline
    def setReportsVarargs(value: String*): Self = this.set("reports", js.Array(value :_*))
    @scala.inline
    def setReports(value: js.Array[String]): Self = this.set("reports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReports: Self = this.set("reports", js.undefined)
    @scala.inline
    def setResourcetype(value: String): Self = this.set("resourcetype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourcetype: Self = this.set("resourcetype", js.undefined)
    @scala.inline
    def setSyncToken(value: String): Self = this.set("syncToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyncToken: Self = this.set("syncToken", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

