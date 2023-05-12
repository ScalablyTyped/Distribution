package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MetadataType extends StObject
@JSImport("@cesium/engine", "MetadataType")
@js.native
object MetadataType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MetadataType & String] = js.native
  
  /**
    * A boolean (true/false) value
    */
  @js.native
  sealed trait BOOLEAN
    extends StObject
       with MetadataType
  /* "BOOLEAN" */ val BOOLEAN: typings.cesiumEngine.mod.MetadataType.BOOLEAN & String = js.native
  
  /**
    * An enumerated value. This type is used in conjunction with a {@link MetadataEnum} to describe the valid values.
    */
  @js.native
  sealed trait ENUM
    extends StObject
       with MetadataType
  /* "ENUM" */ val ENUM: typings.cesiumEngine.mod.MetadataType.ENUM & String = js.native
  
  /**
    * A 2x2 matrix, stored in column-major format.
    */
  @js.native
  sealed trait MAT2
    extends StObject
       with MetadataType
  /* "MAT2" */ val MAT2: typings.cesiumEngine.mod.MetadataType.MAT2 & String = js.native
  
  /**
    * A 3x3 matrix, stored in column-major format.
    */
  @js.native
  sealed trait MAT3
    extends StObject
       with MetadataType
  /* "MAT3" */ val MAT3: typings.cesiumEngine.mod.MetadataType.MAT3 & String = js.native
  
  /**
    * A 4x4 matrix, stored in column-major format.
    */
  @js.native
  sealed trait MAT4
    extends StObject
       with MetadataType
  /* "MAT4" */ val MAT4: typings.cesiumEngine.mod.MetadataType.MAT4 & String = js.native
  
  /**
    * A single component
    */
  @js.native
  sealed trait SCALAR
    extends StObject
       with MetadataType
  /* "SCALAR" */ val SCALAR: typings.cesiumEngine.mod.MetadataType.SCALAR & String = js.native
  
  /**
    * A UTF-8 encoded string value
    */
  @js.native
  sealed trait STRING
    extends StObject
       with MetadataType
  /* "STRING" */ val STRING: typings.cesiumEngine.mod.MetadataType.STRING & String = js.native
  
  /**
    * A vector with two components
    */
  @js.native
  sealed trait VEC2
    extends StObject
       with MetadataType
  /* "VEC2" */ val VEC2: typings.cesiumEngine.mod.MetadataType.VEC2 & String = js.native
  
  /**
    * A vector with three components
    */
  @js.native
  sealed trait VEC3
    extends StObject
       with MetadataType
  /* "VEC3" */ val VEC3: typings.cesiumEngine.mod.MetadataType.VEC3 & String = js.native
  
  /**
    * A vector with four components
    */
  @js.native
  sealed trait VEC4
    extends StObject
       with MetadataType
  /* "VEC4" */ val VEC4: typings.cesiumEngine.mod.MetadataType.VEC4 & String = js.native
}
