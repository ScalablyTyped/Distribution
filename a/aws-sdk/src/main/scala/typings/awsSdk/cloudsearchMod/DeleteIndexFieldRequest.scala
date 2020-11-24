package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIndexFieldRequest extends js.Object {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  
  /**
    * The name of the index field your want to remove from the domain's indexing options.
    */
  var IndexFieldName: DynamicFieldName = js.native
}
object DeleteIndexFieldRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, IndexFieldName: DynamicFieldName): DeleteIndexFieldRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], IndexFieldName = IndexFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIndexFieldRequest]
  }
  
  @scala.inline
  implicit class DeleteIndexFieldRequestOps[Self <: DeleteIndexFieldRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexFieldName(value: DynamicFieldName): Self = this.set("IndexFieldName", value.asInstanceOf[js.Any])
  }
}
