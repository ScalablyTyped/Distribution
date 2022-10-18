package typings.babylonjs

import typings.babylonjs.anon.Depth
import typings.babylonjs.anon.Holes
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Vector4
import typings.babylonjs.meshesMeshDotvertexDataMod.VertexData
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesBuildersPolygonBuilderMod {
  
  @JSImport("babylonjs/Meshes/Builders/polygonBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreatePolygon(name: String, options: Depth): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolygon(name: String, options: Depth, scene: Unit, earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolygon(name: String, options: Depth, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolygon(name: String, options: Depth, scene: Nullable[Scene], earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: js.Array[Vector4]): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: js.Array[Vector4], fColors: js.Array[Color4]): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: js.Array[Color4],
    frontUVs: Unit,
    backUVs: Unit,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: js.Array[Color4],
    frontUVs: Unit,
    backUVs: Vector4
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: js.Array[Color4],
    frontUVs: Unit,
    backUVs: Vector4,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: js.Array[Color4],
    frontUVs: Vector4
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: js.Array[Color4],
    frontUVs: Vector4,
    backUVs: Unit,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: js.Array[Color4],
    frontUVs: Vector4,
    backUVs: Vector4
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: js.Array[Color4],
    frontUVs: Vector4,
    backUVs: Vector4,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: Unit,
    frontUVs: Unit,
    backUVs: Unit,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: Unit,
    frontUVs: Unit,
    backUVs: Vector4
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: Unit,
    frontUVs: Unit,
    backUVs: Vector4,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: js.Array[Vector4], fColors: Unit, frontUVs: Vector4): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: Unit,
    frontUVs: Vector4,
    backUVs: Unit,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: Unit,
    frontUVs: Vector4,
    backUVs: Vector4
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: js.Array[Vector4],
    fColors: Unit,
    frontUVs: Vector4,
    backUVs: Vector4,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: js.Array[Color4]): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: Unit,
    fColors: js.Array[Color4],
    frontUVs: Unit,
    backUVs: Unit,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: Unit,
    fColors: js.Array[Color4],
    frontUVs: Unit,
    backUVs: Vector4
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: Unit,
    fColors: js.Array[Color4],
    frontUVs: Unit,
    backUVs: Vector4,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: js.Array[Color4], frontUVs: Vector4): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: Unit,
    fColors: js.Array[Color4],
    frontUVs: Vector4,
    backUVs: Unit,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: Unit,
    fColors: js.Array[Color4],
    frontUVs: Vector4,
    backUVs: Vector4
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: Unit,
    fColors: js.Array[Color4],
    frontUVs: Vector4,
    backUVs: Vector4,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: Unit,
    fColors: Unit,
    frontUVs: Unit,
    backUVs: Unit,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: Unit, frontUVs: Unit, backUVs: Vector4): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: Unit,
    fColors: Unit,
    frontUVs: Unit,
    backUVs: Vector4,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: Unit, frontUVs: Vector4): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: Unit,
    fColors: Unit,
    frontUVs: Vector4,
    backUVs: Unit,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: Unit,
    fColors: Unit,
    frontUVs: Vector4,
    backUVs: Vector4
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  inline def CreatePolygonVertexData(
    polygon: Mesh,
    sideOrientation: Double,
    fUV: Unit,
    fColors: Unit,
    frontUVs: Vector4,
    backUVs: Vector4,
    wrp: Boolean
  ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygonVertexData")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrp.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  
  inline def ExtrudePolygon(name: String, options: Holes): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(name: String, options: Holes, scene: Unit, earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(name: String, options: Holes, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(name: String, options: Holes, scene: Nullable[Scene], earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  object PolygonBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/polygonBuilder", "PolygonBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/polygonBuilder", "PolygonBuilder.CreatePolygon")
    @js.native
    def CreatePolygon: js.Function4[
        /* name */ String, 
        /* options */ Depth, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        /* earcutInjection */ js.UndefOr[Any], 
        Mesh
      ] = js.native
    inline def CreatePolygon(name: String, options: Depth): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreatePolygon(name: String, options: Depth, scene: Unit, earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreatePolygon(name: String, options: Depth, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreatePolygon(name: String, options: Depth, scene: Nullable[Scene], earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreatePolygon_=(
      x: js.Function4[
          /* name */ String, 
          /* options */ Depth, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          /* earcutInjection */ js.UndefOr[Any], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePolygon")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Builders/polygonBuilder", "PolygonBuilder.ExtrudePolygon")
    @js.native
    def ExtrudePolygon: js.Function4[
        /* name */ String, 
        /* options */ Holes, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        /* earcutInjection */ js.UndefOr[Any], 
        Mesh
      ] = js.native
    inline def ExtrudePolygon(name: String, options: Holes): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def ExtrudePolygon(name: String, options: Holes, scene: Unit, earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def ExtrudePolygon(name: String, options: Holes, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def ExtrudePolygon(name: String, options: Holes, scene: Nullable[Scene], earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def ExtrudePolygon_=(
      x: js.Function4[
          /* name */ String, 
          /* options */ Holes, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          /* earcutInjection */ js.UndefOr[Any], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudePolygon")(x.asInstanceOf[js.Any])
  }
}
