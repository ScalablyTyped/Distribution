package typings.blocks

import org.scalablytyped.runtime.StringDictionary
import typings.blocks.anon.Create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionPrototype
  extends /* propertyName */ StringDictionary[js.Any] {
  
  var options: js.UndefOr[Create] = js.native
}
object CollectionPrototype {
  
  @scala.inline
  def apply(): CollectionPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionPrototype]
  }
  
  @scala.inline
  implicit class CollectionPrototypeOps[Self <: CollectionPrototype] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: Create): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
