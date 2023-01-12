package typings.chainsafeLibp2pGossipsub.distSrcMetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramConfig[Labels /* <: LabelsGeneric */] extends StObject {
  
  var buckets: js.UndefOr[js.Array[Double]] = js.undefined
  
  var help: String
  
  var labelNames: js.UndefOr[js.Array[/* keyof Labels */ String]] = js.undefined
  
  var name: String
}
object HistogramConfig {
  
  inline def apply[Labels /* <: LabelsGeneric */](help: String, name: String): HistogramConfig[Labels] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramConfig[Labels]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistogramConfig[?], Labels /* <: LabelsGeneric */] (val x: Self & HistogramConfig[Labels]) extends AnyVal {
    
    inline def setBuckets(value: js.Array[Double]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: Double*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setLabelNames(value: js.Array[/* keyof Labels */ String]): Self = StObject.set(x, "labelNames", value.asInstanceOf[js.Any])
    
    inline def setLabelNamesUndefined: Self = StObject.set(x, "labelNames", js.undefined)
    
    inline def setLabelNamesVarargs(value: (/* keyof Labels */ String)*): Self = StObject.set(x, "labelNames", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
