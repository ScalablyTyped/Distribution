package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPartitionsResponse extends StObject {
  
  /**
    * A continuation token, if the returned list of partitions does not include the last one.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * A list of requested partitions.
    */
  var Partitions: js.UndefOr[PartitionList] = js.native
}
object GetPartitionsResponse {
  
  @scala.inline
  def apply(): GetPartitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPartitionsResponse]
  }
  
  @scala.inline
  implicit class GetPartitionsResponseMutableBuilder[Self <: GetPartitionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPartitions(value: PartitionList): Self = StObject.set(x, "Partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionsUndefined: Self = StObject.set(x, "Partitions", js.undefined)
    
    @scala.inline
    def setPartitionsVarargs(value: Partition*): Self = StObject.set(x, "Partitions", js.Array(value :_*))
  }
}
