package typings.azureArmResource.policyModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyDefinition
  extends typings.msRestAzure.mod.BaseResource {
  /**
    * The policy definition description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The display name of the policy definition.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The ID of the policy definition.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The policy definition metadata.
    */
  var metadata: js.UndefOr[js.Any] = js.native
  /**
    * The policy definition mode. Possible values are NotSpecified, Indexed, and All. Possible
    * values include: 'NotSpecified', 'Indexed', 'All'
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * The name of the policy definition.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * Required if a parameter is used in policy rule.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  /**
    * The policy rule.
    */
  var policyRule: js.UndefOr[js.Any] = js.native
  /**
    * The type of policy definition. Possible values are NotSpecified, BuiltIn, and Custom. Possible
    * values include: 'NotSpecified', 'BuiltIn', 'Custom'
    */
  var policyType: js.UndefOr[String] = js.native
  /**
    * The type of the resource (Microsoft.Authorization/policyDefinitions).
    */
  val `type`: js.UndefOr[String] = js.native
}

