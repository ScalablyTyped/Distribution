package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterResult extends StObject {
  
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.snowballMod.ClusterId] = js.native
}
object CreateClusterResult {
  
  @scala.inline
  def apply(): CreateClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterResult]
  }
  
  @scala.inline
  implicit class CreateClusterResultMutableBuilder[Self <: CreateClusterResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
  }
}
