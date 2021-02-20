package typings.awsSdk.s3Mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordsEvent extends StObject {
  
  /**
    * The byte array of partial, one or more result records.
    */
  var Payload: js.UndefOr[Buffer] = js.native
}
object RecordsEvent {
  
  @scala.inline
  def apply(): RecordsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordsEvent]
  }
  
  @scala.inline
  implicit class RecordsEventMutableBuilder[Self <: RecordsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Buffer): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
  }
}
