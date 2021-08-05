package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInventoryRetrievalJobDescriptionMod {
  
  trait InventoryRetrievalJobDescription extends StObject {
    
    /**
      * <p>The end of the date range in UTC for vault inventory retrieval that includes archives created before this date. This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.</p>
      */
    var EndDate: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The output format for the vault inventory list, which is set by the <b>InitiateJob</b> request when initiating a job to retrieve a vault inventory. Valid values are <code>CSV</code> and <code>JSON</code>.</p>
      */
    var Format: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The maximum number of inventory items returned per vault inventory retrieval request. This limit is set when initiating the job with the a <b>InitiateJob</b> request. </p>
      */
    var Limit: js.UndefOr[String] = js.undefined
    
    /**
      * <p>An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use the marker in a new <b>InitiateJob</b> request to obtain additional inventory items. If there are no more inventory items, this value is <code>null</code>. For more information, see <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html#api-initiate-job-post-vault-inventory-list-filtering"> Range Inventory Retrieval</a>.</p>
      */
    var Marker: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that includes archives created on or after this date. This value should be a string in the ISO 8601 date format, for example <code>2013-03-20T17:03:43Z</code>.</p>
      */
    var StartDate: js.UndefOr[String] = js.undefined
  }
  object InventoryRetrievalJobDescription {
    
    inline def apply(): InventoryRetrievalJobDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InventoryRetrievalJobDescription]
    }
    
    extension [Self <: InventoryRetrievalJobDescription](x: Self) {
      
      inline def setEndDate(value: String): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
      
      inline def setLimit(value: String): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
      
      inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
      
      inline def setStartDate(value: String): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    }
  }
  
  type UnmarshalledInventoryRetrievalJobDescription = InventoryRetrievalJobDescription
}
