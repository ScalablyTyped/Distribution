package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageServiceProperties extends js.Object {
  var DefaultServiceVersion: java.lang.String
  var Logging: azureLib.Anon_Delete
  var Metrics: azureLib.Anon_Enabled
}

object StorageServiceProperties {
  @scala.inline
  def apply(
    DefaultServiceVersion: java.lang.String,
    Logging: azureLib.Anon_Delete,
    Metrics: azureLib.Anon_Enabled
  ): StorageServiceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DefaultServiceVersion")(DefaultServiceVersion)
    __obj.updateDynamic("Logging")(Logging)
    __obj.updateDynamic("Metrics")(Metrics)
    __obj.asInstanceOf[StorageServiceProperties]
  }
}

