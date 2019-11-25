package typings.backlogDashJs.backlogDashJsMod.Entity.File

import typings.node.streamMod.PassThrough
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.backlogDashJs.backlogDashJsMod.Entity.File.NodeFileData
  - typings.backlogDashJs.backlogDashJsMod.Entity.File.BrowserFileData
*/
trait FileData extends js.Object

object FileData {
  @scala.inline
  def NodeFileData(body: PassThrough, filename: String, url: String): FileData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileData]
  }
  @scala.inline
  def BrowserFileData(body: js.Any, url: String, blob: () => js.Promise[Blob] = null): FileData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (blob != null) __obj.updateDynamic("blob")(js.Any.fromFunction0(blob))
    __obj.asInstanceOf[FileData]
  }
}

