package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContainersOptions extends TimeoutIntervalOptions {
  
  var include: js.UndefOr[String] = js.native
  
  var marker: String = js.native
  
  var maxresults: js.UndefOr[Double] = js.native
  
  var prefix: js.UndefOr[String] = js.native
}
object ListContainersOptions {
  
  @scala.inline
  def apply(marker: String): ListContainersOptions = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContainersOptions]
  }
  
  @scala.inline
  implicit class ListContainersOptionsMutableBuilder[Self <: ListContainersOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxresults(value: Double): Self = StObject.set(x, "maxresults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxresultsUndefined: Self = StObject.set(x, "maxresults", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
