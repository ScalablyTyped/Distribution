package typings.awsSdkBuildTypes.apiModelMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Long
  extends ShapeDef
     with Shape {
  
  var max: js.UndefOr[scala.Double] = js.native
  
  var min: js.UndefOr[scala.Double] = js.native
  
  @JSName("type")
  val type_Long: long = js.native
}
object Long {
  
  @scala.inline
  def apply(`type`: long): Long = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Long]
  }
  
  @scala.inline
  implicit class LongMutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: scala.Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: scala.Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setType(value: long): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
