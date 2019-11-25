package typings.cassanknex.cassanknexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereableQueryBuilder[T] extends js.Object {
  def andWhere[K /* <: String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def andWhere[K /* <: String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): this.type = js.native
  def orWhere[K /* <: String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def orWhere[K /* <: String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): this.type = js.native
  def tokenWhere[K /* <: String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def tokenWhere[K /* <: String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): this.type = js.native
  def ttl[K /* <: String */](columnName: K): this.type = js.native
  def where[K /* <: String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def where[K /* <: String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): this.type = js.native
}

