package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoSpatialColumnGroup extends js.Object {
  
  /**
    * Columns in this hierarchy.
    */
  var Columns: ColumnList = js.native
  
  /**
    * Country code.
    */
  var CountryCode: GeoSpatialCountryCode = js.native
  
  /**
    * A display name for the hierarchy.
    */
  var Name: ColumnGroupName = js.native
}
object GeoSpatialColumnGroup {
  
  @scala.inline
  def apply(Columns: ColumnList, CountryCode: GeoSpatialCountryCode, Name: ColumnGroupName): GeoSpatialColumnGroup = {
    val __obj = js.Dynamic.literal(Columns = Columns.asInstanceOf[js.Any], CountryCode = CountryCode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSpatialColumnGroup]
  }
  
  @scala.inline
  implicit class GeoSpatialColumnGroupOps[Self <: GeoSpatialColumnGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnsVarargs(value: ColumnName*): Self = this.set("Columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: ColumnList): Self = this.set("Columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: GeoSpatialCountryCode): Self = this.set("CountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ColumnGroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
