package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterEndpoint extends StObject {
  
  /**
    * The type associated with a custom endpoint. One of: READER, WRITER, ANY.
    */
  var CustomEndpointType: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the endpoint.
    */
  var DBClusterEndpointArn: js.UndefOr[String] = js.native
  
  /**
    * The identifier associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A unique system-generated identifier for an endpoint. It remains the same for the whole life of the endpoint.
    */
  var DBClusterEndpointResourceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The DNS address of the endpoint.
    */
  var Endpoint: js.UndefOr[String] = js.native
  
  /**
    * The type of the endpoint. One of: READER, WRITER, CUSTOM.
    */
  var EndpointType: js.UndefOr[String] = js.native
  
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.native
  
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.native
  
  /**
    * The current status of the endpoint. One of: creating, available, deleting, inactive, modifying. The inactive state applies to an endpoint that can't be used for a certain kind of cluster, such as a writer endpoint for a read-only secondary cluster in a global database.
    */
  var Status: js.UndefOr[String] = js.native
}
object DBClusterEndpoint {
  
  @scala.inline
  def apply(): DBClusterEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterEndpoint]
  }
  
  @scala.inline
  implicit class DBClusterEndpointMutableBuilder[Self <: DBClusterEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomEndpointType(value: String): Self = StObject.set(x, "CustomEndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEndpointTypeUndefined: Self = StObject.set(x, "CustomEndpointType", js.undefined)
    
    @scala.inline
    def setDBClusterEndpointArn(value: String): Self = StObject.set(x, "DBClusterEndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterEndpointArnUndefined: Self = StObject.set(x, "DBClusterEndpointArn", js.undefined)
    
    @scala.inline
    def setDBClusterEndpointIdentifier(value: String): Self = StObject.set(x, "DBClusterEndpointIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterEndpointIdentifierUndefined: Self = StObject.set(x, "DBClusterEndpointIdentifier", js.undefined)
    
    @scala.inline
    def setDBClusterEndpointResourceIdentifier(value: String): Self = StObject.set(x, "DBClusterEndpointResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterEndpointResourceIdentifierUndefined: Self = StObject.set(x, "DBClusterEndpointResourceIdentifier", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointType(value: String): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setExcludedMembers(value: StringList): Self = StObject.set(x, "ExcludedMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedMembersUndefined: Self = StObject.set(x, "ExcludedMembers", js.undefined)
    
    @scala.inline
    def setExcludedMembersVarargs(value: String*): Self = StObject.set(x, "ExcludedMembers", js.Array(value :_*))
    
    @scala.inline
    def setStaticMembers(value: StringList): Self = StObject.set(x, "StaticMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticMembersUndefined: Self = StObject.set(x, "StaticMembers", js.undefined)
    
    @scala.inline
    def setStaticMembersVarargs(value: String*): Self = StObject.set(x, "StaticMembers", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
