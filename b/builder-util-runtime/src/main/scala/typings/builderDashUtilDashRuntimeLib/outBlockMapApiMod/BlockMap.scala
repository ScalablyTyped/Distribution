package typings
package builderDashUtilDashRuntimeLib.outBlockMapApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockMap extends js.Object {
  var files: js.Array[BlockMapFile]
  var version: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`1` | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`2`
}

object BlockMap {
  @scala.inline
  def apply(
    files: js.Array[BlockMapFile],
    version: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`1` | builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeLibStrings.`2`
  ): BlockMap = {
    val __obj = js.Dynamic.literal(files = files, version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlockMap]
  }
}

