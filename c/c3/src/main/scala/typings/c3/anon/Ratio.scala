package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ratio extends StObject {
  
  /**
    * Set max width of each bar
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * Set the width of each bar by ratio
    * Defaults to `0.6`.
    */
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
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
  }
}
