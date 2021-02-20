package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECSService extends StObject {
  
  /**
    *  The name of the cluster that the Amazon ECS service is associated with. 
    */
  var clusterName: js.UndefOr[ECSClusterName] = js.native
  
  /**
    *  The name of the target Amazon ECS service. 
    */
  var serviceName: js.UndefOr[ECSServiceName] = js.native
}
object ECSService {
  
  @scala.inline
  def apply(): ECSService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ECSService]
  }
  
  @scala.inline
  implicit class ECSServiceMutableBuilder[Self <: ECSService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: ECSClusterName): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    @scala.inline
    def setServiceName(value: ECSServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
