package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPSetSummary extends StObject {
  
  /**
    * The IPSetId for an IPSet. You can use IPSetId in a GetIPSet request to get detailed information about an IPSet.
    */
  var IPSetId: ResourceId = js.native
  
  /**
    * A friendly name or description of the IPSet. You can't change the name of an IPSet after you create it.
    */
  var Name: ResourceName = js.native
}
object IPSetSummary {
  
  @scala.inline
  def apply(IPSetId: ResourceId, Name: ResourceName): IPSetSummary = {
    val __obj = js.Dynamic.literal(IPSetId = IPSetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetSummary]
  }
  
  @scala.inline
  implicit class IPSetSummaryMutableBuilder[Self <: IPSetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIPSetId(value: ResourceId): Self = StObject.set(x, "IPSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
