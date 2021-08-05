package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConstraintInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.undefined
  
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typings.awsSdk.servicecatalogMod.IdempotencyToken
  
  /**
    * The constraint parameters, in JSON format. The syntax depends on the constraint type as follows:  LAUNCH  You are required to specify either the RoleArn or the LocalRoleName but can't use both. Specify the RoleArn property as follows:  {"RoleArn" : "arn:aws:iam::123456789012:role/LaunchRole"}  Specify the LocalRoleName property as follows:  {"LocalRoleName": "SCBasicLaunchRole"}  If you specify the LocalRoleName property, when an account uses the launch constraint, the IAM role with that name in the account will be used. This allows launch-role constraints to be account-agnostic so the administrator can create fewer resources per shared account.  The given role name must exist in the account used to create the launch constraint and the account of the user who launches a product with this launch constraint.  You cannot have both a LAUNCH and a STACKSET constraint. You also cannot have more than one LAUNCH constraint on a product and portfolio.  NOTIFICATION  Specify the NotificationArns property as follows:  {"NotificationArns" : ["arn:aws:sns:us-east-1:123456789012:Topic"]}   RESOURCE_UPDATE  Specify the TagUpdatesOnProvisionedProduct property as follows:  {"Version":"2.0","Properties":{"TagUpdateOnProvisionedProduct":"String"}}  The TagUpdatesOnProvisionedProduct property accepts a string value of ALLOWED or NOT_ALLOWED.  STACKSET  Specify the Parameters property as follows:  {"Version": "String", "Properties": {"AccountList": [ "String" ], "RegionList": [ "String" ], "AdminRole": "String", "ExecutionRole": "String"}}  You cannot have both a LAUNCH and a STACKSET constraint. You also cannot have more than one STACKSET constraint on a product and portfolio. Products with a STACKSET constraint will launch an AWS CloudFormation stack set.  TEMPLATE  Specify the Rules property. For more information, see Template Constraint Rules.  
    */
  var Parameters: ConstraintParameters
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
  
  /**
    * The product identifier.
    */
  var ProductId: Id
  
  /**
    * The type of constraint.    LAUNCH     NOTIFICATION     RESOURCE_UPDATE     STACKSET     TEMPLATE   
    */
  var Type: ConstraintType
}
object CreateConstraintInput {
  
  inline def apply(
    IdempotencyToken: IdempotencyToken,
    Parameters: ConstraintParameters,
    PortfolioId: Id,
    ProductId: Id,
    Type: ConstraintType
  ): CreateConstraintInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], PortfolioId = PortfolioId.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConstraintInput]
  }
  
  extension [Self <: CreateConstraintInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setDescription(value: ConstraintDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ConstraintParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConstraintType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
