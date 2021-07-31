package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLayerOptions extends StObject {
  
  var databoxId: js.UndefOr[String] = js.undefined
  
  var filter: js.UndefOr[String] = js.undefined
  
  var geotableId: js.UndefOr[String] = js.undefined
  
  var pointDensityType: js.UndefOr[PointDensityType] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[String] = js.undefined
}
object CustomLayerOptions {
  
  @scala.inline
  def apply(): CustomLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLayerOptions]
  }
  
  @scala.inline
  implicit class CustomLayerOptionsMutableBuilder[Self <: CustomLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataboxId(value: String): Self = StObject.set(x, "databoxId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataboxIdUndefined: Self = StObject.set(x, "databoxId", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setGeotableId(value: String): Self = StObject.set(x, "geotableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeotableIdUndefined: Self = StObject.set(x, "geotableId", js.undefined)
    
    @scala.inline
    def setPointDensityType(value: PointDensityType): Self = StObject.set(x, "pointDensityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointDensityTypeUndefined: Self = StObject.set(x, "pointDensityType", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
