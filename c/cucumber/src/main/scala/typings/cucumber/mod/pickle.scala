package typings.cucumber.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickle {
  
  trait Argument extends StObject {
    
    var rows: js.Array[Cell]
  }
  object Argument {
    
    inline def apply(rows: js.Array[Cell]): Argument = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argument]
    }
    
    extension [Self <: Argument](x: Self) {
      
      inline def setRows(value: js.Array[Cell]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: Cell*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
  
  trait Cell extends StObject {
    
    var location: Location
    
    var value: String
  }
  object Cell {
    
    inline def apply(location: Location, value: String): Cell = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cell]
    }
    
    extension [Self <: Cell](x: Self) {
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Location extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Location {
    
    inline def apply(column: Double, line: Double): Location = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pickle extends StObject {
    
    var language: String
    
    var locations: js.Array[Location]
    
    var name: String
    
    var steps: js.Array[typings.cucumber.mod.pickle.Step]
    
    var tags: js.Array[typings.cucumber.mod.pickle.Tag]
  }
  object Pickle {
    
    inline def apply(
      language: String,
      locations: js.Array[Location],
      name: String,
      steps: js.Array[typings.cucumber.mod.pickle.Step],
      tags: js.Array[typings.cucumber.mod.pickle.Tag]
    ): Pickle = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pickle]
    }
    
    extension [Self <: Pickle](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[typings.cucumber.mod.pickle.Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: typings.cucumber.mod.pickle.Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      inline def setTags(value: js.Array[typings.cucumber.mod.pickle.Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: typings.cucumber.mod.pickle.Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    }
  }
  
  trait Step extends StObject {
    
    var arguments: js.Array[Argument]
    
    var locations: js.Array[Location]
    
    var text: String
  }
  object Step {
    
    inline def apply(arguments: js.Array[Argument], locations: js.Array[Location], text: String): typings.cucumber.mod.pickle.Step = {
      val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cucumber.mod.pickle.Step]
    }
    
    extension [Self <: typings.cucumber.mod.pickle.Step](x: Self) {
      
      inline def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
      
      inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tag extends StObject {
    
    var location: Location
    
    var name: String
  }
  object Tag {
    
    inline def apply(location: Location, name: String): typings.cucumber.mod.pickle.Tag = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cucumber.mod.pickle.Tag]
    }
    
    extension [Self <: typings.cucumber.mod.pickle.Tag](x: Self) {
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
