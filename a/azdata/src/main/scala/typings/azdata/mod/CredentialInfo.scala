package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialInfo extends js.Object {
  var createDate: String
  var dateLastModified: String
  var id: Double
  var identity: String
  var name: String
  var providerName: String
}

object CredentialInfo {
  @scala.inline
  def apply(
    createDate: String,
    dateLastModified: String,
    id: Double,
    identity: String,
    name: String,
    providerName: String
  ): CredentialInfo = {
    val __obj = js.Dynamic.literal(createDate = createDate.asInstanceOf[js.Any], dateLastModified = dateLastModified.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CredentialInfo]
  }
}

