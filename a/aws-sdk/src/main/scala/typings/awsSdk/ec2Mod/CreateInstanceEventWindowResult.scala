package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceEventWindowResult extends StObject {
  
  /**
    * Information about the event window.
    */
  var InstanceEventWindow: js.UndefOr[typings.awsSdk.ec2Mod.InstanceEventWindow] = js.undefined
}
object CreateInstanceEventWindowResult {
  
  inline def apply(): CreateInstanceEventWindowResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceEventWindowResult]
  }
  
  extension [Self <: CreateInstanceEventWindowResult](x: Self) {
    
    inline def setInstanceEventWindow(value: InstanceEventWindow): Self = StObject.set(x, "InstanceEventWindow", value.asInstanceOf[js.Any])
    
    inline def setInstanceEventWindowUndefined: Self = StObject.set(x, "InstanceEventWindow", js.undefined)
  }
}
