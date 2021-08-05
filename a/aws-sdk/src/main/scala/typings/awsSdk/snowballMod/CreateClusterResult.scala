package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterResult extends StObject {
  
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.snowballMod.ClusterId] = js.undefined
}
object CreateClusterResult {
  
  inline def apply(): CreateClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterResult]
  }
  
  extension [Self <: CreateClusterResult](x: Self) {
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
  }
}
