package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationResult extends StObject {
  
  /**
    * The name of the API operation tested on the indicated resource.
    */
  var EvalActionName: ActionNameType
  
  /**
    * The result of the simulation.
    */
  var EvalDecision: PolicyEvaluationDecisionType
  
  /**
    * Additional details about the results of the cross-account evaluation decision. This parameter is populated for only cross-account simulations. It contains a brief summary of how each policy type contributes to the final evaluation decision. If the simulation evaluates policies within the same account and includes a resource ARN, then the parameter is present but the response is empty. If the simulation evaluates policies within the same account and specifies all resources (*), then the parameter is not returned. When you make a cross-account request, Amazon Web Services evaluates the request in the trusting account and the trusted account. The request is allowed only if both evaluations return true. For more information about how policies are evaluated, see Evaluating policies within a single account. If an Organizations SCP included in the evaluation denies access, the simulation ends. In this case, policy evaluation does not proceed any further and this parameter is not returned.
    */
  var EvalDecisionDetails: js.UndefOr[EvalDecisionDetailsType] = js.undefined
  
  /**
    * The ARN of the resource that the indicated API operation was tested on.
    */
  var EvalResourceName: js.UndefOr[ResourceNameType] = js.undefined
  
  /**
    * A list of the statements in the input policies that determine the result for this scenario. Remember that even if multiple statements allow the operation on the resource, if only one statement denies that operation, then the explicit deny overrides any allow. In addition, the deny statement is the only entry included in the result.
    */
  var MatchedStatements: js.UndefOr[StatementListType] = js.undefined
  
  /**
    * A list of context keys that are required by the included input policies but that were not provided by one of the input parameters. This list is used when the resource in a simulation is "*", either explicitly, or when the ResourceArns parameter blank. If you include a list of resources, then any missing context values are instead included under the ResourceSpecificResults section. To discover the context keys used by a set of policies, you can call GetContextKeysForCustomPolicy or GetContextKeysForPrincipalPolicy.
    */
  var MissingContextValues: js.UndefOr[ContextKeyNamesResultListType] = js.undefined
  
  /**
    * A structure that details how Organizations and its service control policies affect the results of the simulation. Only applies if the simulated user's account is part of an organization.
    */
  var OrganizationsDecisionDetail: js.UndefOr[typings.awsSdk.iamMod.OrganizationsDecisionDetail] = js.undefined
  
  /**
    * Contains information about the effect that a permissions boundary has on a policy simulation when the boundary is applied to an IAM entity.
    */
  var PermissionsBoundaryDecisionDetail: js.UndefOr[typings.awsSdk.iamMod.PermissionsBoundaryDecisionDetail] = js.undefined
  
  /**
    * The individual results of the simulation of the API operation specified in EvalActionName on each resource.
    */
  var ResourceSpecificResults: js.UndefOr[ResourceSpecificResultListType] = js.undefined
}
object EvaluationResult {
  
  inline def apply(EvalActionName: ActionNameType, EvalDecision: PolicyEvaluationDecisionType): EvaluationResult = {
    val __obj = js.Dynamic.literal(EvalActionName = EvalActionName.asInstanceOf[js.Any], EvalDecision = EvalDecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationResult]
  }
  
  extension [Self <: EvaluationResult](x: Self) {
    
    inline def setEvalActionName(value: ActionNameType): Self = StObject.set(x, "EvalActionName", value.asInstanceOf[js.Any])
    
    inline def setEvalDecision(value: PolicyEvaluationDecisionType): Self = StObject.set(x, "EvalDecision", value.asInstanceOf[js.Any])
    
    inline def setEvalDecisionDetails(value: EvalDecisionDetailsType): Self = StObject.set(x, "EvalDecisionDetails", value.asInstanceOf[js.Any])
    
    inline def setEvalDecisionDetailsUndefined: Self = StObject.set(x, "EvalDecisionDetails", js.undefined)
    
    inline def setEvalResourceName(value: ResourceNameType): Self = StObject.set(x, "EvalResourceName", value.asInstanceOf[js.Any])
    
    inline def setEvalResourceNameUndefined: Self = StObject.set(x, "EvalResourceName", js.undefined)
    
    inline def setMatchedStatements(value: StatementListType): Self = StObject.set(x, "MatchedStatements", value.asInstanceOf[js.Any])
    
    inline def setMatchedStatementsUndefined: Self = StObject.set(x, "MatchedStatements", js.undefined)
    
    inline def setMatchedStatementsVarargs(value: Statement*): Self = StObject.set(x, "MatchedStatements", js.Array(value*))
    
    inline def setMissingContextValues(value: ContextKeyNamesResultListType): Self = StObject.set(x, "MissingContextValues", value.asInstanceOf[js.Any])
    
    inline def setMissingContextValuesUndefined: Self = StObject.set(x, "MissingContextValues", js.undefined)
    
    inline def setMissingContextValuesVarargs(value: ContextKeyNameType*): Self = StObject.set(x, "MissingContextValues", js.Array(value*))
    
    inline def setOrganizationsDecisionDetail(value: OrganizationsDecisionDetail): Self = StObject.set(x, "OrganizationsDecisionDetail", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsDecisionDetailUndefined: Self = StObject.set(x, "OrganizationsDecisionDetail", js.undefined)
    
    inline def setPermissionsBoundaryDecisionDetail(value: PermissionsBoundaryDecisionDetail): Self = StObject.set(x, "PermissionsBoundaryDecisionDetail", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryDecisionDetailUndefined: Self = StObject.set(x, "PermissionsBoundaryDecisionDetail", js.undefined)
    
    inline def setResourceSpecificResults(value: ResourceSpecificResultListType): Self = StObject.set(x, "ResourceSpecificResults", value.asInstanceOf[js.Any])
    
    inline def setResourceSpecificResultsUndefined: Self = StObject.set(x, "ResourceSpecificResults", js.undefined)
    
    inline def setResourceSpecificResultsVarargs(value: ResourceSpecificResult*): Self = StObject.set(x, "ResourceSpecificResults", js.Array(value*))
  }
}
