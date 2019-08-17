package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ResourceNs {
  import typings.cesium.cesiumMod.Resource
  import typings.std.Error

  type RetryCallback = js.Function2[/* resource */ Resource, /* error */ Error, Unit]
}
