package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumedLicenseSummary extends StObject {
  
  /**
    * Number of licenses consumed by the resource.
    */
  var ConsumedLicenses: js.UndefOr[BoxLong] = js.undefined
  
  /**
    * Resource type of the resource consuming a license.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.undefined
}
object ConsumedLicenseSummary {
  
  @scala.inline
  def apply(): ConsumedLicenseSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumedLicenseSummary]
  }
  
  @scala.inline
  implicit class ConsumedLicenseSummaryMutableBuilder[Self <: ConsumedLicenseSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumedLicenses(value: BoxLong): Self = StObject.set(x, "ConsumedLicenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumedLicensesUndefined: Self = StObject.set(x, "ConsumedLicenses", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
