package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticInferenceAcceleratorAssociation extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorArn: js.UndefOr[String] = js.undefined
  
  /**
    *  The ID of the association. 
    */
  var ElasticInferenceAcceleratorAssociationId: js.UndefOr[String] = js.undefined
  
  /**
    *  The state of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorAssociationState: js.UndefOr[String] = js.undefined
  
  /**
    *  The time at which the elastic inference accelerator is associated with an instance. 
    */
  var ElasticInferenceAcceleratorAssociationTime: js.UndefOr[DateTime] = js.undefined
}
object ElasticInferenceAcceleratorAssociation {
  
  inline def apply(): ElasticInferenceAcceleratorAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticInferenceAcceleratorAssociation]
  }
  
  extension [Self <: ElasticInferenceAcceleratorAssociation](x: Self) {
    
    inline def setElasticInferenceAcceleratorArn(value: String): Self = StObject.set(x, "ElasticInferenceAcceleratorArn", value.asInstanceOf[js.Any])
    
    inline def setElasticInferenceAcceleratorArnUndefined: Self = StObject.set(x, "ElasticInferenceAcceleratorArn", js.undefined)
    
    inline def setElasticInferenceAcceleratorAssociationId(value: String): Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationId", value.asInstanceOf[js.Any])
    
    inline def setElasticInferenceAcceleratorAssociationIdUndefined: Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationId", js.undefined)
    
    inline def setElasticInferenceAcceleratorAssociationState(value: String): Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationState", value.asInstanceOf[js.Any])
    
    inline def setElasticInferenceAcceleratorAssociationStateUndefined: Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationState", js.undefined)
    
    inline def setElasticInferenceAcceleratorAssociationTime(value: DateTime): Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationTime", value.asInstanceOf[js.Any])
    
    inline def setElasticInferenceAcceleratorAssociationTimeUndefined: Self = StObject.set(x, "ElasticInferenceAcceleratorAssociationTime", js.undefined)
  }
}
