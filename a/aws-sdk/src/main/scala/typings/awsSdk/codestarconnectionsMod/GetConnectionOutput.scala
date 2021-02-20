package typings.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectionOutput extends StObject {
  
  /**
    * The connection details, such as status, owner, and provider type.
    */
  var Connection: js.UndefOr[typings.awsSdk.codestarconnectionsMod.Connection] = js.native
}
object GetConnectionOutput {
  
  @scala.inline
  def apply(): GetConnectionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionOutput]
  }
  
  @scala.inline
  implicit class GetConnectionOutputMutableBuilder[Self <: GetConnectionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
  }
}
