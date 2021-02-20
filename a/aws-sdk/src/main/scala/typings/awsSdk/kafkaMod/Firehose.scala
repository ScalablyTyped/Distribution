package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firehose extends StObject {
  
  var DeliveryStream: js.UndefOr[string] = js.native
  
  var Enabled: boolean = js.native
}
object Firehose {
  
  @scala.inline
  def apply(Enabled: boolean): Firehose = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firehose]
  }
  
  @scala.inline
  implicit class FirehoseMutableBuilder[Self <: Firehose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStream(value: string): Self = StObject.set(x, "DeliveryStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamUndefined: Self = StObject.set(x, "DeliveryStream", js.undefined)
    
    @scala.inline
    def setEnabled(value: boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
