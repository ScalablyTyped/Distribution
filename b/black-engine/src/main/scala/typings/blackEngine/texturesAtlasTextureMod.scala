package typings.blackEngine

import typings.blackEngine.texturesTextureMod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object texturesAtlasTextureMod {
  
  @JSImport("black-engine/textures/AtlasTexture", "AtlasTexture")
  @js.native
  open class AtlasTexture protected () extends Texture {
    def this(nativeElement: Any, jsonObject: Any) = this()
    def this(nativeElement: Any, jsonObject: Any, scale: Double) = this()
    
    /* private */ var __parseAtlasData: Any = js.native
    
    def getTexture(name: String): Texture = js.native
    
    def getTextures(): js.Array[Texture] = js.native
    def getTextures(nameMask: String): js.Array[Texture] = js.native
    def getTextures(nameMask: String, outTextures: js.Array[Texture]): js.Array[Texture] = js.native
    def getTextures(nameMask: Null, outTextures: js.Array[Texture]): js.Array[Texture] = js.native
    def getTextures(nameMask: Unit, outTextures: js.Array[Texture]): js.Array[Texture] = js.native
    
    /* private */ var mSubTextures: Any = js.native
    
    def subTextures: Any = js.native
  }
  /* static members */
  object AtlasTexture {
    
    @JSImport("black-engine/textures/AtlasTexture", "AtlasTexture")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("black-engine/textures/AtlasTexture", "AtlasTexture.__naturalComparer")
    @js.native
    def __naturalComparer: Any = js.native
    inline def __naturalComparer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__naturalComparer")(x.asInstanceOf[js.Any])
    
    inline def naturalSort(dataset: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("naturalSort")(dataset.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def naturalSort(dataset: js.Array[Any], field: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("naturalSort")(dataset.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
