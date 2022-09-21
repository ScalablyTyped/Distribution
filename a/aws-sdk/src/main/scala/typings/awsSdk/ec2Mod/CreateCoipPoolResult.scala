package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCoipPoolResult extends StObject {
  
  var CoipPool: js.UndefOr[typings.awsSdk.ec2Mod.CoipPool] = js.undefined
}
object CreateCoipPoolResult {
  
  inline def apply(): CreateCoipPoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCoipPoolResult]
  }
  
  extension [Self <: CreateCoipPoolResult](x: Self) {
    
    inline def setCoipPool(value: CoipPool): Self = StObject.set(x, "CoipPool", value.asInstanceOf[js.Any])
    
    inline def setCoipPoolUndefined: Self = StObject.set(x, "CoipPool", js.undefined)
  }
}
