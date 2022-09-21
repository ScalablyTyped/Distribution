package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOutpostOutput extends StObject {
  
  var Outpost: js.UndefOr[typings.awsSdk.outpostsMod.Outpost] = js.undefined
}
object UpdateOutpostOutput {
  
  inline def apply(): UpdateOutpostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateOutpostOutput]
  }
  
  extension [Self <: UpdateOutpostOutput](x: Self) {
    
    inline def setOutpost(value: Outpost): Self = StObject.set(x, "Outpost", value.asInstanceOf[js.Any])
    
    inline def setOutpostUndefined: Self = StObject.set(x, "Outpost", js.undefined)
  }
}
