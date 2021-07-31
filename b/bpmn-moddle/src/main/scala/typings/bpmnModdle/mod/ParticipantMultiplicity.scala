package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantMultiplicity
  extends StObject
     with BaseElement {
  
  var maximum: Double
  
  var minimum: Double
}
object ParticipantMultiplicity {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, id: String, maximum: Double, minimum: Double): ParticipantMultiplicity = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantMultiplicity]
  }
  
  @scala.inline
  implicit class ParticipantMultiplicityMutableBuilder[Self <: ParticipantMultiplicity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
  }
}
