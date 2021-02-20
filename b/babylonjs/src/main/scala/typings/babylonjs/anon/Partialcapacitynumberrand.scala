package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  capacity :number,   randomTextureSize :number}> */
@js.native
trait Partialcapacitynumberrand extends StObject {
  
  var capacity: js.UndefOr[Double] = js.native
  
  var randomTextureSize: js.UndefOr[Double] = js.native
}
object Partialcapacitynumberrand {
  
  @scala.inline
  def apply(): Partialcapacitynumberrand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialcapacitynumberrand]
  }
  
  @scala.inline
  implicit class PartialcapacitynumberrandMutableBuilder[Self <: Partialcapacitynumberrand] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    @scala.inline
    def setRandomTextureSize(value: Double): Self = StObject.set(x, "randomTextureSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomTextureSizeUndefined: Self = StObject.set(x, "randomTextureSize", js.undefined)
  }
}
