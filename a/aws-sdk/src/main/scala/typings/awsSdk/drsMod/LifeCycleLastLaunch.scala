package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycleLastLaunch extends StObject {
  
  /**
    * An object containing information regarding the initiation of the last launch of a Source Server.
    */
  var initiated: js.UndefOr[LifeCycleLastLaunchInitiated] = js.undefined
}
object LifeCycleLastLaunch {
  
  inline def apply(): LifeCycleLastLaunch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycleLastLaunch]
  }
  
  extension [Self <: LifeCycleLastLaunch](x: Self) {
    
    inline def setInitiated(value: LifeCycleLastLaunchInitiated): Self = StObject.set(x, "initiated", value.asInstanceOf[js.Any])
    
    inline def setInitiatedUndefined: Self = StObject.set(x, "initiated", js.undefined)
  }
}
