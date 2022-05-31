package typings.babylonjs

import typings.babylonjs.lensFlareSystemMod.LensFlareSystem
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.textureMod.Texture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lensFlareMod {
  
  @JSImport("babylonjs/LensFlares/lensFlare", "LensFlare")
  @js.native
  class LensFlare protected () extends StObject {
    /**
      * Instantiates a new Lens Flare.
      * This represents one of the lens effect in a `lensFlareSystem`.
      * It controls one of the indiviual texture used in the effect.
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      * @param size Define the size of the lens flare in the system (a floating value between 0 and 1)
      * @param position Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
      * @param color Define the lens color
      * @param imgUrl Define the lens texture url
      * @param system Define the `lensFlareSystem` this flare is part of
      */
    def this(
      /**
      * Define the size of the lens flare in the system (a floating value between 0 and 1)
      */
    size: Double,
      /**
      * Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
      */
    position: Double,
      color: Color3,
      imgUrl: String,
      system: LensFlareSystem
    ) = this()
    
    /* private */ var _system: js.Any = js.native
    
    /**
      * Define the alpha mode to render this particular lens.
      */
    var alphaMode: Double = js.native
    
    /**
      * Define the lens color.
      */
    var color: Color3 = js.native
    
    /**
      * Dispose and release the lens flare with its associated resources.
      */
    def dispose(): Unit = js.native
    
    /**
      * Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
      */
    var position: Double = js.native
    
    /**
      * Define the size of the lens flare in the system (a floating value between 0 and 1)
      */
    var size: Double = js.native
    
    /**
      * Define the lens texture.
      */
    var texture: Nullable[Texture] = js.native
  }
  /* static members */
  object LensFlare {
    
    @JSImport("babylonjs/LensFlares/lensFlare", "LensFlare")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Lens Flare.
      * This represents one of the lens effect in a `lensFlareSystem`.
      * It controls one of the indiviual texture used in the effect.
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      * @param size Define the size of the lens flare (a floating value between 0 and 1)
      * @param position Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
      * @param color Define the lens color
      * @param imgUrl Define the lens texture url
      * @param system Define the `lensFlareSystem` this flare is part of
      * @returns The newly created Lens Flare
      */
    inline def AddFlare(size: Double, position: Double, color: Color3, imgUrl: String, system: LensFlareSystem): LensFlare = (^.asInstanceOf[js.Dynamic].applyDynamic("AddFlare")(size.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], imgUrl.asInstanceOf[js.Any], system.asInstanceOf[js.Any])).asInstanceOf[LensFlare]
  }
}
