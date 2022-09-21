package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PixelDatatype extends StObject
@JSImport("cesium", "PixelDatatype")
@js.native
object PixelDatatype extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[PixelDatatype & scala.Nothing] = js.native
  
  @js.native
  sealed trait FLOAT
    extends StObject
       with PixelDatatype
  /* WebGLConstants.FLOAT */ val FLOAT: typings.cesium.mod.PixelDatatype.FLOAT & scala.Nothing = js.native
  
  @js.native
  sealed trait HALF_FLOAT
    extends StObject
       with PixelDatatype
  /* WebGLConstants.HALF_FLOAT_OES */ val HALF_FLOAT: typings.cesium.mod.PixelDatatype.HALF_FLOAT & scala.Nothing = js.native
  
  @js.native
  sealed trait UNSIGNED_BYTE
    extends StObject
       with PixelDatatype
  /* WebGLConstants.UNSIGNED_BYTE */ val UNSIGNED_BYTE: typings.cesium.mod.PixelDatatype.UNSIGNED_BYTE & scala.Nothing = js.native
  
  @js.native
  sealed trait UNSIGNED_INT
    extends StObject
       with PixelDatatype
  /* WebGLConstants.UNSIGNED_INT */ val UNSIGNED_INT: typings.cesium.mod.PixelDatatype.UNSIGNED_INT & scala.Nothing = js.native
  
  @js.native
  sealed trait UNSIGNED_INT_24_8
    extends StObject
       with PixelDatatype
  /* WebGLConstants.UNSIGNED_INT_24_8 */ val UNSIGNED_INT_24_8: typings.cesium.mod.PixelDatatype.UNSIGNED_INT_24_8 & scala.Nothing = js.native
  
  @js.native
  sealed trait UNSIGNED_SHORT
    extends StObject
       with PixelDatatype
  /* WebGLConstants.UNSIGNED_SHORT */ val UNSIGNED_SHORT: typings.cesium.mod.PixelDatatype.UNSIGNED_SHORT & scala.Nothing = js.native
  
  @js.native
  sealed trait UNSIGNED_SHORT_4_4_4_4
    extends StObject
       with PixelDatatype
  /* WebGLConstants.UNSIGNED_SHORT_4_4_4_4 */ val UNSIGNED_SHORT_4_4_4_4: typings.cesium.mod.PixelDatatype.UNSIGNED_SHORT_4_4_4_4 & scala.Nothing = js.native
  
  @js.native
  sealed trait UNSIGNED_SHORT_5_5_5_1
    extends StObject
       with PixelDatatype
  /* WebGLConstants.UNSIGNED_SHORT_5_5_5_1 */ val UNSIGNED_SHORT_5_5_5_1: typings.cesium.mod.PixelDatatype.UNSIGNED_SHORT_5_5_5_1 & scala.Nothing = js.native
  
  @js.native
  sealed trait UNSIGNED_SHORT_5_6_5
    extends StObject
       with PixelDatatype
  /* WebGLConstants.UNSIGNED_SHORT_5_6_5 */ val UNSIGNED_SHORT_5_6_5: typings.cesium.mod.PixelDatatype.UNSIGNED_SHORT_5_6_5 & scala.Nothing = js.native
}
