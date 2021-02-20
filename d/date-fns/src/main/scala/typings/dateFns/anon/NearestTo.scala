package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NearestTo extends StObject {
  
  var nearestTo: js.UndefOr[Double] = js.native
}
object NearestTo {
  
  @scala.inline
  def apply(): NearestTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearestTo]
  }
  
  @scala.inline
  implicit class NearestToMutableBuilder[Self <: NearestTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNearestTo(value: Double): Self = StObject.set(x, "nearestTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestToUndefined: Self = StObject.set(x, "nearestTo", js.undefined)
  }
}
