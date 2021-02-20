package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterParameterGroupResult extends StObject {
  
  var ClusterParameterGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterParameterGroup] = js.native
}
object CreateClusterParameterGroupResult {
  
  @scala.inline
  def apply(): CreateClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterParameterGroupResult]
  }
  
  @scala.inline
  implicit class CreateClusterParameterGroupResultMutableBuilder[Self <: CreateClusterParameterGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterParameterGroup(value: ClusterParameterGroup): Self = StObject.set(x, "ClusterParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterParameterGroupUndefined: Self = StObject.set(x, "ClusterParameterGroup", js.undefined)
  }
}
