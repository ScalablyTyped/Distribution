package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapboxProviderCommonOptions extends StObject {
  
  /**
    * A credit for the data source, which is displayed on the canvas
    */
  var credit: js.UndefOr[Credit | String] = js.undefined
  
  /**
    * The ellipsoid.
    * If not specified, the WGS84 ellipsoid is used
    */
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  
  /**
    * The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit
    * @default undefined
    */
  var maximumLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum level-of-detail supported by the imagery provider.
    * Take care when specifying this that the number of tiles at the minimum level is small, such as four or less.
    * A larger number is likely to result in rendering problems
    * @default 0
    */
  var minimumLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * The rectangle, in radians, covered by the image
    * @defualt Rectangle.MAX_VALUE
    */
  var rectangle: js.UndefOr[Rectangle] = js.undefined
}
object MapboxProviderCommonOptions {
  
  inline def apply(): MapboxProviderCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapboxProviderCommonOptions]
  }
  
  extension [Self <: MapboxProviderCommonOptions](x: Self) {
    
    inline def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    inline def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    inline def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    inline def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
    
    inline def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
    
    inline def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
  }
}
