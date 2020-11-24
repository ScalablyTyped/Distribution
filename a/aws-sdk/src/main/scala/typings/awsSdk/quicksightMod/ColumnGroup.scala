package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroup extends js.Object {
  
  /**
    * Geospatial column group that denotes a hierarchy.
    */
  var GeoSpatialColumnGroup: js.UndefOr[typings.awsSdk.quicksightMod.GeoSpatialColumnGroup] = js.native
}
object ColumnGroup {
  
  @scala.inline
  def apply(): ColumnGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroup]
  }
  
  @scala.inline
  implicit class ColumnGroupOps[Self <: ColumnGroup] (val x: Self) extends AnyVal {
    
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
    def setGeoSpatialColumnGroup(value: GeoSpatialColumnGroup): Self = this.set("GeoSpatialColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoSpatialColumnGroup: Self = this.set("GeoSpatialColumnGroup", js.undefined)
  }
}
