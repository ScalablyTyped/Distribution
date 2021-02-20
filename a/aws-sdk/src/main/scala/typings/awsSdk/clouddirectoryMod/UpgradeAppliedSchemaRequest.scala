package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeAppliedSchemaRequest extends StObject {
  
  /**
    * The ARN for the directory to which the upgraded schema will be applied.
    */
  var DirectoryArn: Arn = js.native
  
  /**
    * Used for testing whether the major version schemas are backward compatible or not. If schema compatibility fails, an exception would be thrown else the call would succeed but no changes will be saved. This parameter is optional.
    */
  var DryRun: js.UndefOr[Bool] = js.native
  
  /**
    * The revision of the published schema to upgrade the directory to.
    */
  var PublishedSchemaArn: Arn = js.native
}
object UpgradeAppliedSchemaRequest {
  
  @scala.inline
  def apply(DirectoryArn: Arn, PublishedSchemaArn: Arn): UpgradeAppliedSchemaRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], PublishedSchemaArn = PublishedSchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeAppliedSchemaRequest]
  }
  
  @scala.inline
  implicit class UpgradeAppliedSchemaRequestMutableBuilder[Self <: UpgradeAppliedSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Bool): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPublishedSchemaArn(value: Arn): Self = StObject.set(x, "PublishedSchemaArn", value.asInstanceOf[js.Any])
  }
}
