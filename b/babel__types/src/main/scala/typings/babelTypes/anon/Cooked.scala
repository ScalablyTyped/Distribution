package typings.babelTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cooked extends StObject {
  
  var cooked: js.UndefOr[String] = js.native
  
  var raw: String = js.native
}
object Cooked {
  
  @scala.inline
  def apply(raw: String): Cooked = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cooked]
  }
  
  @scala.inline
  implicit class CookedMutableBuilder[Self <: Cooked] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCooked(value: String): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookedUndefined: Self = StObject.set(x, "cooked", js.undefined)
    
    @scala.inline
    def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
