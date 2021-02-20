package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsStartIncluded extends StObject {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var isStartIncluded: js.UndefOr[Boolean] = js.native
  
  var isStopIncluded: js.UndefOr[Boolean] = js.native
  
  var iso8601: String = js.native
}
object IsStartIncluded {
  
  @scala.inline
  def apply(iso8601: String): IsStartIncluded = {
    val __obj = js.Dynamic.literal(iso8601 = iso8601.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsStartIncluded]
  }
  
  @scala.inline
  implicit class IsStartIncludedMutableBuilder[Self <: IsStartIncluded] (val x: Self) extends AnyVal {
    
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
    def setIso8601(value: String): Self = StObject.set(x, "iso8601", value.asInstanceOf[js.Any])
  }
}
