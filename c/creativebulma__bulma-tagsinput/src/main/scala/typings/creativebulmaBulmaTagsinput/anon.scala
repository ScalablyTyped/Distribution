package typings.creativebulmaBulmaTagsinput

import typings.creativebulmaBulmaTagsinput.mod.BulmaTagsInputItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Item extends StObject {
    
    var item: String | BulmaTagsInputItem = js.native
    
    var tag: String = js.native
  }
  object Item {
    
    @scala.inline
    def apply(item: String | BulmaTagsInputItem, tag: String): Item = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: String | BulmaTagsInputItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
