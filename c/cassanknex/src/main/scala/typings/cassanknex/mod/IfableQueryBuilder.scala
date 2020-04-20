package typings.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfableQueryBuilder[T] extends js.Object {
  def `if`[K /* <: /* keyof T */ String */](lhs: K, comparison: ComparisonRestriction): this.type = js.native
  def `if`[K /* <: /* keyof T */ String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
}

