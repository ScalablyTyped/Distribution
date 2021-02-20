package typings.codemirror.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ch extends StObject {
  
  var ch: Double = js.native
  
  var hitSide: js.UndefOr[Boolean] = js.native
  
  var line: Double = js.native
}
object Ch {
  
  @scala.inline
  def apply(ch: Double, line: Double): Ch = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ch]
  }
  
  @scala.inline
  implicit class ChMutableBuilder[Self <: Ch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCh(value: Double): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSide(value: Boolean): Self = StObject.set(x, "hitSide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSideUndefined: Self = StObject.set(x, "hitSide", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
