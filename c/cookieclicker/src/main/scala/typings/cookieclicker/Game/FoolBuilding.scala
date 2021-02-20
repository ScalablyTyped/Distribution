package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoolBuilding extends StObject {
  
  var desc: String = js.native
  
  var icon: js.Tuple2[Double, Double] = js.native
  
  var name: String = js.native
}
object FoolBuilding {
  
  @scala.inline
  def apply(desc: String, icon: js.Tuple2[Double, Double], name: String): FoolBuilding = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoolBuilding]
  }
  
  @scala.inline
  implicit class FoolBuildingMutableBuilder[Self <: FoolBuilding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
