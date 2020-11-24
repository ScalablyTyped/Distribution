package typings.babylonjs

import typings.babylonjs.anon.Segments
import typings.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/Builders/hemisphereBuilder", JSImport.Namespace)
@js.native
object hemisphereBuilderMod extends js.Object {
  
  @js.native
  class HemisphereBuilder () extends js.Object
  /* static members */
  @js.native
  object HemisphereBuilder extends js.Object {
    
    /**
      * Creates a hemisphere mesh
      * @param name defines the name of the mesh
      * @param options defines the options used to create the mesh
      * @param scene defines the hosting scene
      * @returns the hemisphere mesh
      */
    def CreateHemisphere(name: String, options: Segments, scene: js.Any): Mesh = js.native
  }
}
