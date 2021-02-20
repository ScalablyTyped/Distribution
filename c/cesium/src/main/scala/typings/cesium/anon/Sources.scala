package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sources extends StObject {
  
  var show: js.UndefOr[Boolean] = js.native
  
  var sources: js.UndefOr[js.Any] = js.native
}
object Sources {
  
  @scala.inline
  def apply(): Sources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sources]
  }
  
  @scala.inline
  implicit class SourcesMutableBuilder[Self <: Sources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setSources(value: js.Any): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
  }
}
