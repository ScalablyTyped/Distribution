package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMultiplexResponse extends js.Object {
  
  /**
    * The newly created multiplex.
    */
  var Multiplex: js.UndefOr[typings.awsSdk.medialiveMod.Multiplex] = js.native
}
object CreateMultiplexResponse {
  
  @scala.inline
  def apply(): CreateMultiplexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMultiplexResponse]
  }
  
  @scala.inline
  implicit class CreateMultiplexResponseOps[Self <: CreateMultiplexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMultiplex(value: Multiplex): Self = this.set("Multiplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplex: Self = this.set("Multiplex", js.undefined)
  }
}
