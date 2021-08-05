package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestEnvironment extends StObject {
  
  var orientationAngle: js.UndefOr[Double] = js.undefined
  
  var orientationType: js.UndefOr[String] = js.undefined
  
  var userAgent: String
  
  var windowHeight: Double
  
  var windowWidth: Double
}
object TestEnvironment {
  
  inline def apply(userAgent: String, windowHeight: Double, windowWidth: Double): TestEnvironment = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEnvironment]
  }
  
  extension [Self <: TestEnvironment](x: Self) {
    
    inline def setOrientationAngle(value: Double): Self = StObject.set(x, "orientationAngle", value.asInstanceOf[js.Any])
    
    inline def setOrientationAngleUndefined: Self = StObject.set(x, "orientationAngle", js.undefined)
    
    inline def setOrientationType(value: String): Self = StObject.set(x, "orientationType", value.asInstanceOf[js.Any])
    
    inline def setOrientationTypeUndefined: Self = StObject.set(x, "orientationType", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
