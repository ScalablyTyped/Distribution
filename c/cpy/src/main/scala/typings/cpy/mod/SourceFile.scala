package typings.cpy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceFile extends js.Object {
  /**
  		File extension.
  		@example 'js'
  		*/
  val extension: String
  /**
  		Filename with extension.
  		@example 'foo.js'
  		*/
  val name: String
  /**
  		Filename without extension.
  		@example 'foo'
  		*/
  val nameWithoutExtension: String
  /**
  		Resolved path to the file.
  		@example '/tmp/dir/foo.js'
  		*/
  val path: String
  /**
  		Relative path to the file from `cwd`.
  		@example 'dir/foo.js' if `cwd` was '/tmp'
  		*/
  val relativePath: String
}

object SourceFile {
  @scala.inline
  def apply(extension: String, name: String, nameWithoutExtension: String, path: String, relativePath: String): SourceFile = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameWithoutExtension = nameWithoutExtension.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceFile]
  }
}

