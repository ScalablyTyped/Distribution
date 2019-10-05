package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "GeometryPipeline")
@js.native
object GeometryPipeline extends js.Object {
  def compressVertices(geometry: Geometry): Geometry = js.native
  def computeBinormalAndTangent(geometry: Geometry): Geometry = js.native
  def computeNormal(geometry: Geometry): Geometry = js.native
  def createAttributeLocations(geometry: Geometry): js.Any = js.native
  def createLineSegmentsForVectors(geometry: Geometry): Geometry = js.native
  def createLineSegmentsForVectors(geometry: Geometry, attributeName: String): Geometry = js.native
  def createLineSegmentsForVectors(geometry: Geometry, attributeName: String, length: Double): Geometry = js.native
  def encodeAttribute(geometry: Geometry, attributeName: String, attributeHighName: String, attributeLowName: String): Geometry = js.native
  def fitToUnsignedShortIndices(geometry: Geometry): js.Array[Geometry] = js.native
  def projectTo2D(geometry: Geometry, attributeName: String, attributeName3D: String, attributeName2D: String): Geometry = js.native
  def projectTo2D(
    geometry: Geometry,
    attributeName: String,
    attributeName3D: String,
    attributeName2D: String,
    projection: js.Any
  ): Geometry = js.native
  def reorderForPostVertexCache(geometry: Geometry): Geometry = js.native
  def reorderForPostVertexCache(geometry: Geometry, cacheCapacity: Double): Geometry = js.native
  def reorderForPreVertexCache(geometry: Geometry): Geometry = js.native
  def toWireframe(geometry: Geometry): Geometry = js.native
  def transformToWorldCoordinates(instance: GeometryInstance): GeometryInstance = js.native
}

