package typings.babylonjs.buildersIndexMod

import typings.babylonjs.anon.Segments
import typings.babylonjs.meshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/Builders/index", "HemisphereBuilder")
@js.native
class HemisphereBuilder ()
  extends typings.babylonjs.hemisphereBuilderMod.HemisphereBuilder
/* static members */
object HemisphereBuilder {
  
  @JSImport("babylonjs/Meshes/Builders/index", "HemisphereBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a hemisphere mesh
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the hemisphere mesh
    */
  inline def CreateHemisphere(name: String, options: Segments, scene: js.Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
}
