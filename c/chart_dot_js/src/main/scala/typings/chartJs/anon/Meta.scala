package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.AnyObject
import typings.chartJs.distChunksHelpersDotcoreMod.ChartMeta
import typings.chartJs.distChunksHelpersDotcoreMod.ChartType
import typings.chartJs.distChunksHelpersDotcoreMod.Element
import typings.chartJs.distChunksHelpersDotcoreMod.UpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta extends StObject {
  
  var cancelable: false
  
  var index: Double
  
  var meta: ChartMeta[ChartType, Element[AnyObject, AnyObject], Element[AnyObject, AnyObject]]
  
  var mode: UpdateMode
}
object Meta {
  
  inline def apply(
    index: Double,
    meta: ChartMeta[ChartType, Element[AnyObject, AnyObject], Element[AnyObject, AnyObject]],
    mode: UpdateMode
  ): Meta = {
    val __obj = js.Dynamic.literal(cancelable = false, index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  extension [Self <: Meta](x: Self) {
    
    inline def setCancelable(value: false): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: ChartMeta[ChartType, Element[AnyObject, AnyObject], Element[AnyObject, AnyObject]]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMode(value: UpdateMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
