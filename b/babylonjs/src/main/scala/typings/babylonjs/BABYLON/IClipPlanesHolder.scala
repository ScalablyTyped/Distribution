package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClipPlanesHolder extends js.Object {
  
  /**
    * Gets or sets the active clipplane 1
    */
  var clipPlane: Nullable[Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 2
    */
  var clipPlane2: Nullable[Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 3
    */
  var clipPlane3: Nullable[Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 4
    */
  var clipPlane4: Nullable[Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 5
    */
  var clipPlane5: Nullable[Plane] = js.native
  
  /**
    * Gets or sets the active clipplane 6
    */
  var clipPlane6: Nullable[Plane] = js.native
}
object IClipPlanesHolder {
  
  @scala.inline
  def apply(): IClipPlanesHolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClipPlanesHolder]
  }
  
  @scala.inline
  implicit class IClipPlanesHolderOps[Self <: IClipPlanesHolder] (val x: Self) extends AnyVal {
    
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
    def setClipPlane(value: Nullable[Plane]): Self = this.set("clipPlane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlaneNull: Self = this.set("clipPlane", null)
    
    @scala.inline
    def setClipPlane2(value: Nullable[Plane]): Self = this.set("clipPlane2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlane2Null: Self = this.set("clipPlane2", null)
    
    @scala.inline
    def setClipPlane3(value: Nullable[Plane]): Self = this.set("clipPlane3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlane3Null: Self = this.set("clipPlane3", null)
    
    @scala.inline
    def setClipPlane4(value: Nullable[Plane]): Self = this.set("clipPlane4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlane4Null: Self = this.set("clipPlane4", null)
    
    @scala.inline
    def setClipPlane5(value: Nullable[Plane]): Self = this.set("clipPlane5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlane5Null: Self = this.set("clipPlane5", null)
    
    @scala.inline
    def setClipPlane6(value: Nullable[Plane]): Self = this.set("clipPlane6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlane6Null: Self = this.set("clipPlane6", null)
  }
}
