package typings.babylonjs.mod

import typings.babylonjs.iClipPlanesHolderMod.IClipPlanesHolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ThinMaterialHelper")
@js.native
class ThinMaterialHelper ()
  extends typings.babylonjs.legacyMod.ThinMaterialHelper
/* static members */
@JSImport("babylonjs", "ThinMaterialHelper")
@js.native
object ThinMaterialHelper extends js.Object {
  
  /**
    * Binds the clip plane information from the holder to the effect.
    * @param effect The effect we are binding the data to
    * @param holder The entity containing the clip plane information
    */
  def BindClipPlane(effect: typings.babylonjs.effectMod.Effect, holder: IClipPlanesHolder): Unit = js.native
}
