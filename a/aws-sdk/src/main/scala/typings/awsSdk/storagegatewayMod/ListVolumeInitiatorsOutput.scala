package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVolumeInitiatorsOutput extends StObject {
  
  /**
    * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
    */
  var Initiators: js.UndefOr[typings.awsSdk.storagegatewayMod.Initiators] = js.native
}
object ListVolumeInitiatorsOutput {
  
  @scala.inline
  def apply(): ListVolumeInitiatorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVolumeInitiatorsOutput]
  }
  
  @scala.inline
  implicit class ListVolumeInitiatorsOutputMutableBuilder[Self <: ListVolumeInitiatorsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiators(value: Initiators): Self = StObject.set(x, "Initiators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitiatorsUndefined: Self = StObject.set(x, "Initiators", js.undefined)
    
    @scala.inline
    def setInitiatorsVarargs(value: Initiator*): Self = StObject.set(x, "Initiators", js.Array(value :_*))
  }
}
