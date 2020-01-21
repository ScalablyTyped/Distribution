package typings.builderUtilRuntime.blockMapApiMod

import typings.builderUtilRuntime.builderUtilRuntimeStrings.`1`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.`2`
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
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlockMap]
  }
}

