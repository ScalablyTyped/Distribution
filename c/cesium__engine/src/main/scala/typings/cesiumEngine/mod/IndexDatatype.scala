package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndexDatatype extends StObject
@JSImport("@cesium/engine", "IndexDatatype")
@js.native
object IndexDatatype extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[IndexDatatype & scala.Nothing] = js.native
  
  /**
    * 8-bit unsigned byte corresponding to <code>UNSIGNED_BYTE</code> and the type
    * of an element in <code>Uint8Array</code>.
    */
  @js.native
  sealed trait UNSIGNED_BYTE
    extends StObject
       with IndexDatatype
  /* WebGLConstants.UNSIGNED_BYTE */ val UNSIGNED_BYTE: typings.cesiumEngine.mod.IndexDatatype.UNSIGNED_BYTE & scala.Nothing = js.native
  
  /**
    * 32-bit unsigned int corresponding to <code>UNSIGNED_INT</code> and the type
    * of an element in <code>Uint32Array</code>.
    */
  @js.native
  sealed trait UNSIGNED_INT
    extends StObject
       with IndexDatatype
  /* WebGLConstants.UNSIGNED_INT */ val UNSIGNED_INT: typings.cesiumEngine.mod.IndexDatatype.UNSIGNED_INT & scala.Nothing = js.native
  
  /**
    * 16-bit unsigned short corresponding to <code>UNSIGNED_SHORT</code> and the type
    * of an element in <code>Uint16Array</code>.
    */
  @js.native
  sealed trait UNSIGNED_SHORT
    extends StObject
       with IndexDatatype
  /* WebGLConstants.UNSIGNED_SHORT */ val UNSIGNED_SHORT: typings.cesiumEngine.mod.IndexDatatype.UNSIGNED_SHORT & scala.Nothing = js.native
}
