package typings.codemirror.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bias extends StObject {
  
  var bias: js.UndefOr[Double] = js.native
  
  var origin: js.UndefOr[String] = js.native
  
  var scroll: js.UndefOr[Boolean] = js.native
}
object Bias {
  
  @scala.inline
  def apply(): Bias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bias]
  }
  
  @scala.inline
  implicit class BiasMutableBuilder[Self <: Bias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
  }
}
