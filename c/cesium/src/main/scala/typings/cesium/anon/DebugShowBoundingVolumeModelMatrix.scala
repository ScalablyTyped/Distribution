package typings.cesium.anon

import typings.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugShowBoundingVolumeModelMatrix extends StObject {
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  
  var modelMatrix: js.UndefOr[Matrix4] = js.native
}
object DebugShowBoundingVolumeModelMatrix {
  
  @scala.inline
  def apply(): DebugShowBoundingVolumeModelMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugShowBoundingVolumeModelMatrix]
  }
  
  @scala.inline
  implicit class DebugShowBoundingVolumeModelMatrixMutableBuilder[Self <: DebugShowBoundingVolumeModelMatrix] (val x: Self) extends AnyVal {
    
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
