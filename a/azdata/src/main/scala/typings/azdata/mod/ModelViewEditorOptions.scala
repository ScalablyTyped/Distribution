package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelViewEditorOptions extends StObject {
  
  /**
    * Resource name for this editor
    * File icons might depend on file extension, language id or resource name
    * Resource name field needs to be set explicitly if file icon for a particular Model View Editor depends on editor resource name
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
  
  inline def apply(): ModelViewEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelViewEditorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelViewEditorOptions] (val x: Self) extends AnyVal {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setRetainContextWhenHidden(value: Boolean): Self = StObject.set(x, "retainContextWhenHidden", value.asInstanceOf[js.Any])
    
    inline def setRetainContextWhenHiddenUndefined: Self = StObject.set(x, "retainContextWhenHidden", js.undefined)
    
    inline def setSupportsSave(value: Boolean): Self = StObject.set(x, "supportsSave", value.asInstanceOf[js.Any])
    
    inline def setSupportsSaveUndefined: Self = StObject.set(x, "supportsSave", js.undefined)
  }
}
