package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpgradePublishedSchemaResponse extends StObject {
  
  /**
    * The ARN of the upgraded schema that is returned as part of the response.
    */
  var UpgradedSchemaArn: js.UndefOr[Arn] = js.native
}
object UpgradePublishedSchemaResponse {
  
  @scala.inline
  def apply(): UpgradePublishedSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradePublishedSchemaResponse]
  }
  
  @scala.inline
  implicit class UpgradePublishedSchemaResponseMutableBuilder[Self <: UpgradePublishedSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUpgradedSchemaArn(value: Arn): Self = StObject.set(x, "UpgradedSchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpgradedSchemaArnUndefined: Self = StObject.set(x, "UpgradedSchemaArn", js.undefined)
  }
}
