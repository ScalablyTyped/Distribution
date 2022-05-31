package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.Segments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.HemisphereBuilder")
@js.native
class HemisphereBuilder ()
  extends StObject
     with typings.babylonjs.BABYLON.HemisphereBuilder
/* static members */
object HemisphereBuilder {
  
  @JSGlobal("BABYLON.HemisphereBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a hemisphere mesh
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the hemisphere mesh
    */
  inline def CreateHemisphere(name: String, options: Segments, scene: js.Any): typings.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.Mesh]
}
