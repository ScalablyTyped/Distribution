package typings.chartJs.anon

import typings.chartJs.chartJsBooleans.`true`
import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ChartMeta
import typings.chartJs.distTypesIndexMod.UpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta extends StObject {
  
  var cancelable: `true`
  
  var index: Double
  
  var meta: ChartMeta[
    typings.chartJs.distTypesIndexMod.ChartType, 
    default[AnyObject, AnyObject], 
    default[AnyObject, AnyObject]
  ]
  
  var mode: UpdateMode
}
object Meta {
  
  inline def apply(
    index: Double,
    meta: ChartMeta[
      typings.chartJs.distTypesIndexMod.ChartType, 
      default[AnyObject, AnyObject], 
      default[AnyObject, AnyObject]
    ],
    mode: UpdateMode
  ): Meta = {
    val __obj = js.Dynamic.literal(cancelable = true, index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMeta(
      value: ChartMeta[
          typings.chartJs.distTypesIndexMod.ChartType, 
          default[AnyObject, AnyObject], 
          default[AnyObject, AnyObject]
        ]
    ): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMode(value: UpdateMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
