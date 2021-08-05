package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputLocationRef extends StObject {
  
  var DestinationRefId: js.UndefOr[string] = js.undefined
}
object OutputLocationRef {
  
  inline def apply(): OutputLocationRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLocationRef]
  }
  
  extension [Self <: OutputLocationRef](x: Self) {
    
    inline def setDestinationRefId(value: string): Self = StObject.set(x, "DestinationRefId", value.asInstanceOf[js.Any])
    
    inline def setDestinationRefIdUndefined: Self = StObject.set(x, "DestinationRefId", js.undefined)
  }
}
