package typings.datatablesNetRowgroup.DataTables

import typings.datatablesNet.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RowGroup extension options
  */
@js.native
trait RowGroupSettings extends js.Object {
  /**
    * Set the class name to be used for the grouping rows
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Set the data point to use as the grouping data source
    */
  var dataSrc: js.UndefOr[Double | String] = js.native
  /**
    * Provides the ability to disable row grouping at initialisation
    */
  var enable: js.UndefOr[Boolean] = js.native
  /**
    * Set the class name to be used for the grouping end rows
    */
  var endClassName: js.UndefOr[String] = js.native
  /**
    * Provide a function that can be used to control the data shown in the end grouping row
    */
  var endRender: js.UndefOr[js.Function2[/* rows */ Api, /* group */ String, String | HTMLElement | JQuery]] = js.native
  /**
    * Provide a function that can be used to control the data shown in the start grouping row
    */
  var startRender: js.UndefOr[js.Function2[/* rows */ Api, /* group */ String, String | HTMLElement | JQuery]] = js.native
}

object RowGroupSettings {
  @scala.inline
  def apply(): RowGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowGroupSettings]
  }
  @scala.inline
  implicit class RowGroupSettingsOps[Self <: RowGroupSettings] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDataSrc(value: Double | String): Self = this.set("dataSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSrc: Self = this.set("dataSrc", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    @scala.inline
    def setEndClassName(value: String): Self = this.set("endClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndClassName: Self = this.set("endClassName", js.undefined)
    @scala.inline
    def setEndRender(value: (/* rows */ Api, /* group */ String) => String | HTMLElement | JQuery): Self = this.set("endRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEndRender: Self = this.set("endRender", js.undefined)
    @scala.inline
    def setStartRender(value: (/* rows */ Api, /* group */ String) => String | HTMLElement | JQuery): Self = this.set("startRender", js.Any.fromFunction2(value))
    @scala.inline
    def deleteStartRender: Self = this.set("startRender", js.undefined)
  }
  
}

