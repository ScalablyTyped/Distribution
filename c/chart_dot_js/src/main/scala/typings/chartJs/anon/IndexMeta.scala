package typings.chartJs.anon

import typings.chartJs.mod.ChartMeta
import typings.chartJs.mod.ChartType
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesElementMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexMeta extends StObject {
  
  var index: Double
  
  var meta: ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType]
}
object IndexMeta {
  
  inline def apply(
    index: Double,
    meta: ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType]
  ): IndexMeta = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexMeta]
  }
  
  extension [Self <: IndexMeta](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: ChartMeta[Element[AnyObject, AnyObject], Element[AnyObject, AnyObject], ChartType]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
