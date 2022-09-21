package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelPackageGroupPolicyInput extends StObject {
  
  /**
    * The name of the model group for which to get the resource policy.
    */
  var ModelPackageGroupName: EntityName
}
object GetModelPackageGroupPolicyInput {
  
  inline def apply(ModelPackageGroupName: EntityName): GetModelPackageGroupPolicyInput = {
    val __obj = js.Dynamic.literal(ModelPackageGroupName = ModelPackageGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelPackageGroupPolicyInput]
  }
  
  extension [Self <: GetModelPackageGroupPolicyInput](x: Self) {
    
    inline def setModelPackageGroupName(value: EntityName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
  }
}
