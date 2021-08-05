package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clip extends StObject {
  
  /**
    * Settings that determine when a clip begins and how long it lasts.
    */
  var TimeSpan: js.UndefOr[typings.awsSdk.elastictranscoderMod.TimeSpan] = js.undefined
}
object Clip {
  
  inline def apply(): Clip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clip]
  }
  
  extension [Self <: Clip](x: Self) {
    
    inline def setTimeSpan(value: TimeSpan): Self = StObject.set(x, "TimeSpan", value.asInstanceOf[js.Any])
    
    inline def setTimeSpanUndefined: Self = StObject.set(x, "TimeSpan", js.undefined)
  }
}
