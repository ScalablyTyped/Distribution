package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsResizable extends StObject {
  
  var isResizable: Boolean
  
  var minSize: Double
}
object IsResizable {
  
  @scala.inline
  def apply(isResizable: Boolean, minSize: Double): IsResizable = {
    val __obj = js.Dynamic.literal(isResizable = isResizable.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsResizable]
  }
  
  @scala.inline
  implicit class IsResizableMutableBuilder[Self <: IsResizable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
  }
}
