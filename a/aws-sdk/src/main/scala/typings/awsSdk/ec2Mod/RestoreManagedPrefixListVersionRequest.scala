package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreManagedPrefixListVersionRequest extends StObject {
  
  /**
    * The current version number for the prefix list.
    */
  var CurrentVersion: Long = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: PrefixListResourceId = js.native
  
  /**
    * The version to restore.
    */
  var PreviousVersion: Long = js.native
}
object RestoreManagedPrefixListVersionRequest {
  
  @scala.inline
  def apply(CurrentVersion: Long, PrefixListId: PrefixListResourceId, PreviousVersion: Long): RestoreManagedPrefixListVersionRequest = {
    val __obj = js.Dynamic.literal(CurrentVersion = CurrentVersion.asInstanceOf[js.Any], PrefixListId = PrefixListId.asInstanceOf[js.Any], PreviousVersion = PreviousVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreManagedPrefixListVersionRequest]
  }
  
  @scala.inline
  implicit class RestoreManagedPrefixListVersionRequestMutableBuilder[Self <: RestoreManagedPrefixListVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentVersion(value: Long): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousVersion(value: Long): Self = StObject.set(x, "PreviousVersion", value.asInstanceOf[js.Any])
  }
}
