package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.selectTapp()
trait SelectTappConfig extends StObject {
  
  var id: js.UndefOr[Double] = js.undefined
  
  var internalName: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[Double] = js.undefined
  
  var showName: js.UndefOr[String] = js.undefined
}
object SelectTappConfig {
  
  @scala.inline
  def apply(): SelectTappConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectTappConfig]
  }
  
  @scala.inline
  implicit class SelectTappConfigMutableBuilder[Self <: SelectTappConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInternalName(value: String): Self = StObject.set(x, "internalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalNameUndefined: Self = StObject.set(x, "internalName", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowName(value: String): Self = StObject.set(x, "showName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNameUndefined: Self = StObject.set(x, "showName", js.undefined)
  }
}
