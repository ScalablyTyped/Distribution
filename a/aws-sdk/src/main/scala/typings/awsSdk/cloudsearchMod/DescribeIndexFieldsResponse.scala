package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIndexFieldsResponse extends StObject {
  
  /**
    * The index fields configured for the domain.
    */
  var IndexFields: IndexFieldStatusList = js.native
}
object DescribeIndexFieldsResponse {
  
  @scala.inline
  def apply(IndexFields: IndexFieldStatusList): DescribeIndexFieldsResponse = {
    val __obj = js.Dynamic.literal(IndexFields = IndexFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexFieldsResponse]
  }
  
  @scala.inline
  implicit class DescribeIndexFieldsResponseMutableBuilder[Self <: DescribeIndexFieldsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexFields(value: IndexFieldStatusList): Self = StObject.set(x, "IndexFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexFieldsVarargs(value: IndexFieldStatus*): Self = StObject.set(x, "IndexFields", js.Array(value :_*))
  }
}
