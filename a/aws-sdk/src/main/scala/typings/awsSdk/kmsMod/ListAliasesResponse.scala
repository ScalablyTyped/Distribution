package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAliasesResponse extends StObject {
  
  /**
    * A list of aliases.
    */
  var Aliases: js.UndefOr[AliasList] = js.undefined
  
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.undefined
  
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.undefined
}
object ListAliasesResponse {
  
  @scala.inline
  def apply(): ListAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAliasesResponse]
  }
  
  @scala.inline
  implicit class ListAliasesResponseMutableBuilder[Self <: ListAliasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: AliasList): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: AliasListEntry*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: MarkerType): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setTruncated(value: BooleanType): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
  }
}
