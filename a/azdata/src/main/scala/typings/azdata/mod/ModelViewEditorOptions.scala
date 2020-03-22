package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelViewEditorOptions extends js.Object {
  /**
  		 * Resource name for this editor
  		 * File icons might depend on file extension, language id or resource name
  		 * Resource name field needs to be set explitly if file icon for a particular Model View Editor depends on editor resource name
  		 */
  val resourceName: js.UndefOr[String] = js.undefined
  /**
  		 * Should the model view editor's context be kept around even when the editor is no longer visible? It is false by default
  		 */
  val retainContextWhenHidden: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Does this model view editor support save?
  		 */
  val supportsSave: js.UndefOr[Boolean] = js.undefined
}

object ModelViewEditorOptions {
  @scala.inline
  def apply(
    resourceName: String = null,
    retainContextWhenHidden: js.UndefOr[Boolean] = js.undefined,
    supportsSave: js.UndefOr[Boolean] = js.undefined
  ): ModelViewEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (!js.isUndefined(retainContextWhenHidden)) __obj.updateDynamic("retainContextWhenHidden")(retainContextWhenHidden.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsSave)) __obj.updateDynamic("supportsSave")(supportsSave.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelViewEditorOptions]
  }
}

