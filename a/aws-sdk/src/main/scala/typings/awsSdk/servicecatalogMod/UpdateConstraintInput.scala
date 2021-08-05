package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConstraintInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The updated description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.undefined
  
  /**
    * The identifier of the constraint.
    */
  var Id: typings.awsSdk.servicecatalogMod.Id
  
  /**
    * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:  LAUNCH  You are required to specify either the RoleArn or the LocalRoleName but can't use both. Specify the RoleArn property as follows:  {"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}  Specify the LocalRoleName property as follows:  {"LocalRoleName": "SCBasicLaunchRole"}  If you specify the LocalRoleName property, when an account uses the launch constraint, the IAM role with that name in the account will be used. This allows launch-role constraints to be account-agnostic so the administrator can create fewer resources per shared account.  The given role name must exist in the account used to create the launch constraint and the account of the user who launches a product with this launch constraint.  You cannot have both a LAUNCH and a STACKSET constraint. You also cannot have more than one LAUNCH constraint on a product and portfolio.  NOTIFICATION  Specify the NotificationArns property as follows:  {"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}   RESOURCE_UPDATE  Specify the TagUpdatesOnProvisionedProduct property as follows:  {"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}  The TagUpdatesOnProvisionedProduct property accepts a string value of ALLOWED or NOT_ALLOWED.  STACKSET  Specify the Parameters property as follows:  {"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}  You cannot have both a LAUNCH and a STACKSET constraint. You also cannot have more than one STACKSET constraint on a product and portfolio. Products with a STACKSET constraint will launch an AWS CloudFormation stack set.  TEMPLATE  Specify the Rules property. For more information, see Template Constraint Rules.  
    */
  var Parameters: js.UndefOr[ConstraintParameters] = js.undefined
}
object UpdateConstraintInput {
  
  inline def apply(Id: Id): UpdateConstraintInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConstraintInput]
  }
  
  extension [Self <: UpdateConstraintInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setDescription(value: ConstraintDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ConstraintParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
  }
}
