package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootNodeResponse extends StObject {
  
  /**
    * A description of the DAX cluster after a node has been rebooted.
    */
  var Cluster: js.UndefOr[typings.awsSdk.daxMod.Cluster] = js.undefined
}
object RebootNodeResponse {
  
  @scala.inline
  def apply(): RebootNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootNodeResponse]
  }
  
  @scala.inline
  implicit class RebootNodeResponseMutableBuilder[Self <: RebootNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
