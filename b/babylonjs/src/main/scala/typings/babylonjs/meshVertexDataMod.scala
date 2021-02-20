package typings.babylonjs

import typings.babylonjs.anon.AlignHorizontal
import typings.babylonjs.anon.AlignVertical
import typings.babylonjs.anon.AlphaFilter
import typings.babylonjs.anon.Arc
import typings.babylonjs.anon.BInfo
import typings.babylonjs.anon.BackUVs
import typings.babylonjs.anon.Colors
import typings.babylonjs.anon.DashNb
import typings.babylonjs.anon.Depth
import typings.babylonjs.anon.Diameter
import typings.babylonjs.anon.FaceColors
import typings.babylonjs.anon.FrontUVs
import typings.babylonjs.anon.P
import typings.babylonjs.anon.Precision
import typings.babylonjs.anon.Radius
import typings.babylonjs.anon.RadiusX
import typings.babylonjs.anon.SideOrientation
import typings.babylonjs.anon.Subdivisions
import typings.babylonjs.capsuleBuilderMod.ICreateCapsuleOptions
import typings.babylonjs.geometryMod.Geometry
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector4
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshVertexDataMod {
  
  @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData")
  @js.native
  class VertexData () extends StObject {
    
    var _applyTo: js.Any = js.native
    
    var _mergeElement: js.Any = js.native
    
    var _update: js.Any = js.native
    
    var _validate: js.Any = js.native
    
    /**
      * Associates the vertexData to the passed Geometry.
      * Sets it as updatable or not (default `false`)
      * @param geometry the geometry the vertexData is applied to
      * @param updatable when used and having the value true allows new data to update the vertexData
      * @returns VertexData
      */
    def applyToGeometry(geometry: Geometry): VertexData = js.native
    def applyToGeometry(geometry: Geometry, updatable: Boolean): VertexData = js.native
    
    /**
      * Associates the vertexData to the passed Mesh.
      * Sets it as updatable or not (default `false`)
      * @param mesh the mesh the vertexData is applied to
      * @param updatable when used and having the value true allows new data to update the vertexData
      * @returns the VertexData
      */
    def applyToMesh(mesh: Mesh): VertexData = js.native
    def applyToMesh(mesh: Mesh, updatable: Boolean): VertexData = js.native
    
    /**
      * An array of the r, g, b, a, color of each vertex  [...., r, g, b, a, .....]
      */
    var colors: Nullable[FloatArray] = js.native
    
    /**
      * An array of i, j, k the three vertex indices required for each triangular facet  [...., i, j, k .....]
      */
    var indices: Nullable[IndicesArray] = js.native
    
    /**
      * An array containing the list of indices to the array of matrices produced by bones, each vertex have up to 4 indices (8 if the matricesIndicesExtra is set).
      */
    var matricesIndices: Nullable[FloatArray] = js.native
    
    /**
      * An array extending the number of possible indices
      */
    var matricesIndicesExtra: Nullable[FloatArray] = js.native
    
    /**
      * An array containing the list of weights defining the weight of each indexed matrix in the final computation
      */
    var matricesWeights: Nullable[FloatArray] = js.native
    
    /**
      * An array extending the number of possible weights when the number of indices is extended
      */
    var matricesWeightsExtra: Nullable[FloatArray] = js.native
    
    /**
      * Merges the passed VertexData into the current one
      * @param other the VertexData to be merged into the current one
      * @param use32BitsIndices defines a boolean indicating if indices must be store in a 32 bits array
      * @returns the modified VertexData
      */
    def merge(other: VertexData): VertexData = js.native
    def merge(other: VertexData, use32BitsIndices: Boolean): VertexData = js.native
    
    /**
      * An array of the x, y, z normal vector of each vertex  [...., x, y, z, .....]
      */
    var normals: Nullable[FloatArray] = js.native
    
    /**
      * An array of the x, y, z position of each vertex  [...., x, y, z, .....]
      */
    var positions: Nullable[FloatArray] = js.native
    
    /**
      * Serializes the VertexData
      * @returns a serialized object
      */
    def serialize(): js.Any = js.native
    
    /**
      * Uses the passed data array to set the set the values for the specified kind of data
      * @param data a linear array of floating numbers
      * @param kind the type of data that is being set, eg positions, colors etc
      */
    def set(data: FloatArray, kind: String): Unit = js.native
    
    /**
      * An array of the x, y, z tangent vector of each vertex  [...., x, y, z, .....]
      */
    var tangents: Nullable[FloatArray] = js.native
    
    /**
      * Transforms each position and each normal of the vertexData according to the passed Matrix
      * @param matrix the transforming matrix
      * @returns the VertexData
      */
    def transform(matrix: Matrix): VertexData = js.native
    
    /**
      * Updates the associated geometry
      * @param geometry the geometry to be updated
      * @param updateExtends when true BoundingInfo will be renewed when and if position kind is updated, optional with default false
      * @param makeItUnique when true, and when and if position kind is updated, a new global geometry will be created from these positions and set to the mesh, optional with default false
      * @returns VertexData.
      */
    def updateGeometry(geometry: Geometry): VertexData = js.native
    
    /**
      * Updates the associated mesh
      * @param mesh the mesh to be updated
      * @param updateExtends when true the mesh BoundingInfo will be renewed when and if position kind is updated, optional with default false
      * @param makeItUnique when true, and when and if position kind is updated, a new global geometry will be  created from these positions and set to the mesh, optional with default false
      * @returns VertexData
      */
    def updateMesh(mesh: Mesh): VertexData = js.native
    
    /**
      * An array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
      */
    var uvs: Nullable[FloatArray] = js.native
    
    /**
      * A second array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
      */
    var uvs2: Nullable[FloatArray] = js.native
    
    /**
      * A third array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
      */
    var uvs3: Nullable[FloatArray] = js.native
    
    /**
      * A fourth array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
      */
    var uvs4: Nullable[FloatArray] = js.native
    
    /**
      * A fifth array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
      */
    var uvs5: Nullable[FloatArray] = js.native
    
    /**
      * A sixth array of u,v which maps a texture image onto each vertex  [...., u, v, .....]
      */
    var uvs6: Nullable[FloatArray] = js.native
  }
  /* static members */
  object VertexData {
    
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Mesh side orientation : usually the internal or back surface
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.BACKSIDE")
    @js.native
    val BACKSIDE: Double = js.native
    
    /**
      * Compute normals for given positions and indices
      * @param positions an array of vertex positions, [...., x, y, z, ......]
      * @param indices an array of indices in groups of three for each triangular facet, [...., i, j, k, ......]
      * @param normals an array of vertex normals, [...., x, y, z, ......]
      * @param options an object used to set the following optional parameters for the TorusKnot, optional
      * * facetNormals : optional array of facet normals (vector3)
      * * facetPositions : optional array of facet positions (vector3)
      * * facetPartitioning : optional partitioning array. facetPositions is required for facetPartitioning computation
      * * ratio : optional partitioning ratio / bounding box, required for facetPartitioning computation
      * * bInfo : optional bounding info, required for facetPartitioning computation
      * * bbSize : optional bounding box size data, required for facetPartitioning computation
      * * subDiv : optional partitioning data about subdivsions on  each axis (int), required for facetPartitioning computation
      * * useRightHandedSystem: optional boolean to for right handed system computation
      * * depthSort : optional boolean to enable the facet depth sort computation
      * * distanceTo : optional Vector3 to compute the facet depth from this location
      * * depthSortedFacets : optional array of depthSortedFacets to store the facet distances from the reference location
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.ComputeNormals")
    @js.native
    def ComputeNormals(positions: js.Any, indices: js.Any, normals: js.Any): Unit = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.ComputeNormals")
    @js.native
    def ComputeNormals(positions: js.Any, indices: js.Any, normals: js.Any, options: BInfo): Unit = js.native
    
    /**
      * Creates the VertexData for a box
      * @param options an object used to set the following optional parameters for the box, required but can be empty
      * * size sets the width, height and depth of the box to the value of size, optional default 1
      * * width sets the width (x direction) of the box, overwrites the width set by size, optional, default size
      * * height sets the height (y direction) of the box, overwrites the height set by size, optional, default size
      * * depth sets the depth (z direction) of the box, overwrites the depth set by size, optional, default size
      * * faceUV an array of 6 Vector4 elements used to set different images to each box side
      * * faceColors an array of 6 Color3 elements used to set different colors to each box side
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @returns the VertexData of the box
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateBox")
    @js.native
    def CreateBox(options: Depth): VertexData = js.native
    
    /**
      * Creates the VertexData for a Capsule, inspired from https://github.com/maximeq/three-js-capsule-geometry/blob/master/src/CapsuleBufferGeometry.js
      * @param options an object used to set the following optional parameters for the capsule, required but can be empty
      * @returns the VertexData of the Capsule
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateCapsule")
    @js.native
    def CreateCapsule(): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateCapsule")
    @js.native
    def CreateCapsule(options: ICreateCapsuleOptions): VertexData = js.native
    
    /**
      * Creates the VertexData for a cylinder, cone or prism
      * @param options an object used to set the following optional parameters for the box, required but can be empty
      * * height sets the height (y direction) of the cylinder, optional, default 2
      * * diameterTop sets the diameter of the top of the cone, overwrites diameter,  optional, default diameter
      * * diameterBottom sets the diameter of the bottom of the cone, overwrites diameter,  optional, default diameter
      * * diameter sets the diameter of the top and bottom of the cone, optional default 1
      * * tessellation the number of prism sides, 3 for a triangular prism, optional, default 24
      * * subdivisions` the number of rings along the cylinder height, optional, default 1
      * * arc a number from 0 to 1, to create an unclosed cylinder based on the fraction of the circumference given by the arc value, optional, default 1
      * * faceColors an array of Color3 elements used to set different colors to the top, rings and bottom respectively
      * * faceUV an array of Vector4 elements used to set different images to the top, rings and bottom respectively
      * * hasRings when true makes each subdivision independantly treated as a face for faceUV and faceColors, optional, default false
      * * enclose when true closes an open cylinder by adding extra flat faces between the height axis and vertical edges, think cut cake
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @returns the VertexData of the cylinder, cone or prism
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateCylinder")
    @js.native
    def CreateCylinder(options: Diameter): VertexData = js.native
    
    /**
      * Create the VertexData for a DashedLines
      * @param options an object used to set the following optional parameters for the DashedLines, required but can be empty
      *  - points an array successive Vector3
      *  - dashSize the size of the dashes relative to the dash number, optional, default 3
      *  - gapSize the size of the gap between two successive dashes relative to the dash number, optional, default 1
      *  - dashNb the intended total number of dashes, optional, default 200
      * @returns the VertexData for the DashedLines
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateDashedLines")
    @js.native
    def CreateDashedLines(options: DashNb): VertexData = js.native
    
    /**
      * Creates the VertexData of the Disc or regular Polygon
      * @param options an object used to set the following optional parameters for the disc, required but can be empty
      * * radius the radius of the disc, optional default 0.5
      * * tessellation the number of polygon sides, optional, default 64
      * * arc a number from 0 to 1, to create an unclosed polygon based on the fraction of the circumference given by the arc value, optional, default 1
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @returns the VertexData of the box
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateDisc")
    @js.native
    def CreateDisc(options: Radius): VertexData = js.native
    
    /**
      * Creates the VertexData for a Ground
      * @param options an object used to set the following optional parameters for the Ground, required but can be empty
      *  - width the width (x direction) of the ground, optional, default 1
      *  - height the height (z direction) of the ground, optional, default 1
      *  - subdivisions the number of subdivisions per side, optional, default 1
      * @returns the VertexData of the Ground
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateGround")
    @js.native
    def CreateGround(options: Subdivisions): VertexData = js.native
    
    /**
      * Creates the VertexData of the Ground designed from a heightmap
      * @param options an object used to set the following parameters for the Ground, required and provided by MeshBuilder.CreateGroundFromHeightMap
      * * width the width (x direction) of the ground
      * * height the height (z direction) of the ground
      * * subdivisions the number of subdivisions per side
      * * minHeight the minimum altitude on the ground, optional, default 0
      * * maxHeight the maximum altitude on the ground, optional default 1
      * * colorFilter the filter to apply to the image pixel colors to compute the height, optional Color3, default (0.3, 0.59, 0.11)
      * * buffer the array holding the image color data
      * * bufferWidth the width of image
      * * bufferHeight the height of image
      * * alphaFilter Remove any data where the alpha channel is below this value, defaults 0 (all data visible)
      * @returns the VertexData of the Ground designed from a heightmap
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateGroundFromHeightMap")
    @js.native
    def CreateGroundFromHeightMap(options: AlphaFilter): VertexData = js.native
    
    /**
      * Creates the VertexData of the IcoSphere
      * @param options an object used to set the following optional parameters for the IcoSphere, required but can be empty
      * * radius the radius of the IcoSphere, optional default 1
      * * radiusX allows stretching in the x direction, optional, default radius
      * * radiusY allows stretching in the y direction, optional, default radius
      * * radiusZ allows stretching in the z direction, optional, default radius
      * * flat when true creates a flat shaded mesh, optional, default true
      * * subdivisions increasing the subdivisions increases the number of faces, optional, default 4
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @returns the VertexData of the IcoSphere
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateIcoSphere")
    @js.native
    def CreateIcoSphere(options: RadiusX): VertexData = js.native
    
    /**
      * Creates the VertexData of the LineSystem
      * @param options an object used to set the following optional parameters for the LineSystem, required but can be empty
      *  - lines an array of lines, each line being an array of successive Vector3
      *  - colors an array of line colors, each of the line colors being an array of successive Color4, one per line point
      * @returns the VertexData of the LineSystem
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateLineSystem")
    @js.native
    def CreateLineSystem(options: Colors): VertexData = js.native
    
    /**
      * Creates the VertexData for a Plane
      * @param options an object used to set the following optional parameters for the plane, required but can be empty
      * * size sets the width and height of the plane to the value of size, optional default 1
      * * width sets the width (x direction) of the plane, overwrites the width set by size, optional, default size
      * * height sets the height (y direction) of the plane, overwrites the height set by size, optional, default size
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @returns the VertexData of the box
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePlane")
    @js.native
    def CreatePlane(options: SideOrientation): VertexData = js.native
    
    /**
      * Creates the VertexData for an irregular Polygon in the XoZ plane using a mesh built by polygonTriangulation.build()
      * All parameters are provided by MeshBuilder.CreatePolygon as needed
      * @param polygon a mesh built from polygonTriangulation.build()
      * @param sideOrientation takes the values Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * @param fUV an array of Vector4 elements used to set different images to the top, rings and bottom respectively
      * @param fColors an array of Color3 elements used to set different colors to the top, rings and bottom respectively
      * @param frontUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * @param backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @param wrap a boolean, default false, when true and fUVs used texture is wrapped around all sides, when false texture is applied side
      * @returns the VertexData of the Polygon
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(polygon: Mesh, sideOrientation: Double): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: js.UndefOr[scala.Nothing],
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: Vector4,
      backUVs: js.UndefOr[scala.Nothing],
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: Vector4,
      backUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: Vector4,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(polygon: Mesh, sideOrientation: Double, fUV: js.UndefOr[scala.Nothing], fColors: js.Array[Color4]): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.Array[Color4],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: js.UndefOr[scala.Nothing],
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.Array[Color4],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.Array[Color4],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.Array[Color4],
      frontUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: js.UndefOr[scala.Nothing],
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.UndefOr[scala.Nothing],
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(polygon: Mesh, sideOrientation: Double, fUV: js.Array[Vector4]): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: js.UndefOr[scala.Nothing],
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: Vector4,
      backUVs: js.UndefOr[scala.Nothing],
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: Vector4,
      backUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.UndefOr[scala.Nothing],
      frontUVs: Vector4,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(polygon: Mesh, sideOrientation: Double, fUV: js.Array[Vector4], fColors: js.Array[Color4]): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: js.UndefOr[scala.Nothing],
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: js.UndefOr[scala.Nothing],
      wrap: Boolean
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: Vector4
    ): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolygon")
    @js.native
    def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = js.native
    
    /**
      * Creates the VertexData for a Polyhedron
      * @param options an object used to set the following optional parameters for the polyhedron, required but can be empty
      * * type provided types are:
      *  * 0 : Tetrahedron, 1 : Octahedron, 2 : Dodecahedron, 3 : Icosahedron, 4 : Rhombicuboctahedron, 5 : Triangular Prism, 6 : Pentagonal Prism, 7 : Hexagonal Prism, 8 : Square Pyramid (J1)
      *  * 9 : Pentagonal Pyramid (J2), 10 : Triangular Dipyramid (J12), 11 : Pentagonal Dipyramid (J13), 12 : Elongated Square Dipyramid (J15), 13 : Elongated Pentagonal Dipyramid (J16), 14 : Elongated Pentagonal Cupola (J20)
      * * size the size of the IcoSphere, optional default 1
      * * sizeX allows stretching in the x direction, optional, default size
      * * sizeY allows stretching in the y direction, optional, default size
      * * sizeZ allows stretching in the z direction, optional, default size
      * * custom a number that overwrites the type to create from an extended set of polyhedron from https://www.babylonjs-playground.com/#21QRSK#15 with minimised editor
      * * faceUV an array of Vector4 elements used to set different images to the top, rings and bottom respectively
      * * faceColors an array of Color3 elements used to set different colors to the top, rings and bottom respectively
      * * flat when true creates a flat shaded mesh, optional, default true
      * * subdivisions increasing the subdivisions increases the number of faces, optional, default 4
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @returns the VertexData of the Polyhedron
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreatePolyhedron")
    @js.native
    def CreatePolyhedron(options: FaceColors): VertexData = js.native
    
    /**
      * Creates the VertexData for a Ribbon
      * @param options an object used to set the following optional parameters for the ribbon, required but can be empty
      * * pathArray array of paths, each of which an array of successive Vector3
      * * closeArray creates a seam between the first and the last paths of the pathArray, optional, default false
      * * closePath creates a seam between the first and the last points of each path of the path array, optional, default false
      * * offset a positive integer, only used when pathArray contains a single path (offset = 10 means the point 1 is joined to the point 11), default rounded half size of the pathArray length
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * * invertUV swaps in the U and V coordinates when applying a texture, optional, default false
      * * uvs a linear array, of length 2 * number of vertices, of custom UV values, optional
      * * colors a linear array, of length 4 * number of vertices, of custom color values, optional
      * @returns the VertexData of the ribbon
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateRibbon")
    @js.native
    def CreateRibbon(options: BackUVs): VertexData = js.native
    
    /**
      * Creates the VertexData for an ellipsoid, defaults to a sphere
      * @param options an object used to set the following optional parameters for the box, required but can be empty
      * * segments sets the number of horizontal strips optional, default 32
      * * diameter sets the axes dimensions, diameterX, diameterY and diameterZ to the value of diameter, optional default 1
      * * diameterX sets the diameterX (x direction) of the ellipsoid, overwrites the diameterX set by diameter, optional, default diameter
      * * diameterY sets the diameterY (y direction) of the ellipsoid, overwrites the diameterY set by diameter, optional, default diameter
      * * diameterZ sets the diameterZ (z direction) of the ellipsoid, overwrites the diameterZ set by diameter, optional, default diameter
      * * arc a number from 0 to 1, to create an unclosed ellipsoid based on the fraction of the circumference (latitude) given by the arc value, optional, default 1
      * * slice a number from 0 to 1, to create an unclosed ellipsoid based on the fraction of the height (latitude) given by the arc value, optional, default 1
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @returns the VertexData of the ellipsoid
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateSphere")
    @js.native
    def CreateSphere(options: Arc): VertexData = js.native
    
    /**
      * Creates the VertexData for a tiled box
      * @param options an object used to set the following optional parameters for the box, required but can be empty
      * * faceTiles sets the pattern, tile size and number of tiles for a face
      * * faceUV an array of 6 Vector4 elements used to set different images to each box side
      * * faceColors an array of 6 Color3 elements used to set different colors to each box side
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * @returns the VertexData of the box
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateTiledBox")
    @js.native
    def CreateTiledBox(options: AlignHorizontal): VertexData = js.native
    
    /**
      * Creates the VertexData for a TiledGround by subdividing the ground into tiles
      * @param options an object used to set the following optional parameters for the Ground, required but can be empty
      * * xmin the ground minimum X coordinate, optional, default -1
      * * zmin the ground minimum Z coordinate, optional, default -1
      * * xmax the ground maximum X coordinate, optional, default 1
      * * zmax the ground maximum Z coordinate, optional, default 1
      * * subdivisions a javascript object {w: positive integer, h: positive integer}, `w` and `h` are the numbers of subdivisions on the ground width and height creating 'tiles', default {w: 6, h: 6}
      * * precision a javascript object {w: positive integer, h: positive integer}, `w` and `h` are the numbers of subdivisions on the tile width and height, default {w: 2, h: 2}
      * @returns the VertexData of the TiledGround
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateTiledGround")
    @js.native
    def CreateTiledGround(options: Precision): VertexData = js.native
    
    /**
      * Creates the VertexData for a tiled plane
      * @param options an object used to set the following optional parameters for the box, required but can be empty
      * * pattern a limited pattern arrangement depending on the number
      * * tileSize sets the width, height and depth of the tile to the value of size, optional default 1
      * * tileWidth sets the width (x direction) of the tile, overwrites the width set by size, optional, default size
      * * tileHeight sets the height (y direction) of the tile, overwrites the height set by size, optional, default size
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @returns the VertexData of the tiled plane
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateTiledPlane")
    @js.native
    def CreateTiledPlane(options: AlignVertical): VertexData = js.native
    
    /**
      * Creates the VertexData for a torus
      * @param options an object used to set the following optional parameters for the box, required but can be empty
      * * diameter the diameter of the torus, optional default 1
      * * thickness the diameter of the tube forming the torus, optional default 0.5
      * * tessellation the number of prism sides, 3 for a triangular prism, optional, default 24
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @returns the VertexData of the torus
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateTorus")
    @js.native
    def CreateTorus(options: FrontUVs): VertexData = js.native
    
    /**
      * Creates the VertexData for a TorusKnot
      * @param options an object used to set the following optional parameters for the TorusKnot, required but can be empty
      * * radius the radius of the torus knot, optional, default 2
      * * tube the thickness of the tube, optional, default 0.5
      * * radialSegments the number of sides on each tube segments, optional, default 32
      * * tubularSegments the number of tubes to decompose the knot into, optional, default 32
      * * p the number of windings around the z axis, optional,  default 2
      * * q the number of windings around the x axis, optional,  default 3
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @returns the VertexData of the Torus Knot
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.CreateTorusKnot")
    @js.native
    def CreateTorusKnot(options: P): VertexData = js.native
    
    /**
      * Mesh side orientation : by default, `FRONTSIDE`
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.DEFAULTSIDE")
    @js.native
    val DEFAULTSIDE: Double = js.native
    
    /**
      * Mesh side orientation : both internal and external or front and back surfaces
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.DOUBLESIDE")
    @js.native
    val DOUBLESIDE: Double = js.native
    
    /**
      * Extracts the vertexData from the geometry
      * @param geometry the geometry from which to extract the VertexData
      * @param copyWhenShared defines if the VertexData must be cloned when the geometrty is shared between multiple meshes, optional, default false
      * @param forceCopy indicating that the VertexData must be cloned, optional, default false
      * @returns the object VertexData associated to the passed mesh
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.ExtractFromGeometry")
    @js.native
    def ExtractFromGeometry(geometry: Geometry): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.ExtractFromGeometry")
    @js.native
    def ExtractFromGeometry(geometry: Geometry, copyWhenShared: js.UndefOr[scala.Nothing], forceCopy: Boolean): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.ExtractFromGeometry")
    @js.native
    def ExtractFromGeometry(geometry: Geometry, copyWhenShared: Boolean): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.ExtractFromGeometry")
    @js.native
    def ExtractFromGeometry(geometry: Geometry, copyWhenShared: Boolean, forceCopy: Boolean): VertexData = js.native
    
    /**
      * Extracts the vertexData from a mesh
      * @param mesh the mesh from which to extract the VertexData
      * @param copyWhenShared defines if the VertexData must be cloned when shared between multiple meshes, optional, default false
      * @param forceCopy indicating that the VertexData must be cloned, optional, default false
      * @returns the object VertexData associated to the passed mesh
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.ExtractFromMesh")
    @js.native
    def ExtractFromMesh(mesh: Mesh): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.ExtractFromMesh")
    @js.native
    def ExtractFromMesh(mesh: Mesh, copyWhenShared: js.UndefOr[scala.Nothing], forceCopy: Boolean): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.ExtractFromMesh")
    @js.native
    def ExtractFromMesh(mesh: Mesh, copyWhenShared: Boolean): VertexData = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.ExtractFromMesh")
    @js.native
    def ExtractFromMesh(mesh: Mesh, copyWhenShared: Boolean, forceCopy: Boolean): VertexData = js.native
    
    /**
      * Mesh side orientation : usually the external or front surface
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.FRONTSIDE")
    @js.native
    val FRONTSIDE: Double = js.native
    
    /**
      * Applies VertexData created from the imported parameters to the geometry
      * @param parsedVertexData the parsed data from an imported file
      * @param geometry the geometry to apply the VertexData to
      */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData.ImportVertexData")
    @js.native
    def ImportVertexData(parsedVertexData: js.Any, geometry: Geometry): Unit = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData._ComputeSides")
    @js.native
    def _ComputeSides(
      sideOrientation: Double,
      positions: FloatArray,
      indices: FloatArray,
      normals: FloatArray,
      uvs: FloatArray
    ): Unit = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData._ComputeSides")
    @js.native
    def _ComputeSides(
      sideOrientation: Double,
      positions: FloatArray,
      indices: FloatArray,
      normals: FloatArray,
      uvs: FloatArray,
      frontUVs: js.UndefOr[scala.Nothing],
      backUVs: Vector4
    ): Unit = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData._ComputeSides")
    @js.native
    def _ComputeSides(
      sideOrientation: Double,
      positions: FloatArray,
      indices: FloatArray,
      normals: FloatArray,
      uvs: FloatArray,
      frontUVs: Vector4
    ): Unit = js.native
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData._ComputeSides")
    @js.native
    def _ComputeSides(
      sideOrientation: Double,
      positions: FloatArray,
      indices: FloatArray,
      normals: FloatArray,
      uvs: FloatArray,
      frontUVs: Vector4,
      backUVs: Vector4
    ): Unit = js.native
    
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData._ExtractFrom")
    @js.native
    def _ExtractFrom: js.Any = js.native
    @scala.inline
    def _ExtractFrom_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ExtractFrom")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IGetSetVerticesData extends StObject {
    
    /**
      * Returns an array of integers or a typed array (Int32Array, Uint32Array, Uint16Array) populated with the mesh indices.
      * @param copyWhenShared If true (default false) and and if the mesh geometry is shared among some other meshes, the returned array is a copy of the internal one.
      * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
      * @returns the indices array or an empty array if the mesh has no geometry
      */
    def getIndices(): Nullable[IndicesArray] = js.native
    def getIndices(copyWhenShared: js.UndefOr[scala.Nothing], forceCopy: Boolean): Nullable[IndicesArray] = js.native
    def getIndices(copyWhenShared: Boolean): Nullable[IndicesArray] = js.native
    def getIndices(copyWhenShared: Boolean, forceCopy: Boolean): Nullable[IndicesArray] = js.native
    
    /**
      * Gets a specific vertex data attached to this geometry. Float data is constructed if the vertex buffer data cannot be returned directly.
      * @param kind defines the data kind (Position, normal, etc...)
      * @param copyWhenShared defines if the returned array must be cloned upon returning it if the current geometry is shared between multiple meshes
      * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
      * @returns a float array containing vertex data
      */
    def getVerticesData(kind: String): Nullable[FloatArray] = js.native
    def getVerticesData(kind: String, copyWhenShared: js.UndefOr[scala.Nothing], forceCopy: Boolean): Nullable[FloatArray] = js.native
    def getVerticesData(kind: String, copyWhenShared: Boolean): Nullable[FloatArray] = js.native
    def getVerticesData(kind: String, copyWhenShared: Boolean, forceCopy: Boolean): Nullable[FloatArray] = js.native
    
    /**
      * Gets a boolean indicating if specific vertex data is present
      * @param kind defines the vertex data kind to use
      * @returns true is data kind is present
      */
    def isVerticesDataPresent(kind: String): Boolean = js.native
    
    /**
      * Creates a new index buffer
      * @param indices defines the indices to store in the index buffer
      * @param totalVertices defines the total number of vertices (could be null)
      * @param updatable defines if the index buffer must be flagged as updatable (false by default)
      */
    def setIndices(indices: IndicesArray, totalVertices: Nullable[Double]): Unit = js.native
    def setIndices(indices: IndicesArray, totalVertices: Nullable[Double], updatable: Boolean): Unit = js.native
    
    /**
      * Set specific vertex data
      * @param kind defines the data kind (Position, normal, etc...)
      * @param data defines the vertex data to use
      * @param updatable defines if the vertex must be flagged as updatable (false as default)
      * @param stride defines the stride to use (0 by default). This value is deduced from the kind value if not specified
      */
    def setVerticesData(kind: String, data: FloatArray, updatable: Boolean): Unit = js.native
    
    /**
      * Update a specific associated vertex buffer
      * @param kind defines which buffer to write to (positions, indices, normals, etc). Possible `kind` values :
      * - VertexBuffer.PositionKind
      * - VertexBuffer.UVKind
      * - VertexBuffer.UV2Kind
      * - VertexBuffer.UV3Kind
      * - VertexBuffer.UV4Kind
      * - VertexBuffer.UV5Kind
      * - VertexBuffer.UV6Kind
      * - VertexBuffer.ColorKind
      * - VertexBuffer.MatricesIndicesKind
      * - VertexBuffer.MatricesIndicesExtraKind
      * - VertexBuffer.MatricesWeightsKind
      * - VertexBuffer.MatricesWeightsExtraKind
      * @param data defines the data source
      * @param updateExtends defines if extends info of the mesh must be updated (can be null). This is mostly useful for "position" kind
      * @param makeItUnique defines if the geometry associated with the mesh must be cloned to make the change only for this mesh (and not all meshes associated with the same geometry)
      */
    def updateVerticesData(kind: String, data: FloatArray): Unit = js.native
    def updateVerticesData(kind: String, data: FloatArray, updateExtends: js.UndefOr[scala.Nothing], makeItUnique: Boolean): Unit = js.native
    def updateVerticesData(kind: String, data: FloatArray, updateExtends: Boolean): Unit = js.native
    def updateVerticesData(kind: String, data: FloatArray, updateExtends: Boolean, makeItUnique: Boolean): Unit = js.native
  }
}
