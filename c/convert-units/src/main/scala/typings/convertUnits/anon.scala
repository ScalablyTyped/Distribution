package typings.convertUnits

import typings.convertUnits.mod.Unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abbr[T /* <: Unit */] extends StObject {
    
    var abbr: T
    
    var measure: typings.convertUnits.mod.Measure
    
    var system: typings.convertUnits.mod.System
    
    var unit: Name
  }
  object Abbr {
    
    inline def apply[T /* <: Unit */](
      abbr: T,
      measure: typings.convertUnits.mod.Measure,
      system: typings.convertUnits.mod.System,
      unit: Name
    ): Abbr[T] = {
      val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abbr[T]]
    }
    
    extension [Self <: Abbr[?], T /* <: Unit */](x: Self & Abbr[T]) {
      
      inline def setAbbr(value: T): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setMeasure(value: typings.convertUnits.mod.Measure): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      inline def setSystem(value: typings.convertUnits.mod.System): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: Name): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait CutOffNumber extends StObject {
    
    var cutOffNumber: js.UndefOr[Double] = js.undefined
    
    var exclude: js.UndefOr[js.Array[Unit]] = js.undefined
  }
  object CutOffNumber {
    
    inline def apply(): CutOffNumber = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CutOffNumber]
    }
    
    extension [Self <: CutOffNumber](x: Self) {
      
      inline def setCutOffNumber(value: Double): Self = StObject.set(x, "cutOffNumber", value.asInstanceOf[js.Any])
      
      inline def setCutOffNumberUndefined: Self = StObject.set(x, "cutOffNumber", js.undefined)
      
      inline def setExclude(value: js.Array[Unit]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: Unit*): Self = StObject.set(x, "exclude", js.Array(value*))
    }
  }
  
  trait Measure[T /* <: Unit */] extends StObject {
    
    var abbr: T
    
    var measure: typings.convertUnits.mod.Measure
    
    var plural: String
    
    var singular: String
    
    var system: typings.convertUnits.mod.System
  }
  object Measure {
    
    inline def apply[T /* <: Unit */](
      abbr: T,
      measure: typings.convertUnits.mod.Measure,
      plural: String,
      singular: String,
      system: typings.convertUnits.mod.System
    ): Measure[T] = {
      val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
      __obj.asInstanceOf[Measure[T]]
    }
    
    extension [Self <: Measure[?], T /* <: Unit */](x: Self & Measure[T]) {
      
      inline def setAbbr(value: T): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setMeasure(value: typings.convertUnits.mod.Measure): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      inline def setSystem(value: typings.convertUnits.mod.System): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: Singular
    
    var to_anchor: Double
  }
  object Name {
    
    inline def apply(name: Singular, to_anchor: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], to_anchor = to_anchor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: Singular): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTo_anchor(value: Double): Self = StObject.set(x, "to_anchor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Plural extends StObject {
    
    var plural: String
    
    var singular: String
    
    var unit: String
    
    var `val`: Double
  }
  object Plural {
    
    inline def apply(plural: String, singular: String, unit: String, `val`: Double): Plural = {
      val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plural]
    }
    
    extension [Self <: Plural](x: Self) {
      
      inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setVal(value: Double): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  trait Singular extends StObject {
    
    var plural: String
    
    var singular: String
  }
  object Singular {
    
    inline def apply(plural: String, singular: String): Singular = {
      val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
      __obj.asInstanceOf[Singular]
    }
    
    extension [Self <: Singular](x: Self) {
      
      inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
    }
  }
  
  trait System extends StObject {
    
    var abbr: Unit
    
    var measure: typings.convertUnits.mod.Measure
    
    var plural: String
    
    var singular: String
    
    var system: typings.convertUnits.mod.System
  }
  object System {
    
    inline def apply(
      abbr: Unit,
      measure: typings.convertUnits.mod.Measure,
      plural: String,
      singular: String,
      system: typings.convertUnits.mod.System
    ): System = {
      val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
      __obj.asInstanceOf[System]
    }
    
    extension [Self <: System](x: Self) {
      
      inline def setAbbr(value: Unit): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setMeasure(value: typings.convertUnits.mod.Measure): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      inline def setSystem(value: typings.convertUnits.mod.System): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    }
  }
}
