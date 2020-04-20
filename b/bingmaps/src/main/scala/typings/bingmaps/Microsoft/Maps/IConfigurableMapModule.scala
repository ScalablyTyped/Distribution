package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigurableMapModule extends js.Object {
  /** Name of the module to load. Supported values: "Microsoft.Maps.GeoXml", "Microsoft.Maps.GeoJson". */
  var moduleName: String
  /** A set of steps to execute after a module is loaded. */
  var moduleOptions: PostModuleAction | js.Array[PostModuleAction]
}

object IConfigurableMapModule {
  @scala.inline
  def apply(moduleName: String, moduleOptions: PostModuleAction | js.Array[PostModuleAction]): IConfigurableMapModule = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], moduleOptions = moduleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfigurableMapModule]
  }
}

