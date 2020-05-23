package typings.azdata.mod.nb

import typings.azdata.mod.IConnectionProfile
import typings.vscode.mod.ViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookShowOptions extends js.Object {
  /**
    * Optional profile indicating the initial connection to use for this editor
    */
  var connectionProfile: js.UndefOr[IConnectionProfile] = js.undefined
  /**
    * Default kernel for notebook
    */
  var defaultKernel: js.UndefOr[IKernelSpec] = js.undefined
  /**
    * Optional content used to give an initial notebook state
    */
  var initialContent: js.UndefOr[INotebookContents | String] = js.undefined
  /**
    * A optional boolean value indicating the dirty state after the initial content is loaded, default value is true
    */
  var initialDirtyState: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional flag that when `true` will stop the [editor](#NotebookEditor) from taking focus.
    */
  var preserveFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional flag that controls if an [editor](#NotebookEditor)-tab will be replaced
    * with the next editor or if it will be kept.
    */
  var preview: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional string indicating which notebook provider to initially use
    */
  var providerId: js.UndefOr[String] = js.undefined
  /**
    * An optional view column in which the [editor](#NotebookEditor) should be shown.
    * The default is the [active](#ViewColumn.Active), other values are adjusted to
    * be `Min(column, columnCount + 1)`, the [active](#ViewColumn.Active)-column is
    * not adjusted. Use [`ViewColumn.Beside`](#ViewColumn.Beside) to open the
    * editor to the side of the currently active one.
    */
  var viewColumn: js.UndefOr[ViewColumn] = js.undefined
}

object NotebookShowOptions {
  @scala.inline
  def apply(
    connectionProfile: IConnectionProfile = null,
    defaultKernel: IKernelSpec = null,
    initialContent: INotebookContents | String = null,
    initialDirtyState: js.UndefOr[Boolean] = js.undefined,
    preserveFocus: js.UndefOr[Boolean] = js.undefined,
    preview: js.UndefOr[Boolean] = js.undefined,
    providerId: String = null,
    viewColumn: ViewColumn = null
  ): NotebookShowOptions = {
    val __obj = js.Dynamic.literal()
    if (connectionProfile != null) __obj.updateDynamic("connectionProfile")(connectionProfile.asInstanceOf[js.Any])
    if (defaultKernel != null) __obj.updateDynamic("defaultKernel")(defaultKernel.asInstanceOf[js.Any])
    if (initialContent != null) __obj.updateDynamic("initialContent")(initialContent.asInstanceOf[js.Any])
    if (!js.isUndefined(initialDirtyState)) __obj.updateDynamic("initialDirtyState")(initialDirtyState.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview.get.asInstanceOf[js.Any])
    if (providerId != null) __obj.updateDynamic("providerId")(providerId.asInstanceOf[js.Any])
    if (viewColumn != null) __obj.updateDynamic("viewColumn")(viewColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookShowOptions]
  }
}

