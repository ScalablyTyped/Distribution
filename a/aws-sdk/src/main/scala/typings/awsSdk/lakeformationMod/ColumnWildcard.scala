package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnWildcard extends StObject {
  
  /**
    * Excludes column names. Any column with this name will be excluded.
    */
  var ExcludedColumnNames: js.UndefOr[ColumnNames] = js.native
}
object ColumnWildcard {
  
  @scala.inline
  def apply(): ColumnWildcard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnWildcard]
  }
  
  @scala.inline
  implicit class ColumnWildcardMutableBuilder[Self <: ColumnWildcard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedColumnNames(value: ColumnNames): Self = StObject.set(x, "ExcludedColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedColumnNamesUndefined: Self = StObject.set(x, "ExcludedColumnNames", js.undefined)
    
    @scala.inline
    def setExcludedColumnNamesVarargs(value: NameString*): Self = StObject.set(x, "ExcludedColumnNames", js.Array(value :_*))
  }
}
