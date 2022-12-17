package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DecalBuilder {
  
  @JSImport("babylonjs/Legacy/legacy", "DecalBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "DecalBuilder.CreateDecal")
  @js.native
  def CreateDecal: js.Function3[
    /* name */ String, 
    /* sourceMesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, 
    /* options */ typings.babylonjs.anon.Angle, 
    typings.babylonjs.meshesMeshMod.Mesh
  ] = js.native
  inline def CreateDecal(
    name: String,
    sourceMesh: typings.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    options: typings.babylonjs.anon.Angle
  ): typings.babylonjs.meshesMeshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesMeshMod.Mesh]
  inline def CreateDecal_=(
    x: js.Function3[
      /* name */ String, 
      /* sourceMesh */ typings.babylonjs.meshesAbstractMeshMod.AbstractMesh, 
      /* options */ typings.babylonjs.anon.Angle, 
      typings.babylonjs.meshesMeshMod.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDecal")(x.asInstanceOf[js.Any])
}
