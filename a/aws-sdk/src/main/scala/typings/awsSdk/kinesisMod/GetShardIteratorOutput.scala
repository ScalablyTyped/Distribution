package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetShardIteratorOutput extends StObject {
  
  /**
    * The position in the shard from which to start reading data records sequentially. A shard iterator specifies this position using the sequence number of a data record in a shard.
    */
  var ShardIterator: js.UndefOr[typings.awsSdk.kinesisMod.ShardIterator] = js.native
}
object GetShardIteratorOutput {
  
  @scala.inline
  def apply(): GetShardIteratorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetShardIteratorOutput]
  }
  
  @scala.inline
  implicit class GetShardIteratorOutputMutableBuilder[Self <: GetShardIteratorOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShardIterator(value: ShardIterator): Self = StObject.set(x, "ShardIterator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardIteratorUndefined: Self = StObject.set(x, "ShardIterator", js.undefined)
  }
}
