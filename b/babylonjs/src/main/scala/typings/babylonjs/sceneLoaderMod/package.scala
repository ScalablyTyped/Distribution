package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sceneLoaderMod {
  
  type ISceneLoaderPluginExtensions = /**
    * Defines the list of supported extensions
    */
  org.scalablytyped.runtime.StringDictionary[typings.babylonjs.anon.IsBinary]
  
  type SceneLoaderSuccessCallback = js.Function7[
    /* meshes */ js.Array[typings.babylonjs.abstractMeshMod.AbstractMesh], 
    /* particleSystems */ js.Array[typings.babylonjs.iparticlesystemMod.IParticleSystem], 
    /* skeletons */ js.Array[typings.babylonjs.skeletonMod.Skeleton], 
    /* animationGroups */ js.Array[typings.babylonjs.animationGroupMod.AnimationGroup], 
    /* transformNodes */ js.Array[typings.babylonjs.transformNodeMod.TransformNode], 
    /* geometries */ js.Array[typings.babylonjs.geometryMod.Geometry], 
    /* lights */ js.Array[typings.babylonjs.lightMod.Light], 
    scala.Unit
  ]
}
