package typings.ckeditorCkeditor5Engine.mod.model

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaContextItem extends js.Object {
  
  def getAttribute(key: String): String = js.native
  
  var getAttributeKeys: Iterable[String] = js.native
  
  var name: String = js.native
}
object SchemaContextItem {
  
  @scala.inline
  def apply(getAttribute: String => String, getAttributeKeys: Iterable[String], name: String): SchemaContextItem = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributeKeys = getAttributeKeys.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContextItem]
  }
  
  @scala.inline
  implicit class SchemaContextItemOps[Self <: SchemaContextItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAttribute(value: String => String): Self = this.set("getAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAttributeKeys(value: Iterable[String]): Self = this.set("getAttributeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
