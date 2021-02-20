package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOTAUpdatesResponse extends StObject {
  
  /**
    * A token to use to get the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of OTA update jobs.
    */
  var otaUpdates: js.UndefOr[OTAUpdatesSummary] = js.native
}
object ListOTAUpdatesResponse {
  
  @scala.inline
  def apply(): ListOTAUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOTAUpdatesResponse]
  }
  
  @scala.inline
  implicit class ListOTAUpdatesResponseMutableBuilder[Self <: ListOTAUpdatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setOtaUpdates(value: OTAUpdatesSummary): Self = StObject.set(x, "otaUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtaUpdatesUndefined: Self = StObject.set(x, "otaUpdates", js.undefined)
    
    @scala.inline
    def setOtaUpdatesVarargs(value: OTAUpdateSummary*): Self = StObject.set(x, "otaUpdates", js.Array(value :_*))
  }
}
