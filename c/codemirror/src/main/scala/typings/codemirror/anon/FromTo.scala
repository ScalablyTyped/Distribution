package typings.codemirror.anon

import typings.codemirror.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromTo extends StObject {
  
  var from: Position | Double = js.native
  
  var to: Position | Double = js.native
}
object FromTo {
  
  @scala.inline
  def apply(from: Position | Double, to: Position | Double): FromTo = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromTo]
  }
  
  @scala.inline
  implicit class FromToMutableBuilder[Self <: FromTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Position | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Position | Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
