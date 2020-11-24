package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructValue extends js.Object {
  
  /**
    * The attributes returned in the record.
    */
  var attributes: js.UndefOr[ArrayValueList] = js.native
}
object StructValue {
  
  @scala.inline
  def apply(): StructValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructValue]
  }
  
  @scala.inline
  implicit class StructValueOps[Self <: StructValue] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: Value*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: ArrayValueList): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
}
