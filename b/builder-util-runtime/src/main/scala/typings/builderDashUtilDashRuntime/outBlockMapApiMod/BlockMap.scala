package typings.builderDashUtilDashRuntime.outBlockMapApiMod

import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.`1`
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockMap extends js.Object {
  var files: js.Array[BlockMapFile]
  var version: `1` | `2`
}

object BlockMap {
  @scala.inline
  def apply(files: js.Array[BlockMapFile], version: `1` | `2`): BlockMap = {
    val __obj = js.Dynamic.literal(files = files, version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlockMap]
  }
}

