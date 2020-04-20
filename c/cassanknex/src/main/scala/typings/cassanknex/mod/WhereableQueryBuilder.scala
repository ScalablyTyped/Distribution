package typings.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereableQueryBuilder[T] extends js.Object {
  def andWhere[K /* <: /* keyof T */ String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def andWhere[K /* <: /* keyof T */ String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): this.type = js.native
  def orWhere[K /* <: /* keyof T */ String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def orWhere[K /* <: /* keyof T */ String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): this.type = js.native
  def tokenWhere[K /* <: /* keyof T */ String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def tokenWhere[K /* <: /* keyof T */ String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): this.type = js.native
  def ttl[K /* <: /* keyof T */ String */](columnName: K): this.type = js.native
  def where[K /* <: /* keyof T */ String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  def where[K /* <: /* keyof T */ String */](
    lhs: K,
    comparison: InRestriction,
    rhs: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): this.type = js.native
}

