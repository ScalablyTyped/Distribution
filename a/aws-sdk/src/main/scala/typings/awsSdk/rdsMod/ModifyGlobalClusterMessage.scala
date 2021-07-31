package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyGlobalClusterMessage extends StObject {
  
  /**
    *  Indicates if the global database cluster has deletion protection enabled. The global database cluster can't be deleted when deletion protection is enabled. 
    */
  var DeletionProtection: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    *  The DB cluster identifier for the global cluster being modified. This parameter isn't case-sensitive.  Constraints:   Must match the identifier of an existing global database cluster.  
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    *  The new cluster identifier for the global database cluster when modifying a global database cluster. This value is stored as a lowercase string.  Constraints:   Must contain from 1 to 63 letters, numbers, or hyphens   The first character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster2 
    */
  var NewGlobalClusterIdentifier: js.UndefOr[String] = js.undefined
}
object ModifyGlobalClusterMessage {
  
  @scala.inline
  def apply(): ModifyGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyGlobalClusterMessage]
  }
  
  @scala.inline
  implicit class ModifyGlobalClusterMessageMutableBuilder[Self <: ModifyGlobalClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletionProtection(value: BooleanOptional): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    @scala.inline
    def setGlobalClusterIdentifier(value: String): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "GlobalClusterIdentifier", js.undefined)
    
    @scala.inline
    def setNewGlobalClusterIdentifier(value: String): Self = StObject.set(x, "NewGlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewGlobalClusterIdentifierUndefined: Self = StObject.set(x, "NewGlobalClusterIdentifier", js.undefined)
  }
}
