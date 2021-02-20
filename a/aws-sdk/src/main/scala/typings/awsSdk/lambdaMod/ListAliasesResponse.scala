package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAliasesResponse extends StObject {
  
  /**
    * A list of aliases.
    */
  var Aliases: js.UndefOr[AliasList] = js.native
  
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
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
    def setAliasesVarargs(value: AliasConfiguration*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
