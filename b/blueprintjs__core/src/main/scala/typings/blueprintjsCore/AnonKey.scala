package typings.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey[T /* <: js.Object */] extends js.Object {
  var key: String
  var valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  var valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}

object AnonKey {
  @scala.inline
  def apply[T /* <: js.Object */](
    key: String,
    valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any,
    valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ): AnonKey[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], valueA = valueA.asInstanceOf[js.Any], valueB = valueB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey[T]]
  }
}

