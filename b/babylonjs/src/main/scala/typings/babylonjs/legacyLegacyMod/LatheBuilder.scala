package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.anon.Clip
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LatheBuilder {
  
  @JSImport("babylonjs/Legacy/legacy", "LatheBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "LatheBuilder.CreateLathe")
  @js.native
  def CreateLathe: js.Function3[
    /* name */ String, 
    /* options */ Clip, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateLathe(name: String, options: Clip): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateLathe(name: String, options: Clip, scene: Nullable[typings.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateLathe_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Clip, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLathe")(x.asInstanceOf[js.Any])
}
