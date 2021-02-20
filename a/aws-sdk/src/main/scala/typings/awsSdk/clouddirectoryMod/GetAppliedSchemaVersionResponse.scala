package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAppliedSchemaVersionResponse extends StObject {
  
  /**
    * Current applied schema ARN, including the minor version in use if one was provided.
    */
  var AppliedSchemaArn: js.UndefOr[Arn] = js.native
}
object GetAppliedSchemaVersionResponse {
  
  @scala.inline
  def apply(): GetAppliedSchemaVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAppliedSchemaVersionResponse]
  }
  
  @scala.inline
  implicit class GetAppliedSchemaVersionResponseMutableBuilder[Self <: GetAppliedSchemaVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppliedSchemaArn(value: Arn): Self = StObject.set(x, "AppliedSchemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedSchemaArnUndefined: Self = StObject.set(x, "AppliedSchemaArn", js.undefined)
  }
}
