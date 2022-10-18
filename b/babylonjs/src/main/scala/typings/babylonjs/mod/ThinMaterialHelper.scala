package typings.babylonjs.mod

import typings.babylonjs.miscInterfacesIClipPlanesHolderMod.IClipPlanesHolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ThinMaterialHelper")
@js.native
open class ThinMaterialHelper ()
  extends typings.babylonjs.legacyLegacyMod.ThinMaterialHelper
/* static members */
object ThinMaterialHelper {
  
  @JSImport("babylonjs", "ThinMaterialHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Binds the clip plane information from the holder to the effect.
    * @param effect The effect we are binding the data to
    * @param holder The entity containing the clip plane information
    */
  inline def BindClipPlane(effect: typings.babylonjs.materialsEffectMod.Effect, holder: IClipPlanesHolder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindClipPlane")(effect.asInstanceOf[js.Any], holder.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
