package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSchemaFromJsonResponse extends StObject {
  
  /**
    * The ARN of the schema to update.
    */
  var Arn: js.UndefOr[typings.awsSdk.clouddirectoryMod.Arn] = js.native
}
object PutSchemaFromJsonResponse {
  
  @scala.inline
  def apply(): PutSchemaFromJsonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSchemaFromJsonResponse]
  }
  
  @scala.inline
  implicit class PutSchemaFromJsonResponseMutableBuilder[Self <: PutSchemaFromJsonResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
