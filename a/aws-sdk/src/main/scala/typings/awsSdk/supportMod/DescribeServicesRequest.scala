package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServicesRequest extends StObject {
  
  /**
    * The ISO 639-1 code for the language in which AWS provides support. AWS Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.undefined
  
  /**
    * A JSON-formatted list of service codes available for AWS services.
    */
  var serviceCodeList: js.UndefOr[ServiceCodeList] = js.undefined
}
object DescribeServicesRequest {
  
  @scala.inline
  def apply(): DescribeServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeServicesRequest]
  }
  
  @scala.inline
  implicit class DescribeServicesRequestMutableBuilder[Self <: DescribeServicesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setServiceCodeList(value: ServiceCodeList): Self = StObject.set(x, "serviceCodeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCodeListUndefined: Self = StObject.set(x, "serviceCodeList", js.undefined)
    
    @scala.inline
    def setServiceCodeListVarargs(value: ServiceCode*): Self = StObject.set(x, "serviceCodeList", js.Array(value :_*))
  }
}
