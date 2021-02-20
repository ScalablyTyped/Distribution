package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetModelStatus extends StObject {
  
  /**
    * Contains associated error information, if any.
    */
  var error: js.UndefOr[ErrorDetails] = js.native
  
  /**
    * The current state of the asset model.
    */
  var state: AssetModelState = js.native
}
object AssetModelStatus {
  
  @scala.inline
  def apply(state: AssetModelState): AssetModelStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelStatus]
  }
  
  @scala.inline
  implicit class AssetModelStatusMutableBuilder[Self <: AssetModelStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setState(value: AssetModelState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
