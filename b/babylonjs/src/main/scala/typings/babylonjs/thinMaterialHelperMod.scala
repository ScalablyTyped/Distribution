package typings.babylonjs

import typings.babylonjs.effectMod.Effect
import typings.babylonjs.iClipPlanesHolderMod.IClipPlanesHolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/thinMaterialHelper", JSImport.Namespace)
@js.native
object thinMaterialHelperMod extends js.Object {
  
  @js.native
  class ThinMaterialHelper () extends js.Object
  /* static members */
  @js.native
  object ThinMaterialHelper extends js.Object {
    
    /**
      * Binds the clip plane information from the holder to the effect.
      * @param effect The effect we are binding the data to
      * @param holder The entity containing the clip plane information
      */
    def BindClipPlane(effect: Effect, holder: IClipPlanesHolder): Unit = js.native
  }
}
