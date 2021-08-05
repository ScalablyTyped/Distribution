package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBClusterEndpointMessage extends StObject {
  
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String
  
  /**
    * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: String
  
  /**
    * The type of the endpoint. One of: READER, WRITER, ANY.
    */
  var EndpointType: String
  
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.undefined
  
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.undefined
  
  /**
    * The tags to be assigned to the Amazon RDS resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDBClusterEndpointMessage {
  
  inline def apply(DBClusterEndpointIdentifier: String, DBClusterIdentifier: String, EndpointType: String): CreateDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier.asInstanceOf[js.Any], DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], EndpointType = EndpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterEndpointMessage]
  }
  
  extension [Self <: CreateDBClusterEndpointMessage](x: Self) {
    
    inline def setDBClusterEndpointIdentifier(value: String): Self = StObject.set(x, "DBClusterEndpointIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEndpointType(value: String): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setExcludedMembers(value: StringList): Self = StObject.set(x, "ExcludedMembers", value.asInstanceOf[js.Any])
    
    inline def setExcludedMembersUndefined: Self = StObject.set(x, "ExcludedMembers", js.undefined)
    
    inline def setExcludedMembersVarargs(value: String*): Self = StObject.set(x, "ExcludedMembers", js.Array(value :_*))
    
    inline def setStaticMembers(value: StringList): Self = StObject.set(x, "StaticMembers", value.asInstanceOf[js.Any])
    
    inline def setStaticMembersUndefined: Self = StObject.set(x, "StaticMembers", js.undefined)
    
    inline def setStaticMembersVarargs(value: String*): Self = StObject.set(x, "StaticMembers", js.Array(value :_*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
