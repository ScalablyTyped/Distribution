package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceConnectorProperties extends StObject {
  
  /**
    * The properties that are applied when Marketo is being used as a source.
    */
  var Marketo: js.UndefOr[MarketoSourceProperties] = js.undefined
  
  /**
    * The properties that are applied when Amazon S3 is being used as the flow source.
    */
  var S3: js.UndefOr[S3SourceProperties] = js.undefined
  
  /**
    * The properties that are applied when Salesforce is being used as a source.
    */
  var Salesforce: js.UndefOr[SalesforceSourceProperties] = js.undefined
  
  /**
    * The properties that are applied when ServiceNow is being used as a source.
    */
  var ServiceNow: js.UndefOr[ServiceNowSourceProperties] = js.undefined
  
  /**
    * The properties that are applied when using Zendesk as a flow source.
    */
  var Zendesk: js.UndefOr[ZendeskSourceProperties] = js.undefined
}
object SourceConnectorProperties {
  
  inline def apply(): SourceConnectorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceConnectorProperties]
  }
  
  extension [Self <: SourceConnectorProperties](x: Self) {
    
    inline def setMarketo(value: MarketoSourceProperties): Self = StObject.set(x, "Marketo", value.asInstanceOf[js.Any])
    
    inline def setMarketoUndefined: Self = StObject.set(x, "Marketo", js.undefined)
    
    inline def setS3(value: S3SourceProperties): Self = StObject.set(x, "S3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "S3", js.undefined)
    
    inline def setSalesforce(value: SalesforceSourceProperties): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    inline def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    inline def setServiceNow(value: ServiceNowSourceProperties): Self = StObject.set(x, "ServiceNow", value.asInstanceOf[js.Any])
    
    inline def setServiceNowUndefined: Self = StObject.set(x, "ServiceNow", js.undefined)
    
    inline def setZendesk(value: ZendeskSourceProperties): Self = StObject.set(x, "Zendesk", value.asInstanceOf[js.Any])
    
    inline def setZendeskUndefined: Self = StObject.set(x, "Zendesk", js.undefined)
  }
}
