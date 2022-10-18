package typings.babylonjs.meshesIndexMod

import typings.babylonjs.anon.Angle
import typings.babylonjs.meshesMeshMod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DecalBuilder {
  
  @JSImport("babylonjs/Meshes/index", "DecalBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Meshes/index", "DecalBuilder.CreateDecal")
  @js.native
  def CreateDecal: js.Function3[
    /* name */ String, 
    /* sourceMesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, 
    /* options */ Angle, 
    Mesh
  ] = js.native
  inline def CreateDecal(name: String, sourceMesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, options: Angle): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateDecal_=(
    x: js.Function3[
      /* name */ String, 
      /* sourceMesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, 
      /* options */ Angle, 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDecal")(x.asInstanceOf[js.Any])
}
