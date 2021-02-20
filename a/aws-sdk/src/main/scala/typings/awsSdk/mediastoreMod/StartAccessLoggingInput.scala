package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartAccessLoggingInput extends StObject {
  
  /**
    * The name of the container that you want to start access logging on.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}
object StartAccessLoggingInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName): StartAccessLoggingInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAccessLoggingInput]
  }
  
  @scala.inline
  implicit class StartAccessLoggingInputMutableBuilder[Self <: StartAccessLoggingInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerName(value: ContainerName): Self = StObject.set(x, "ContainerName", value.asInstanceOf[js.Any])
  }
}
