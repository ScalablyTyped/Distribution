package typings.blueprintjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key[T /* <: js.Object */] extends js.Object {
  var key: /* keyof T */ String
  var valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  var valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}

object Key {
  @scala.inline
  def apply[T](
    key: /* keyof T */ String,
    valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any,
    valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ): Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], valueA = valueA.asInstanceOf[js.Any], valueB = valueB.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[T]]
  }
}

