package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeServicesRequest extends js.Object {
  
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.native
  
  /**
    * A JSON-formatted list of service codes available for AWS services.
    */
  var serviceCodeList: js.UndefOr[ServiceCodeList] = js.native
}
object DescribeServicesRequest {
  
  @scala.inline
  def apply(): DescribeServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesRequest]
  }
  
  @scala.inline
  implicit class DescribeServicesRequestOps[Self <: DescribeServicesRequest] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setServiceCodeListVarargs(value: ServiceCode*): Self = this.set("serviceCodeList", js.Array(value :_*))
    
    @scala.inline
    def setServiceCodeList(value: ServiceCodeList): Self = this.set("serviceCodeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceCodeList: Self = this.set("serviceCodeList", js.undefined)
  }
}
