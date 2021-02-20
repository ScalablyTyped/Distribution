package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterParameterGroupNameMessage extends StObject {
  
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
  
  /**
    * The status of the parameter group. For example, if you made a change to a parameter group name-value pair, then the change could be pending a reboot of an associated cluster.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.native
}
object ClusterParameterGroupNameMessage {
  
  @scala.inline
  def apply(): ClusterParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterGroupNameMessage]
  }
  
  @scala.inline
  implicit class ClusterParameterGroupNameMessageMutableBuilder[Self <: ClusterParameterGroupNameMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
    
    @scala.inline
    def setParameterGroupStatus(value: String): Self = StObject.set(x, "ParameterGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupStatusUndefined: Self = StObject.set(x, "ParameterGroupStatus", js.undefined)
  }
}
