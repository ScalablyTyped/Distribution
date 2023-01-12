package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaOptions extends StObject {
  
  var albumsControl: js.UndefOr[Boolean] = js.undefined
  
  var albumsControlOptions: js.UndefOr[AlbumsControlOptions] = js.undefined
  
  var indoorSceneSwitchControl: js.UndefOr[Boolean] = js.undefined
  
  var linksControl: js.UndefOr[Boolean] = js.undefined
  
  var navigationControl: js.UndefOr[Boolean] = js.undefined
}
object PanoramaOptions {
  
  inline def apply(): PanoramaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanoramaOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PanoramaOptions] (val x: Self) extends AnyVal {
    
    inline def setAlbumsControl(value: Boolean): Self = StObject.set(x, "albumsControl", value.asInstanceOf[js.Any])
    
    inline def setAlbumsControlOptions(value: AlbumsControlOptions): Self = StObject.set(x, "albumsControlOptions", value.asInstanceOf[js.Any])
    
    inline def setAlbumsControlOptionsUndefined: Self = StObject.set(x, "albumsControlOptions", js.undefined)
    
    inline def setAlbumsControlUndefined: Self = StObject.set(x, "albumsControl", js.undefined)
    
    inline def setIndoorSceneSwitchControl(value: Boolean): Self = StObject.set(x, "indoorSceneSwitchControl", value.asInstanceOf[js.Any])
    
    inline def setIndoorSceneSwitchControlUndefined: Self = StObject.set(x, "indoorSceneSwitchControl", js.undefined)
    
    inline def setLinksControl(value: Boolean): Self = StObject.set(x, "linksControl", value.asInstanceOf[js.Any])
    
    inline def setLinksControlUndefined: Self = StObject.set(x, "linksControl", js.undefined)
    
    inline def setNavigationControl(value: Boolean): Self = StObject.set(x, "navigationControl", value.asInstanceOf[js.Any])
    
    inline def setNavigationControlUndefined: Self = StObject.set(x, "navigationControl", js.undefined)
  }
}
