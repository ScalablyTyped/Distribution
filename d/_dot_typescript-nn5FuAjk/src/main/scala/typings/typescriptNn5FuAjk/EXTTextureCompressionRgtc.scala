package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EXTTextureCompressionRgtc extends StObject {
  
  val COMPRESSED_RED_GREEN_RGTC2_EXT: GLenum
  
  val COMPRESSED_RED_RGTC1_EXT: GLenum
  
  val COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT: GLenum
  
  val COMPRESSED_SIGNED_RED_RGTC1_EXT: GLenum
}
object EXTTextureCompressionRgtc {
  
  inline def apply(
    COMPRESSED_RED_GREEN_RGTC2_EXT: GLenum,
    COMPRESSED_RED_RGTC1_EXT: GLenum,
    COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT: GLenum,
    COMPRESSED_SIGNED_RED_RGTC1_EXT: GLenum
  ): EXTTextureCompressionRgtc = {
    val __obj = js.Dynamic.literal(COMPRESSED_RED_GREEN_RGTC2_EXT = COMPRESSED_RED_GREEN_RGTC2_EXT.asInstanceOf[js.Any], COMPRESSED_RED_RGTC1_EXT = COMPRESSED_RED_RGTC1_EXT.asInstanceOf[js.Any], COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT = COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT.asInstanceOf[js.Any], COMPRESSED_SIGNED_RED_RGTC1_EXT = COMPRESSED_SIGNED_RED_RGTC1_EXT.asInstanceOf[js.Any])
    __obj.asInstanceOf[EXTTextureCompressionRgtc]
  }
  
  extension [Self <: EXTTextureCompressionRgtc](x: Self) {
    
    inline def setCOMPRESSED_RED_GREEN_RGTC2_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_RED_GREEN_RGTC2_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_RED_RGTC1_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_RED_RGTC1_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_SIGNED_RED_GREEN_RGTC2_EXT", value.asInstanceOf[js.Any])
    
    inline def setCOMPRESSED_SIGNED_RED_RGTC1_EXT(value: GLenum): Self = StObject.set(x, "COMPRESSED_SIGNED_RED_RGTC1_EXT", value.asInstanceOf[js.Any])
  }
}
