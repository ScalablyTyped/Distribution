package typings.cesium.cesiumMod

import typings.cesium.cesiumMod.Resource
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ResourceNs {
  type RetryCallback = js.Function2[/* resource */ Resource, /* error */ Error, Unit]
}
