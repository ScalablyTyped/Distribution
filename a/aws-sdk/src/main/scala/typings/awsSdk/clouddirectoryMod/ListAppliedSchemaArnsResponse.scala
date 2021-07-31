package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppliedSchemaArnsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
  
  /**
    * The ARNs of schemas that are applied to the directory.
    */
  var SchemaArns: js.UndefOr[Arns] = js.undefined
}
object ListAppliedSchemaArnsResponse {
  
  @scala.inline
  def apply(): ListAppliedSchemaArnsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAppliedSchemaArnsResponse]
  }
  
  @scala.inline
  implicit class ListAppliedSchemaArnsResponseMutableBuilder[Self <: ListAppliedSchemaArnsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSchemaArns(value: Arns): Self = StObject.set(x, "SchemaArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnsUndefined: Self = StObject.set(x, "SchemaArns", js.undefined)
    
    @scala.inline
    def setSchemaArnsVarargs(value: Arn*): Self = StObject.set(x, "SchemaArns", js.Array(value :_*))
  }
}
