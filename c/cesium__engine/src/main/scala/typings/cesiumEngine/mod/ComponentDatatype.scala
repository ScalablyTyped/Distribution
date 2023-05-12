package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ComponentDatatype extends StObject
@JSImport("@cesium/engine", "ComponentDatatype")
@js.native
object ComponentDatatype extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[ComponentDatatype & scala.Nothing] = js.native
  
  /**
    * 8-bit signed byte corresponding to <code>gl.BYTE</code> and the type
    * of an element in <code>Int8Array</code>.
    */
  @js.native
  sealed trait BYTE
    extends StObject
       with ComponentDatatype
  /* WebGLConstants.BYTE */ val BYTE: typings.cesiumEngine.mod.ComponentDatatype.BYTE & scala.Nothing = js.native
  
  /**
    * 64-bit floating-point corresponding to <code>gl.DOUBLE</code> (in Desktop OpenGL;
    * this is not supported in WebGL, and is emulated in Cesium via {@link GeometryPipeline.encodeAttribute})
    * and the type of an element in <code>Float64Array</code>.
    */
  @js.native
  sealed trait DOUBLE
    extends StObject
       with ComponentDatatype
  /* WebGLConstants.DOUBLE */ val DOUBLE: typings.cesiumEngine.mod.ComponentDatatype.DOUBLE & scala.Nothing = js.native
  
  /**
    * 32-bit floating-point corresponding to <code>FLOAT</code> and the type
    * of an element in <code>Float32Array</code>.
    */
  @js.native
  sealed trait FLOAT
    extends StObject
       with ComponentDatatype
  /* WebGLConstants.FLOAT */ val FLOAT: typings.cesiumEngine.mod.ComponentDatatype.FLOAT & scala.Nothing = js.native
  
  /**
    * 32-bit signed int corresponding to <code>INT</code> and the type
    * of an element in <code>Int32Array</code>.
    */
  @js.native
  sealed trait INT
    extends StObject
       with ComponentDatatype
  /* WebGLConstants.INT */ val INT: typings.cesiumEngine.mod.ComponentDatatype.INT & scala.Nothing = js.native
  
  /**
    * 16-bit signed short corresponding to <code>SHORT</code> and the type
    * of an element in <code>Int16Array</code>.
    */
  @js.native
  sealed trait SHORT
    extends StObject
       with ComponentDatatype
  /* WebGLConstants.SHORT */ val SHORT: typings.cesiumEngine.mod.ComponentDatatype.SHORT & scala.Nothing = js.native
  
  /**
    * 8-bit unsigned byte corresponding to <code>UNSIGNED_BYTE</code> and the type
    * of an element in <code>Uint8Array</code>.
    */
  @js.native
  sealed trait UNSIGNED_BYTE
    extends StObject
       with ComponentDatatype
  /* WebGLConstants.UNSIGNED_BYTE */ val UNSIGNED_BYTE: typings.cesiumEngine.mod.ComponentDatatype.UNSIGNED_BYTE & scala.Nothing = js.native
  
  /**
    * 32-bit unsigned int corresponding to <code>UNSIGNED_INT</code> and the type
    * of an element in <code>Uint32Array</code>.
    */
  @js.native
  sealed trait UNSIGNED_INT
    extends StObject
       with ComponentDatatype
  /* WebGLConstants.UNSIGNED_INT */ val UNSIGNED_INT: typings.cesiumEngine.mod.ComponentDatatype.UNSIGNED_INT & scala.Nothing = js.native
  
  /**
    * 16-bit unsigned short corresponding to <code>UNSIGNED_SHORT</code> and the type
    * of an element in <code>Uint16Array</code>.
    */
  @js.native
  sealed trait UNSIGNED_SHORT
    extends StObject
       with ComponentDatatype
  /* WebGLConstants.UNSIGNED_SHORT */ val UNSIGNED_SHORT: typings.cesiumEngine.mod.ComponentDatatype.UNSIGNED_SHORT & scala.Nothing = js.native
}
