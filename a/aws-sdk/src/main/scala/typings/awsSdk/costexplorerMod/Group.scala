package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  /**
    * The keys that are included in this group.
    */
  var Keys: js.UndefOr[typings.awsSdk.costexplorerMod.Keys] = js.undefined
  
  /**
    * The metrics that are included in this group.
    */
  var Metrics: js.UndefOr[typings.awsSdk.costexplorerMod.Metrics] = js.undefined
}
object Group {
  
  inline def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setKeys(value: Keys): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
    
    inline def setKeysVarargs(value: Key*): Self = StObject.set(x, "Keys", js.Array(value*))
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
  }
}
