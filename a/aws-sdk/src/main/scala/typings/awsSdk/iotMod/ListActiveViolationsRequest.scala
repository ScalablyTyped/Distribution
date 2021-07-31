package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListActiveViolationsRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The name of the Device Defender security profile for which violations are listed.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  
  /**
    * The name of the thing whose active violations are listed.
    */
  var thingName: js.UndefOr[DeviceDefenderThingName] = js.undefined
}
object ListActiveViolationsRequest {
  
  @scala.inline
  def apply(): ListActiveViolationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActiveViolationsRequest]
  }
  
  @scala.inline
  implicit class ListActiveViolationsRequestMutableBuilder[Self <: ListActiveViolationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
    
    @scala.inline
    def setThingName(value: DeviceDefenderThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
