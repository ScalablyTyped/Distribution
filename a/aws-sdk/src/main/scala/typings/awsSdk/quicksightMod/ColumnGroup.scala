package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroup extends StObject {
  
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
  implicit class ColumnGroupMutableBuilder[Self <: ColumnGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoSpatialColumnGroup(value: GeoSpatialColumnGroup): Self = StObject.set(x, "GeoSpatialColumnGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoSpatialColumnGroupUndefined: Self = StObject.set(x, "GeoSpatialColumnGroup", js.undefined)
  }
}
