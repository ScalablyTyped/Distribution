package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageScanFinding extends StObject {
  
  /**
    * A collection of attributes of the host from which the finding is generated.
    */
  var attributes: js.UndefOr[AttributeList] = js.undefined
  
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[FindingDescription] = js.undefined
  
  /**
    * The name associated with the finding, usually a CVE number.
    */
  var name: js.UndefOr[FindingName] = js.undefined
  
  /**
    * The finding severity.
    */
  var severity: js.UndefOr[FindingSeverity] = js.undefined
  
  /**
    * A link containing additional details about the security vulnerability.
    */
  var uri: js.UndefOr[Url] = js.undefined
}
object ImageScanFinding {
  
  inline def apply(): ImageScanFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFinding]
  }
  
  extension [Self <: ImageScanFinding](x: Self) {
    
    inline def setAttributes(value: AttributeList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setDescription(value: FindingDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: FindingName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSeverity(value: FindingSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setUri(value: Url): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
