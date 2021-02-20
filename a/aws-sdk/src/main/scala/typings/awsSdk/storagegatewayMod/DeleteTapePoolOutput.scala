package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTapePoolOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom tape pool being deleted.
    */
  var PoolARN: js.UndefOr[typings.awsSdk.storagegatewayMod.PoolARN] = js.native
}
object DeleteTapePoolOutput {
  
  @scala.inline
  def apply(): DeleteTapePoolOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTapePoolOutput]
  }
  
  @scala.inline
  implicit class DeleteTapePoolOutputMutableBuilder[Self <: DeleteTapePoolOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoolARN(value: PoolARN): Self = StObject.set(x, "PoolARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolARNUndefined: Self = StObject.set(x, "PoolARN", js.undefined)
  }
}
