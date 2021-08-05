package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyTargetSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the policy target. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[GenericArn] = js.undefined
  
  /**
    * The friendly name of the policy target. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[TargetName] = js.undefined
  
  /**
    * The unique identifier (ID) of the policy target. The regex pattern for a target ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.    Account - A string that consists of exactly 12 digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.undefined
  
  /**
    * The type of the policy target.
    */
  var Type: js.UndefOr[TargetType] = js.undefined
}
object PolicyTargetSummary {
  
  inline def apply(): PolicyTargetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTargetSummary]
  }
  
  extension [Self <: PolicyTargetSummary](x: Self) {
    
    inline def setArn(value: GenericArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: TargetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTargetId(value: PolicyTargetId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "TargetId", js.undefined)
    
    inline def setType(value: TargetType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
