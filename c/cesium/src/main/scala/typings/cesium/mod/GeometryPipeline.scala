package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeometryPipeline {
  
  @JSImport("cesium", "GeometryPipeline.compressVertices")
  @js.native
  def compressVertices(geometry: Geometry): Geometry = js.native
  
  @JSImport("cesium", "GeometryPipeline.computeBinormalAndTangent")
  @js.native
  def computeBinormalAndTangent(geometry: Geometry): Geometry = js.native
  
  @JSImport("cesium", "GeometryPipeline.computeNormal")
  @js.native
  def computeNormal(geometry: Geometry): Geometry = js.native
  
  @JSImport("cesium", "GeometryPipeline.createAttributeLocations")
  @js.native
  def createAttributeLocations(geometry: Geometry): js.Any = js.native
  
  @JSImport("cesium", "GeometryPipeline.createLineSegmentsForVectors")
  @js.native
  def createLineSegmentsForVectors(geometry: Geometry): Geometry = js.native
  @JSImport("cesium", "GeometryPipeline.createLineSegmentsForVectors")
  @js.native
  def createLineSegmentsForVectors(geometry: Geometry, attributeName: js.UndefOr[scala.Nothing], length: Double): Geometry = js.native
  @JSImport("cesium", "GeometryPipeline.createLineSegmentsForVectors")
  @js.native
  def createLineSegmentsForVectors(geometry: Geometry, attributeName: String): Geometry = js.native
  @JSImport("cesium", "GeometryPipeline.createLineSegmentsForVectors")
  @js.native
  def createLineSegmentsForVectors(geometry: Geometry, attributeName: String, length: Double): Geometry = js.native
  
  @JSImport("cesium", "GeometryPipeline.encodeAttribute")
  @js.native
  def encodeAttribute(geometry: Geometry, attributeName: String, attributeHighName: String, attributeLowName: String): Geometry = js.native
  
  @JSImport("cesium", "GeometryPipeline.fitToUnsignedShortIndices")
  @js.native
  def fitToUnsignedShortIndices(geometry: Geometry): js.Array[Geometry] = js.native
  
  @JSImport("cesium", "GeometryPipeline.projectTo2D")
  @js.native
  def projectTo2D(geometry: Geometry, attributeName: String, attributeName3D: String, attributeName2D: String): Geometry = js.native
  @JSImport("cesium", "GeometryPipeline.projectTo2D")
  @js.native
  def projectTo2D(
    geometry: Geometry,
    attributeName: String,
    attributeName3D: String,
    attributeName2D: String,
    projection: js.Any
  ): Geometry = js.native
  
  @JSImport("cesium", "GeometryPipeline.reorderForPostVertexCache")
  @js.native
  def reorderForPostVertexCache(geometry: Geometry): Geometry = js.native
  @JSImport("cesium", "GeometryPipeline.reorderForPostVertexCache")
  @js.native
  def reorderForPostVertexCache(geometry: Geometry, cacheCapacity: Double): Geometry = js.native
  
  @JSImport("cesium", "GeometryPipeline.reorderForPreVertexCache")
  @js.native
  def reorderForPreVertexCache(geometry: Geometry): Geometry = js.native
  
  @JSImport("cesium", "GeometryPipeline.toWireframe")
  @js.native
  def toWireframe(geometry: Geometry): Geometry = js.native
  
  @JSImport("cesium", "GeometryPipeline.transformToWorldCoordinates")
  @js.native
  def transformToWorldCoordinates(instance: GeometryInstance): GeometryInstance = js.native
}
