package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sasl extends js.Object {
  
  /**
    * 
    Details for SASL/SCRAM client authentication.
    
    */
  var Scram: js.UndefOr[typings.awsSdk.kafkaMod.Scram] = js.native
}
object Sasl {
  
  @scala.inline
  def apply(): Sasl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sasl]
  }
  
  @scala.inline
  implicit class SaslOps[Self <: Sasl] (val x: Self) extends AnyVal {
    
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
    def setScram(value: Scram): Self = this.set("Scram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScram: Self = this.set("Scram", js.undefined)
  }
}
