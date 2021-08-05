package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIndexFieldsResponse extends StObject {
  
  /**
    * The index fields configured for the domain.
    */
  var IndexFields: IndexFieldStatusList
}
object DescribeIndexFieldsResponse {
  
  inline def apply(IndexFields: IndexFieldStatusList): DescribeIndexFieldsResponse = {
    val __obj = js.Dynamic.literal(IndexFields = IndexFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexFieldsResponse]
  }
  
  extension [Self <: DescribeIndexFieldsResponse](x: Self) {
    
    inline def setIndexFields(value: IndexFieldStatusList): Self = StObject.set(x, "IndexFields", value.asInstanceOf[js.Any])
    
    inline def setIndexFieldsVarargs(value: IndexFieldStatus*): Self = StObject.set(x, "IndexFields", js.Array(value :_*))
  }
}
