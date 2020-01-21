package typings.datatablesNetRowreorder.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowReorderSettings extends js.Object {
  /**
    * Configure the data point that will be used for the reordering data
    */
  var dataSrc: js.UndefOr[String] = js.undefined
  /**
    * Attach an Editor instance for database updating
    */
  var editor: js.UndefOr[js.Any] = js.undefined
  /**
    * Enable / disable RowReorder's user interaction
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the options for the Editor form when submitting data
    */
  var formOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * Define the selector used to pick the elements that will start a drag
    */
  var selector: js.UndefOr[String] = js.undefined
  /**
    * Horizontal position control of the row being dragged
    */
  var snapX: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Control automatic of data when a row is dropped
    */
  var update: js.UndefOr[Boolean] = js.undefined
}

object RowReorderSettings {
  @scala.inline
  def apply(
    dataSrc: String = null,
    editor: js.Any = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    formOptions: js.Any = null,
    selector: String = null,
    snapX: Double | Boolean = null,
    update: js.UndefOr[Boolean] = js.undefined
  ): RowReorderSettings = {
    val __obj = js.Dynamic.literal()
    if (dataSrc != null) __obj.updateDynamic("dataSrc")(dataSrc.asInstanceOf[js.Any])
    if (editor != null) __obj.updateDynamic("editor")(editor.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (formOptions != null) __obj.updateDynamic("formOptions")(formOptions.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (snapX != null) __obj.updateDynamic("snapX")(snapX.asInstanceOf[js.Any])
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowReorderSettings]
  }
}

