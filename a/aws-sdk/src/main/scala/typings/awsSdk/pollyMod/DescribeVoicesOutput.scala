package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVoicesOutput extends StObject {
  
  /**
    * The pagination token to use in the next request to continue the listing of voices. NextToken is returned only if the response is truncated.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pollyMod.NextToken] = js.undefined
  
  /**
    * A list of voices with their properties.
    */
  var Voices: js.UndefOr[VoiceList] = js.undefined
}
object DescribeVoicesOutput {
  
  @scala.inline
  def apply(): DescribeVoicesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVoicesOutput]
  }
  
  @scala.inline
  implicit class DescribeVoicesOutputMutableBuilder[Self <: DescribeVoicesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVoices(value: VoiceList): Self = StObject.set(x, "Voices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoicesUndefined: Self = StObject.set(x, "Voices", js.undefined)
    
    @scala.inline
    def setVoicesVarargs(value: Voice*): Self = StObject.set(x, "Voices", js.Array(value :_*))
  }
}
