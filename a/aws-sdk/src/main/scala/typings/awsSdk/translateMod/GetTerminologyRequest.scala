package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTerminologyRequest extends js.Object {
  
  /**
    * The name of the custom terminology being retrieved.
    */
  var Name: ResourceName = js.native
  
  /**
    * The data format of the custom terminology being retrieved, either CSV or TMX.
    */
  var TerminologyDataFormat: typings.awsSdk.translateMod.TerminologyDataFormat = js.native
}
object GetTerminologyRequest {
  
  @scala.inline
  def apply(Name: ResourceName, TerminologyDataFormat: TerminologyDataFormat): GetTerminologyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TerminologyDataFormat = TerminologyDataFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTerminologyRequest]
  }
  
  @scala.inline
  implicit class GetTerminologyRequestOps[Self <: GetTerminologyRequest] (val x: Self) extends AnyVal {
    
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
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminologyDataFormat(value: TerminologyDataFormat): Self = this.set("TerminologyDataFormat", value.asInstanceOf[js.Any])
  }
}
