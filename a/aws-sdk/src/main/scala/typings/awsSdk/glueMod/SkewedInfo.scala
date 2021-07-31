package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkewedInfo extends StObject {
  
  /**
    * A list of names of columns that contain skewed values.
    */
  var SkewedColumnNames: js.UndefOr[NameStringList] = js.undefined
  
  /**
    * A mapping of skewed values to the columns that contain them.
    */
  var SkewedColumnValueLocationMaps: js.UndefOr[LocationMap] = js.undefined
  
  /**
    * A list of values that appear so frequently as to be considered skewed.
    */
  var SkewedColumnValues: js.UndefOr[ColumnValueStringList] = js.undefined
}
object SkewedInfo {
  
  @scala.inline
  def apply(): SkewedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkewedInfo]
  }
  
  @scala.inline
  implicit class SkewedInfoMutableBuilder[Self <: SkewedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkewedColumnNames(value: NameStringList): Self = StObject.set(x, "SkewedColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewedColumnNamesUndefined: Self = StObject.set(x, "SkewedColumnNames", js.undefined)
    
    @scala.inline
    def setSkewedColumnNamesVarargs(value: NameString*): Self = StObject.set(x, "SkewedColumnNames", js.Array(value :_*))
    
    @scala.inline
    def setSkewedColumnValueLocationMaps(value: LocationMap): Self = StObject.set(x, "SkewedColumnValueLocationMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewedColumnValueLocationMapsUndefined: Self = StObject.set(x, "SkewedColumnValueLocationMaps", js.undefined)
    
    @scala.inline
    def setSkewedColumnValues(value: ColumnValueStringList): Self = StObject.set(x, "SkewedColumnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkewedColumnValuesUndefined: Self = StObject.set(x, "SkewedColumnValues", js.undefined)
    
    @scala.inline
    def setSkewedColumnValuesVarargs(value: ColumnValuesString*): Self = StObject.set(x, "SkewedColumnValues", js.Array(value :_*))
  }
}
