package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticGpuAssociation extends StObject {
  
  /**
    * The ID of the association.
    */
  var ElasticGpuAssociationId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the association between the instance and the Elastic Graphics accelerator.
    */
  var ElasticGpuAssociationState: js.UndefOr[String] = js.undefined
  
  /**
    * The time the Elastic Graphics accelerator was associated with the instance.
    */
  var ElasticGpuAssociationTime: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Elastic Graphics accelerator.
    */
  var ElasticGpuId: js.UndefOr[String] = js.undefined
}
object ElasticGpuAssociation {
  
  @scala.inline
  def apply(): ElasticGpuAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpuAssociation]
  }
  
  @scala.inline
  implicit class ElasticGpuAssociationMutableBuilder[Self <: ElasticGpuAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticGpuAssociationId(value: String): Self = StObject.set(x, "ElasticGpuAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuAssociationIdUndefined: Self = StObject.set(x, "ElasticGpuAssociationId", js.undefined)
    
    @scala.inline
    def setElasticGpuAssociationState(value: String): Self = StObject.set(x, "ElasticGpuAssociationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuAssociationStateUndefined: Self = StObject.set(x, "ElasticGpuAssociationState", js.undefined)
    
    @scala.inline
    def setElasticGpuAssociationTime(value: String): Self = StObject.set(x, "ElasticGpuAssociationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuAssociationTimeUndefined: Self = StObject.set(x, "ElasticGpuAssociationTime", js.undefined)
    
    @scala.inline
    def setElasticGpuId(value: String): Self = StObject.set(x, "ElasticGpuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuIdUndefined: Self = StObject.set(x, "ElasticGpuId", js.undefined)
  }
}
