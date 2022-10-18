package typings.babylonjs

import typings.babylonjs.meshesGeodesicMeshMod.PolyhedronData
import typings.babylonjs.meshesGoldbergMeshMod.GoldbergMesh
import typings.babylonjs.meshesMeshDotvertexDataMod.VertexData
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesBuildersGoldbergBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/goldbergBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateGoldberg(name: String, options: GoldbergCreationOption): GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GoldbergMesh]
  inline def CreateGoldberg(name: String, options: GoldbergCreationOption, scene: Nullable[Scene]): GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GoldbergMesh]
  
  inline def CreateGoldbergVertexData(options: GoldbergVertexDataOption, goldbergData: PolyhedronData): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldbergVertexData")(options.asInstanceOf[js.Any], goldbergData.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  
  trait GoldbergCreationOption
    extends StObject
       with GoldbergVertexDataOption {
    
    /**
      * number of horizontal steps along an isogrid
      */
    var m: js.UndefOr[Double] = js.undefined
    
    /**
      * number of angled steps along an isogrid
      */
    var n: js.UndefOr[Double] = js.undefined
    
    /**
      * defines if the mesh must be flagged as updatable
      */
    var updatable: js.UndefOr[Boolean] = js.undefined
  }
  object GoldbergCreationOption {
    
    inline def apply(): GoldbergCreationOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoldbergCreationOption]
    }
    
    extension [Self <: GoldbergCreationOption](x: Self) {
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
      
      inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
      
      inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    }
  }
  
  trait GoldbergVertexDataOption extends StObject {
    
    /**
      * optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      */
    var sideOrientation: js.UndefOr[Double] = js.undefined
    
    /**
      * the size of the Goldberg, optional default 1
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * allows stretching in the x direction, optional, default size
      */
    var sizeX: js.UndefOr[Double] = js.undefined
    
    /**
      * allows stretching in the y direction, optional, default size
      */
    var sizeY: js.UndefOr[Double] = js.undefined
    
    /**
      * allows stretching in the z direction, optional, default size
      */
    var sizeZ: js.UndefOr[Double] = js.undefined
  }
  object GoldbergVertexDataOption {
    
    inline def apply(): GoldbergVertexDataOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoldbergVertexDataOption]
    }
    
    extension [Self <: GoldbergVertexDataOption](x: Self) {
      
      inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
      
      inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeX(value: Double): Self = StObject.set(x, "sizeX", value.asInstanceOf[js.Any])
      
      inline def setSizeXUndefined: Self = StObject.set(x, "sizeX", js.undefined)
      
      inline def setSizeY(value: Double): Self = StObject.set(x, "sizeY", value.asInstanceOf[js.Any])
      
      inline def setSizeYUndefined: Self = StObject.set(x, "sizeY", js.undefined)
      
      inline def setSizeZ(value: Double): Self = StObject.set(x, "sizeZ", value.asInstanceOf[js.Any])
      
      inline def setSizeZUndefined: Self = StObject.set(x, "sizeZ", js.undefined)
    }
  }
}
