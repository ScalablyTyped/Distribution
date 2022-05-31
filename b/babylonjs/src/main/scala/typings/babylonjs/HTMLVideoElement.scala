package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLVideoElement extends StObject {
  
  var mozSrcObject: js.Any
}
object HTMLVideoElement {
  
  inline def apply(mozSrcObject: js.Any): HTMLVideoElement = {
    val __obj = js.Dynamic.literal(mozSrcObject = mozSrcObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLVideoElement]
  }
  
  extension [Self <: HTMLVideoElement](x: Self) {
    
    inline def setMozSrcObject(value: js.Any): Self = StObject.set(x, "mozSrcObject", value.asInstanceOf[js.Any])
  }
}
