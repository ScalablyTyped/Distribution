package typings.babylonjs

import typings.babylonjs.anon.AlignHorizontal
import typings.babylonjs.anon.AlignVertical
import typings.babylonjs.anon.AlphaFilter
import typings.babylonjs.anon.Arc
import typings.babylonjs.anon.BInfo
import typings.babylonjs.anon.BackUVs
import typings.babylonjs.anon.Colors
import typings.babylonjs.anon.Custom
import typings.babylonjs.anon.DashNb
import typings.babylonjs.anon.Depth
import typings.babylonjs.anon.Diameter
import typings.babylonjs.anon.Flat
import typings.babylonjs.anon.FrontUVs
import typings.babylonjs.anon.P
import typings.babylonjs.anon.Precision
import typings.babylonjs.anon.Radius
import typings.babylonjs.anon.SideOrientation
import typings.babylonjs.anon.Subdivisions
import typings.babylonjs.anon.Transform
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector4
import typings.babylonjs.meshesBuildersCapsuleBuilderMod.ICreateCapsuleOptions
import typings.babylonjs.meshesGeometryMod.Geometry
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.miscCoroutineMod.Coroutine
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meshesMeshDotvertexDataMod {
  
  @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData")
  @js.native
  open class VertexData () extends StObject {
    
    /* private */ val _applyTo: Any = js.native
    
    /**
      * @internal
      */
    def _applyToCoroutine(meshOrGeometry: IGetSetVerticesData, updatable: Boolean, isAsync: Boolean): Coroutine[VertexData] = js.native
    def _applyToCoroutine(meshOrGeometry: IGetSetVerticesData, updatable: Unit, isAsync: Boolean): Coroutine[VertexData] = js.native
    
    def _mergeCoroutine(
      transform: Unit,
      vertexDatas: js.Array[Transform],
      use32BitsIndices: Boolean,
      isAsync: Boolean,
      forceCloneIndices: Boolean
    ): Coroutine[VertexData] = js.native
    def _mergeCoroutine(
      transform: Unit,
      vertexDatas: js.Array[Transform],
      use32BitsIndices: Unit,
      isAsync: Boolean,
      forceCloneIndices: Boolean
    ): Coroutine[VertexData] = js.native
    /**
      * @internal
      */
    def _mergeCoroutine(
      transform: Matrix,
      vertexDatas: js.Array[Transform],
      use32BitsIndices: Boolean,
      isAsync: Boolean,
      forceCloneIndices: Boolean
    ): Coroutine[VertexData] = js.native
    def _mergeCoroutine(
      transform: Matrix,
      vertexDatas: js.Array[Transform],
      use32BitsIndices: Unit,
      isAsync: Boolean,
      forceCloneIndices: Boolean
    ): Coroutine[VertexData] = js.native
    
    /* private */ var _update: Any = js.native
    
    /* private */ var _validate: Any = js.native
    
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
    
    def merge(others: js.Array[VertexData]): VertexData = js.native
    def merge(others: js.Array[VertexData], use32BitsIndices: Boolean): VertexData = js.native
    def merge(others: js.Array[VertexData], use32BitsIndices: Boolean, forceCloneIndices: Boolean): VertexData = js.native
    def merge(others: js.Array[VertexData], use32BitsIndices: Unit, forceCloneIndices: Boolean): VertexData = js.native
    /**
      * Merges the passed VertexData into the current one
      * @param others the VertexData to be merged into the current one
      * @param use32BitsIndices defines a boolean indicating if indices must be store in a 32 bits array
      * @param forceCloneIndices defines a boolean indicating if indices are forced to be cloned
      * @returns the modified VertexData
      */
    def merge(others: VertexData): VertexData = js.native
    def merge(others: VertexData, use32BitsIndices: Boolean): VertexData = js.native
    def merge(others: VertexData, use32BitsIndices: Boolean, forceCloneIndices: Boolean): VertexData = js.native
    def merge(others: VertexData, use32BitsIndices: Unit, forceCloneIndices: Boolean): VertexData = js.native
    
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
    def serialize(): Any = js.native
    
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
      * @returns VertexData.
      */
    def updateGeometry(geometry: Geometry): VertexData = js.native
    
    /**
      * Updates the associated mesh
      * @param mesh the mesh to be updated
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
      * * subDiv : optional partitioning data about subdivisions on  each axis (int), required for facetPartitioning computation
      * * useRightHandedSystem: optional boolean to for right handed system computation
      * * depthSort : optional boolean to enable the facet depth sort computation
      * * distanceTo : optional Vector3 to compute the facet depth from this location
      * * depthSortedFacets : optional array of depthSortedFacets to store the facet distances from the reference location
      * @param options.facetNormals
      * @param options.facetPositions
      * @param options.facetPartitioning
      * @param options.ratio
      * @param options.bInfo
      * @param options.bbSize
      * @param options.subDiv
      * @param options.useRightHandedSystem
      * @param options.depthSort
      * @param options.distanceTo
      * @param options.depthSortedFacets
      */
    inline def ComputeNormals(positions: Any, indices: Any, normals: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ComputeNormals")(positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], normals.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def ComputeNormals(positions: Any, indices: Any, normals: Any, options: BInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ComputeNormals")(positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], normals.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
      * @param options.size
      * @param options.width
      * @param options.height
      * @param options.depth
      * @param options.faceUV
      * @param options.faceColors
      * @param options.sideOrientation
      * @param options.frontUVs
      * @param options.backUVs
      * @returns the VertexData of the box
      * @deprecated Please use CreateBoxVertexData from the BoxBuilder file instead
      */
    inline def CreateBox(options: Depth): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
    /**
      * Creates the VertexData for a Capsule, inspired from https://github.com/maximeq/three-js-capsule-geometry/blob/master/src/CapsuleBufferGeometry.js
      * @param options an object used to set the following optional parameters for the capsule, required but can be empty
      * @returns the VertexData of the Capsule
      * @deprecated Please use CreateCapsuleVertexData from the capsuleBuilder file instead
      */
    inline def CreateCapsule(): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")().asInstanceOf[VertexData]
    inline def CreateCapsule(options: ICreateCapsuleOptions): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
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
      * * hasRings when true makes each subdivision independently treated as a face for faceUV and faceColors, optional, default false
      * * enclose when true closes an open cylinder by adding extra flat faces between the height axis and vertical edges, think cut cake
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @param options.height
      * @param options.diameterTop
      * @param options.diameterBottom
      * @param options.diameter
      * @param options.tessellation
      * @param options.subdivisions
      * @param options.arc
      * @param options.faceColors
      * @param options.faceUV
      * @param options.hasRings
      * @param options.enclose
      * @param options.sideOrientation
      * @param options.frontUVs
      * @param options.backUVs
      * @returns the VertexData of the cylinder, cone or prism
      * @deprecated please use CreateCylinderVertexData instead
      */
    inline def CreateCylinder(options: Diameter): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
    /**
      * Create the VertexData for a DashedLines
      * @param options an object used to set the following optional parameters for the DashedLines, required but can be empty
      *  - points an array successive Vector3
      *  - dashSize the size of the dashes relative to the dash number, optional, default 3
      *  - gapSize the size of the gap between two successive dashes relative to the dash number, optional, default 1
      *  - dashNb the intended total number of dashes, optional, default 200
      * @param options.points
      * @param options.dashSize
      * @param options.gapSize
      * @param options.dashNb
      * @returns the VertexData for the DashedLines
      * @deprecated use CreateDashedLinesVertexData instead
      */
    inline def CreateDashedLines(options: DashNb): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
    /**
      * Creates the VertexData of the Disc or regular Polygon
      * @param options an object used to set the following optional parameters for the disc, required but can be empty
      * * radius the radius of the disc, optional default 0.5
      * * tessellation the number of polygon sides, optional, default 64
      * * arc a number from 0 to 1, to create an unclosed polygon based on the fraction of the circumference given by the arc value, optional, default 1
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @param options.radius
      * @param options.tessellation
      * @param options.arc
      * @param options.sideOrientation
      * @param options.frontUVs
      * @param options.backUVs
      * @returns the VertexData of the box
      * @deprecated use CreateDiscVertexData instead
      */
    inline def CreateDisc(options: Radius): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
    /**
      * Creates the VertexData for a Ground
      * @param options an object used to set the following optional parameters for the Ground, required but can be empty
      *  - width the width (x direction) of the ground, optional, default 1
      *  - height the height (z direction) of the ground, optional, default 1
      *  - subdivisions the number of subdivisions per side, optional, default 1
      * @param options.width
      * @param options.height
      * @param options.subdivisions
      * @param options.subdivisionsX
      * @param options.subdivisionsY
      * @returns the VertexData of the Ground
      * @deprecated Please use CreateGroundVertexData instead
      */
    inline def CreateGround(options: Subdivisions): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
    /**
      * Creates the VertexData of the Ground designed from a heightmap
      * @param options an object used to set the following parameters for the Ground, required and provided by CreateGroundFromHeightMap
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
      * @param options.width
      * @param options.height
      * @param options.subdivisions
      * @param options.minHeight
      * @param options.maxHeight
      * @param options.colorFilter
      * @param options.buffer
      * @param options.bufferWidth
      * @param options.bufferHeight
      * @param options.alphaFilter
      * @returns the VertexData of the Ground designed from a heightmap
      * @deprecated use CreateGroundFromHeightMapVertexData instead
      */
    inline def CreateGroundFromHeightMap(options: AlphaFilter): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
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
      * @param options.radius
      * @param options.radiusX
      * @param options.radiusY
      * @param options.radiusZ
      * @param options.flat
      * @param options.subdivisions
      * @param options.sideOrientation
      * @param options.frontUVs
      * @param options.backUVs
      * @returns the VertexData of the IcoSphere
      * @deprecated use CreateIcoSphereVertexData instead
      */
    inline def CreateIcoSphere(options: Flat): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
    /**
      * Creates the VertexData of the LineSystem
      * @param options an object used to set the following optional parameters for the LineSystem, required but can be empty
      *  - lines an array of lines, each line being an array of successive Vector3
      *  - colors an array of line colors, each of the line colors being an array of successive Color4, one per line point
      * @param options.lines
      * @param options.colors
      * @returns the VertexData of the LineSystem
      * @deprecated use CreateLineSystemVertexData instead
      */
    inline def CreateLineSystem(options: Colors): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
    /**
      * Creates the VertexData for a Plane
      * @param options an object used to set the following optional parameters for the plane, required but can be empty
      * * size sets the width and height of the plane to the value of size, optional default 1
      * * width sets the width (x direction) of the plane, overwrites the width set by size, optional, default size
      * * height sets the height (y direction) of the plane, overwrites the height set by size, optional, default size
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @param options.size
      * @param options.width
      * @param options.height
      * @param options.sideOrientation
      * @param options.frontUVs
      * @param options.backUVs
      * @returns the VertexData of the box
      * @deprecated use CreatePlaneVertexData instead
      */
    inline def CreatePlane(options: SideOrientation): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
    /**
      * Creates the VertexData for an irregular Polygon in the XoZ plane using a mesh built by polygonTriangulation.build()
      * All parameters are provided by CreatePolygon as needed
      * @param polygon a mesh built from polygonTriangulation.build()
      * @param sideOrientation takes the values Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * @param fUV an array of Vector4 elements used to set different images to the top, rings and bottom respectively
      * @param fColors an array of Color3 elements used to set different colors to the top, rings and bottom respectively
      * @param frontUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * @param backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @param wrap a boolean, default false, when true and fUVs used texture is wrapped around all sides, when false texture is applied side
      * @returns the VertexData of the Polygon
      * @deprecated use CreatePolygonVertexData instead
      */
    inline def CreatePolygon(polygon: Mesh, sideOrientation: Double): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(polygon: Mesh, sideOrientation: Double, fUV: js.Array[Vector4]): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(polygon: Mesh, sideOrientation: Double, fUV: js.Array[Vector4], fColors: js.Array[Color4]): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: Unit,
      backUVs: Unit,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: Unit,
      backUVs: Vector4
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: Unit,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: Vector4
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: Unit,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: Vector4
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: Unit,
      frontUVs: Unit,
      backUVs: Unit,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: Unit,
      frontUVs: Unit,
      backUVs: Vector4
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: Unit,
      frontUVs: Unit,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(polygon: Mesh, sideOrientation: Double, fUV: js.Array[Vector4], fColors: Unit, frontUVs: Vector4): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: Unit,
      frontUVs: Vector4,
      backUVs: Unit,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: Unit,
      frontUVs: Vector4,
      backUVs: Vector4
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: js.Array[Vector4],
      fColors: Unit,
      frontUVs: Vector4,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: js.Array[Color4]): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: Unit,
      fColors: js.Array[Color4],
      frontUVs: Unit,
      backUVs: Unit,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: Unit,
      fColors: js.Array[Color4],
      frontUVs: Unit,
      backUVs: Vector4
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: Unit,
      fColors: js.Array[Color4],
      frontUVs: Unit,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: js.Array[Color4], frontUVs: Vector4): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: Unit,
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: Unit,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: Unit,
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: Vector4
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: Unit,
      fColors: js.Array[Color4],
      frontUVs: Vector4,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: Unit,
      fColors: Unit,
      frontUVs: Unit,
      backUVs: Unit,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: Unit, frontUVs: Unit, backUVs: Vector4): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: Unit,
      fColors: Unit,
      frontUVs: Unit,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(polygon: Mesh, sideOrientation: Double, fUV: Unit, fColors: Unit, frontUVs: Vector4): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: Unit,
      fColors: Unit,
      frontUVs: Vector4,
      backUVs: Unit,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: Unit,
      fColors: Unit,
      frontUVs: Vector4,
      backUVs: Vector4
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def CreatePolygon(
      polygon: Mesh,
      sideOrientation: Double,
      fUV: Unit,
      fColors: Unit,
      frontUVs: Vector4,
      backUVs: Vector4,
      wrap: Boolean
    ): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(polygon.asInstanceOf[js.Any], sideOrientation.asInstanceOf[js.Any], fUV.asInstanceOf[js.Any], fColors.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any], wrap.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    
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
      * @param options.type
      * @param options.size
      * @param options.sizeX
      * @param options.sizeY
      * @param options.sizeZ
      * @param options.custom
      * @param options.faceUV
      * @param options.faceColors
      * @param options.flat
      * @param options.sideOrientation
      * @param options.frontUVs
      * @param options.backUVs
      * @returns the VertexData of the Polyhedron
      * @deprecated use CreatePolyhedronVertexData instead
      */
    inline def CreatePolyhedron(options: Custom): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
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
      * @param options.pathArray
      * @param options.closeArray
      * @param options.closePath
      * @param options.offset
      * @param options.sideOrientation
      * @param options.frontUVs
      * @param options.backUVs
      * @param options.invertUV
      * @param options.uvs
      * @param options.colors
      * @returns the VertexData of the ribbon
      * @deprecated use CreateRibbonVertexData instead
      */
    inline def CreateRibbon(options: BackUVs): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
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
      * @param options.segments
      * @param options.diameter
      * @param options.diameterX
      * @param options.diameterY
      * @param options.diameterZ
      * @param options.arc
      * @param options.slice
      * @param options.sideOrientation
      * @param options.frontUVs
      * @param options.backUVs
      * @returns the VertexData of the ellipsoid
      * @deprecated use CreateSphereVertexData instead
      */
    inline def CreateSphere(options: Arc): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
    /**
      * Creates the VertexData for a tiled box
      * @param options an object used to set the following optional parameters for the box, required but can be empty
      * * faceTiles sets the pattern, tile size and number of tiles for a face
      * * faceUV an array of 6 Vector4 elements used to set different images to each box side
      * * faceColors an array of 6 Color3 elements used to set different colors to each box side
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * @param options.pattern
      * @param options.width
      * @param options.height
      * @param options.depth
      * @param options.tileSize
      * @param options.tileWidth
      * @param options.tileHeight
      * @param options.alignHorizontal
      * @param options.alignVertical
      * @param options.faceUV
      * @param options.faceColors
      * @param options.sideOrientation
      * @returns the VertexData of the box
      * @deprecated Please use CreateTiledBoxVertexData instead
      */
    inline def CreateTiledBox(options: AlignHorizontal): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
    /**
      * Creates the VertexData for a TiledGround by subdividing the ground into tiles
      * @param options an object used to set the following optional parameters for the Ground, required but can be empty
      * * xmin the ground minimum X coordinate, optional, default -1
      * * zmin the ground minimum Z coordinate, optional, default -1
      * * xmax the ground maximum X coordinate, optional, default 1
      * * zmax the ground maximum Z coordinate, optional, default 1
      * * subdivisions a javascript object {w: positive integer, h: positive integer}, `w` and `h` are the numbers of subdivisions on the ground width and height creating 'tiles', default {w: 6, h: 6}
      * * precision a javascript object {w: positive integer, h: positive integer}, `w` and `h` are the numbers of subdivisions on the tile width and height, default {w: 2, h: 2}
      * @param options.xmin
      * @param options.zmin
      * @param options.xmax
      * @param options.zmax
      * @param options.subdivisions
      * @param options.subdivisions.w
      * @param options.subdivisions.h
      * @param options.precision
      * @param options.precision.w
      * @param options.precision.h
      * @returns the VertexData of the TiledGround
      * @deprecated use CreateTiledGroundVertexData instead
      */
    inline def CreateTiledGround(options: Precision): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
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
      * @param options.pattern
      * @param options.tileSize
      * @param options.tileWidth
      * @param options.tileHeight
      * @param options.size
      * @param options.width
      * @param options.height
      * @param options.alignHorizontal
      * @param options.alignVertical
      * @param options.sideOrientation
      * @param options.frontUVs
      * @param options.backUVs
      * @returns the VertexData of the tiled plane
      * @deprecated use CreateTiledPlaneVertexData instead
      */
    inline def CreateTiledPlane(options: AlignVertical): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
    /**
      * Creates the VertexData for a torus
      * @param options an object used to set the following optional parameters for the box, required but can be empty
      * * diameter the diameter of the torus, optional default 1
      * * thickness the diameter of the tube forming the torus, optional default 0.5
      * * tessellation the number of prism sides, 3 for a triangular prism, optional, default 24
      * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
      * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
      * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
      * @param options.diameter
      * @param options.thickness
      * @param options.tessellation
      * @param options.sideOrientation
      * @param options.frontUVs
      * @param options.backUVs
      * @returns the VertexData of the torus
      * @deprecated use CreateTorusVertexData instead
      */
    inline def CreateTorus(options: FrontUVs): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
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
      * @param options.radius
      * @param options.tube
      * @param options.radialSegments
      * @param options.tubularSegments
      * @param options.p
      * @param options.q
      * @param options.sideOrientation
      * @param options.frontUVs
      * @param options.backUVs
      * @returns the VertexData of the Torus Knot
      * @deprecated use CreateTorusKnotVertexData instead
      */
    inline def CreateTorusKnot(options: P): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(options.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    
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
      * @param copyWhenShared defines if the VertexData must be cloned when the geometry is shared between multiple meshes, optional, default false
      * @param forceCopy indicating that the VertexData must be cloned, optional, default false
      * @returns the object VertexData associated to the passed mesh
      */
    inline def ExtractFromGeometry(geometry: Geometry): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("ExtractFromGeometry")(geometry.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    inline def ExtractFromGeometry(geometry: Geometry, copyWhenShared: Boolean): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtractFromGeometry")(geometry.asInstanceOf[js.Any], copyWhenShared.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def ExtractFromGeometry(geometry: Geometry, copyWhenShared: Boolean, forceCopy: Boolean): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtractFromGeometry")(geometry.asInstanceOf[js.Any], copyWhenShared.asInstanceOf[js.Any], forceCopy.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def ExtractFromGeometry(geometry: Geometry, copyWhenShared: Unit, forceCopy: Boolean): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtractFromGeometry")(geometry.asInstanceOf[js.Any], copyWhenShared.asInstanceOf[js.Any], forceCopy.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    
    /**
      * Extracts the vertexData from a mesh
      * @param mesh the mesh from which to extract the VertexData
      * @param copyWhenShared defines if the VertexData must be cloned when shared between multiple meshes, optional, default false
      * @param forceCopy indicating that the VertexData must be cloned, optional, default false
      * @returns the object VertexData associated to the passed mesh
      */
    inline def ExtractFromMesh(mesh: Mesh): VertexData = ^.asInstanceOf[js.Dynamic].applyDynamic("ExtractFromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[VertexData]
    inline def ExtractFromMesh(mesh: Mesh, copyWhenShared: Boolean): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtractFromMesh")(mesh.asInstanceOf[js.Any], copyWhenShared.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def ExtractFromMesh(mesh: Mesh, copyWhenShared: Boolean, forceCopy: Boolean): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtractFromMesh")(mesh.asInstanceOf[js.Any], copyWhenShared.asInstanceOf[js.Any], forceCopy.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    inline def ExtractFromMesh(mesh: Mesh, copyWhenShared: Unit, forceCopy: Boolean): VertexData = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtractFromMesh")(mesh.asInstanceOf[js.Any], copyWhenShared.asInstanceOf[js.Any], forceCopy.asInstanceOf[js.Any])).asInstanceOf[VertexData]
    
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
    inline def ImportVertexData(parsedVertexData: Any, geometry: Geometry): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ImportVertexData")(parsedVertexData.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @internal
      */
    inline def _ComputeSides(
      sideOrientation: Double,
      positions: FloatArray,
      indices: FloatArray | IndicesArray,
      normals: FloatArray,
      uvs: FloatArray
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ComputeSides")(sideOrientation.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], normals.asInstanceOf[js.Any], uvs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _ComputeSides(
      sideOrientation: Double,
      positions: FloatArray,
      indices: FloatArray | IndicesArray,
      normals: FloatArray,
      uvs: FloatArray,
      frontUVs: Unit,
      backUVs: Vector4
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ComputeSides")(sideOrientation.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], normals.asInstanceOf[js.Any], uvs.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _ComputeSides(
      sideOrientation: Double,
      positions: FloatArray,
      indices: FloatArray | IndicesArray,
      normals: FloatArray,
      uvs: FloatArray,
      frontUVs: Vector4
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ComputeSides")(sideOrientation.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], normals.asInstanceOf[js.Any], uvs.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def _ComputeSides(
      sideOrientation: Double,
      positions: FloatArray,
      indices: FloatArray | IndicesArray,
      normals: FloatArray,
      uvs: FloatArray,
      frontUVs: Vector4,
      backUVs: Vector4
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_ComputeSides")(sideOrientation.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], normals.asInstanceOf[js.Any], uvs.asInstanceOf[js.Any], frontUVs.asInstanceOf[js.Any], backUVs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData._ExtractFrom")
    @js.native
    def _ExtractFrom: Any = js.native
    inline def _ExtractFrom_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ExtractFrom")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData._FlipFaces")
    @js.native
    def _FlipFaces: Any = js.native
    inline def _FlipFaces_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FlipFaces")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData._MergeElement")
    @js.native
    def _MergeElement: Any = js.native
    inline def _MergeElement_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_MergeElement")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData._TransformVector3Coordinates")
    @js.native
    def _TransformVector3Coordinates: Any = js.native
    inline def _TransformVector3Coordinates_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TransformVector3Coordinates")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData._TransformVector3Normals")
    @js.native
    def _TransformVector3Normals: Any = js.native
    inline def _TransformVector3Normals_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TransformVector3Normals")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Meshes/mesh.vertexData", "VertexData._TransformVector4Normals")
    @js.native
    def _TransformVector4Normals: Any = js.native
    inline def _TransformVector4Normals_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TransformVector4Normals")(x.asInstanceOf[js.Any])
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
    def getIndices(copyWhenShared: Boolean): Nullable[IndicesArray] = js.native
    def getIndices(copyWhenShared: Boolean, forceCopy: Boolean): Nullable[IndicesArray] = js.native
    def getIndices(copyWhenShared: Unit, forceCopy: Boolean): Nullable[IndicesArray] = js.native
    
    /**
      * Gets a specific vertex data attached to this geometry. Float data is constructed if the vertex buffer data cannot be returned directly.
      * @param kind defines the data kind (Position, normal, etc...)
      * @param copyWhenShared defines if the returned array must be cloned upon returning it if the current geometry is shared between multiple meshes
      * @param forceCopy defines a boolean indicating that the returned array must be cloned upon returning it
      * @returns a float array containing vertex data
      */
    def getVerticesData(kind: String): Nullable[FloatArray] = js.native
    def getVerticesData(kind: String, copyWhenShared: Boolean): Nullable[FloatArray] = js.native
    def getVerticesData(kind: String, copyWhenShared: Boolean, forceCopy: Boolean): Nullable[FloatArray] = js.native
    def getVerticesData(kind: String, copyWhenShared: Unit, forceCopy: Boolean): Nullable[FloatArray] = js.native
    
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
    def updateVerticesData(kind: String, data: FloatArray, updateExtends: Boolean): Unit = js.native
    def updateVerticesData(kind: String, data: FloatArray, updateExtends: Boolean, makeItUnique: Boolean): Unit = js.native
    def updateVerticesData(kind: String, data: FloatArray, updateExtends: Unit, makeItUnique: Boolean): Unit = js.native
  }
}
