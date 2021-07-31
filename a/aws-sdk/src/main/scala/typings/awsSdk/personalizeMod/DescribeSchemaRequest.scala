package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSchemaRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the schema to retrieve.
    */
  var schemaArn: Arn
}
object DescribeSchemaRequest {
  
  @scala.inline
  def apply(schemaArn: Arn): DescribeSchemaRequest = {
    val __obj = js.Dynamic.literal(schemaArn = schemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSchemaRequest]
  }
  
  @scala.inline
  implicit class DescribeSchemaRequestMutableBuilder[Self <: DescribeSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "schemaArn", value.asInstanceOf[js.Any])
  }
}
