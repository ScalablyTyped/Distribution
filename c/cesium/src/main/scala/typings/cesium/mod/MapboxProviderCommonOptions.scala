package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapboxProviderCommonOptions extends StObject {
  
  /**
    * A credit for the data source, which is displayed on the canvas
    */
  var credit: js.UndefOr[Credit | String] = js.native
  
  /**
    * The ellipsoid.
    * If not specified, the WGS84 ellipsoid is used
    */
  var ellipsoid: js.UndefOr[Ellipsoid] = js.native
  
  /**
    * The maximum level-of-detail supported by the imagery provider, or undefined if there is no limit
    * @default undefined
    */
  var maximumLevel: js.UndefOr[Double] = js.native
  
  /**
    * The minimum level-of-detail supported by the imagery provider.
    * Take care when specifying this that the number of tiles at the minimum level is small, such as four or less.
    * A larger number is likely to result in rendering problems
    * @default 0
    */
  var minimumLevel: js.UndefOr[Double] = js.native
  
  /**
    * The rectangle, in radians, covered by the image
    * @defualt Rectangle.MAX_VALUE
    */
  var rectangle: js.UndefOr[Rectangle] = js.native
}
object MapboxProviderCommonOptions {
  
  @scala.inline
  def apply(): MapboxProviderCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapboxProviderCommonOptions]
  }
  
  @scala.inline
  implicit class MapboxProviderCommonOptionsMutableBuilder[Self <: MapboxProviderCommonOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
    
    @scala.inline
    def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    @scala.inline
    def setMinimumLevel(value: Double): Self = StObject.set(x, "minimumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumLevelUndefined: Self = StObject.set(x, "minimumLevel", js.undefined)
    
    @scala.inline
    def setRectangle(value: Rectangle): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
  }
}
