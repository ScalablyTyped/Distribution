package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIndexRequest extends StObject {
  
  /**
    * The index name.
    */
  var indexName: IndexName
}
object DescribeIndexRequest {
  
  @scala.inline
  def apply(indexName: IndexName): DescribeIndexRequest = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexRequest]
  }
  
  @scala.inline
  implicit class DescribeIndexRequestMutableBuilder[Self <: DescribeIndexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
  }
}
