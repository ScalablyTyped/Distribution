package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigurableMapModule extends js.Object {
  /** Name of the module to load. Supported values: "Microsoft.Maps.GeoXml", "Microsoft.Maps.GeoJson". */
  var moduleName: java.lang.String
  /** A set of steps to execute after a module is loaded. */
  var moduleOptions: PostModuleAction | js.Array[PostModuleAction]
}

object IConfigurableMapModule {
  @scala.inline
  def apply(moduleName: java.lang.String, moduleOptions: PostModuleAction | js.Array[PostModuleAction]): IConfigurableMapModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("moduleName")(moduleName)
    __obj.updateDynamic("moduleOptions")(moduleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurableMapModule]
  }
}

