package typings.babylonjs.mod

import typings.babylonjs.anon.CloseArray
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RibbonBuilder {
  
  @JSImport("babylonjs", "RibbonBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs", "RibbonBuilder.CreateRibbon")
  @js.native
  def CreateRibbon: js.Function3[
    /* name */ String, 
    /* options */ CloseArray, 
    /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateRibbon(name: String, options: CloseArray): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateRibbon(name: String, options: CloseArray, scene: Nullable[typings.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateRibbon_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ CloseArray, 
      /* scene */ js.UndefOr[Nullable[typings.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateRibbon")(x.asInstanceOf[js.Any])
}
