package typings
package cassanknexLib.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereableQueryBuilder[T] extends js.Object {
  def andWhere[K /* <: java.lang.String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def andWhere[K /* <: java.lang.String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): this.type = js.native
  def orWhere[K /* <: java.lang.String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def orWhere[K /* <: java.lang.String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): this.type = js.native
  def tokenWhere[K /* <: java.lang.String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def tokenWhere[K /* <: java.lang.String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): this.type = js.native
  def ttl[K /* <: java.lang.String */](columnName: K): this.type = js.native
  def where[K /* <: java.lang.String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def where[K /* <: java.lang.String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): this.type = js.native
}

