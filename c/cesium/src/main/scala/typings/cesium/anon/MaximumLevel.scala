package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumLevel extends StObject {
  
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.undefined
  
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  
  var fileExtension: js.UndefOr[String] = js.undefined
  
  var maximumLevel: js.UndefOr[Double] = js.undefined
  
  var minimumLevel: js.UndefOr[Double] = js.undefined
  
  var proxy: js.UndefOr[js.Any] = js.undefined
  
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object MaximumLevel {
  
  inline def apply(): MaximumLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaximumLevel]
  }
  
  extension [Self <: MaximumLevel](x: Self) {
    
    inline def setCredit(value: typings.cesium.mod.Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    inline def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setFileExtension(value: String): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
    
    inline def setFileExtensionUndefined: Self = StObject.set(x, "fileExtension", js.undefined)
    
    inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    inline def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
    
    inline def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
    
    inline def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setRectangle(value: typings.cesium.mod.Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
