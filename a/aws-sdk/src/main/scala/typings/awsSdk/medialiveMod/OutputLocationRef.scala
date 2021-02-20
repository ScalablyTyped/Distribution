package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputLocationRef extends StObject {
  
  var DestinationRefId: js.UndefOr[string] = js.native
}
object OutputLocationRef {
  
  @scala.inline
  def apply(): OutputLocationRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLocationRef]
  }
  
  @scala.inline
  implicit class OutputLocationRefMutableBuilder[Self <: OutputLocationRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationRefId(value: string): Self = StObject.set(x, "DestinationRefId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationRefIdUndefined: Self = StObject.set(x, "DestinationRefId", js.undefined)
  }
}
