package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestConnectionResponse extends StObject {
  
  /**
    * The connection tested.
    */
  var Connection: js.UndefOr[typings.awsSdk.dmsMod.Connection] = js.native
}
object TestConnectionResponse {
  
  @scala.inline
  def apply(): TestConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestConnectionResponse]
  }
  
  @scala.inline
  implicit class TestConnectionResponseMutableBuilder[Self <: TestConnectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
