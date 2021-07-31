package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeElasticsearchInstanceTypeLimitsRequest extends StObject {
  
  /**
    *  DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are querying for Elasticsearch  Limits  for existing domain. 
    */
  var DomainName: js.UndefOr[typings.awsSdk.esMod.DomainName] = js.undefined
  
  /**
    *  Version of Elasticsearch for which  Limits  are needed. 
    */
  var ElasticsearchVersion: ElasticsearchVersionString
  
  /**
    *  The instance type for an Elasticsearch cluster for which Elasticsearch  Limits  are needed. 
    */
  var InstanceType: ESPartitionInstanceType
}
object DescribeElasticsearchInstanceTypeLimitsRequest {
  
  @scala.inline
  def apply(ElasticsearchVersion: ElasticsearchVersionString, InstanceType: ESPartitionInstanceType): DescribeElasticsearchInstanceTypeLimitsRequest = {
    val __obj = js.Dynamic.literal(ElasticsearchVersion = ElasticsearchVersion.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeElasticsearchInstanceTypeLimitsRequest]
  }
  
  @scala.inline
  implicit class DescribeElasticsearchInstanceTypeLimitsRequestMutableBuilder[Self <: DescribeElasticsearchInstanceTypeLimitsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setElasticsearchVersion(value: ElasticsearchVersionString): Self = StObject.set(x, "ElasticsearchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: ESPartitionInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
  }
}
