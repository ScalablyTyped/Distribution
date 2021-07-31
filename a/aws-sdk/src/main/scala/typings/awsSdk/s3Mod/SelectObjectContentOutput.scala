package typings.awsSdk.s3Mod

import typings.awsSdk.anon.Cont
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectObjectContentOutput extends StObject {
  
  /**
    * The array of results.
    */
  var Payload: js.UndefOr[SelectObjectContentEventStream] = js.undefined
}
object SelectObjectContentOutput {
  
  @scala.inline
  def apply(): SelectObjectContentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectObjectContentOutput]
  }
  
  @scala.inline
  implicit class SelectObjectContentOutputMutableBuilder[Self <: SelectObjectContentOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: SelectObjectContentEventStream): Self = StObject.set(x, "Payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "Payload", js.undefined)
    
    @scala.inline
    def setPayloadVarargs(value: Cont*): Self = StObject.set(x, "Payload", js.Array(value :_*))
  }
}
