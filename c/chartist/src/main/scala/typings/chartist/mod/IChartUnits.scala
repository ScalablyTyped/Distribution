package typings.chartist.mod

import typings.chartist.chartistStrings.height
import typings.chartist.chartistStrings.horizontal
import typings.chartist.chartistStrings.vertical
import typings.chartist.chartistStrings.width
import typings.chartist.chartistStrings.x
import typings.chartist.chartistStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChartUnits extends StObject {
  
  var dir: vertical | horizontal
  
  var len: height | width
  
  var pos: x | y
  
  var rectEnd: String
  
  var rectOffset: String
  
  var rectStart: String
}
object IChartUnits {
  
  @scala.inline
  def apply(
    dir: vertical | horizontal,
    len: height | width,
    pos: x | y,
    rectEnd: String,
    rectOffset: String,
    rectStart: String
  ): IChartUnits = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], len = len.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], rectEnd = rectEnd.asInstanceOf[js.Any], rectOffset = rectOffset.asInstanceOf[js.Any], rectStart = rectStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartUnits]
  }
  
  @scala.inline
  implicit class IChartUnitsMutableBuilder[Self <: IChartUnits] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDir(value: vertical | horizontal): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLen(value: height | width): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: typings.chartist.chartistStrings.x | y): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectEnd(value: String): Self = StObject.set(x, "rectEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectOffset(value: String): Self = StObject.set(x, "rectOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectStart(value: String): Self = StObject.set(x, "rectStart", value.asInstanceOf[js.Any])
  }
}
