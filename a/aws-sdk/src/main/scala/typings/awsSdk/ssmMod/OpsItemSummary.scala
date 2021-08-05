package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsItemSummary extends StObject {
  
  /**
    * A list of OpsItems by category.
    */
  var Category: js.UndefOr[OpsItemCategory] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
    */
  var CreatedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the OpsItem was created.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM entity that created the OpsItem.
    */
  var LastModifiedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the OpsItem was last updated.
    */
  var LastModifiedTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Operational data is custom data that provides useful reference details about the OpsItem. 
    */
  var OperationalData: js.UndefOr[OpsItemOperationalData] = js.undefined
  
  /**
    * The ID of the OpsItem.
    */
  var OpsItemId: js.UndefOr[typings.awsSdk.ssmMod.OpsItemId] = js.undefined
  
  /**
    * The importance of this OpsItem in relation to other OpsItems in the system.
    */
  var Priority: js.UndefOr[OpsItemPriority] = js.undefined
  
  /**
    * A list of OpsItems by severity.
    */
  var Severity: js.UndefOr[OpsItemSeverity] = js.undefined
  
  /**
    * The impacted AWS resource.
    */
  var Source: js.UndefOr[OpsItemSource] = js.undefined
  
  /**
    * The OpsItem status. Status can be Open, In Progress, or Resolved.
    */
  var Status: js.UndefOr[OpsItemStatus] = js.undefined
  
  /**
    * A short heading that describes the nature of the OpsItem and the impacted resource.
    */
  var Title: js.UndefOr[OpsItemTitle] = js.undefined
}
object OpsItemSummary {
  
  inline def apply(): OpsItemSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsItemSummary]
  }
  
  extension [Self <: OpsItemSummary](x: Self) {
    
    inline def setCategory(value: OpsItemCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setCreatedBy(value: String): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreatedTime(value: DateTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setLastModifiedBy(value: String): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: DateTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setOperationalData(value: OpsItemOperationalData): Self = StObject.set(x, "OperationalData", value.asInstanceOf[js.Any])
    
    inline def setOperationalDataUndefined: Self = StObject.set(x, "OperationalData", js.undefined)
    
    inline def setOpsItemId(value: OpsItemId): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
    
    inline def setOpsItemIdUndefined: Self = StObject.set(x, "OpsItemId", js.undefined)
    
    inline def setPriority(value: OpsItemPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setSeverity(value: OpsItemSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    inline def setSource(value: OpsItemSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStatus(value: OpsItemStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTitle(value: OpsItemTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
