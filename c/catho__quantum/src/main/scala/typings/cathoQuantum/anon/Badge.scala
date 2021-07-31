package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Badge extends StObject {
  
  var badge: js.UndefOr[js.Object] = js.undefined
}
object Badge {
  
  @scala.inline
  def apply(): Badge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Badge]
  }
  
  @scala.inline
  implicit class BadgeMutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadge(value: js.Object): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
  }
}
