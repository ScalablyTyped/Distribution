package typings.backlogDashJs.backlogDashJsMod.EntityNs.FileNs

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
    val __obj = js.Dynamic.literal(body = body, filename = filename, url = url)
  
    __obj.asInstanceOf[NodeFileData]
  }
}

