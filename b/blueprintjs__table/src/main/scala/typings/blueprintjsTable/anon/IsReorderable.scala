package typings.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsReorderable extends StObject {
  
  var isReorderable: Boolean
  
  var isResizable: Boolean
  
  var loading: Boolean
}
object IsReorderable {
  
  @scala.inline
  def apply(isReorderable: Boolean, isResizable: Boolean, loading: Boolean): IsReorderable = {
    val __obj = js.Dynamic.literal(isReorderable = isReorderable.asInstanceOf[js.Any], isResizable = isResizable.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsReorderable]
  }
  
  @scala.inline
  implicit class IsReorderableMutableBuilder[Self <: IsReorderable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsReorderable(value: Boolean): Self = StObject.set(x, "isReorderable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResizable(value: Boolean): Self = StObject.set(x, "isResizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
  }
}
