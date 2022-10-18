package typings.babylonjs.meshesIndexMod

import typings.babylonjs.meshesBuildersCapsuleBuilderMod.ICreateCapsuleOptions
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CapsuleBuilder {
  
  @JSImport("babylonjs/Meshes/index", "CapsuleBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "CapsuleBuilder.CreateCapsule")
  @js.native
  def CreateCapsule: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[ICreateCapsuleOptions], 
    /* scene */ js.UndefOr[Nullable[Scene]], 
    Mesh
  ] = js.native
  inline def CreateCapsule(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateCapsule(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCapsule(name: String, options: ICreateCapsuleOptions): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCapsule_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[ICreateCapsuleOptions], 
      /* scene */ js.UndefOr[Nullable[Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCapsule")(x.asInstanceOf[js.Any])
}
