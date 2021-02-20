package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTapePoolInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom tape pool to delete.
    */
  var PoolARN: typings.awsSdk.storagegatewayMod.PoolARN = js.native
}
object DeleteTapePoolInput {
  
  @scala.inline
  def apply(PoolARN: PoolARN): DeleteTapePoolInput = {
    val __obj = js.Dynamic.literal(PoolARN = PoolARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTapePoolInput]
  }
  
  @scala.inline
  implicit class DeleteTapePoolInputMutableBuilder[Self <: DeleteTapePoolInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPoolARN(value: PoolARN): Self = StObject.set(x, "PoolARN", value.asInstanceOf[js.Any])
  }
}
