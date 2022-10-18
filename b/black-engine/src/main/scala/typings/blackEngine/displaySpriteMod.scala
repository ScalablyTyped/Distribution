package typings.blackEngine

import typings.blackEngine.displayDisplayObjectMod.DisplayObject
import typings.blackEngine.geomRectangleMod.Rectangle
import typings.blackEngine.texturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displaySpriteMod {
  
  @JSImport("black-engine/display/Sprite", "Sprite")
  @js.native
  open class Sprite () extends DisplayObject {
    def this(texture: String) = this()
    def this(texture: Texture) = this()
    def this(texture: String, useTextureProps: Boolean) = this()
    def this(texture: Null, useTextureProps: Boolean) = this()
    def this(texture: Unit, useTextureProps: Boolean) = this()
    def this(texture: Texture, useTextureProps: Boolean) = this()
    
    /* private */ var mSlice9grid: Any = js.native
    
    /* private */ var mTexture: Any = js.native
    
    /* private */ var mTextureName: Any = js.native
    
    /* private */ var mTiling: Any = js.native
    
    /* private */ var mUseTextureProps: Any = js.native
    
    def slice9grid: Rectangle = js.native
    def slice9grid_=(arg: Rectangle): Unit = js.native
    
    def texture: Texture = js.native
    
    def textureName: String = js.native
    def textureName_=(arg: String): Unit = js.native
    
    def texture_=(arg: Texture): Unit = js.native
    
    def tiling: Any = js.native
    def tiling_=(arg: Any): Unit = js.native
  }
}
