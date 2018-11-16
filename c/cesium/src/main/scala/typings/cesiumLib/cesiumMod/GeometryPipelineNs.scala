package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GeometryPipeline")
@js.native
object GeometryPipelineNs extends js.Object {
  def compressVertices(geometry: cesiumLib.cesiumMod.CesiumNs.Geometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def computeBinormalAndTangent(geometry: cesiumLib.cesiumMod.CesiumNs.Geometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def computeNormal(geometry: cesiumLib.cesiumMod.CesiumNs.Geometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def createAttributeLocations(geometry: cesiumLib.cesiumMod.CesiumNs.Geometry): js.Any = js.native
  def createLineSegmentsForVectors(geometry: cesiumLib.cesiumMod.CesiumNs.Geometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def createLineSegmentsForVectors(geometry: cesiumLib.cesiumMod.CesiumNs.Geometry, attributeName: java.lang.String): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def createLineSegmentsForVectors(
    geometry: cesiumLib.cesiumMod.CesiumNs.Geometry,
    attributeName: java.lang.String,
    length: scala.Double
  ): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def encodeAttribute(
    geometry: cesiumLib.cesiumMod.CesiumNs.Geometry,
    attributeName: java.lang.String,
    attributeHighName: java.lang.String,
    attributeLowName: java.lang.String
  ): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def fitToUnsignedShortIndices(geometry: cesiumLib.cesiumMod.CesiumNs.Geometry): js.Array[cesiumLib.cesiumMod.CesiumNs.Geometry] = js.native
  def projectTo2D(
    geometry: cesiumLib.cesiumMod.CesiumNs.Geometry,
    attributeName: java.lang.String,
    attributeName3D: java.lang.String,
    attributeName2D: java.lang.String
  ): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def projectTo2D(
    geometry: cesiumLib.cesiumMod.CesiumNs.Geometry,
    attributeName: java.lang.String,
    attributeName3D: java.lang.String,
    attributeName2D: java.lang.String,
    projection: js.Any
  ): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def reorderForPostVertexCache(geometry: cesiumLib.cesiumMod.CesiumNs.Geometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def reorderForPostVertexCache(geometry: cesiumLib.cesiumMod.CesiumNs.Geometry, cacheCapacity: scala.Double): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def reorderForPreVertexCache(geometry: cesiumLib.cesiumMod.CesiumNs.Geometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def toWireframe(geometry: cesiumLib.cesiumMod.CesiumNs.Geometry): cesiumLib.cesiumMod.CesiumNs.Geometry = js.native
  def transformToWorldCoordinates(instance: cesiumLib.cesiumMod.CesiumNs.GeometryInstance): cesiumLib.cesiumMod.CesiumNs.GeometryInstance = js.native
}

