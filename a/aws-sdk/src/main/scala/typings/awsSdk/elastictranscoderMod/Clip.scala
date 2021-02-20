package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clip extends StObject {
  
  /**
    * Settings that determine when a clip begins and how long it lasts.
    */
  var TimeSpan: js.UndefOr[typings.awsSdk.elastictranscoderMod.TimeSpan] = js.native
}
object Clip {
  
  @scala.inline
  def apply(): Clip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clip]
  }
  
  @scala.inline
  implicit class ClipMutableBuilder[Self <: Clip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeSpan(value: TimeSpan): Self = StObject.set(x, "TimeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSpanUndefined: Self = StObject.set(x, "TimeSpan", js.undefined)
  }
}
