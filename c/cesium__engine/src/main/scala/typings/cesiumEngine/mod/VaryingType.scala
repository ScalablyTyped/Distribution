package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VaryingType extends StObject
@JSImport("@cesium/engine", "VaryingType")
@js.native
object VaryingType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[VaryingType & String] = js.native
  
  /**
    * A single floating point value.
    */
  @js.native
  sealed trait FLOAT
    extends StObject
       with VaryingType
  /* "float" */ val FLOAT: typings.cesiumEngine.mod.VaryingType.FLOAT & String = js.native
  
  /**
    * A 2x2 matrix of floating point values.
    */
  @js.native
  sealed trait MAT2
    extends StObject
       with VaryingType
  /* "mat2" */ val MAT2: typings.cesiumEngine.mod.VaryingType.MAT2 & String = js.native
  
  /**
    * A 3x3 matrix of floating point values.
    */
  @js.native
  sealed trait MAT3
    extends StObject
       with VaryingType
  /* "mat2" */ val MAT3: typings.cesiumEngine.mod.VaryingType.MAT3 & String = js.native
  
  /**
    * A 3x3 matrix of floating point values.
    */
  @js.native
  sealed trait MAT4
    extends StObject
       with VaryingType
  /* "mat4" */ val MAT4: typings.cesiumEngine.mod.VaryingType.MAT4 & String = js.native
  
  /**
    * A vector of 2 floating point values.
    */
  @js.native
  sealed trait VEC2
    extends StObject
       with VaryingType
  /* "vec2" */ val VEC2: typings.cesiumEngine.mod.VaryingType.VEC2 & String = js.native
  
  /**
    * A vector of 3 floating point values.
    */
  @js.native
  sealed trait VEC3
    extends StObject
       with VaryingType
  /* "vec3" */ val VEC3: typings.cesiumEngine.mod.VaryingType.VEC3 & String = js.native
  
  /**
    * A vector of 4 floating point values.
    */
  @js.native
  sealed trait VEC4
    extends StObject
       with VaryingType
  /* "vec4" */ val VEC4: typings.cesiumEngine.mod.VaryingType.VEC4 & String = js.native
}
