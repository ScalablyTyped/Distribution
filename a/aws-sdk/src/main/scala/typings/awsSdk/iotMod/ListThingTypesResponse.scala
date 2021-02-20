package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingTypesResponse extends StObject {
  
  /**
    * The token for the next set of results. Will not be returned if operation has returned all results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The thing types.
    */
  var thingTypes: js.UndefOr[ThingTypeList] = js.native
}
object ListThingTypesResponse {
  
  @scala.inline
  def apply(): ListThingTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingTypesResponse]
  }
  
  @scala.inline
  implicit class ListThingTypesResponseMutableBuilder[Self <: ListThingTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setThingTypes(value: ThingTypeList): Self = StObject.set(x, "thingTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypesUndefined: Self = StObject.set(x, "thingTypes", js.undefined)
    
    @scala.inline
    def setThingTypesVarargs(value: ThingTypeDefinition*): Self = StObject.set(x, "thingTypes", js.Array(value :_*))
  }
}
