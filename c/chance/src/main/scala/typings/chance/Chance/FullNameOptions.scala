package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullNameOptions extends StObject {
  
  var middle: Boolean
  
  var middle_initial: Boolean
  
  var prefix: Boolean
  
  var suffix: Boolean
}
object FullNameOptions {
  
  @scala.inline
  def apply(middle: Boolean, middle_initial: Boolean, prefix: Boolean, suffix: Boolean): FullNameOptions = {
    val __obj = js.Dynamic.literal(middle = middle.asInstanceOf[js.Any], middle_initial = middle_initial.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullNameOptions]
  }
  
  @scala.inline
  implicit class FullNameOptionsMutableBuilder[Self <: FullNameOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMiddle(value: Boolean): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddle_initial(value: Boolean): Self = StObject.set(x, "middle_initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffix(value: Boolean): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
  }
}
