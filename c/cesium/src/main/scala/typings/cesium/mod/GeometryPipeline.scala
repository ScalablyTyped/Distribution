package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeometryPipeline {
  
  @JSImport("cesium", "GeometryPipeline")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compressVertices(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("compressVertices")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  @scala.inline
  def computeBinormalAndTangent(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("computeBinormalAndTangent")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  @scala.inline
  def computeNormal(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("computeNormal")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  @scala.inline
  def createAttributeLocations(geometry: Geometry): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAttributeLocations")(geometry.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def createLineSegmentsForVectors(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  @scala.inline
  def createLineSegmentsForVectors(geometry: Geometry, attributeName: String): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  @scala.inline
  def createLineSegmentsForVectors(geometry: Geometry, attributeName: String, length: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  @scala.inline
  def createLineSegmentsForVectors(geometry: Geometry, attributeName: Unit, length: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  
  @scala.inline
  def encodeAttribute(geometry: Geometry, attributeName: String, attributeHighName: String, attributeLowName: String): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAttribute")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeHighName.asInstanceOf[js.Any], attributeLowName.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  
  @scala.inline
  def fitToUnsignedShortIndices(geometry: Geometry): js.Array[Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("fitToUnsignedShortIndices")(geometry.asInstanceOf[js.Any]).asInstanceOf[js.Array[Geometry]]
  
  @scala.inline
  def projectTo2D(geometry: Geometry, attributeName: String, attributeName3D: String, attributeName2D: String): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeName3D.asInstanceOf[js.Any], attributeName2D.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  @scala.inline
  def projectTo2D(
    geometry: Geometry,
    attributeName: String,
    attributeName3D: String,
    attributeName2D: String,
    projection: js.Any
  ): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeName3D.asInstanceOf[js.Any], attributeName2D.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  
  @scala.inline
  def reorderForPostVertexCache(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("reorderForPostVertexCache")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  @scala.inline
  def reorderForPostVertexCache(geometry: Geometry, cacheCapacity: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderForPostVertexCache")(geometry.asInstanceOf[js.Any], cacheCapacity.asInstanceOf[js.Any])).asInstanceOf[Geometry]
  
  @scala.inline
  def reorderForPreVertexCache(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("reorderForPreVertexCache")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  @scala.inline
  def toWireframe(geometry: Geometry): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("toWireframe")(geometry.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  
  @scala.inline
  def transformToWorldCoordinates(instance: GeometryInstance): GeometryInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("transformToWorldCoordinates")(instance.asInstanceOf[js.Any]).asInstanceOf[GeometryInstance]
}
