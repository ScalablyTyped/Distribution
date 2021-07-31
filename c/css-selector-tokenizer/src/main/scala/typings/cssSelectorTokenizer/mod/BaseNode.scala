package typings.cssSelectorTokenizer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseNode extends StObject {
  
  var after: js.UndefOr[String] = js.undefined
  
  var before: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object BaseNode {
  
  @scala.inline
  def apply(): BaseNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseNode]
  }
  
  @scala.inline
  implicit class BaseNodeMutableBuilder[Self <: BaseNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
