package typings.babylonjs.materialsIndexMod

import typings.babylonjs.iClipPlanesHolderMod.IClipPlanesHolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "ThinMaterialHelper")
@js.native
class ThinMaterialHelper ()
  extends typings.babylonjs.thinMaterialHelperMod.ThinMaterialHelper
/* static members */
object ThinMaterialHelper {
  
  /**
    * Binds the clip plane information from the holder to the effect.
    * @param effect The effect we are binding the data to
    * @param holder The entity containing the clip plane information
    */
  @JSImport("babylonjs/Materials/index", "ThinMaterialHelper.BindClipPlane")
  @js.native
  def BindClipPlane(effect: typings.babylonjs.effectMod.Effect, holder: IClipPlanesHolder): Unit = js.native
}
