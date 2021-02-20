package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalCityResult extends StObject {
  
  var center: Point = js.native
  
  var level: Double = js.native
  
  var name: String = js.native
}
object LocalCityResult {
  
  @scala.inline
  def apply(center: Point, level: Double, name: String): LocalCityResult = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalCityResult]
  }
  
  @scala.inline
  implicit class LocalCityResultMutableBuilder[Self <: LocalCityResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
