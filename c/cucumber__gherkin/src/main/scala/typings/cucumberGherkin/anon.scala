package typings.cucumberGherkin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cells extends StObject {
    
    var cells: js.Array[Location]
    
    var id: String
    
    var location: typings.cucumberMessages.mod.Location
  }
  object Cells {
    
    inline def apply(cells: js.Array[Location], id: String, location: typings.cucumberMessages.mod.Location): Cells = {
      val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cells]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cells] (val x: Self) extends AnyVal {
      
      inline def setCells(value: js.Array[Location]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(value: Location*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: typings.cucumberMessages.mod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var location: typings.cucumberMessages.mod.Location
    
    var value: String
  }
  object Location {
    
    inline def apply(location: typings.cucumberMessages.mod.Location, value: String): Location = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: typings.cucumberMessages.mod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
