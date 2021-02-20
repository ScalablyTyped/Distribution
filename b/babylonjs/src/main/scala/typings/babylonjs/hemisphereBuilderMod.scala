package typings.babylonjs

import typings.babylonjs.anon.Segments
import typings.babylonjs.meshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hemisphereBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/hemisphereBuilder", "HemisphereBuilder")
  @js.native
  class HemisphereBuilder () extends StObject
  /* static members */
  object HemisphereBuilder {
    
    /**
      * Creates a hemisphere mesh
      * @param name defines the name of the mesh
      * @param options defines the options used to create the mesh
      * @param scene defines the hosting scene
      * @returns the hemisphere mesh
      */
    @JSImport("babylonjs/Meshes/Builders/hemisphereBuilder", "HemisphereBuilder.CreateHemisphere")
    @js.native
    def CreateHemisphere(name: String, options: Segments, scene: js.Any): Mesh = js.native
  }
}
