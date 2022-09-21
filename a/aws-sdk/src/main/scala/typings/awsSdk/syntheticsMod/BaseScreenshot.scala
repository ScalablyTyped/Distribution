package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseScreenshot extends StObject {
  
  /**
    * Coordinates that define the part of a screen to ignore during screenshot comparisons. To obtain the coordinates to use here, use the CloudWatch console to draw the boundaries on the screen. For more information, see  Editing or deleting a canary 
    */
  var IgnoreCoordinates: js.UndefOr[BaseScreenshotIgnoreCoordinates] = js.undefined
  
  /**
    * The name of the screenshot. This is generated the first time the canary is run after the UpdateCanary operation that specified for this canary to perform visual monitoring.
    */
  var ScreenshotName: String
}
object BaseScreenshot {
  
  inline def apply(ScreenshotName: String): BaseScreenshot = {
    val __obj = js.Dynamic.literal(ScreenshotName = ScreenshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseScreenshot]
  }
  
  extension [Self <: BaseScreenshot](x: Self) {
    
    inline def setIgnoreCoordinates(value: BaseScreenshotIgnoreCoordinates): Self = StObject.set(x, "IgnoreCoordinates", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCoordinatesUndefined: Self = StObject.set(x, "IgnoreCoordinates", js.undefined)
    
    inline def setIgnoreCoordinatesVarargs(value: BaseScreenshotConfigIgnoreCoordinate*): Self = StObject.set(x, "IgnoreCoordinates", js.Array(value*))
    
    inline def setScreenshotName(value: String): Self = StObject.set(x, "ScreenshotName", value.asInstanceOf[js.Any])
  }
}
