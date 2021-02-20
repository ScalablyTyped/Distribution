package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapTypeControlOptions extends StObject {
  
  var mapTypes: js.UndefOr[js.Array[MapType]] = js.native
  
  var `type`: js.UndefOr[MapTypeControlType] = js.native
}
object MapTypeControlOptions {
  
  @scala.inline
  def apply(): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  
  @scala.inline
  implicit class MapTypeControlOptionsMutableBuilder[Self <: MapTypeControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapTypes(value: js.Array[MapType]): Self = StObject.set(x, "mapTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapTypesUndefined: Self = StObject.set(x, "mapTypes", js.undefined)
    
    @scala.inline
    def setMapTypesVarargs(value: MapType*): Self = StObject.set(x, "mapTypes", js.Array(value :_*))
    
    @scala.inline
    def setType(value: MapTypeControlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
