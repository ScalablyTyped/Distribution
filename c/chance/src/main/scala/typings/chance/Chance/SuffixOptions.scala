package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuffixOptions extends StObject {
  
  var full: Boolean = js.native
}
object SuffixOptions {
  
  @scala.inline
  def apply(full: Boolean): SuffixOptions = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuffixOptions]
  }
  
  @scala.inline
  implicit class SuffixOptionsMutableBuilder[Self <: SuffixOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
  }
}
