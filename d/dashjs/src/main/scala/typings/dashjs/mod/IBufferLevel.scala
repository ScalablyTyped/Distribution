package typings.dashjs.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBufferLevel extends StObject {
  
  var level: Double = js.native
  
  var t: Date = js.native
}
object IBufferLevel {
  
  @scala.inline
  def apply(level: Double, t: Date): IBufferLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBufferLevel]
  }
  
  @scala.inline
  implicit class IBufferLevelMutableBuilder[Self <: IBufferLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: Date): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
