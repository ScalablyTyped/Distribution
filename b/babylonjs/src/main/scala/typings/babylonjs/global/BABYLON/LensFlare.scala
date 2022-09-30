package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.LensFlare")
@js.native
open class LensFlare protected ()
  extends StObject
     with typings.babylonjs.BABYLON.LensFlare {
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
    color: typings.babylonjs.BABYLON.Color3,
    imgUrl: String,
    system: typings.babylonjs.BABYLON.LensFlareSystem
  ) = this()
  
  /** @internal */
  /* CompleteClass */
  var _drawWrapper: typings.babylonjs.BABYLON.DrawWrapper = js.native
  
  /* private */ /* CompleteClass */
  var _system: Any = js.native
  
  /**
    * Define the alpha mode to render this particular lens.
    */
  /* CompleteClass */
  var alphaMode: Double = js.native
  
  /**
    * Define the lens color.
    */
  /* CompleteClass */
  var color: typings.babylonjs.BABYLON.Color3 = js.native
  
  /**
    * Dispose and release the lens flare with its associated resources.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
    */
  /* CompleteClass */
  var position: Double = js.native
  
  /**
    * Define the size of the lens flare in the system (a floating value between 0 and 1)
    */
  /* CompleteClass */
  var size: Double = js.native
  
  /**
    * Define the lens texture.
    */
  /* CompleteClass */
  var texture: Nullable[typings.babylonjs.BABYLON.Texture] = js.native
}
/* static members */
object LensFlare {
  
  @JSGlobal("BABYLON.LensFlare")
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
    color: typings.babylonjs.BABYLON.Color3,
    imgUrl: String,
    system: typings.babylonjs.BABYLON.LensFlareSystem
  ): typings.babylonjs.BABYLON.LensFlare = (^.asInstanceOf[js.Dynamic].applyDynamic("AddFlare")(size.asInstanceOf[js.Any], position.asInstanceOf[js.Any], color.asInstanceOf[js.Any], imgUrl.asInstanceOf[js.Any], system.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.LensFlare]
}
