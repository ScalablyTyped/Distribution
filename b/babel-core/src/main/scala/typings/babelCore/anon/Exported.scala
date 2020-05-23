package typings.babelCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exported extends js.Object {
  var exported: js.Array[js.Object]
  var specifiers: js.Array[js.Object]
}

object Exported {
  @scala.inline
  def apply(exported: js.Array[js.Object], specifiers: js.Array[js.Object]): Exported = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exported]
  }
}

