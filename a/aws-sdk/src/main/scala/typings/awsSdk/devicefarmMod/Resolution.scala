package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolution extends StObject {
  
  /**
    * The screen resolution's height, expressed in pixels.
    */
  var height: js.UndefOr[Integer] = js.undefined
  
  /**
    * The screen resolution's width, expressed in pixels.
    */
  var width: js.UndefOr[Integer] = js.undefined
}
object Resolution {
  
  inline def apply(): Resolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resolution]
  }
  
  extension [Self <: Resolution](x: Self) {
    
    inline def setHeight(value: Integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
