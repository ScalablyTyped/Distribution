package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperatingSystem extends StObject {
  
  /**
    * The operating system.
    */
  var Type: js.UndefOr[OperatingSystemType] = js.native
}
object OperatingSystem {
  
  @scala.inline
  def apply(): OperatingSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystem]
  }
  
  @scala.inline
  implicit class OperatingSystemMutableBuilder[Self <: OperatingSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: OperatingSystemType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
