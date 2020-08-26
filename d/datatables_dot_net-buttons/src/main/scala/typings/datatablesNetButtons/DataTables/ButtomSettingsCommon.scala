package typings.datatablesNetButtons.DataTables

import typings.datatablesNet.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtomSettingsCommon extends js.Object {
  /**
    * Action to take when the button is activated
    */
  var action: js.UndefOr[FunctionButtonAction] = js.native
  /**
    * Ensure that any requirements have been satisfied before initialising a button
    */
  var available: js.UndefOr[FunctionButtonAvailable] = js.native
  /**
    * Set the class name for the button
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Function that is called when the button is destroyed
    */
  var destroy: js.UndefOr[FunctionButtonInit] = js.native
  /**
    * Set a button's initial enabled state
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Define which button type the button should be based on
    */
  var extend: js.UndefOr[String] = js.native
  /**
    * Initialisation function that can be used to add events specific to this button
    */
  var init: js.UndefOr[FunctionButtonInit] = js.native
  /**
    * Define an activation key for a button
    */
  var key: js.UndefOr[String | ButtonKey] = js.native
  /**
    * Set a name for each selection
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Unique namespace for every button
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * The text to show in the button
    */
  var text: js.UndefOr[String | FunctionButtonText] = js.native
  /**
    * Button 'title' attribute text
    */
  var titleAttr: js.UndefOr[String] = js.native
}

object ButtomSettingsCommon {
  @scala.inline
  def apply(): ButtomSettingsCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtomSettingsCommon]
  }
  @scala.inline
  implicit class ButtomSettingsCommonOps[Self <: ButtomSettingsCommon] (val x: Self) extends AnyVal {
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
    def setAction(value: (/* e */ js.Any, /* dt */ Api, /* node */ JQuery, /* config */ ButtonSettings) => Unit): Self = this.set("action", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setAvailable(value: (/* dt */ Api, /* config */ js.Any) => Boolean): Self = this.set("available", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAvailable: Self = this.set("available", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDestroy(value: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => Unit): Self = this.set("destroy", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setExtend(value: String): Self = this.set("extend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    @scala.inline
    def setInit(value: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => Unit): Self = this.set("init", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    @scala.inline
    def setKey(value: String | ButtonKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setTextFunction3(value: (/* dt */ Api, /* node */ JQuery, /* config */ js.Any) => String): Self = this.set("text", js.Any.fromFunction3(value))
    @scala.inline
    def setText(value: String | FunctionButtonText): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTitleAttr(value: String): Self = this.set("titleAttr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleAttr: Self = this.set("titleAttr", js.undefined)
  }
  
}

