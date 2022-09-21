package typings.baseui.anon

import typings.baseui.overridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelInteractable extends StObject {
  
  var LabelInteractable: Override[Any]
}
object LabelInteractable {
  
  inline def apply(LabelInteractable: Override[Any]): LabelInteractable = {
    val __obj = js.Dynamic.literal(LabelInteractable = LabelInteractable.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelInteractable]
  }
  
  extension [Self <: LabelInteractable](x: Self) {
    
    inline def setLabelInteractable(value: Override[Any]): Self = StObject.set(x, "LabelInteractable", value.asInstanceOf[js.Any])
  }
}
