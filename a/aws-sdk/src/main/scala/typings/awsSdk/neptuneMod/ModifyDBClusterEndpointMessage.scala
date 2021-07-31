package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBClusterEndpointMessage extends StObject {
  
  /**
    * The identifier of the endpoint to modify. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String
  
  /**
    * The type of the endpoint. One of: READER, WRITER, ANY.
    */
  var EndpointType: js.UndefOr[String] = js.undefined
  
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.undefined
  
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.undefined
}
object ModifyDBClusterEndpointMessage {
  
  @scala.inline
  def apply(DBClusterEndpointIdentifier: String): ModifyDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterEndpointMessage]
  }
  
  @scala.inline
  implicit class ModifyDBClusterEndpointMessageMutableBuilder[Self <: ModifyDBClusterEndpointMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterEndpointIdentifier(value: String): Self = StObject.set(x, "DBClusterEndpointIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointType(value: String): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
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
  }
}
