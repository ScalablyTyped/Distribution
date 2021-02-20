package typings.babelTraverse.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Confident extends StObject {
  
  var confident: Boolean = js.native
  
  var value: js.Any = js.native
}
object Confident {
  
  @scala.inline
  def apply(confident: Boolean, value: js.Any): Confident = {
    val __obj = js.Dynamic.literal(confident = confident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confident]
  }
  
  @scala.inline
  implicit class ConfidentMutableBuilder[Self <: Confident] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfident(value: Boolean): Self = StObject.set(x, "confident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
