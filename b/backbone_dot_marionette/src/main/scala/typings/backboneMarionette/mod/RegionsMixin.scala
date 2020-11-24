package typings.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionsMixin extends js.Object {
  
  var addRegion: js.Any = js.native
  
  var addRegions: js.Any = js.native
  
  var detachChildView: js.Any = js.native
  
  var emptyRegions: js.Any = js.native
  
  var getChildView: js.Any = js.native
  
  var getRegion: js.Any = js.native
  
  var getRegions: js.Any = js.native
  
  var hasRegion: js.Any = js.native
  
  var regionClass: js.Any = js.native
  
  var removeRegion: js.Any = js.native
  
  var removeRegions: js.Any = js.native
  
  var showChildView: js.Any = js.native
}
object RegionsMixin {
  
  @scala.inline
  def apply(
    addRegion: js.Any,
    addRegions: js.Any,
    detachChildView: js.Any,
    emptyRegions: js.Any,
    getChildView: js.Any,
    getRegion: js.Any,
    getRegions: js.Any,
    hasRegion: js.Any,
    regionClass: js.Any,
    removeRegion: js.Any,
    removeRegions: js.Any,
    showChildView: js.Any
  ): RegionsMixin = {
    val __obj = js.Dynamic.literal(addRegion = addRegion.asInstanceOf[js.Any], addRegions = addRegions.asInstanceOf[js.Any], detachChildView = detachChildView.asInstanceOf[js.Any], emptyRegions = emptyRegions.asInstanceOf[js.Any], getChildView = getChildView.asInstanceOf[js.Any], getRegion = getRegion.asInstanceOf[js.Any], getRegions = getRegions.asInstanceOf[js.Any], hasRegion = hasRegion.asInstanceOf[js.Any], regionClass = regionClass.asInstanceOf[js.Any], removeRegion = removeRegion.asInstanceOf[js.Any], removeRegions = removeRegions.asInstanceOf[js.Any], showChildView = showChildView.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionsMixin]
  }
  
  @scala.inline
  implicit class RegionsMixinOps[Self <: RegionsMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddRegion(value: js.Any): Self = this.set("addRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddRegions(value: js.Any): Self = this.set("addRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachChildView(value: js.Any): Self = this.set("detachChildView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyRegions(value: js.Any): Self = this.set("emptyRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChildView(value: js.Any): Self = this.set("getChildView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRegion(value: js.Any): Self = this.set("getRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRegions(value: js.Any): Self = this.set("getRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRegion(value: js.Any): Self = this.set("hasRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionClass(value: js.Any): Self = this.set("regionClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRegion(value: js.Any): Self = this.set("removeRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRegions(value: js.Any): Self = this.set("removeRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowChildView(value: js.Any): Self = this.set("showChildView", value.asInstanceOf[js.Any])
  }
}
