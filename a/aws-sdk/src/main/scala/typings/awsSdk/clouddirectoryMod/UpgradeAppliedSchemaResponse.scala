package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradeAppliedSchemaResponse extends StObject {
  
  /**
    * The ARN of the directory that is returned as part of the response.
    */
  var DirectoryArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ARN of the upgraded schema that is returned as part of the response.
    */
  var UpgradedSchemaArn: js.UndefOr[Arn] = js.native
}
object UpgradeAppliedSchemaResponse {
  
  @scala.inline
  def apply(): UpgradeAppliedSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeAppliedSchemaResponse]
  }
  
  @scala.inline
  implicit class UpgradeAppliedSchemaResponseMutableBuilder[Self <: UpgradeAppliedSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryArnUndefined: Self = StObject.set(x, "DirectoryArn", js.undefined)
    
    @scala.inline
    def setUpgradedSchemaArn(value: Arn): Self = StObject.set(x, "UpgradedSchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradedSchemaArnUndefined: Self = StObject.set(x, "UpgradedSchemaArn", js.undefined)
  }
}
