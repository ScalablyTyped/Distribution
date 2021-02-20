package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInstanceAccessOutput extends StObject {
  
  /**
    * The connection information for a fleet instance, including IP address and access credentials.
    */
  var InstanceAccess: js.UndefOr[typings.awsSdk.gameliftMod.InstanceAccess] = js.native
}
object GetInstanceAccessOutput {
  
  @scala.inline
  def apply(): GetInstanceAccessOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceAccessOutput]
  }
  
  @scala.inline
  implicit class GetInstanceAccessOutputMutableBuilder[Self <: GetInstanceAccessOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceAccess(value: InstanceAccess): Self = StObject.set(x, "InstanceAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceAccessUndefined: Self = StObject.set(x, "InstanceAccess", js.undefined)
  }
}
