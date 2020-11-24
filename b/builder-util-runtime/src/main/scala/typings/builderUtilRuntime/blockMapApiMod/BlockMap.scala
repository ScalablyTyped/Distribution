package typings.builderUtilRuntime.blockMapApiMod

import typings.builderUtilRuntime.builderUtilRuntimeStrings.`1`
import typings.builderUtilRuntime.builderUtilRuntimeStrings.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockMap extends js.Object {
  
  var files: js.Array[BlockMapFile] = js.native
  
  var version: `1` | `2` = js.native
}
object BlockMap {
  
  @scala.inline
  def apply(files: js.Array[BlockMapFile], version: `1` | `2`): BlockMap = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockMap]
  }
  
  @scala.inline
  implicit class BlockMapOps[Self <: BlockMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilesVarargs(value: BlockMapFile*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[BlockMapFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: `1` | `2`): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
