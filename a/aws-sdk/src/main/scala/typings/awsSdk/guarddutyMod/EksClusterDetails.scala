package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksClusterDetails extends StObject {
  
  /**
    * EKS cluster ARN.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the EKS cluster was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * EKS cluster name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The EKS cluster status.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The EKS cluster tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.guarddutyMod.Tags] = js.undefined
  
  /**
    * The VPC ID to which the EKS cluster is attached.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object EksClusterDetails {
  
  inline def apply(): EksClusterDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksClusterDetails]
  }
  
  extension [Self <: EksClusterDetails](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
