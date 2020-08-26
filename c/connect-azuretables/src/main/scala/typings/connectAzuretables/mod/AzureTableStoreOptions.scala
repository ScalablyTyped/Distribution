package typings.connectAzuretables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AzureTableStoreOptions extends js.Object {
  var accessKey: js.UndefOr[String] = js.native
  var errorLogger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  var logger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
   // sessionTimeOut in minutes
  var overrideCron: js.UndefOr[String] = js.native
  var sessionTimeOut: js.UndefOr[Double] = js.native
   // cron job description
  var storageAccount: js.UndefOr[String] = js.native
  var table: js.UndefOr[String] = js.native
}

object AzureTableStoreOptions {
  @scala.inline
  def apply(): AzureTableStoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureTableStoreOptions]
  }
  @scala.inline
  implicit class AzureTableStoreOptionsOps[Self <: AzureTableStoreOptions] (val x: Self) extends AnyVal {
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
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessKey: Self = this.set("accessKey", js.undefined)
    @scala.inline
    def setErrorLogger(value: /* message */ String => Unit): Self = this.set("errorLogger", js.Any.fromFunction1(value))
    @scala.inline
    def deleteErrorLogger: Self = this.set("errorLogger", js.undefined)
    @scala.inline
    def setLogger(value: /* message */ String => Unit): Self = this.set("logger", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setOverrideCron(value: String): Self = this.set("overrideCron", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideCron: Self = this.set("overrideCron", js.undefined)
    @scala.inline
    def setSessionTimeOut(value: Double): Self = this.set("sessionTimeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionTimeOut: Self = this.set("sessionTimeOut", js.undefined)
    @scala.inline
    def setStorageAccount(value: String): Self = this.set("storageAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageAccount: Self = this.set("storageAccount", js.undefined)
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
  
}

