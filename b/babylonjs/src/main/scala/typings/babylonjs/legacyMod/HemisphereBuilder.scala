package typings.babylonjs.legacyMod

import typings.babylonjs.anon.Segments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "HemisphereBuilder")
@js.native
class HemisphereBuilder ()
  extends typings.babylonjs.indexMod.HemisphereBuilder
/* static members */
@JSImport("babylonjs/Legacy/legacy", "HemisphereBuilder")
@js.native
object HemisphereBuilder extends js.Object {
  
  /**
    * Creates a hemisphere mesh
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the hemisphere mesh
    */
  def CreateHemisphere(name: String, options: Segments, scene: js.Any): typings.babylonjs.meshMod.Mesh = js.native
}
