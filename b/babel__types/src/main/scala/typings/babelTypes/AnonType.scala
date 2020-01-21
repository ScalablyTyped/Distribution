package typings.babelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.Node['type'] */ js.Any */] extends js.Object {
  var `type`: T
}

object AnonType {
  @scala.inline
  def apply[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.Node['type'] */ js.Any */](`type`: T): AnonType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[T]]
  }
}

