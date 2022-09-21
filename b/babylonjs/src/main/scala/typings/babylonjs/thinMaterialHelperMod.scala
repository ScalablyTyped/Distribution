package typings.babylonjs

import typings.babylonjs.effectMod.Effect
import typings.babylonjs.iClipPlanesHolderMod.IClipPlanesHolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thinMaterialHelperMod {
  
  @JSImport("babylonjs/Materials/thinMaterialHelper", "ThinMaterialHelper")
  @js.native
  open class ThinMaterialHelper () extends StObject
  /* static members */
  object ThinMaterialHelper {
    
    @JSImport("babylonjs/Materials/thinMaterialHelper", "ThinMaterialHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Binds the clip plane information from the holder to the effect.
      * @param effect The effect we are binding the data to
      * @param holder The entity containing the clip plane information
      */
    inline def BindClipPlane(effect: Effect, holder: IClipPlanesHolder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindClipPlane")(effect.asInstanceOf[js.Any], holder.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
