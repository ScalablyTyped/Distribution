package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddInstanceFleetOutput extends StObject {
  
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.undefined
  
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleetId: js.UndefOr[typings.awsSdk.emrMod.InstanceFleetId] = js.undefined
}
object AddInstanceFleetOutput {
  
  @scala.inline
  def apply(): AddInstanceFleetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddInstanceFleetOutput]
  }
  
  @scala.inline
  implicit class AddInstanceFleetOutputMutableBuilder[Self <: AddInstanceFleetOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterArn(value: ArnType): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    @scala.inline
    def setClusterId(value: XmlStringMaxLen256): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    @scala.inline
    def setInstanceFleetId(value: InstanceFleetId): Self = StObject.set(x, "InstanceFleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFleetIdUndefined: Self = StObject.set(x, "InstanceFleetId", js.undefined)
  }
}
