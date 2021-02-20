package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticInferenceAcceleratorAssociation extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorArn: js.UndefOr[String] = js.native
  
  /**
    *  The ID of the association. 
    */
  var ElasticInferenceAcceleratorAssociationId: js.UndefOr[String] = js.native
  
  /**
    *  The state of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorAssociationState: js.UndefOr[String] = js.native
  
  /**
    *  The time at which the elastic inference accelerator is associated with an instance. 
    */
  var ElasticInferenceAcceleratorAssociationTime: js.UndefOr[DateTime] = js.native
}
object ElasticInferenceAcceleratorAssociation {
  
  @scala.inline
  def apply(): ElasticInferenceAcceleratorAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticInferenceAcceleratorAssociation]
  }
  
  @scala.inline
  implicit class ElasticInferenceAcceleratorAssociationMutableBuilder[Self <: ElasticInferenceAcceleratorAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElasticInferenceAcceleratorArn(value: String): Self = StObject.set(x, "ElasticInferenceAcceleratorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticInferenceAcceleratorArnUndefined: Self = StObject.set(x, "ElasticInferenceAcceleratorArn", js.undefined)
    
    @scala.inline
    def setElasticInferenceAcceleratorAssociationId(value: String): Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticInferenceAcceleratorAssociationIdUndefined: Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationId", js.undefined)
    
    @scala.inline
    def setElasticInferenceAcceleratorAssociationState(value: String): Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticInferenceAcceleratorAssociationStateUndefined: Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationState", js.undefined)
    
    @scala.inline
    def setElasticInferenceAcceleratorAssociationTime(value: DateTime): Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticInferenceAcceleratorAssociationTimeUndefined: Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationTime", js.undefined)
  }
}
