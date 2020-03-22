package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICodeMirrorMode extends js.Object {
  var name: String
  var version: String
}

object ICodeMirrorMode {
  @scala.inline
  def apply(name: String, version: String): ICodeMirrorMode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICodeMirrorMode]
  }
}

