package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Cartesian3
import typings.cesiumEngine.mod.Credit
import typings.cesiumEngine.mod.OrientedBoundingBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundingSphere extends StObject {
  
  var boundingSphere: typings.cesiumEngine.mod.BoundingSphere
  
  var childTileMask: js.UndefOr[Double] = js.undefined
  
  var createdByUpsampling: js.UndefOr[Boolean] = js.undefined
  
  var credits: js.UndefOr[js.Array[Credit]] = js.undefined
  
  var eastIndices: js.Array[Double]
  
  var eastSkirtHeight: Double
  
  var encodedNormals: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var horizonOcclusionPoint: Cartesian3
  
  var indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array
  
  var maximumHeight: Double
  
  var minimumHeight: Double
  
  var northIndices: js.Array[Double]
  
  var northSkirtHeight: Double
  
  var orientedBoundingBox: js.UndefOr[OrientedBoundingBox] = js.undefined
  
  var quantizedVertices: js.typedarray.Uint16Array
  
  var southIndices: js.Array[Double]
  
  var southSkirtHeight: Double
  
  var waterMask: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var westIndices: js.Array[Double]
  
  var westSkirtHeight: Double
}
object BoundingSphere {
  
  inline def apply(
    boundingSphere: typings.cesiumEngine.mod.BoundingSphere,
    eastIndices: js.Array[Double],
    eastSkirtHeight: Double,
    horizonOcclusionPoint: Cartesian3,
    indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array,
    maximumHeight: Double,
    minimumHeight: Double,
    northIndices: js.Array[Double],
    northSkirtHeight: Double,
    quantizedVertices: js.typedarray.Uint16Array,
    southIndices: js.Array[Double],
    southSkirtHeight: Double,
    westIndices: js.Array[Double],
    westSkirtHeight: Double
  ): BoundingSphere = {
    val __obj = js.Dynamic.literal(boundingSphere = boundingSphere.asInstanceOf[js.Any], eastIndices = eastIndices.asInstanceOf[js.Any], eastSkirtHeight = eastSkirtHeight.asInstanceOf[js.Any], horizonOcclusionPoint = horizonOcclusionPoint.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], maximumHeight = maximumHeight.asInstanceOf[js.Any], minimumHeight = minimumHeight.asInstanceOf[js.Any], northIndices = northIndices.asInstanceOf[js.Any], northSkirtHeight = northSkirtHeight.asInstanceOf[js.Any], quantizedVertices = quantizedVertices.asInstanceOf[js.Any], southIndices = southIndices.asInstanceOf[js.Any], southSkirtHeight = southSkirtHeight.asInstanceOf[js.Any], westIndices = westIndices.asInstanceOf[js.Any], westSkirtHeight = westSkirtHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingSphere]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoundingSphere] (val x: Self) extends AnyVal {
    
    inline def setBoundingSphere(value: typings.cesiumEngine.mod.BoundingSphere): Self = StObject.set(x, "boundingSphere", value.asInstanceOf[js.Any])
    
    inline def setChildTileMask(value: Double): Self = StObject.set(x, "childTileMask", value.asInstanceOf[js.Any])
    
    inline def setChildTileMaskUndefined: Self = StObject.set(x, "childTileMask", js.undefined)
    
    inline def setCreatedByUpsampling(value: Boolean): Self = StObject.set(x, "createdByUpsampling", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUpsamplingUndefined: Self = StObject.set(x, "createdByUpsampling", js.undefined)
    
    inline def setCredits(value: js.Array[Credit]): Self = StObject.set(x, "credits", value.asInstanceOf[js.Any])
    
    inline def setCreditsUndefined: Self = StObject.set(x, "credits", js.undefined)
    
    inline def setCreditsVarargs(value: Credit*): Self = StObject.set(x, "credits", js.Array(value*))
    
    inline def setEastIndices(value: js.Array[Double]): Self = StObject.set(x, "eastIndices", value.asInstanceOf[js.Any])
    
    inline def setEastIndicesVarargs(value: Double*): Self = StObject.set(x, "eastIndices", js.Array(value*))
    
    inline def setEastSkirtHeight(value: Double): Self = StObject.set(x, "eastSkirtHeight", value.asInstanceOf[js.Any])
    
    inline def setEncodedNormals(value: js.typedarray.Uint8Array): Self = StObject.set(x, "encodedNormals", value.asInstanceOf[js.Any])
    
    inline def setEncodedNormalsUndefined: Self = StObject.set(x, "encodedNormals", js.undefined)
    
    inline def setHorizonOcclusionPoint(value: Cartesian3): Self = StObject.set(x, "horizonOcclusionPoint", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.typedarray.Uint16Array | js.typedarray.Uint32Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setMaximumHeight(value: Double): Self = StObject.set(x, "maximumHeight", value.asInstanceOf[js.Any])
    
    inline def setMinimumHeight(value: Double): Self = StObject.set(x, "minimumHeight", value.asInstanceOf[js.Any])
    
    inline def setNorthIndices(value: js.Array[Double]): Self = StObject.set(x, "northIndices", value.asInstanceOf[js.Any])
    
    inline def setNorthIndicesVarargs(value: Double*): Self = StObject.set(x, "northIndices", js.Array(value*))
    
    inline def setNorthSkirtHeight(value: Double): Self = StObject.set(x, "northSkirtHeight", value.asInstanceOf[js.Any])
    
    inline def setOrientedBoundingBox(value: OrientedBoundingBox): Self = StObject.set(x, "orientedBoundingBox", value.asInstanceOf[js.Any])
    
    inline def setOrientedBoundingBoxUndefined: Self = StObject.set(x, "orientedBoundingBox", js.undefined)
    
    inline def setQuantizedVertices(value: js.typedarray.Uint16Array): Self = StObject.set(x, "quantizedVertices", value.asInstanceOf[js.Any])
    
    inline def setSouthIndices(value: js.Array[Double]): Self = StObject.set(x, "southIndices", value.asInstanceOf[js.Any])
    
    inline def setSouthIndicesVarargs(value: Double*): Self = StObject.set(x, "southIndices", js.Array(value*))
    
    inline def setSouthSkirtHeight(value: Double): Self = StObject.set(x, "southSkirtHeight", value.asInstanceOf[js.Any])
    
    inline def setWaterMask(value: js.typedarray.Uint8Array): Self = StObject.set(x, "waterMask", value.asInstanceOf[js.Any])
    
    inline def setWaterMaskUndefined: Self = StObject.set(x, "waterMask", js.undefined)
    
    inline def setWestIndices(value: js.Array[Double]): Self = StObject.set(x, "westIndices", value.asInstanceOf[js.Any])
    
    inline def setWestIndicesVarargs(value: Double*): Self = StObject.set(x, "westIndices", js.Array(value*))
    
    inline def setWestSkirtHeight(value: Double): Self = StObject.set(x, "westSkirtHeight", value.asInstanceOf[js.Any])
  }
}
