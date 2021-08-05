package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPSetSummary extends StObject {
  
  /**
    * The IPSetId for an IPSet. You can use IPSetId in a GetIPSet request to get detailed information about an IPSet.
    */
  var IPSetId: ResourceId
  
  /**
    * A friendly name or description of the IPSet. You can't change the name of an IPSet after you create it.
    */
  var Name: ResourceName
}
object IPSetSummary {
  
  inline def apply(IPSetId: ResourceId, Name: ResourceName): IPSetSummary = {
    val __obj = js.Dynamic.literal(IPSetId = IPSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetSummary]
  }
  
  extension [Self <: IPSetSummary](x: Self) {
    
    inline def setIPSetId(value: ResourceId): Self = StObject.set(x, "IPSetId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
