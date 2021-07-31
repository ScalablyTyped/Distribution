package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfableQueryBuilder[T] extends StObject {
  
  def `if`[K /* <: /* keyof T */ String */](lhs: K, comparison: ComparisonRestriction): this.type = js.native
  def `if`[K /* <: /* keyof T */ String */](
    lhs: K,
    comparison: ComparisonRestriction,
    rhs: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
}
