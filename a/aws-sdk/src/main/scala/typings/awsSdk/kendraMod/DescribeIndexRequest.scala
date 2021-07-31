package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIndexRequest extends StObject {
  
  /**
    * The name of the index to describe.
    */
  var Id: IndexId
}
object DescribeIndexRequest {
  
  @scala.inline
  def apply(Id: IndexId): DescribeIndexRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexRequest]
  }
  
  @scala.inline
  implicit class DescribeIndexRequestMutableBuilder[Self <: DescribeIndexRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IndexId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
