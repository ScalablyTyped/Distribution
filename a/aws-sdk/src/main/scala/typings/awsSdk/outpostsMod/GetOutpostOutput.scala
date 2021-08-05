package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOutpostOutput extends StObject {
  
  var Outpost: js.UndefOr[typings.awsSdk.outpostsMod.Outpost] = js.undefined
}
object GetOutpostOutput {
  
  inline def apply(): GetOutpostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutpostOutput]
  }
  
  extension [Self <: GetOutpostOutput](x: Self) {
    
    inline def setOutpost(value: Outpost): Self = StObject.set(x, "Outpost", value.asInstanceOf[js.Any])
    
    inline def setOutpostUndefined: Self = StObject.set(x, "Outpost", js.undefined)
  }
}
