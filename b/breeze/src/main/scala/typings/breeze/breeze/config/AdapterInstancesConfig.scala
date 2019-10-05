package typings.breeze.breeze.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdapterInstancesConfig extends js.Object {
  /** the name of a previously registered "ajax" adapter */
  var ajax: js.UndefOr[String] = js.undefined
  /** the name of a previously registered "dataService" adapter */
  var dataService: js.UndefOr[String] = js.undefined
  /** the name of a previously registered "modelLibrary" adapter */
  var modelLibary: js.UndefOr[String] = js.undefined
  /** the name of a previously registered "uriBuilder" adapter */
  var uriBuilder: js.UndefOr[String] = js.undefined
}

object AdapterInstancesConfig {
  @scala.inline
  def apply(
    ajax: String = null,
    dataService: String = null,
    modelLibary: String = null,
    uriBuilder: String = null
  ): AdapterInstancesConfig = {
    val __obj = js.Dynamic.literal()
    if (ajax != null) __obj.updateDynamic("ajax")(ajax)
    if (dataService != null) __obj.updateDynamic("dataService")(dataService)
    if (modelLibary != null) __obj.updateDynamic("modelLibary")(modelLibary)
    if (uriBuilder != null) __obj.updateDynamic("uriBuilder")(uriBuilder)
    __obj.asInstanceOf[AdapterInstancesConfig]
  }
}

