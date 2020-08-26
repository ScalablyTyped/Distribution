package typings.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobInformation extends js.Object {
  var cron: String = js.native
  var endDate: js.UndefOr[Double] = js.native
  var every: Double = js.native
  var id: js.UndefOr[String] = js.native
  var key: String = js.native
  var name: String = js.native
  var next: Double = js.native
  var tz: js.UndefOr[String] = js.native
}

object JobInformation {
  @scala.inline
  def apply(cron: String, every: Double, key: String, name: String, next: Double): JobInformation = {
    val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any], every = every.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobInformation]
  }
  @scala.inline
  implicit class JobInformationOps[Self <: JobInformation] (val x: Self) extends AnyVal {
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
    def setCron(value: String): Self = this.set("cron", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvery(value: Double): Self = this.set("every", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: Double): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndDate(value: Double): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setTz(value: String): Self = this.set("tz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTz: Self = this.set("tz", js.undefined)
  }
  
}

