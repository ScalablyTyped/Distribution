package typings.babylonjs

import typings.babylonjs.babylonjsStrings.box
import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRBoxDetectionBoundary
  extends StObject
     with XRDetectionBoundary {
  
  var extent: DOMPointReadOnly
  
  var `type`: box
}
object XRBoxDetectionBoundary {
  
  inline def apply(extent: DOMPointReadOnly): XRBoxDetectionBoundary = {
    val __obj = js.Dynamic.literal(extent = extent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("box")
    __obj.asInstanceOf[XRBoxDetectionBoundary]
  }
  
  extension [Self <: XRBoxDetectionBoundary](x: Self) {
    
    inline def setExtent(value: DOMPointReadOnly): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setType(value: box): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
