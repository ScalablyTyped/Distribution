package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStreamingDistributionsResult extends StObject {
  
  /**
    * The StreamingDistributionList type. 
    */
  var StreamingDistributionList: js.UndefOr[typings.awsSdk.cloudfrontMod.StreamingDistributionList] = js.native
}
object ListStreamingDistributionsResult {
  
  @scala.inline
  def apply(): ListStreamingDistributionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamingDistributionsResult]
  }
  
  @scala.inline
  implicit class ListStreamingDistributionsResultMutableBuilder[Self <: ListStreamingDistributionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamingDistributionList(value: StreamingDistributionList): Self = StObject.set(x, "StreamingDistributionList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingDistributionListUndefined: Self = StObject.set(x, "StreamingDistributionList", js.undefined)
  }
}
