package typings.chartJs.anon

import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.distCoreCoreDotelementMod.default
import typings.chartJs.distTypesBasicMod.AnyObject
import typings.chartJs.distTypesIndexMod.ChartMeta
import typings.chartJs.distTypesIndexMod.UpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelableIndex extends StObject {
  
  var cancelable: `false`
  
  var index: Double
  
  var meta: ChartMeta[
    typings.chartJs.distTypesIndexMod.ChartType, 
    default[AnyObject, AnyObject], 
    default[AnyObject, AnyObject]
  ]
  
  var mode: UpdateMode
}
object CancelableIndex {
  
  inline def apply(
    index: Double,
    meta: ChartMeta[
      typings.chartJs.distTypesIndexMod.ChartType, 
      default[AnyObject, AnyObject], 
      default[AnyObject, AnyObject]
    ],
    mode: UpdateMode
  ): CancelableIndex = {
    val __obj = js.Dynamic.literal(cancelable = false, index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelableIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelableIndex] (val x: Self) extends AnyVal {
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
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
