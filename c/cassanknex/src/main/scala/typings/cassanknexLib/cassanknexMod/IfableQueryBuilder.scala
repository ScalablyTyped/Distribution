package typings
package cassanknexLib.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfableQueryBuilder[T] extends js.Object {
  def `if`[K /* <: java.lang.String */](lhs: K, comparison: ComparisonRestriction): this.type = js.native
  def `if`[K /* <: java.lang.String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
}

