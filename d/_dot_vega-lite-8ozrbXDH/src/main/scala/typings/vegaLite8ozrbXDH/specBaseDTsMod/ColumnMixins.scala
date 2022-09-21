package typings.vegaLite8ozrbXDH.specBaseDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnMixins extends StObject {
  
  /**
    * The number of columns to include in the view composition layout.
    *
    * __Default value__: `undefined` -- An infinite number of columns (a single row) will be assumed. This is equivalent to
    * `hconcat` (for `concat`) and to using the `column` channel (for `facet` and `repeat`).
    *
    * __Note__:
    *
    * 1) This property is only for:
    * - the general (wrappable) `concat` operator (not `hconcat`/`vconcat`)
    * - the `facet` and `repeat` operator with one field/repetition definition (without row/column nesting)
    *
    * 2) Setting the `columns` to `1` is equivalent to `vconcat` (for `concat`) and to using the `row` channel (for `facet` and `repeat`).
    */
  var columns: js.UndefOr[Double] = js.undefined
}
object ColumnMixins {
  
  inline def apply(): ColumnMixins = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnMixins]
  }
  
  extension [Self <: ColumnMixins](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
  }
}
