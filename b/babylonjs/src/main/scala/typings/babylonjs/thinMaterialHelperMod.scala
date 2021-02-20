package typings.babylonjs

import typings.babylonjs.effectMod.Effect
import typings.babylonjs.iClipPlanesHolderMod.IClipPlanesHolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thinMaterialHelperMod {
  
  @JSImport("babylonjs/Materials/thinMaterialHelper", "ThinMaterialHelper")
  @js.native
  class ThinMaterialHelper () extends StObject
  /* static members */
  object ThinMaterialHelper {
    
    /**
      * Binds the clip plane information from the holder to the effect.
      * @param effect The effect we are binding the data to
      * @param holder The entity containing the clip plane information
      */
    @JSImport("babylonjs/Materials/thinMaterialHelper", "ThinMaterialHelper.BindClipPlane")
    @js.native
    def BindClipPlane(effect: Effect, holder: IClipPlanesHolder): Unit = js.native
  }
}
