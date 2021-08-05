package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreManagedPrefixListVersionRequest extends StObject {
  
  /**
    * The current version number for the prefix list.
    */
  var CurrentVersion: Long
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: PrefixListResourceId
  
  /**
    * The version to restore.
    */
  var PreviousVersion: Long
}
object RestoreManagedPrefixListVersionRequest {
  
  inline def apply(CurrentVersion: Long, PrefixListId: PrefixListResourceId, PreviousVersion: Long): RestoreManagedPrefixListVersionRequest = {
    val __obj = js.Dynamic.literal(CurrentVersion = CurrentVersion.asInstanceOf[js.Any], PrefixListId = PrefixListId.asInstanceOf[js.Any], PreviousVersion = PreviousVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreManagedPrefixListVersionRequest]
  }
  
  extension [Self <: RestoreManagedPrefixListVersionRequest](x: Self) {
    
    inline def setCurrentVersion(value: Long): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPreviousVersion(value: Long): Self = StObject.set(x, "PreviousVersion", value.asInstanceOf[js.Any])
  }
}
