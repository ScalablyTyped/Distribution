package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListManagedSchemaArnsResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.native
  
  /**
    * The ARNs for all AWS managed schemas.
    */
  var SchemaArns: js.UndefOr[Arns] = js.native
}
object ListManagedSchemaArnsResponse {
  
  @scala.inline
  def apply(): ListManagedSchemaArnsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManagedSchemaArnsResponse]
  }
  
  @scala.inline
  implicit class ListManagedSchemaArnsResponseMutableBuilder[Self <: ListManagedSchemaArnsResponse] (val x: Self) extends AnyVal {
    
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
