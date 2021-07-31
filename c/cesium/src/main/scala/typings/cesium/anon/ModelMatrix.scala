package typings.cesium.anon

import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelMatrix extends StObject {
  
  var blendOption: js.UndefOr[typings.cesium.mod.BlendOption] = js.undefined
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
}
object ModelMatrix {
  
  @scala.inline
  def apply(): ModelMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelMatrix]
  }
  
  @scala.inline
  implicit class ModelMatrixMutableBuilder[Self <: ModelMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlendOption(value: typings.cesium.mod.BlendOption): Self = StObject.set(x, "blendOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendOptionUndefined: Self = StObject.set(x, "blendOption", js.undefined)
    
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
  }
}
