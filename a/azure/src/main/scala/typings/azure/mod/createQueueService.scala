package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "createQueueService")
@js.native
object createQueueService extends js.Object {
  def apply(): QueueService = js.native
  def apply(connectionString: String): QueueService = js.native
  def apply(storageAccount: String, storageAccessKey: String): QueueService = js.native
  def apply(
    storageAccount: String,
    storageAccessKey: String,
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: String
  ): QueueService = js.native
  def apply(storageAccount: String, storageAccessKey: String, host: String): QueueService = js.native
  def apply(storageAccount: String, storageAccessKey: String, host: String, authenticationProvider: String): QueueService = js.native
}

