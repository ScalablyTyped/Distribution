package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTerminologyRequest extends StObject {
  
  /**
    * The name of the custom terminology being retrieved.
    */
  var Name: ResourceName
  
  /**
    * The data format of the custom terminology being retrieved, either CSV or TMX.
    */
  var TerminologyDataFormat: typings.awsSdk.translateMod.TerminologyDataFormat
}
object GetTerminologyRequest {
  
  @scala.inline
  def apply(Name: ResourceName, TerminologyDataFormat: TerminologyDataFormat): GetTerminologyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TerminologyDataFormat = TerminologyDataFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTerminologyRequest]
  }
  
  @scala.inline
  implicit class GetTerminologyRequestMutableBuilder[Self <: GetTerminologyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminologyDataFormat(value: TerminologyDataFormat): Self = StObject.set(x, "TerminologyDataFormat", value.asInstanceOf[js.Any])
  }
}
