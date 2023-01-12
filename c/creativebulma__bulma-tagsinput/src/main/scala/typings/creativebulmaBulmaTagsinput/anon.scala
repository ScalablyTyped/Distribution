package typings.creativebulmaBulmaTagsinput

import typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInputItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Item extends StObject {
    
    var item: String | BulmaTagsInputItem
    
    var tag: String
  }
  object Item {
    
    inline def apply(item: String | BulmaTagsInputItem, tag: String): Item = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setItem(value: String | BulmaTagsInputItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
