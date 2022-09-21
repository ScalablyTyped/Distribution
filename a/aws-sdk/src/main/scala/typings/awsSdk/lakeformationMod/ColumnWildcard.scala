package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnWildcard extends StObject {
  
  /**
    * Excludes column names. Any column with this name will be excluded.
    */
  var ExcludedColumnNames: js.UndefOr[ColumnNames] = js.undefined
}
object ColumnWildcard {
  
  inline def apply(): ColumnWildcard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnWildcard]
  }
  
  extension [Self <: ColumnWildcard](x: Self) {
    
    inline def setExcludedColumnNames(value: ColumnNames): Self = StObject.set(x, "ExcludedColumnNames", value.asInstanceOf[js.Any])
    
    inline def setExcludedColumnNamesUndefined: Self = StObject.set(x, "ExcludedColumnNames", js.undefined)
    
    inline def setExcludedColumnNamesVarargs(value: NameString*): Self = StObject.set(x, "ExcludedColumnNames", js.Array(value*))
  }
}
