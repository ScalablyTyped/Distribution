package typings.azureArmResource.policyModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyAssignment
  extends typings.msRestAzure.mod.BaseResource {
  
  /**
    * This message will be part of response in case of policy violation.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The display name of the policy assignment.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The ID of the policy assignment.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The managed identity associated with the policy assignment.
    */
  var identity: js.UndefOr[Identity] = js.native
  
  /**
    * The location of the policy assignment. Only required when utilizing managed identity.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The policy assignment metadata.
    */
  var metadata: js.UndefOr[js.Any] = js.native
  
  /**
    * The name of the policy assignment.
    */
  val name: js.UndefOr[String] = js.native
  
  /**
    * The policy's excluded scopes.
    */
  var notScopes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required if a parameter is used in policy rule.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  
  /**
    * The ID of the policy definition or policy set definition being assigned.
    */
  var policyDefinitionId: js.UndefOr[String] = js.native
  
  /**
    * The scope for the policy assignment.
    */
  var scope: js.UndefOr[String] = js.native
  
  /**
    * The policy sku. This property is optional, obsolete, and will be ignored.
    */
  var sku: js.UndefOr[PolicySku] = js.native
  
  /**
    * The type of the policy assignment.
    */
  val `type`: js.UndefOr[String] = js.native
}
