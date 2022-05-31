package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeometryPipeline {
  
  @JSGlobal("Cesium.GeometryPipeline")
  @js.native
  val ^ : js.Any = js.native
  
  inline def compressVertices(geometry: typings.cesium.mod.Geometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("compressVertices")(geometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  inline def computeBinormalAndTangent(geometry: typings.cesium.mod.Geometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("computeBinormalAndTangent")(geometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  inline def computeNormal(geometry: typings.cesium.mod.Geometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("computeNormal")(geometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  inline def createAttributeLocations(geometry: typings.cesium.mod.Geometry): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createAttributeLocations")(geometry.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def createLineSegmentsForVectors(geometry: typings.cesium.mod.Geometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  inline def createLineSegmentsForVectors(geometry: typings.cesium.mod.Geometry, attributeName: String): typings.cesium.mod.Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Geometry]
  inline def createLineSegmentsForVectors(geometry: typings.cesium.mod.Geometry, attributeName: String, length: Double): typings.cesium.mod.Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Geometry]
  inline def createLineSegmentsForVectors(geometry: typings.cesium.mod.Geometry, attributeName: Unit, length: Double): typings.cesium.mod.Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("createLineSegmentsForVectors")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Geometry]
  
  inline def encodeAttribute(
    geometry: typings.cesium.mod.Geometry,
    attributeName: String,
    attributeHighName: String,
    attributeLowName: String
  ): typings.cesium.mod.Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeAttribute")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeHighName.asInstanceOf[js.Any], attributeLowName.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Geometry]
  
  inline def fitToUnsignedShortIndices(geometry: typings.cesium.mod.Geometry): js.Array[typings.cesium.mod.Geometry] = ^.asInstanceOf[js.Dynamic].applyDynamic("fitToUnsignedShortIndices")(geometry.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.cesium.mod.Geometry]]
  
  inline def projectTo2D(
    geometry: typings.cesium.mod.Geometry,
    attributeName: String,
    attributeName3D: String,
    attributeName2D: String
  ): typings.cesium.mod.Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeName3D.asInstanceOf[js.Any], attributeName2D.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Geometry]
  inline def projectTo2D(
    geometry: typings.cesium.mod.Geometry,
    attributeName: String,
    attributeName3D: String,
    attributeName2D: String,
    projection: js.Any
  ): typings.cesium.mod.Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("projectTo2D")(geometry.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any], attributeName3D.asInstanceOf[js.Any], attributeName2D.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Geometry]
  
  inline def reorderForPostVertexCache(geometry: typings.cesium.mod.Geometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("reorderForPostVertexCache")(geometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  inline def reorderForPostVertexCache(geometry: typings.cesium.mod.Geometry, cacheCapacity: Double): typings.cesium.mod.Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("reorderForPostVertexCache")(geometry.asInstanceOf[js.Any], cacheCapacity.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Geometry]
  
  inline def reorderForPreVertexCache(geometry: typings.cesium.mod.Geometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("reorderForPreVertexCache")(geometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  inline def toWireframe(geometry: typings.cesium.mod.Geometry): typings.cesium.mod.Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("toWireframe")(geometry.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Geometry]
  
  inline def transformToWorldCoordinates(instance: typings.cesium.mod.GeometryInstance): typings.cesium.mod.GeometryInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("transformToWorldCoordinates")(instance.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.GeometryInstance]
}
