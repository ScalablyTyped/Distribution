package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.double
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Double
  extends ShapeDef
     with Shape {
  
  var max: js.UndefOr[scala.Double] = js.native
  
  var min: js.UndefOr[scala.Double] = js.native
  
  @JSName("type")
  val type_Double: double = js.native
}
object Double {
  
  @scala.inline
  def apply(`type`: double): Double = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Double]
  }
  
  @scala.inline
  implicit class DoubleMutableBuilder[Self <: Double] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setType(value: double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
