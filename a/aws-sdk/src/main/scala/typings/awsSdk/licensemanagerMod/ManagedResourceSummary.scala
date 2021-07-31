package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedResourceSummary extends StObject {
  
  /**
    * Number of resources associated with licenses.
    */
  var AssociationCount: js.UndefOr[BoxLong] = js.undefined
  
  /**
    * Type of resource associated with a license.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.undefined
}
object ManagedResourceSummary {
  
  @scala.inline
  def apply(): ManagedResourceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedResourceSummary]
  }
  
  @scala.inline
  implicit class ManagedResourceSummaryMutableBuilder[Self <: ManagedResourceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationCount(value: BoxLong): Self = StObject.set(x, "AssociationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationCountUndefined: Self = StObject.set(x, "AssociationCount", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
