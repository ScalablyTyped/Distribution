package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIntegrationItem extends StObject {
  
  /**
    * The timestamp of when the domain was created.
    */
  var CreatedAt: js.Date
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * Boolean to indicate if the Flow associated with the Integration is created via Appflow console or with ObjectTypeName equals _unstructured via API/CLI in flowDefinition
    */
  var IsUnstructured: js.UndefOr[optionalBoolean] = js.undefined
  
  /**
    * The timestamp of when the domain was most recently edited.
    */
  var LastUpdatedAt: js.Date
  
  /**
    * The name of the profile object type.
    */
  var ObjectTypeName: js.UndefOr[typeName] = js.undefined
  
  /**
    * A map in which each key is an event type from an external application such as Segment or Shopify, and each value is an ObjectTypeName (template) used to ingest the event. It supports the following event types: SegmentIdentify, ShopifyCreateCustomers, ShopifyUpdateCustomers, ShopifyCreateDraftOrders, ShopifyUpdateDraftOrders, ShopifyCreateOrders, and ShopifyUpdatedOrders.
    */
  var ObjectTypeNames: js.UndefOr[typings.awsSdk.customerprofilesMod.ObjectTypeNames] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The URI of the S3 bucket or any other type of data source.
    */
  var Uri: string1To255
  
  /**
    * Unique identifier for the workflow.
    */
  var WorkflowId: js.UndefOr[string1To255] = js.undefined
}
object ListIntegrationItem {
  
  inline def apply(CreatedAt: js.Date, DomainName: name, LastUpdatedAt: js.Date, Uri: string1To255): ListIntegrationItem = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], LastUpdatedAt = LastUpdatedAt.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIntegrationItem]
  }
  
  extension [Self <: ListIntegrationItem](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setIsUnstructured(value: optionalBoolean): Self = StObject.set(x, "IsUnstructured", value.asInstanceOf[js.Any])
    
    inline def setIsUnstructuredUndefined: Self = StObject.set(x, "IsUnstructured", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeName(value: typeName): Self = StObject.set(x, "ObjectTypeName", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNameUndefined: Self = StObject.set(x, "ObjectTypeName", js.undefined)
    
    inline def setObjectTypeNames(value: ObjectTypeNames): Self = StObject.set(x, "ObjectTypeNames", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNamesUndefined: Self = StObject.set(x, "ObjectTypeNames", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setUri(value: string1To255): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
    
    inline def setWorkflowId(value: string1To255): Self = StObject.set(x, "WorkflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "WorkflowId", js.undefined)
  }
}
