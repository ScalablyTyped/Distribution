package typings.babylonjs

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TODO: remove this file when we upgrade to TypeScript 5.0
  */
/* eslint-disable no-var */
/* eslint-disable @typescript-eslint/naming-convention */
trait OffscreenCanvasEventMap extends StObject {
  
  var contextlost: Event
  
  var contextrestored: Event
}
object OffscreenCanvasEventMap {
  
  inline def apply(contextlost: Event, contextrestored: Event): OffscreenCanvasEventMap = {
    val __obj = js.Dynamic.literal(contextlost = contextlost.asInstanceOf[js.Any], contextrestored = contextrestored.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffscreenCanvasEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OffscreenCanvasEventMap] (val x: Self) extends AnyVal {
    
    inline def setContextlost(value: Event): Self = StObject.set(x, "contextlost", value.asInstanceOf[js.Any])
    
    inline def setContextrestored(value: Event): Self = StObject.set(x, "contextrestored", value.asInstanceOf[js.Any])
  }
}
