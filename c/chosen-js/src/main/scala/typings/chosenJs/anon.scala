package typings.chosenJs

import typings.chosenJs.Chosen.SelectedData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Deselected
    extends StObject
       with SelectedData {
    
    /** When a selection option was unselected: the value of the unselected option. */
    var deselected: String
  }
  object Deselected {
    
    inline def apply(deselected: String): Deselected = {
      val __obj = js.Dynamic.literal(deselected = deselected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Deselected]
    }
    
    extension [Self <: Deselected](x: Self) {
      
      inline def setDeselected(value: String): Self = StObject.set(x, "deselected", value.asInstanceOf[js.Any])
    }
  }
  
  trait Selected
    extends StObject
       with SelectedData {
    
    /** When a new option was selected: the value of the newly selected option. */
    var selected: String
  }
  object Selected {
    
    inline def apply(selected: String): Selected = {
      val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Selected]
    }
    
    extension [Self <: Selected](x: Self) {
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
