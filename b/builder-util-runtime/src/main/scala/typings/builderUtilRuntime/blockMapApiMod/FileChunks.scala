package typings.builderUtilRuntime.blockMapApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileChunks extends js.Object {
  
  var checksums: js.Array[String] = js.native
  
  var sizes: js.Array[Double] = js.native
}
object FileChunks {
  
  @scala.inline
  def apply(checksums: js.Array[String], sizes: js.Array[Double]): FileChunks = {
    val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileChunks]
  }
  
  @scala.inline
  implicit class FileChunksOps[Self <: FileChunks] (val x: Self) extends AnyVal {
    
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
    def setChecksumsVarargs(value: String*): Self = this.set("checksums", js.Array(value :_*))
    
    @scala.inline
    def setChecksums(value: js.Array[String]): Self = this.set("checksums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizesVarargs(value: Double*): Self = this.set("sizes", js.Array(value :_*))
    
    @scala.inline
    def setSizes(value: js.Array[Double]): Self = this.set("sizes", value.asInstanceOf[js.Any])
  }
}
