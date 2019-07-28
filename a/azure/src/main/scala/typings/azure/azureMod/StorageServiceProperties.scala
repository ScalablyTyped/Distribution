package typings.azure.azureMod

import typings.azure.Anon_Delete
import typings.azure.Anon_Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageServiceProperties extends js.Object {
  var DefaultServiceVersion: String
  var Logging: Anon_Delete
  var Metrics: Anon_Enabled
}

object StorageServiceProperties {
  @scala.inline
  def apply(DefaultServiceVersion: String, Logging: Anon_Delete, Metrics: Anon_Enabled): StorageServiceProperties = {
    val __obj = js.Dynamic.literal(DefaultServiceVersion = DefaultServiceVersion, Logging = Logging, Metrics = Metrics)
  
    __obj.asInstanceOf[StorageServiceProperties]
  }
}

