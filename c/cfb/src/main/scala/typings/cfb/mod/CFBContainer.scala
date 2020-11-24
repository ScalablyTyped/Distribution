package typings.cfb.mod

import typings.cfb.anon.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CFBContainer extends js.Object {
  
  /* Array of entries in the same order as FullPaths */
  var FileIndex: js.Array[CFBEntry] = js.native
  
  /* List of streams and storages */
  var FullPaths: js.Array[String] = js.native
  
  /* Raw Content, in chunks (Buffer when available, Array of bytes otherwise) */
  var raw: js.UndefOr[Header] = js.native
}
object CFBContainer {
  
  @scala.inline
  def apply(FileIndex: js.Array[CFBEntry], FullPaths: js.Array[String]): CFBContainer = {
    val __obj = js.Dynamic.literal(FileIndex = FileIndex.asInstanceOf[js.Any], FullPaths = FullPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[CFBContainer]
  }
  
  @scala.inline
  implicit class CFBContainerOps[Self <: CFBContainer] (val x: Self) extends AnyVal {
    
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
    def setFileIndexVarargs(value: CFBEntry*): Self = this.set("FileIndex", js.Array(value :_*))
    
    @scala.inline
    def setFileIndex(value: js.Array[CFBEntry]): Self = this.set("FileIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullPathsVarargs(value: String*): Self = this.set("FullPaths", js.Array(value :_*))
    
    @scala.inline
    def setFullPaths(value: js.Array[String]): Self = this.set("FullPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Header): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
  }
}
