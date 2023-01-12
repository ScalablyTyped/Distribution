package typings.azdata.mod.nb

import typings.azdata.mod.IConnectionProfile
import typings.vscode.mod.ViewColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookShowOptions extends StObject {
  
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
  
  inline def apply(): NotebookShowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookShowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookShowOptions] (val x: Self) extends AnyVal {
    
    inline def setConnectionProfile(value: IConnectionProfile): Self = StObject.set(x, "connectionProfile", value.asInstanceOf[js.Any])
    
    inline def setConnectionProfileUndefined: Self = StObject.set(x, "connectionProfile", js.undefined)
    
    inline def setDefaultKernel(value: IKernelSpec): Self = StObject.set(x, "defaultKernel", value.asInstanceOf[js.Any])
    
    inline def setDefaultKernelUndefined: Self = StObject.set(x, "defaultKernel", js.undefined)
    
    inline def setInitialContent(value: INotebookContents | String): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
    
    inline def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
    
    inline def setInitialDirtyState(value: Boolean): Self = StObject.set(x, "initialDirtyState", value.asInstanceOf[js.Any])
    
    inline def setInitialDirtyStateUndefined: Self = StObject.set(x, "initialDirtyState", js.undefined)
    
    inline def setPreserveFocus(value: Boolean): Self = StObject.set(x, "preserveFocus", value.asInstanceOf[js.Any])
    
    inline def setPreserveFocusUndefined: Self = StObject.set(x, "preserveFocus", js.undefined)
    
    inline def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
    
    inline def setViewColumn(value: ViewColumn): Self = StObject.set(x, "viewColumn", value.asInstanceOf[js.Any])
    
    inline def setViewColumnUndefined: Self = StObject.set(x, "viewColumn", js.undefined)
  }
}
