package typings.chui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deletable extends StObject {
  
  var callback: js.UndefOr[js.Function] = js.undefined
  
  var deletable: js.UndefOr[Boolean] = js.undefined
  
  var deleteLabel: js.UndefOr[String] = js.undefined
  
  var doneLabel: js.UndefOr[String] = js.undefined
  
  var editLabel: js.UndefOr[String] = js.undefined
  
  var movable: js.UndefOr[Boolean] = js.undefined
}
object Deletable {
  
  inline def apply(): Deletable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deletable]
  }
  
  extension [Self <: Deletable](x: Self) {
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
    
    inline def setDeletableUndefined: Self = StObject.set(x, "deletable", js.undefined)
    
    inline def setDeleteLabel(value: String): Self = StObject.set(x, "deleteLabel", value.asInstanceOf[js.Any])
    
    inline def setDeleteLabelUndefined: Self = StObject.set(x, "deleteLabel", js.undefined)
    
    inline def setDoneLabel(value: String): Self = StObject.set(x, "doneLabel", value.asInstanceOf[js.Any])
    
    inline def setDoneLabelUndefined: Self = StObject.set(x, "doneLabel", js.undefined)
    
    inline def setEditLabel(value: String): Self = StObject.set(x, "editLabel", value.asInstanceOf[js.Any])
    
    inline def setEditLabelUndefined: Self = StObject.set(x, "editLabel", js.undefined)
    
    inline def setMovable(value: Boolean): Self = StObject.set(x, "movable", value.asInstanceOf[js.Any])
    
    inline def setMovableUndefined: Self = StObject.set(x, "movable", js.undefined)
  }
}
