package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentFilter extends js.Object {
  
  /**
    * The name of the filter.
    */
  var key: DocumentFilterKey = js.native
  
  /**
    * The value of the filter.
    */
  var value: DocumentFilterValue = js.native
}
object DocumentFilter {
  
  @scala.inline
  def apply(key: DocumentFilterKey, value: DocumentFilterValue): DocumentFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFilter]
  }
  
  @scala.inline
  implicit class DocumentFilterOps[Self <: DocumentFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: DocumentFilterKey): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DocumentFilterValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
