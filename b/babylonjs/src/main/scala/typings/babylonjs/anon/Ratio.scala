package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ratio extends StObject {
  
  var ratio: Double = js.native
}
object Ratio {
  
  @scala.inline
  def apply(ratio: Double): Ratio = {
    val __obj = js.Dynamic.literal(ratio = ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ratio]
  }
  
  @scala.inline
  implicit class RatioMutableBuilder[Self <: Ratio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
  }
}
