package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentProxyInfo extends js.Object {
  var accountName: String
  var credentialId: Double
  var credentialIdentity: String
  var credentialName: String
  var description: String
  var id: Double
  var isEnabled: Boolean
}

object AgentProxyInfo {
  @scala.inline
  def apply(
    accountName: String,
    credentialId: Double,
    credentialIdentity: String,
    credentialName: String,
    description: String,
    id: Double,
    isEnabled: Boolean
  ): AgentProxyInfo = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], credentialId = credentialId.asInstanceOf[js.Any], credentialIdentity = credentialIdentity.asInstanceOf[js.Any], credentialName = credentialName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AgentProxyInfo]
  }
}

