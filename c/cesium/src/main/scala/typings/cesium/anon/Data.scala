package typings.cesium.anon

import typings.cesium.mod.JulianDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var isStartIncluded: js.UndefOr[Boolean] = js.native
  
  var isStopIncluded: js.UndefOr[Boolean] = js.native
  
  var start: js.UndefOr[JulianDate] = js.native
  
  var stop: js.UndefOr[JulianDate] = js.native
}
object Data {
  
  @scala.inline
  def apply(): Data = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setIsStartIncluded(value: Boolean): Self = StObject.set(x, "isStartIncluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStartIncludedUndefined: Self = StObject.set(x, "isStartIncluded", js.undefined)
    
    @scala.inline
    def setIsStopIncluded(value: Boolean): Self = StObject.set(x, "isStopIncluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStopIncludedUndefined: Self = StObject.set(x, "isStopIncluded", js.undefined)
    
    @scala.inline
    def setStart(value: JulianDate): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: JulianDate): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
