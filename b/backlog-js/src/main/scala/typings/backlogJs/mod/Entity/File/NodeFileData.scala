package typings.backlogJs.mod.Entity.File

import typings.node.streamMod.PassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeFileData extends FileData {
  var body: PassThrough
  var filename: String
  var url: String
}

object NodeFileData {
  @scala.inline
  def apply(body: PassThrough, filename: String, url: String): NodeFileData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeFileData]
  }
}

