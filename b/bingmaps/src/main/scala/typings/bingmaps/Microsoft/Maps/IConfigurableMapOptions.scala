package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigurableMapOptions extends js.Object {
  /** Initial map options. */
  var mapOptions: IMapOptions
  /** List of configuration modules to load. */
  var modules: js.Array[IConfigurableMapModule]
}

object IConfigurableMapOptions {
  @scala.inline
  def apply(mapOptions: IMapOptions, modules: js.Array[IConfigurableMapModule]): IConfigurableMapOptions = {
    val __obj = js.Dynamic.literal(mapOptions = mapOptions, modules = modules)
  
    __obj.asInstanceOf[IConfigurableMapOptions]
  }
}

