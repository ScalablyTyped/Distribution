package typings.awsSdk.cloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestStatus extends StObject {
  
  /**
    * The encrypted resource ID for the request.
    */
  var rid: js.UndefOr[String] = js.native
  
  /**
    * How long it took to process the request, in milliseconds.
    */
  var timems: js.UndefOr[Long] = js.native
}
object SuggestStatus {
  
  @scala.inline
  def apply(): SuggestStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestStatus]
  }
  
  @scala.inline
  implicit class SuggestStatusMutableBuilder[Self <: SuggestStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRid(value: String): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRidUndefined: Self = StObject.set(x, "rid", js.undefined)
    
    @scala.inline
    def setTimems(value: Long): Self = StObject.set(x, "timems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimemsUndefined: Self = StObject.set(x, "timems", js.undefined)
  }
}
