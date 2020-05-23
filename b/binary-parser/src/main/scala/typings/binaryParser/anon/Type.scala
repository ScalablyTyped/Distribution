package typings.binaryParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}

object Type {
  @scala.inline
  def apply(`type`: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

