package typings.babylonjs

import typings.babylonjs.anon.Clip
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object latheBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/latheBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateLathe(name: String, options: Clip): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateLathe(name: String, options: Clip, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  object LatheBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/latheBuilder", "LatheBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/latheBuilder", "LatheBuilder.CreateLathe")
    @js.native
    def CreateLathe: js.Function3[/* name */ String, /* options */ Clip, /* scene */ js.UndefOr[Nullable[Scene]], Mesh] = js.native
    inline def CreateLathe(name: String, options: Clip): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateLathe(name: String, options: Clip, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateLathe_=(
      x: js.Function3[/* name */ String, /* options */ Clip, /* scene */ js.UndefOr[Nullable[Scene]], Mesh]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLathe")(x.asInstanceOf[js.Any])
  }
}
