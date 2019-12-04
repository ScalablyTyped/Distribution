package typings.atAwsDashSdkCredentialDashProviderDashImds.buildRemoteProviderImdsCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImdsCredentials extends js.Object {
  var AccessKeyId: String
  var Expiration: String
  var SecretAccessKey: String
  var Token: String
}

object ImdsCredentials {
  @scala.inline
  def apply(AccessKeyId: String, Expiration: String, SecretAccessKey: String, Token: String): ImdsCredentials = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], Expiration = Expiration.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImdsCredentials]
  }
}

