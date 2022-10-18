package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "LensFlare")
@js.native
open class LensFlare protected ()
  extends typings.babylonjs.legacyLegacyMod.LensFlare {
  /**
    * Instantiates a new Lens Flare.
    * This represents one of the lens effect in a `lensFlareSystem`.
    * It controls one of the individual texture used in the effect.
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
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    imgUrl: String,
    system: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem
  ) = this()
}
/* static members */
object LensFlare {
  
  @JSImport("babylonjs", "LensFlare")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Lens Flare.
    * This represents one of the lens effect in a `lensFlareSystem`.
    * It controls one of the individual texture used in the effect.
    * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
    * @param size Define the size of the lens flare (a floating value between 0 and 1)
    * @param position Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
    * @param color Define the lens color
    * @param imgUrl Define the lens texture url
    * @param system Define the `lensFlareSystem` this flare is part of
    * @returns The newly created Lens Flare
    */
  inline def AddFlare(
    size: Double,
    position: Double,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3,
    imgUrl: String,
    system: typings.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem
  ): typings.babylonjs.lensFlaresLensFlareMod.LensFlare = (^.asInstanceOf[js.Dynamic].applyDynamic("AddFlare")(size.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], imgUrl.asInstanceOf[js.Any], system.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.lensFlaresLensFlareMod.LensFlare]
}
