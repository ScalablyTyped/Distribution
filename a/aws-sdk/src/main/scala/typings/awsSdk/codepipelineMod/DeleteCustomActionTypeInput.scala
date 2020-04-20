package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCustomActionTypeInput extends js.Object {
  /**
    * The category of the custom action that you want to delete, such as source or deploy.
    */
  var category: ActionCategory = js.native
  /**
    * The provider of the service used in the custom action, such as AWS CodeDeploy.
    */
  var provider: ActionProvider = js.native
  /**
    * The version of the custom action to delete.
    */
  var version: Version = js.native
}

object DeleteCustomActionTypeInput {
  @scala.inline
  def apply(category: ActionCategory, provider: ActionProvider, version: Version): DeleteCustomActionTypeInput = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomActionTypeInput]
  }
}

