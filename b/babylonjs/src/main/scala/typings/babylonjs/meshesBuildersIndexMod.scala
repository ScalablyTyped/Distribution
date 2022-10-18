package typings.babylonjs

import typings.babylonjs.anon.AdjustFrame
import typings.babylonjs.anon.AlignHorizontal
import typings.babylonjs.anon.AlignVertical
import typings.babylonjs.anon.AlphaFilter
import typings.babylonjs.anon.Angle
import typings.babylonjs.anon.Arc
import typings.babylonjs.anon.BackUVs
import typings.babylonjs.anon.BottomBaseAt
import typings.babylonjs.anon.Buffer
import typings.babylonjs.anon.Cap
import typings.babylonjs.anon.Clip
import typings.babylonjs.anon.CloseArray
import typings.babylonjs.anon.ClosePath
import typings.babylonjs.anon.CloseShape
import typings.babylonjs.anon.Colors
import typings.babylonjs.anon.Custom
import typings.babylonjs.anon.DashNb
import typings.babylonjs.anon.DashSize
import typings.babylonjs.anon.DedupTopBottomIndices
import typings.babylonjs.anon.Depth
import typings.babylonjs.anon.Diameter
import typings.babylonjs.anon.DiameterX
import typings.babylonjs.anon.FaceColors
import typings.babylonjs.anon.FaceUV
import typings.babylonjs.anon.Flat
import typings.babylonjs.anon.FrontUVs
import typings.babylonjs.anon.Holes
import typings.babylonjs.anon.Instance
import typings.babylonjs.anon.InvertUV
import typings.babylonjs.anon.Lines
import typings.babylonjs.anon.P
import typings.babylonjs.anon.Pattern
import typings.babylonjs.anon.Precision
import typings.babylonjs.anon.Q
import typings.babylonjs.anon.Radius
import typings.babylonjs.anon.RadiusX
import typings.babylonjs.anon.SideOrientation
import typings.babylonjs.anon.Size
import typings.babylonjs.anon.Subdivisions
import typings.babylonjs.anon.SubdivisionsX
import typings.babylonjs.anon.Tessellation
import typings.babylonjs.anon.Thickness
import typings.babylonjs.anon.TileHeight
import typings.babylonjs.anon.Xmax
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Vector4
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesBuildersCapsuleBuilderMod.ICreateCapsuleOptions
import typings.babylonjs.meshesBuildersGoldbergBuilderMod.GoldbergCreationOption
import typings.babylonjs.meshesBuildersGoldbergBuilderMod.GoldbergVertexDataOption
import typings.babylonjs.meshesGeodesicMeshMod.PolyhedronData
import typings.babylonjs.meshesGoldbergMeshMod.GoldbergMesh
import typings.babylonjs.meshesGroundMeshMod.GroundMesh
import typings.babylonjs.meshesLinesMeshMod.LinesMesh
import typings.babylonjs.meshesMeshDotvertexDataMod.VertexData
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesBuildersIndexMod {
  
  @JSImport("babylonjs/Meshes/Builders/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object BoxBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "BoxBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "BoxBuilder.CreateBox")
    @js.native
    def CreateBox: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[BackUVs], 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateBox(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreateBox(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateBox(name: String, options: BackUVs): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateBox(name: String, options: BackUVs, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateBox_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[BackUVs], 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateBox")(x.asInstanceOf[js.Any])
  }
  
  object CapsuleBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "CapsuleBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "CapsuleBuilder.CreateCapsule")
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
  
  inline def CreateBox(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateBox(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateBox(name: String, options: BackUVs): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateBox(name: String, options: BackUVs, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateBoxVertexData(options: BottomBaseAt): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBoxVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateCapsule(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateCapsule(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCapsule(name: String, options: ICreateCapsuleOptions): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateCapsuleVertexData(): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsuleVertexData")().asInstanceOf[VertexData]
  inline def CreateCapsuleVertexData(options: ICreateCapsuleOptions): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsuleVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateCylinder(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateCylinder(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCylinder(name: String, options: Arc): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCylinder(name: String, options: Arc, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateCylinderVertexData(options: Cap): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinderVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateDashedLines(name: String, options: DashNb): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
  inline def CreateDashedLines(name: String, options: DashNb, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
  
  inline def CreateDashedLinesVertexData(options: DashSize): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLinesVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateDecal(name: String, sourceMesh: AbstractMesh, options: Angle): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateDisc(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateDisc(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateDisc(name: String, options: FrontUVs): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateDisc(name: String, options: FrontUVs, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateDiscVertexData(options: Radius): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDiscVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateGeodesic(name: String, options: FaceColors): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeodesic")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateGeodesic(name: String, options: FaceColors, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeodesic")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateGoldberg(name: String, options: GoldbergCreationOption): GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GoldbergMesh]
  inline def CreateGoldberg(name: String, options: GoldbergCreationOption, scene: Nullable[Scene]): GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GoldbergMesh]
  
  inline def CreateGoldbergVertexData(options: GoldbergVertexDataOption, goldbergData: PolyhedronData): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldbergVertexData")(options.asInstanceOf[js.Any], goldbergData.asInstanceOf[js.Any])).asInstanceOf[VertexData]
  
  inline def CreateGround(name: String): GroundMesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any]).asInstanceOf[GroundMesh]
  inline def CreateGround(name: String, options: Unit, scene: Scene): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  inline def CreateGround(name: String, options: Subdivisions): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  inline def CreateGround(name: String, options: Subdivisions, scene: Scene): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  
  inline def CreateGroundFromHeightMap(name: String, url: String): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: Unit, scene: Nullable[Scene]): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: AlphaFilter): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: AlphaFilter, scene: Nullable[Scene]): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
  
  inline def CreateGroundFromHeightMapVertexData(options: Buffer): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMapVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateGroundVertexData(options: SubdivisionsX): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateHemisphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateHemisphere(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateHemisphere(name: String, options: Diameter): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateHemisphere(name: String, options: Diameter, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateIcoSphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateIcoSphere(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateIcoSphere(name: String, options: Flat): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateIcoSphere(name: String, options: Flat, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateIcoSphereVertexData(options: RadiusX): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphereVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateLathe(name: String, options: Clip): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateLathe(name: String, options: Clip, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateLineSystem(name: String, options: Colors, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
  
  inline def CreateLineSystemVertexData(options: Lines): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystemVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateLines(name: String, options: Instance): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
  inline def CreateLines(name: String, options: Instance, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
  
  inline def CreatePlane(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreatePlane(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePlane(name: String, options: SideOrientation): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePlane(name: String, options: SideOrientation, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreatePlaneVertexData(options: Size): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlaneVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
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
  
  inline def CreatePolyhedron(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreatePolyhedron(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolyhedron(name: String, options: Custom): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolyhedron(name: String, options: Custom, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreatePolyhedronVertexData(options: FaceUV): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedronVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateRibbon(name: String, options: CloseArray): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateRibbon(name: String, options: CloseArray, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateRibbonVertexData(options: ClosePath): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbonVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateSphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateSphere(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateSphere(name: String, options: DiameterX): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateSphere(name: String, options: DiameterX, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateSphereVertexData(options: DedupTopBottomIndices): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphereVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateTiledBox(name: String, options: AlignHorizontal): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledBox(name: String, options: AlignHorizontal, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateTiledBoxVertexData(options: AlignVertical): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBoxVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateTiledGround(name: String, options: Precision): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledGround(name: String, options: Precision, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateTiledGroundVertexData(options: Xmax): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGroundVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateTiledPlane(name: String, options: Pattern): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledPlane(name: String, options: Pattern, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateTiledPlaneVertexData(options: TileHeight): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlaneVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateTorus(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Tessellation): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Tessellation, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateTorusKnot(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def CreateTorusKnotVertexData(options: Q): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnotVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateTorusVertexData(options: Thickness): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusVertexData")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
  
  inline def CreateTube(name: String, options: InvertUV): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTube(name: String, options: InvertUV, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  object CylinderBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "CylinderBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "CylinderBuilder.CreateCylinder")
    @js.native
    def CreateCylinder: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[Arc], 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateCylinder(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreateCylinder(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateCylinder(name: String, options: Arc): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateCylinder(name: String, options: Arc, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateCylinder_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[Arc], 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCylinder")(x.asInstanceOf[js.Any])
  }
  
  object DecalBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "DecalBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "DecalBuilder.CreateDecal")
    @js.native
    def CreateDecal: js.Function3[/* name */ String, /* sourceMesh */ AbstractMesh, /* options */ Angle, Mesh] = js.native
    inline def CreateDecal(name: String, sourceMesh: AbstractMesh, options: Angle): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateDecal_=(x: js.Function3[/* name */ String, /* sourceMesh */ AbstractMesh, /* options */ Angle, Mesh]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDecal")(x.asInstanceOf[js.Any])
  }
  
  object DiscBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "DiscBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "DiscBuilder.CreateDisc")
    @js.native
    def CreateDisc: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[FrontUVs], 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateDisc(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreateDisc(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateDisc(name: String, options: FrontUVs): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateDisc(name: String, options: FrontUVs, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateDisc_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[FrontUVs], 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDisc")(x.asInstanceOf[js.Any])
  }
  
  inline def ExtrudePolygon(name: String, options: Holes): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(name: String, options: Holes, scene: Unit, earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(name: String, options: Holes, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(name: String, options: Holes, scene: Nullable[Scene], earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def ExtrudeShape(name: String, options: AdjustFrame): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudeShape(name: String, options: AdjustFrame, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def ExtrudeShapeCustom(name: String, options: CloseShape): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudeShapeCustom(name: String, options: CloseShape, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  object GroundBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "GroundBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "GroundBuilder.CreateGround")
    @js.native
    def CreateGround: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[Subdivisions], 
        /* scene */ js.UndefOr[Scene], 
        GroundMesh
      ] = js.native
    inline def CreateGround(name: String): GroundMesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any]).asInstanceOf[GroundMesh]
    inline def CreateGround(name: String, options: Unit, scene: Scene): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGround(name: String, options: Subdivisions): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGround(name: String, options: Subdivisions, scene: Scene): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    
    @JSImport("babylonjs/Meshes/Builders/index", "GroundBuilder.CreateGroundFromHeightMap")
    @js.native
    def CreateGroundFromHeightMap: js.Function4[
        /* name */ String, 
        /* url */ String, 
        /* options */ js.UndefOr[AlphaFilter], 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        GroundMesh
      ] = js.native
    inline def CreateGroundFromHeightMap(name: String, url: String): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGroundFromHeightMap(name: String, url: String, options: Unit, scene: Nullable[Scene]): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGroundFromHeightMap(name: String, url: String, options: AlphaFilter): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGroundFromHeightMap(name: String, url: String, options: AlphaFilter, scene: Nullable[Scene]): GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[GroundMesh]
    inline def CreateGroundFromHeightMap_=(
      x: js.Function4[
          /* name */ String, 
          /* url */ String, 
          /* options */ js.UndefOr[AlphaFilter], 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          GroundMesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGroundFromHeightMap")(x.asInstanceOf[js.Any])
    
    inline def CreateGround_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[Subdivisions], 
          /* scene */ js.UndefOr[Scene], 
          GroundMesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGround")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Builders/index", "GroundBuilder.CreateTiledGround")
    @js.native
    def CreateTiledGround: js.Function3[
        /* name */ String, 
        /* options */ Precision, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateTiledGround(name: String, options: Precision): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTiledGround(name: String, options: Precision, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTiledGround_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ Precision, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledGround")(x.asInstanceOf[js.Any])
  }
  
  object HemisphereBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "HemisphereBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "HemisphereBuilder.CreateHemisphere")
    @js.native
    def CreateHemisphere: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[Diameter], 
        /* scene */ js.UndefOr[Scene], 
        Mesh
      ] = js.native
    inline def CreateHemisphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreateHemisphere(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateHemisphere(name: String, options: Diameter): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateHemisphere(name: String, options: Diameter, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateHemisphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateHemisphere_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[Diameter], 
          /* scene */ js.UndefOr[Scene], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateHemisphere")(x.asInstanceOf[js.Any])
  }
  
  object IcoSphereBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "IcoSphereBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "IcoSphereBuilder.CreateIcoSphere")
    @js.native
    def CreateIcoSphere: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[Flat], 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateIcoSphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreateIcoSphere(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateIcoSphere(name: String, options: Flat): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateIcoSphere(name: String, options: Flat, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateIcoSphere_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[Flat], 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateIcoSphere")(x.asInstanceOf[js.Any])
  }
  
  object LatheBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "LatheBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "LatheBuilder.CreateLathe")
    @js.native
    def CreateLathe: js.Function3[/* name */ String, /* options */ Clip, /* scene */ js.UndefOr[Nullable[Scene]], Mesh] = js.native
    inline def CreateLathe(name: String, options: Clip): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateLathe(name: String, options: Clip, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateLathe_=(
      x: js.Function3[/* name */ String, /* options */ Clip, /* scene */ js.UndefOr[Nullable[Scene]], Mesh]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLathe")(x.asInstanceOf[js.Any])
  }
  
  object LinesBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "LinesBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "LinesBuilder.CreateDashedLines")
    @js.native
    def CreateDashedLines: js.Function3[
        /* name */ String, 
        /* options */ DashNb, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        LinesMesh
      ] = js.native
    inline def CreateDashedLines(name: String, options: DashNb): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
    inline def CreateDashedLines(name: String, options: DashNb, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
    inline def CreateDashedLines_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ DashNb, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          LinesMesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDashedLines")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Builders/index", "LinesBuilder.CreateLineSystem")
    @js.native
    def CreateLineSystem: js.Function3[/* name */ String, /* options */ Colors, /* scene */ Nullable[Scene], LinesMesh] = js.native
    inline def CreateLineSystem(name: String, options: Colors, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
    inline def CreateLineSystem_=(x: js.Function3[/* name */ String, /* options */ Colors, /* scene */ Nullable[Scene], LinesMesh]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLineSystem")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/Builders/index", "LinesBuilder.CreateLines")
    @js.native
    def CreateLines: js.Function3[
        /* name */ String, 
        /* options */ Instance, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        LinesMesh
      ] = js.native
    inline def CreateLines(name: String, options: Instance): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
    inline def CreateLines(name: String, options: Instance, scene: Nullable[Scene]): LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[LinesMesh]
    inline def CreateLines_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ Instance, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          LinesMesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLines")(x.asInstanceOf[js.Any])
  }
  
  object PlaneBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "PlaneBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "PlaneBuilder.CreatePlane")
    @js.native
    def CreatePlane: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[SideOrientation], 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreatePlane(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreatePlane(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreatePlane(name: String, options: SideOrientation): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreatePlane(name: String, options: SideOrientation, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreatePlane_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[SideOrientation], 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePlane")(x.asInstanceOf[js.Any])
  }
  
  object PolygonBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "PolygonBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "PolygonBuilder.CreatePolygon")
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
    
    @JSImport("babylonjs/Meshes/Builders/index", "PolygonBuilder.ExtrudePolygon")
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
  
  object PolyhedronBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "PolyhedronBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "PolyhedronBuilder.CreatePolyhedron")
    @js.native
    def CreatePolyhedron: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[Custom], 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreatePolyhedron(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreatePolyhedron(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreatePolyhedron(name: String, options: Custom): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreatePolyhedron(name: String, options: Custom, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreatePolyhedron_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[Custom], 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePolyhedron")(x.asInstanceOf[js.Any])
  }
  
  object RibbonBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "RibbonBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "RibbonBuilder.CreateRibbon")
    @js.native
    def CreateRibbon: js.Function3[
        /* name */ String, 
        /* options */ CloseArray, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateRibbon(name: String, options: CloseArray): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateRibbon(name: String, options: CloseArray, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateRibbon_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ CloseArray, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateRibbon")(x.asInstanceOf[js.Any])
  }
  
  object ShapeBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "ShapeBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "ShapeBuilder.ExtrudeShape")
    @js.native
    def ExtrudeShape: js.Function3[
        /* name */ String, 
        /* options */ AdjustFrame, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def ExtrudeShape(name: String, options: AdjustFrame): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def ExtrudeShape(name: String, options: AdjustFrame, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    
    @JSImport("babylonjs/Meshes/Builders/index", "ShapeBuilder.ExtrudeShapeCustom")
    @js.native
    def ExtrudeShapeCustom: js.Function3[
        /* name */ String, 
        /* options */ CloseShape, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def ExtrudeShapeCustom(name: String, options: CloseShape): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def ExtrudeShapeCustom(name: String, options: CloseShape, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def ExtrudeShapeCustom_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ CloseShape, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudeShapeCustom")(x.asInstanceOf[js.Any])
    
    inline def ExtrudeShape_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ AdjustFrame, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudeShape")(x.asInstanceOf[js.Any])
  }
  
  object SphereBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "SphereBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "SphereBuilder.CreateSphere")
    @js.native
    def CreateSphere: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[DiameterX], 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateSphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreateSphere(name: String, options: Unit, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateSphere(name: String, options: DiameterX): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateSphere(name: String, options: DiameterX, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateSphere_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[DiameterX], 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateSphere")(x.asInstanceOf[js.Any])
  }
  
  object TiledBoxBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "TiledBoxBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "TiledBoxBuilder.CreateTiledBox")
    @js.native
    def CreateTiledBox: js.Function3[
        /* name */ String, 
        /* options */ AlignHorizontal, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateTiledBox(name: String, options: AlignHorizontal): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTiledBox(name: String, options: AlignHorizontal, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTiledBox_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ AlignHorizontal, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledBox")(x.asInstanceOf[js.Any])
  }
  
  object TiledPlaneBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "TiledPlaneBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "TiledPlaneBuilder.CreateTiledPlane")
    @js.native
    def CreateTiledPlane: js.Function3[
        /* name */ String, 
        /* options */ Pattern, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateTiledPlane(name: String, options: Pattern): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTiledPlane(name: String, options: Pattern, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTiledPlane_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ Pattern, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledPlane")(x.asInstanceOf[js.Any])
  }
  
  object TorusBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "TorusBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "TorusBuilder.CreateTorus")
    @js.native
    def CreateTorus: js.Function3[
        /* name */ String, 
        /* options */ js.UndefOr[Tessellation], 
        /* scene */ js.UndefOr[Scene], 
        Mesh
      ] = js.native
    inline def CreateTorus(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreateTorus(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTorus(name: String, options: Tessellation): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTorus(name: String, options: Tessellation, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTorus_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ js.UndefOr[Tessellation], 
          /* scene */ js.UndefOr[Scene], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorus")(x.asInstanceOf[js.Any])
  }
  
  object TorusKnotBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "TorusKnotBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "TorusKnotBuilder.CreateTorusKnot")
    @js.native
    def CreateTorusKnot: js.Function3[/* name */ String, /* options */ js.UndefOr[P], /* scene */ js.UndefOr[Scene], Mesh] = js.native
    inline def CreateTorusKnot(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
    inline def CreateTorusKnot(name: String, options: Unit, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTorusKnot(name: String, options: P): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTorusKnot(name: String, options: P, scene: Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTorusKnot_=(
      x: js.Function3[/* name */ String, /* options */ js.UndefOr[P], /* scene */ js.UndefOr[Scene], Mesh]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorusKnot")(x.asInstanceOf[js.Any])
  }
  
  object TubeBuilder {
    
    @JSImport("babylonjs/Meshes/Builders/index", "TubeBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Meshes/Builders/index", "TubeBuilder.CreateTube")
    @js.native
    def CreateTube: js.Function3[
        /* name */ String, 
        /* options */ InvertUV, 
        /* scene */ js.UndefOr[Nullable[Scene]], 
        Mesh
      ] = js.native
    inline def CreateTube(name: String, options: InvertUV): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTube(name: String, options: InvertUV, scene: Nullable[Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
    inline def CreateTube_=(
      x: js.Function3[
          /* name */ String, 
          /* options */ InvertUV, 
          /* scene */ js.UndefOr[Nullable[Scene]], 
          Mesh
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTube")(x.asInstanceOf[js.Any])
  }
}
