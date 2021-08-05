package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicySummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the policy. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[PolicyArn] = js.undefined
  
  /**
    * A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you can attach the policy to roots, OUs, or accounts, but you cannot edit it.
    */
  var AwsManaged: js.UndefOr[AwsManagedPolicy] = js.undefined
  
  /**
    * The description of the policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.undefined
  
  /**
    * The unique identifier (ID) of the policy. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lowercase or uppercase letters, digits, or the underscore character (_).
    */
  var Id: js.UndefOr[PolicyId] = js.undefined
  
  /**
    * The friendly name of the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[PolicyName] = js.undefined
  
  /**
    * The type of policy.
    */
  var Type: js.UndefOr[PolicyType] = js.undefined
}
object PolicySummary {
  
  inline def apply(): PolicySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicySummary]
  }
  
  extension [Self <: PolicySummary](x: Self) {
    
    inline def setArn(value: PolicyArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAwsManaged(value: AwsManagedPolicy): Self = StObject.set(x, "AwsManaged", value.asInstanceOf[js.Any])
    
    inline def setAwsManagedUndefined: Self = StObject.set(x, "AwsManaged", js.undefined)
    
    inline def setDescription(value: PolicyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: PolicyId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: PolicyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: PolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
