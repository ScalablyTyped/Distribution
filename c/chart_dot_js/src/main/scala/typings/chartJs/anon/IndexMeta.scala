package typings.chartJs.anon

import typings.chartJs.distChunksHelpersDotcoreMod.AnyObject
import typings.chartJs.distChunksHelpersDotcoreMod.ChartMeta
import typings.chartJs.distChunksHelpersDotcoreMod.ChartType
import typings.chartJs.distChunksHelpersDotcoreMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexMeta extends StObject {
  
  var index: Double
  
  var meta: ChartMeta[ChartType, Element[AnyObject, AnyObject], Element[AnyObject, AnyObject]]
}
object IndexMeta {
  
  inline def apply(
    index: Double,
    meta: ChartMeta[ChartType, Element[AnyObject, AnyObject], Element[AnyObject, AnyObject]]
  ): IndexMeta = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexMeta]
  }
  
  extension [Self <: IndexMeta](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: ChartMeta[ChartType, Element[AnyObject, AnyObject], Element[AnyObject, AnyObject]]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
