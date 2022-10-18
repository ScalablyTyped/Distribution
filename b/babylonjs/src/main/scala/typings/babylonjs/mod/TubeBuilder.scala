package typings.babylonjs.mod

import typings.babylonjs.anon.InvertUV
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TubeBuilder {
  
  @JSImport("babylonjs", "TubeBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "TubeBuilder.CreateTube")
  @js.native
  def CreateTube: js.Function3[
    /* name */ String, 
    /* options */ InvertUV, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateTube(name: String, options: InvertUV): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTube(name: String, options: InvertUV, scene: Nullable[typings.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTube_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ InvertUV, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTube")(x.asInstanceOf[js.Any])
}
