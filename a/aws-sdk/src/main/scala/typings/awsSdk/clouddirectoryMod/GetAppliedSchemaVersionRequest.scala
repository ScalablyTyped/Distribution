package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppliedSchemaVersionRequest extends StObject {
  
  /**
    * The ARN of the applied schema.
    */
  var SchemaArn: Arn
}
object GetAppliedSchemaVersionRequest {
  
  inline def apply(SchemaArn: Arn): GetAppliedSchemaVersionRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppliedSchemaVersionRequest]
  }
  
  extension [Self <: GetAppliedSchemaVersionRequest](x: Self) {
    
    inline def setSchemaArn(value: Arn): Self = StObject.set(x, "SchemaArn", value.asInstanceOf[js.Any])
  }
}
