package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticsearchSettings extends StObject {
  
  /**
    * The endpoint for the Elasticsearch cluster. AWS DMS uses HTTPS if a transport protocol (http/https) is not specified.
    */
  var EndpointUri: String
  
  /**
    * The maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster.
    */
  var ErrorRetryDuration: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The maximum percentage of records that can fail to be written before a full load operation stops. To avoid early failure, this counter is only effective after 1000 records are transferred. Elasticsearch also has the concept of error monitoring during the last 10 minutes of an Observation Window. If transfer of all records fail in the last 10 minutes, the full load operation stops. 
    */
  var FullLoadErrorPercentage: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) used by service to access the IAM role.
    */
  var ServiceAccessRoleArn: String
}
object ElasticsearchSettings {
  
  @scala.inline
  def apply(EndpointUri: String, ServiceAccessRoleArn: String): ElasticsearchSettings = {
    val __obj = js.Dynamic.literal(EndpointUri = EndpointUri.asInstanceOf[js.Any], ServiceAccessRoleArn = ServiceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchSettings]
  }
  
  @scala.inline
  implicit class ElasticsearchSettingsMutableBuilder[Self <: ElasticsearchSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointUri(value: String): Self = StObject.set(x, "EndpointUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorRetryDuration(value: IntegerOptional): Self = StObject.set(x, "ErrorRetryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorRetryDurationUndefined: Self = StObject.set(x, "ErrorRetryDuration", js.undefined)
    
    @scala.inline
    def setFullLoadErrorPercentage(value: IntegerOptional): Self = StObject.set(x, "FullLoadErrorPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullLoadErrorPercentageUndefined: Self = StObject.set(x, "FullLoadErrorPercentage", js.undefined)
    
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
  }
}
