package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "createServiceBusService")
@js.native
object createServiceBusService extends js.Object {
  def apply(): ServiceBusService = js.native
  def apply(connectionString: String): ServiceBusService = js.native
  def apply(namespace: String, accessKey: String): ServiceBusService = js.native
  def apply(namespace: String, accessKey: String, issuer: String): ServiceBusService = js.native
  def apply(namespace: String, accessKey: String, issuer: String, acsNamespace: String): ServiceBusService = js.native
  def apply(namespace: String, accessKey: String, issuer: String, acsNamespace: String, host: String): ServiceBusService = js.native
  def apply(
    namespace: String,
    accessKey: String,
    issuer: String,
    acsNamespace: String,
    host: String,
    authenticationProvider: String
  ): ServiceBusService = js.native
}

