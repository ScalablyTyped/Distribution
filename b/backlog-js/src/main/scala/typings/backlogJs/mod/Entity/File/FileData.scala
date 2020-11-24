package typings.backlogJs.mod.Entity.File

import typings.node.streamMod.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.backlogJs.mod.Entity.File.NodeFileData
  - typings.backlogJs.mod.Entity.File.BrowserFileData
*/
trait FileData extends js.Object
object FileData {
  
  @scala.inline
  def NodeFileData(body: PassThrough, filename: String, url: String): FileData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileData]
  }
  
  @scala.inline
  def BrowserFileData(body: js.Any, url: String): FileData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileData]
  }
}
