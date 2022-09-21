package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeObserverEntry extends StObject {
  
  val borderBoxSize: ReadonlyArray[ResizeObserverSize]
  
  val contentBoxSize: ReadonlyArray[ResizeObserverSize]
  
  val contentRect: DOMRectReadOnly
  
  val devicePixelContentBoxSize: ReadonlyArray[ResizeObserverSize]
  
  val target: Element
}
object ResizeObserverEntry {
  
  inline def apply(
    borderBoxSize: ReadonlyArray[ResizeObserverSize],
    contentBoxSize: ReadonlyArray[ResizeObserverSize],
    contentRect: DOMRectReadOnly,
    devicePixelContentBoxSize: ReadonlyArray[ResizeObserverSize],
    target: Element
  ): ResizeObserverEntry = {
    val __obj = js.Dynamic.literal(borderBoxSize = borderBoxSize.asInstanceOf[js.Any], contentBoxSize = contentBoxSize.asInstanceOf[js.Any], contentRect = contentRect.asInstanceOf[js.Any], devicePixelContentBoxSize = devicePixelContentBoxSize.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverEntry]
  }
  
  extension [Self <: ResizeObserverEntry](x: Self) {
    
    inline def setBorderBoxSize(value: ReadonlyArray[ResizeObserverSize]): Self = StObject.set(x, "borderBoxSize", value.asInstanceOf[js.Any])
    
    inline def setContentBoxSize(value: ReadonlyArray[ResizeObserverSize]): Self = StObject.set(x, "contentBoxSize", value.asInstanceOf[js.Any])
    
    inline def setContentRect(value: DOMRectReadOnly): Self = StObject.set(x, "contentRect", value.asInstanceOf[js.Any])
    
    inline def setDevicePixelContentBoxSize(value: ReadonlyArray[ResizeObserverSize]): Self = StObject.set(x, "devicePixelContentBoxSize", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
