package typings.azdata.mod.nb

import typings.azdata.mod.IConnectionProfile
import typings.vscode.mod.ViewColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookShowOptions extends js.Object {
  
  /**
    * Optional profile indicating the initial connection to use for this editor
    */
  var connectionProfile: js.UndefOr[IConnectionProfile] = js.native
  
  /**
    * Default kernel for notebook
    */
  var defaultKernel: js.UndefOr[IKernelSpec] = js.native
  
  /**
    * Optional content used to give an initial notebook state
    */
  var initialContent: js.UndefOr[INotebookContents | String] = js.native
  
  /**
    * A optional boolean value indicating the dirty state after the initial content is loaded, default value is true
    */
  var initialDirtyState: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional flag that when `true` will stop the [editor](#NotebookEditor) from taking focus.
    */
  var preserveFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional flag that controls if an [editor](#NotebookEditor)-tab will be replaced
    * with the next editor or if it will be kept.
    */
  var preview: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional string indicating which notebook provider to initially use
    */
  var providerId: js.UndefOr[String] = js.native
  
  /**
    * An optional view column in which the [editor](#NotebookEditor) should be shown.
    * The default is the [active](#ViewColumn.Active), other values are adjusted to
    * be `Min(column, columnCount + 1)`, the [active](#ViewColumn.Active)-column is
    * not adjusted. Use [`ViewColumn.Beside`](#ViewColumn.Beside) to open the
    * editor to the side of the currently active one.
    */
  var viewColumn: js.UndefOr[ViewColumn] = js.native
}
object NotebookShowOptions {
  
  @scala.inline
  def apply(): NotebookShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookShowOptions]
  }
  
  @scala.inline
  implicit class NotebookShowOptionsOps[Self <: NotebookShowOptions] (val x: Self) extends AnyVal {
    
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
    def setConnectionProfile(value: IConnectionProfile): Self = this.set("connectionProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionProfile: Self = this.set("connectionProfile", js.undefined)
    
    @scala.inline
    def setDefaultKernel(value: IKernelSpec): Self = this.set("defaultKernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultKernel: Self = this.set("defaultKernel", js.undefined)
    
    @scala.inline
    def setInitialContent(value: INotebookContents | String): Self = this.set("initialContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialContent: Self = this.set("initialContent", js.undefined)
    
    @scala.inline
    def setInitialDirtyState(value: Boolean): Self = this.set("initialDirtyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDirtyState: Self = this.set("initialDirtyState", js.undefined)
    
    @scala.inline
    def setPreserveFocus(value: Boolean): Self = this.set("preserveFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveFocus: Self = this.set("preserveFocus", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderId: Self = this.set("providerId", js.undefined)
    
    @scala.inline
    def setViewColumn(value: ViewColumn): Self = this.set("viewColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewColumn: Self = this.set("viewColumn", js.undefined)
  }
}
