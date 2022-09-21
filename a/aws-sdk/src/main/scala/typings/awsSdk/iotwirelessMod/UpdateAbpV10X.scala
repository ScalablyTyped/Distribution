package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAbpV10X extends StObject {
  
  /**
    * The FCnt init value.
    */
  var FCntStart: js.UndefOr[typings.awsSdk.iotwirelessMod.FCntStart] = js.undefined
}
object UpdateAbpV10X {
  
  inline def apply(): UpdateAbpV10X = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAbpV10X]
  }
  
  extension [Self <: UpdateAbpV10X](x: Self) {
    
    inline def setFCntStart(value: FCntStart): Self = StObject.set(x, "FCntStart", value.asInstanceOf[js.Any])
    
    inline def setFCntStartUndefined: Self = StObject.set(x, "FCntStart", js.undefined)
  }
}
