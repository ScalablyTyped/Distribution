package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  capacity :number,   randomTextureSize :number}> */
trait Partialcapacitynumberrand extends StObject {
  
  var capacity: js.UndefOr[Double] = js.undefined
  
  var randomTextureSize: js.UndefOr[Double] = js.undefined
}
object Partialcapacitynumberrand {
  
  inline def apply(): Partialcapacitynumberrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialcapacitynumberrand]
  }
  
  extension [Self <: Partialcapacitynumberrand](x: Self) {
    
    inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setRandomTextureSize(value: Double): Self = StObject.set(x, "randomTextureSize", value.asInstanceOf[js.Any])
    
    inline def setRandomTextureSizeUndefined: Self = StObject.set(x, "randomTextureSize", js.undefined)
  }
}
