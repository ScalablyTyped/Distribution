package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMultiplexResponse extends StObject {
  
  /**
    * The updated multiplex.
    */
  var Multiplex: js.UndefOr[typings.awsSdk.medialiveMod.Multiplex] = js.native
}
object UpdateMultiplexResponse {
  
  @scala.inline
  def apply(): UpdateMultiplexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMultiplexResponse]
  }
  
  @scala.inline
  implicit class UpdateMultiplexResponseMutableBuilder[Self <: UpdateMultiplexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiplex(value: Multiplex): Self = StObject.set(x, "Multiplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplexUndefined: Self = StObject.set(x, "Multiplex", js.undefined)
  }
}
