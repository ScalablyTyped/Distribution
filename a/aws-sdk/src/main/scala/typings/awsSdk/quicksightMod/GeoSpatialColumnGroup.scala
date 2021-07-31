package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoSpatialColumnGroup extends StObject {
  
  /**
    * Columns in this hierarchy.
    */
  var Columns: ColumnList
  
  /**
    * Country code.
    */
  var CountryCode: GeoSpatialCountryCode
  
  /**
    * A display name for the hierarchy.
    */
  var Name: ColumnGroupName
}
object GeoSpatialColumnGroup {
  
  @scala.inline
  def apply(Columns: ColumnList, CountryCode: GeoSpatialCountryCode, Name: ColumnGroupName): GeoSpatialColumnGroup = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], CountryCode = CountryCode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSpatialColumnGroup]
  }
  
  @scala.inline
  implicit class GeoSpatialColumnGroupMutableBuilder[Self <: GeoSpatialColumnGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: ColumnList): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: ColumnName*): Self = StObject.set(x, "Columns", js.Array(value :_*))
    
    @scala.inline
    def setCountryCode(value: GeoSpatialCountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ColumnGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
