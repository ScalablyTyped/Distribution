package typings.atBlueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key[T /* <: js.Object */] extends js.Object {
  var key: String
  var valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  var valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}

object Anon_Key {
  @scala.inline
  def apply[T /* <: js.Object */](
    key: String,
    valueA: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any,
    valueB: /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ): Anon_Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], valueA = valueA.asInstanceOf[js.Any], valueB = valueB.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Key[T]]
  }
}

