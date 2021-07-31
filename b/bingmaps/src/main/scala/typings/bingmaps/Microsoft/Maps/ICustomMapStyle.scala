package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomMapStyle extends StObject {
  
  /** A list of map elements to be styled. */
  var elements: js.UndefOr[IMapElements] = js.undefined
  
  /** Global Settings. */
  var settings: js.UndefOr[ISettingsStyle] = js.undefined
  
  /** The version of the style syntax used. */
  var version: String
}
object ICustomMapStyle {
  
  @scala.inline
  def apply(version: String): ICustomMapStyle = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomMapStyle]
  }
  
  @scala.inline
  implicit class ICustomMapStyleMutableBuilder[Self <: ICustomMapStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: IMapElements): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setSettings(value: ISettingsStyle): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
