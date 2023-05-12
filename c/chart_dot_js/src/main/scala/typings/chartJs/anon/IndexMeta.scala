package typings.chartJs.anon

import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ChartMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexMeta extends StObject {
  
  var index: Double
  
  var meta: ChartMeta[
    typings.chartJs.distTypesIndexMod.ChartType, 
    default[AnyObject, AnyObject], 
    default[AnyObject, AnyObject]
  ]
}
object IndexMeta {
  
  inline def apply(
    index: Double,
    meta: ChartMeta[
      typings.chartJs.distTypesIndexMod.ChartType, 
      default[AnyObject, AnyObject], 
      default[AnyObject, AnyObject]
    ]
  ): IndexMeta = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexMeta] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMeta(
      value: ChartMeta[
          typings.chartJs.distTypesIndexMod.ChartType, 
          default[AnyObject, AnyObject], 
          default[AnyObject, AnyObject]
        ]
    ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
