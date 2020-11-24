package typings.azureArmResource.policyModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicySetDefinition
  extends typings.msRestAzure.mod.BaseResource {
  
  /**
    * The policy set definition description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The display name of the policy set definition.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The ID of the policy set definition.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * The policy set definition metadata.
    */
  var metadata: js.UndefOr[js.Any] = js.native
  
  /**
    * The name of the policy set definition.
    */
  val name: js.UndefOr[String] = js.native
  
  /**
    * The policy set definition parameters that can be used in policy definition references.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  
  /**
    * An array of policy definition references.
    */
  var policyDefinitions: js.Array[PolicyDefinitionReference] = js.native
  
  /**
    * The type of policy definition. Possible values are NotSpecified, BuiltIn, and Custom. Possible
    * values include: 'NotSpecified', 'BuiltIn', 'Custom'
    */
  var policyType: js.UndefOr[String] = js.native
  
  /**
    * The type of the resource (Microsoft.Authorization/policySetDefinitions).
    */
  val `type`: js.UndefOr[String] = js.native
}
