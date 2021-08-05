package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeAppliedSchemaRequest extends StObject {
  
  /**
    * The ARN for the directory to which the upgraded schema will be applied.
    */
  var DirectoryArn: Arn
  
  /**
    * Used for testing whether the major version schemas are backward compatible or not. If schema compatibility fails, an exception would be thrown else the call would succeed but no changes will be saved. This parameter is optional.
    */
  var DryRun: js.UndefOr[Bool] = js.undefined
  
  /**
    * The revision of the published schema to upgrade the directory to.
    */
  var PublishedSchemaArn: Arn
}
object UpgradeAppliedSchemaRequest {
  
  inline def apply(DirectoryArn: Arn, PublishedSchemaArn: Arn): UpgradeAppliedSchemaRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], PublishedSchemaArn = PublishedSchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeAppliedSchemaRequest]
  }
  
  extension [Self <: UpgradeAppliedSchemaRequest](x: Self) {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Bool): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPublishedSchemaArn(value: Arn): Self = StObject.set(x, "PublishedSchemaArn", value.asInstanceOf[js.Any])
  }
}
