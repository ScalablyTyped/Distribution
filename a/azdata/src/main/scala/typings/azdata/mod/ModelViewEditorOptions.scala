package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelViewEditorOptions extends js.Object {
  /**
    * Resource name for this editor
    * File icons might depend on file extension, language id or resource name
    * Resource name field needs to be set explitly if file icon for a particular Model View Editor depends on editor resource name
    */
  val resourceName: js.UndefOr[String] = js.native
  /**
    * Should the model view editor's context be kept around even when the editor is no longer visible? It is false by default
    */
  val retainContextWhenHidden: js.UndefOr[Boolean] = js.native
  /**
    * Does this model view editor support save?
    */
  val supportsSave: js.UndefOr[Boolean] = js.native
}

object ModelViewEditorOptions {
  @scala.inline
  def apply(): ModelViewEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelViewEditorOptions]
  }
  @scala.inline
  implicit class ModelViewEditorOptionsOps[Self <: ModelViewEditorOptions] (val x: Self) extends AnyVal {
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
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setRetainContextWhenHidden(value: Boolean): Self = this.set("retainContextWhenHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetainContextWhenHidden: Self = this.set("retainContextWhenHidden", js.undefined)
    @scala.inline
    def setSupportsSave(value: Boolean): Self = this.set("supportsSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsSave: Self = this.set("supportsSave", js.undefined)
  }
  
}

