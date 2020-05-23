package typings.azure.mod

import typings.azure.anon.Delete
import typings.azure.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageServiceProperties extends js.Object {
  var DefaultServiceVersion: String
  var Logging: Delete
  var Metrics: Enabled
}

object StorageServiceProperties {
  @scala.inline
  def apply(DefaultServiceVersion: String, Logging: Delete, Metrics: Enabled): StorageServiceProperties = {
    val __obj = js.Dynamic.literal(DefaultServiceVersion = DefaultServiceVersion.asInstanceOf[js.Any], Logging = Logging.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageServiceProperties]
  }
}

