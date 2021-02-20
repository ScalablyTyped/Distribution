package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClipPlanesHolder extends StObject {
  
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
  implicit class IClipPlanesHolderMutableBuilder[Self <: IClipPlanesHolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipPlane(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlane2(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlane2Null: Self = StObject.set(x, "clipPlane2", null)
    
    @scala.inline
    def setClipPlane3(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlane3Null: Self = StObject.set(x, "clipPlane3", null)
    
    @scala.inline
    def setClipPlane4(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlane4Null: Self = StObject.set(x, "clipPlane4", null)
    
    @scala.inline
    def setClipPlane5(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlane5Null: Self = StObject.set(x, "clipPlane5", null)
    
    @scala.inline
    def setClipPlane6(value: Nullable[Plane]): Self = StObject.set(x, "clipPlane6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPlane6Null: Self = StObject.set(x, "clipPlane6", null)
    
    @scala.inline
    def setClipPlaneNull: Self = StObject.set(x, "clipPlane", null)
  }
}
