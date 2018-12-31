package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class contains the various kinds of data on every vertex of a mesh used in determining its shape and appearance
  */
@JSImport("babylonjs", "VertexData")
@js.native
class VertexData ()
  extends babylonjsLib.BABYLONNs.VertexData

/**
  * This class contains the various kinds of data on every vertex of a mesh used in determining its shape and appearance
  */
@JSImport("babylonjs", "VertexData")
@js.native
object VertexData extends js.Object {
  var _ComputeSides: js.Any = js.native
  var _ExtractFrom: js.Any = js.native
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
  def ComputeNormals(positions: js.Any, indices: js.Any, normals: js.Any): scala.Unit = js.native
  def ComputeNormals(
    positions: js.Any,
    indices: js.Any,
    normals: js.Any,
    options: babylonjsLib.Anon_UseRightHandedSystem
  ): scala.Unit = js.native
  /**
    * Creates the VertexData for a box
    * @param options an object used to set the following optional parameters for the box, required but can be empty
    * * size sets the width, height and depth of the box to the value of size, optional default 1
    * * width sets the width (x direction) of the box, overwrites the width set by size, optional, default size
    * * height sets the height (y direction) of the box, overwrites the height set by size, optional, default size
    * * depth sets the depth (z direction) of the box, overwrites the depth set by size, optional, default size
    * * faceUV an array of 6 Vector4 elements used to set different images to each box side
    * * faceColors an array of 6 Color3 elements used to set different colors to each box side
    * * sideOrientation optional and takes the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the box
    */
  def CreateBox(options: babylonjsLib.Anon_SizeFaceColors): babylonjsLib.BABYLONNs.VertexData = js.native
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
    * * sideOrientation optional and takes the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the cylinder, cone or prism
    */
  def CreateCylinder(options: babylonjsLib.Anon_SubdivisionsTessellationFaceColors): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Create the VertexData for a DashedLines
    * @param options an object used to set the following optional parameters for the DashedLines, required but can be empty
    *  - points an array successive Vector3
    *  - dashSize the size of the dashes relative to the dash number, optional, default 3
    *  - gapSize the size of the gap between two successive dashes relative to the dash number, optional, default 1
    *  - dashNb the intended total number of dashes, optional, default 200
    * @returns the VertexData for the DashedLines
    */
  def CreateDashedLines(options: babylonjsLib.Anon_Points): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Creates the VertexData of the Disc or regular Polygon
    * @param options an object used to set the following optional parameters for the disc, required but can be empty
    * * radius the radius of the disc, optional default 0.5
    * * tessellation the number of polygon sides, optional, default 64
    * * arc a number from 0 to 1, to create an unclosed polygon based on the fraction of the circumference given by the arc value, optional, default 1
    * * sideOrientation optional and takes the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the box
    */
  def CreateDisc(options: babylonjsLib.Anon_TessellationFrontUVsRadius): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Creates the VertexData for a Ground
    * @param options an object used to set the following optional parameters for the Ground, required but can be empty
    *  - width the width (x direction) of the ground, optional, default 1
    *  - height the height (z direction) of the ground, optional, default 1
    *  - subdivisions the number of subdivisions per side, optional, default 1
    * @returns the VertexData of the Ground
    */
  def CreateGround(options: babylonjsLib.Anon_SubdivisionsHeightSubdivisionsX): babylonjsLib.BABYLONNs.VertexData = js.native
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
  def CreateGroundFromHeightMap(options: babylonjsLib.Anon_MinHeightSubdivisions): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Creates the VertexData of the IcoSphere
    * @param options an object used to set the following optional parameters for the IcoSphere, required but can be empty
    * * radius the radius of the IcoSphere, optional default 1
    * * radiusX allows stretching in the x direction, optional, default radius
    * * radiusY allows stretching in the y direction, optional, default radius
    * * radiusZ allows stretching in the z direction, optional, default radius
    * * flat when true creates a flat shaded mesh, optional, default true
    * * subdivisions increasing the subdivisions increases the number of faces, optional, default 4
    * * sideOrientation optional and takes the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the IcoSphere
    */
  def CreateIcoSphere(options: babylonjsLib.Anon_SubdivisionsRadiusXFlat): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Creates the VertexData of the LineSystem
    * @param options an object used to set the following optional parameters for the LineSystem, required but can be empty
    *  - lines an array of lines, each line being an array of successive Vector3
    *  - colors an array of line colors, each of the line colors being an array of successive Color4, one per line point
    * @returns the VertexData of the LineSystem
    */
  def CreateLineSystem(options: babylonjsLib.Anon_Lines): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Creates the VertexData for a Plane
    * @param options an object used to set the following optional parameters for the plane, required but can be empty
    * * size sets the width and height of the plane to the value of size, optional default 1
    * * width sets the width (x direction) of the plane, overwrites the width set by size, optional, default size
    * * height sets the height (y direction) of the plane, overwrites the height set by size, optional, default size
    * * sideOrientation optional and takes the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the box
    */
  def CreatePlane(options: babylonjsLib.Anon_SizeHeightFrontUVs): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Creates the VertexData for an irregular Polygon in the XoZ plane using a mesh built by polygonTriangulation.build()
    * All parameters are provided by MeshBuilder.CreatePolygon as needed
    * @param polygon a mesh built from polygonTriangulation.build()
    * @param sideOrientation takes the values BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * @param fUV an array of Vector4 elements used to set different images to the top, rings and bottom respectively
    * @param fColors an array of Color3 elements used to set different colors to the top, rings and bottom respectively
    * @param frontUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * @param backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the Polygon
    */
  def CreatePolygon(polygon: babylonjsLib.BABYLONNs.Mesh, sideOrientation: scala.Double): babylonjsLib.BABYLONNs.VertexData = js.native
  def CreatePolygon(
    polygon: babylonjsLib.BABYLONNs.Mesh,
    sideOrientation: scala.Double,
    fUV: js.Array[babylonjsLib.BABYLONNs.Vector4]
  ): babylonjsLib.BABYLONNs.VertexData = js.native
  def CreatePolygon(
    polygon: babylonjsLib.BABYLONNs.Mesh,
    sideOrientation: scala.Double,
    fUV: js.Array[babylonjsLib.BABYLONNs.Vector4],
    fColors: js.Array[babylonjsLib.BABYLONNs.Color4]
  ): babylonjsLib.BABYLONNs.VertexData = js.native
  def CreatePolygon(
    polygon: babylonjsLib.BABYLONNs.Mesh,
    sideOrientation: scala.Double,
    fUV: js.Array[babylonjsLib.BABYLONNs.Vector4],
    fColors: js.Array[babylonjsLib.BABYLONNs.Color4],
    frontUVs: babylonjsLib.BABYLONNs.Vector4
  ): babylonjsLib.BABYLONNs.VertexData = js.native
  def CreatePolygon(
    polygon: babylonjsLib.BABYLONNs.Mesh,
    sideOrientation: scala.Double,
    fUV: js.Array[babylonjsLib.BABYLONNs.Vector4],
    fColors: js.Array[babylonjsLib.BABYLONNs.Color4],
    frontUVs: babylonjsLib.BABYLONNs.Vector4,
    backUVs: babylonjsLib.BABYLONNs.Vector4
  ): babylonjsLib.BABYLONNs.VertexData = js.native
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
    * * sideOrientation optional and takes the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the Polyhedron
    */
  def CreatePolyhedron(options: babylonjsLib.Anon_SizeZCustomSize): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Creates the VertexData for a Ribbon
    * @param options an object used to set the following optional parameters for the ribbon, required but can be empty
    * * pathArray array of paths, each of which an array of successive Vector3
    * * closeArray creates a seam between the first and the last paths of the pathArray, optional, default false
    * * closePath creates a seam between the first and the last points of each path of the path array, optional, default false
    * * offset a positive integer, only used when pathArray contains a single path (offset = 10 means the point 1 is joined to the point 11), default rounded half size of the pathArray length
    * * sideOrientation optional and takes the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * * invertUV swaps in the U and V coordinates when applying a texture, optional, default false
    * * uvs a linear array, of length 2 * number of vertices, of custom UV values, optional
    * * colors a linear array, of length 4 * number of vertices, of custom color values, optional
    * @returns the VertexData of the ribbon
    */
  def CreateRibbon(options: babylonjsLib.Anon_UvsFrontUVs): babylonjsLib.BABYLONNs.VertexData = js.native
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
    * * sideOrientation optional and takes the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the ellipsoid
    */
  def CreateSphere(options: babylonjsLib.Anon_DiameterZFrontUVs): babylonjsLib.BABYLONNs.VertexData = js.native
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
  def CreateTiledGround(options: babylonjsLib.Anon_SubdivisionsPrecisionXmin): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Creates the VertexData for a torus
    * @param options an object used to set the following optional parameters for the box, required but can be empty
    * * diameter the diameter of the torus, optional default 1
    * * thickness the diameter of the tube forming the torus, optional default 0.5
    * * tessellation the number of prism sides, 3 for a triangular prism, optional, default 24
    * * sideOrientation optional and takes the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the torus
    */
  def CreateTorus(options: babylonjsLib.Anon_TessellationFrontUVsThickness): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Creates the VertexData for a TorusKnot
    * @param options an object used to set the following optional parameters for the TorusKnot, required but can be empty
    * * radius the radius of the torus knot, optional, default 2
    * * tube the thickness of the tube, optional, default 0.5
    * * radialSegments the number of sides on each tube segments, optional, default 32
    * * tubularSegments the number of tubes to decompose the knot into, optional, default 32
    * * p the number of windings around the z axis, optional,  default 2
    * * q the number of windings around the x axis, optional,  default 3
    * * sideOrientation optional and takes the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @returns the VertexData of the Torus Knot
    */
  def CreateTorusKnot(options: babylonjsLib.Anon_RadialSegmentsFrontUVs): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Extracts the vertexData from the geometry
    * @param geometry the geometry from which to extract the VertexData
    * @param copyWhenShared defines if the VertexData must be cloned when the geometrty is shared between multiple meshes, optional, default false
    * @param forceCopy indicating that the VertexData must be cloned, optional, default false
    * @returns the object VertexData associated to the passed mesh
    */
  def ExtractFromGeometry(geometry: babylonjsLib.BABYLONNs.Geometry): babylonjsLib.BABYLONNs.VertexData = js.native
  def ExtractFromGeometry(geometry: babylonjsLib.BABYLONNs.Geometry, copyWhenShared: scala.Boolean): babylonjsLib.BABYLONNs.VertexData = js.native
  def ExtractFromGeometry(geometry: babylonjsLib.BABYLONNs.Geometry, copyWhenShared: scala.Boolean, forceCopy: scala.Boolean): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Extracts the vertexData from a mesh
    * @param mesh the mesh from which to extract the VertexData
    * @param copyWhenShared defines if the VertexData must be cloned when shared between multiple meshes, optional, default false
    * @param forceCopy indicating that the VertexData must be cloned, optional, default false
    * @returns the object VertexData associated to the passed mesh
    */
  def ExtractFromMesh(mesh: babylonjsLib.BABYLONNs.Mesh): babylonjsLib.BABYLONNs.VertexData = js.native
  def ExtractFromMesh(mesh: babylonjsLib.BABYLONNs.Mesh, copyWhenShared: scala.Boolean): babylonjsLib.BABYLONNs.VertexData = js.native
  def ExtractFromMesh(mesh: babylonjsLib.BABYLONNs.Mesh, copyWhenShared: scala.Boolean, forceCopy: scala.Boolean): babylonjsLib.BABYLONNs.VertexData = js.native
  /**
    * Applies VertexData created from the imported parameters to the geometry
    * @param parsedVertexData the parsed data from an imported file
    * @param geometry the geometry to apply the VertexData to
    */
  def ImportVertexData(parsedVertexData: js.Any, geometry: babylonjsLib.BABYLONNs.Geometry): scala.Unit = js.native
}

