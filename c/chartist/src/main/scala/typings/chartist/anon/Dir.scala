package typings.chartist.anon

import typings.chartist.chartistStrings.horizontal
import typings.chartist.chartistStrings.width
import typings.chartist.chartistStrings.x
import typings.chartist.chartistStrings.x1
import typings.chartist.chartistStrings.x2
import typings.chartist.chartistStrings.y2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dir extends StObject {
  
  val dir: horizontal
  
  val len: width
  
  val pos: x
  
  val rectEnd: x2
  
  val rectOffset: y2
  
  val rectStart: x1
}
object Dir {
  
  inline def apply(): Dir = {
    val __obj = js.Dynamic.literal(dir = "horizontal", len = "width", pos = "x", rectEnd = "x2", rectOffset = "y2", rectStart = "x1")
    __obj.asInstanceOf[Dir]
  }
  
  extension [Self <: Dir](x: Self) {
    
    inline def setDir(value: horizontal): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setLen(value: width): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setPos(value: typings.chartist.chartistStrings.x): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setRectEnd(value: x2): Self = StObject.set(x, "rectEnd", value.asInstanceOf[js.Any])
    
    inline def setRectOffset(value: y2): Self = StObject.set(x, "rectOffset", value.asInstanceOf[js.Any])
    
    inline def setRectStart(value: x1): Self = StObject.set(x, "rectStart", value.asInstanceOf[js.Any])
  }
}
