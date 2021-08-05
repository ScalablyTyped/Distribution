package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSchemaFromJsonResponse extends StObject {
  
  /**
    * The ARN of the schema to update.
    */
  var Arn: js.UndefOr[typings.awsSdk.clouddirectoryMod.Arn] = js.undefined
}
object PutSchemaFromJsonResponse {
  
  inline def apply(): PutSchemaFromJsonResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSchemaFromJsonResponse]
  }
  
  extension [Self <: PutSchemaFromJsonResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
