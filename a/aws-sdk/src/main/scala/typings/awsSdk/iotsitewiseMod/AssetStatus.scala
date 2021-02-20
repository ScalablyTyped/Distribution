package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetStatus extends StObject {
  
  /**
    * Contains associated error information, if any.
    */
  var error: js.UndefOr[ErrorDetails] = js.native
  
  /**
    * The current status of the asset.
    */
  var state: AssetState = js.native
}
object AssetStatus {
  
  @scala.inline
  def apply(state: AssetState): AssetStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetStatus]
  }
  
  @scala.inline
  implicit class AssetStatusMutableBuilder[Self <: AssetStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setState(value: AssetState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
