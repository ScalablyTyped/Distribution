package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataComponentType extends StObject
@JSImport("@cesium/engine", "MetadataComponentType")
@js.native
object MetadataComponentType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MetadataComponentType & String] = js.native
  
  /**
    * A 32-bit (single precision) floating point number
    */
  @js.native
  sealed trait FLOAT32
    extends StObject
       with MetadataComponentType
  /* "FLOAT32" */ val FLOAT32: typings.cesiumEngine.mod.MetadataComponentType.FLOAT32 & String = js.native
  
  /**
    * A 64-bit (double precision) floating point number
    */
  @js.native
  sealed trait FLOAT64
    extends StObject
       with MetadataComponentType
  /* "FLOAT64" */ val FLOAT64: typings.cesiumEngine.mod.MetadataComponentType.FLOAT64 & String = js.native
  
  /**
    * A 16-bit signed integer
    */
  @js.native
  sealed trait INT16
    extends StObject
       with MetadataComponentType
  /* "INT16" */ val INT16: typings.cesiumEngine.mod.MetadataComponentType.INT16 & String = js.native
  
  /**
    * A 32-bit signed integer
    */
  @js.native
  sealed trait INT32
    extends StObject
       with MetadataComponentType
  /* "INT32" */ val INT32: typings.cesiumEngine.mod.MetadataComponentType.INT32 & String = js.native
  
  /**
    * A 64-bit signed integer. This type requires BigInt support.
    */
  @js.native
  sealed trait INT64
    extends StObject
       with MetadataComponentType
  /* "INT64" */ val INT64: typings.cesiumEngine.mod.MetadataComponentType.INT64 & String = js.native
  
  /**
    * An 8-bit signed integer
    */
  @js.native
  sealed trait INT8
    extends StObject
       with MetadataComponentType
  /* "INT8" */ val INT8: typings.cesiumEngine.mod.MetadataComponentType.INT8 & String = js.native
  
  /**
    * A 16-bit unsigned integer
    */
  @js.native
  sealed trait UINT16
    extends StObject
       with MetadataComponentType
  /* "UINT16" */ val UINT16: typings.cesiumEngine.mod.MetadataComponentType.UINT16 & String = js.native
  
  /**
    * A 32-bit unsigned integer
    */
  @js.native
  sealed trait UINT32
    extends StObject
       with MetadataComponentType
  /* "UINT32" */ val UINT32: typings.cesiumEngine.mod.MetadataComponentType.UINT32 & String = js.native
  
  /**
    * A 64-bit signed integer. This type requires BigInt support
    */
  @js.native
  sealed trait UINT64
    extends StObject
       with MetadataComponentType
  /* "UINT64" */ val UINT64: typings.cesiumEngine.mod.MetadataComponentType.UINT64 & String = js.native
  
  /**
    * An 8-bit unsigned integer
    */
  @js.native
  sealed trait UINT8
    extends StObject
       with MetadataComponentType
  /* "UINT8" */ val UINT8: typings.cesiumEngine.mod.MetadataComponentType.UINT8 & String = js.native
}
