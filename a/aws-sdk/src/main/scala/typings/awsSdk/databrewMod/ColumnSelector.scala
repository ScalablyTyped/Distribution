package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSelector extends StObject {
  
  /**
    * The name of a column from a dataset.
    */
  var Name: js.UndefOr[ColumnName] = js.undefined
  
  /**
    * A regular expression for selecting a column from a dataset.
    */
  var Regex: js.UndefOr[ColumnName] = js.undefined
}
object ColumnSelector {
  
  inline def apply(): ColumnSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSelector]
  }
  
  extension [Self <: ColumnSelector](x: Self) {
    
    inline def setName(value: ColumnName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRegex(value: ColumnName): Self = StObject.set(x, "Regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "Regex", js.undefined)
  }
}
