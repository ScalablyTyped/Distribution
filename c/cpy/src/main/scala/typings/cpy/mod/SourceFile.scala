package typings.cpy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFile extends js.Object {
  
  /**
  		File extension.
  		@example 'js'
  		*/
  val extension: String = js.native
  
  /**
  		Filename with extension.
  		@example 'foo.js'
  		*/
  val name: String = js.native
  
  /**
  		Filename without extension.
  		@example 'foo'
  		*/
  val nameWithoutExtension: String = js.native
  
  /**
  		Resolved path to the file.
  		@example '/tmp/dir/foo.js'
  		*/
  val path: String = js.native
  
  /**
  		Relative path to the file from `cwd`.
  		@example 'dir/foo.js' if `cwd` was '/tmp'
  		*/
  val relativePath: String = js.native
}
object SourceFile {
  
  @scala.inline
  def apply(extension: String, name: String, nameWithoutExtension: String, path: String, relativePath: String): SourceFile = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameWithoutExtension = nameWithoutExtension.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFile]
  }
  
  @scala.inline
  implicit class SourceFileOps[Self <: SourceFile] (val x: Self) extends AnyVal {
    
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
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameWithoutExtension(value: String): Self = this.set("nameWithoutExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
  }
}
