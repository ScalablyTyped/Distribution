package typings
package backlogDashJsLib.backlogDashJsMod.EntityNs.FileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeFileData extends FileData {
  var body: nodeLib.streamMod.PassThrough
  var filename: java.lang.String
  var url: java.lang.String
}

object NodeFileData {
  @scala.inline
  def apply(body: nodeLib.streamMod.PassThrough, filename: java.lang.String, url: java.lang.String): NodeFileData = {
    val __obj = js.Dynamic.literal(body = body, filename = filename, url = url)
  
    __obj.asInstanceOf[NodeFileData]
  }
}

