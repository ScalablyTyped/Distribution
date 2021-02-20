package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradePublishedSchemaRequest extends StObject {
  
  /**
    * The ARN of the development schema with the changes used for the upgrade.
    */
  var DevelopmentSchemaArn: Arn = js.native
  
  /**
    * Used for testing whether the Development schema provided is backwards compatible, or not, with the publish schema provided by the user to be upgraded. If schema compatibility fails, an exception would be thrown else the call would succeed. This parameter is optional and defaults to false.
    */
  var DryRun: js.UndefOr[Bool] = js.native
  
  /**
    * Identifies the minor version of the published schema that will be created. This parameter is NOT optional.
    */
  var MinorVersion: Version = js.native
  
  /**
    * The ARN of the published schema to be upgraded.
    */
  var PublishedSchemaArn: Arn = js.native
}
object UpgradePublishedSchemaRequest {
  
  @scala.inline
  def apply(DevelopmentSchemaArn: Arn, MinorVersion: Version, PublishedSchemaArn: Arn): UpgradePublishedSchemaRequest = {
    val __obj = js.Dynamic.literal(DevelopmentSchemaArn = DevelopmentSchemaArn.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], PublishedSchemaArn = PublishedSchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradePublishedSchemaRequest]
  }
  
  @scala.inline
  implicit class UpgradePublishedSchemaRequestMutableBuilder[Self <: UpgradePublishedSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevelopmentSchemaArn(value: Arn): Self = StObject.set(x, "DevelopmentSchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Bool): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setMinorVersion(value: Version): Self = StObject.set(x, "MinorVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedSchemaArn(value: Arn): Self = StObject.set(x, "PublishedSchemaArn", value.asInstanceOf[js.Any])
  }
}
