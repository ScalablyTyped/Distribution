package typings.atBabelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.Node['type'] */ js.Any */] extends js.Object {
  var `type`: T
}

object Anon_Type {
  @scala.inline
  def apply[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.Node['type'] */ js.Any */](`type`: T): Anon_Type[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Type[T]]
  }
}

