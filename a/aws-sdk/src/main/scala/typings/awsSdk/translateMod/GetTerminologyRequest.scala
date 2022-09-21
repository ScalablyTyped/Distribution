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
    * The data format of the custom terminology being retrieved. If you don't specify this parameter, Amazon Translate returns a file with the same format as the file that was imported to create the terminology.  If you specify this parameter when you retrieve a multi-directional terminology resource, you must specify the same format as the input file that was imported to create it. Otherwise, Amazon Translate throws an error.
    */
  var TerminologyDataFormat: js.UndefOr[typings.awsSdk.translateMod.TerminologyDataFormat] = js.undefined
}
object GetTerminologyRequest {
  
  inline def apply(Name: ResourceName): GetTerminologyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTerminologyRequest]
  }
  
  extension [Self <: GetTerminologyRequest](x: Self) {
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTerminologyDataFormat(value: TerminologyDataFormat): Self = StObject.set(x, "TerminologyDataFormat", value.asInstanceOf[js.Any])
    
    inline def setTerminologyDataFormatUndefined: Self = StObject.set(x, "TerminologyDataFormat", js.undefined)
  }
}
