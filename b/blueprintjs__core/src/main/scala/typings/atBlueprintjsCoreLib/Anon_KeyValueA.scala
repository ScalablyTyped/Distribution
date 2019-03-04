package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyValueA[T /* <: js.Object */] extends js.Object {
  var key: java.lang.String
  var valueA: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
  var valueB: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
}

object Anon_KeyValueA {
  @scala.inline
  def apply[T /* <: js.Object */](
    key: java.lang.String,
    valueA: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any,
    valueB: /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
  ): Anon_KeyValueA[T] = {
    val __obj = js.Dynamic.literal(key = key, valueA = valueA, valueB = valueB)
  
    __obj.asInstanceOf[Anon_KeyValueA[T]]
  }
}

