package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventTypesResult extends StObject {
  
  /**
    * An array of event types.
    */
  var eventTypes: js.UndefOr[eventTypeList] = js.native
  
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object GetEventTypesResult {
  
  @scala.inline
  def apply(): GetEventTypesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventTypesResult]
  }
  
  @scala.inline
  implicit class GetEventTypesResultMutableBuilder[Self <: GetEventTypesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTypes(value: eventTypeList): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
    
    @scala.inline
    def setEventTypesVarargs(value: EventType*): Self = StObject.set(x, "eventTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
