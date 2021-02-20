package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerVertexMod {
  
  object layerVertexShader {
    
    @JSImport("babylonjs/Shaders/layer.vertex", "layerVertexShader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Shaders/layer.vertex", "layerVertexShader.name")
    @js.native
    def name: String = js.native
    @scala.inline
    def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Shaders/layer.vertex", "layerVertexShader.shader")
    @js.native
    def shader: String = js.native
    @scala.inline
    def shader_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shader")(x.asInstanceOf[js.Any])
  }
}
