package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workgroup extends StObject {
  
  /**
    * The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
    */
  var baseCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * An array of parameters to set for finer control over a database. The options are datestyle, enable_user_activity_logging, query_group, search_path, and max_query_execution_time.
    */
  var configParameters: js.UndefOr[ConfigParameterList] = js.undefined
  
  /**
    * The creation date of the workgroup.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The endpoint that is created from the workgroup.
    */
  var endpoint: js.UndefOr[Endpoint] = js.undefined
  
  /**
    * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC.
    */
  var enhancedVpcRouting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The namespace the workgroup is associated with.
    */
  var namespaceName: js.UndefOr[String] = js.undefined
  
  /**
    * A value that specifies whether the workgroup can be accessible from a public network
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of security group IDs to associate with the workgroup.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
  
  /**
    * The status of the workgroup.
    */
  var status: js.UndefOr[WorkgroupStatus] = js.undefined
  
  /**
    * An array of subnet IDs the workgroup is associated with.
    */
  var subnetIds: js.UndefOr[SubnetIdList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that links to the workgroup.
    */
  var workgroupArn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the workgroup.
    */
  var workgroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the workgroup.
    */
  var workgroupName: js.UndefOr[WorkgroupName] = js.undefined
}
object Workgroup {
  
  inline def apply(): Workgroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workgroup]
  }
  
  extension [Self <: Workgroup](x: Self) {
    
    inline def setBaseCapacity(value: Integer): Self = StObject.set(x, "baseCapacity", value.asInstanceOf[js.Any])
    
    inline def setBaseCapacityUndefined: Self = StObject.set(x, "baseCapacity", js.undefined)
    
    inline def setConfigParameters(value: ConfigParameterList): Self = StObject.set(x, "configParameters", value.asInstanceOf[js.Any])
    
    inline def setConfigParametersUndefined: Self = StObject.set(x, "configParameters", js.undefined)
    
    inline def setConfigParametersVarargs(value: ConfigParameter*): Self = StObject.set(x, "configParameters", js.Array(value*))
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEnhancedVpcRouting(value: Boolean): Self = StObject.set(x, "enhancedVpcRouting", value.asInstanceOf[js.Any])
    
    inline def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "enhancedVpcRouting", js.undefined)
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setStatus(value: WorkgroupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: SubnetId*): Self = StObject.set(x, "subnetIds", js.Array(value*))
    
    inline def setWorkgroupArn(value: String): Self = StObject.set(x, "workgroupArn", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupArnUndefined: Self = StObject.set(x, "workgroupArn", js.undefined)
    
    inline def setWorkgroupId(value: String): Self = StObject.set(x, "workgroupId", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupIdUndefined: Self = StObject.set(x, "workgroupId", js.undefined)
    
    inline def setWorkgroupName(value: WorkgroupName): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupNameUndefined: Self = StObject.set(x, "workgroupName", js.undefined)
  }
}
