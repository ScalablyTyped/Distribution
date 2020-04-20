package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionTypeId extends js.Object {
  /**
    * A category defines what kind of action can be taken in the stage, and constrains the provider type for the action. Valid categories are limited to one of the following values. 
    */
  var category: ActionCategory = js.native
  /**
    * The creator of the action being called.
    */
  var owner: ActionOwner = js.native
  /**
    * The provider of the service being called by the action. Valid providers are determined by the action category. For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be specified as CodeDeploy. For more information, see Valid Action Types and Providers in CodePipeline.
    */
  var provider: ActionProvider = js.native
  /**
    * A string that describes the action version.
    */
  var version: Version = js.native
}

object ActionTypeId {
  @scala.inline
  def apply(category: ActionCategory, owner: ActionOwner, provider: ActionProvider, version: Version): ActionTypeId = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypeId]
  }
}

