package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHandle extends StObject {
  
  var text: String
}
object LineHandle {
  
  @scala.inline
  def apply(text: String): LineHandle = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHandle]
  }
  
  @scala.inline
  implicit class LineHandleMutableBuilder[Self <: LineHandle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
