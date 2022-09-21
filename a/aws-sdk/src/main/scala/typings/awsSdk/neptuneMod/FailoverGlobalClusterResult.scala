package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailoverGlobalClusterResult extends StObject {
  
  var GlobalCluster: js.UndefOr[typings.awsSdk.neptuneMod.GlobalCluster] = js.undefined
}
object FailoverGlobalClusterResult {
  
  inline def apply(): FailoverGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverGlobalClusterResult]
  }
  
  extension [Self <: FailoverGlobalClusterResult](x: Self) {
    
    inline def setGlobalCluster(value: GlobalCluster): Self = StObject.set(x, "GlobalCluster", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterUndefined: Self = StObject.set(x, "GlobalCluster", js.undefined)
  }
}
