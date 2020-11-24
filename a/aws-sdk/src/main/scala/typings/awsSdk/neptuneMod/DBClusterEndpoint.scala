package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBClusterEndpoint extends js.Object {
  
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
    * The current status of the endpoint. One of: creating, available, deleting, inactive, modifying. The inactive state applies to an endpoint that cannot be used for a certain kind of cluster, such as a writer endpoint for a read-only secondary cluster in a global database.
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
  implicit class DBClusterEndpointOps[Self <: DBClusterEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomEndpointType(value: String): Self = this.set("CustomEndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEndpointType: Self = this.set("CustomEndpointType", js.undefined)
    
    @scala.inline
    def setDBClusterEndpointArn(value: String): Self = this.set("DBClusterEndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterEndpointArn: Self = this.set("DBClusterEndpointArn", js.undefined)
    
    @scala.inline
    def setDBClusterEndpointIdentifier(value: String): Self = this.set("DBClusterEndpointIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterEndpointIdentifier: Self = this.set("DBClusterEndpointIdentifier", js.undefined)
    
    @scala.inline
    def setDBClusterEndpointResourceIdentifier(value: String): Self = this.set("DBClusterEndpointResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterEndpointResourceIdentifier: Self = this.set("DBClusterEndpointResourceIdentifier", js.undefined)
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBClusterIdentifier: Self = this.set("DBClusterIdentifier", js.undefined)
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    
    @scala.inline
    def setEndpointType(value: String): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointType: Self = this.set("EndpointType", js.undefined)
    
    @scala.inline
    def setExcludedMembersVarargs(value: String*): Self = this.set("ExcludedMembers", js.Array(value :_*))
    
    @scala.inline
    def setExcludedMembers(value: StringList): Self = this.set("ExcludedMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedMembers: Self = this.set("ExcludedMembers", js.undefined)
    
    @scala.inline
    def setStaticMembersVarargs(value: String*): Self = this.set("StaticMembers", js.Array(value :_*))
    
    @scala.inline
    def setStaticMembers(value: StringList): Self = this.set("StaticMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticMembers: Self = this.set("StaticMembers", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
