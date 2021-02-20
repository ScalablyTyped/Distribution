package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagKeys extends StObject {
  
  /**
    *  A complex type that contains Tag key elements.
    */
  var Items: js.UndefOr[TagKeyList] = js.native
}
object TagKeys {
  
  @scala.inline
  def apply(): TagKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagKeys]
  }
  
  @scala.inline
  implicit class TagKeysMutableBuilder[Self <: TagKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: TagKeyList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: TagKey*): Self = StObject.set(x, "Items", js.Array(value :_*))
  }
}
