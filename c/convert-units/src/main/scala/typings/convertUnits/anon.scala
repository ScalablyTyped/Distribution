package typings.convertUnits

import typings.convertUnits.mod.measure
import typings.convertUnits.mod.system
import typings.convertUnits.mod.unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Abbr[T /* <: unit */] extends StObject {
    
    var abbr: T = js.native
    
    var measure: typings.convertUnits.mod.measure = js.native
    
    var system: typings.convertUnits.mod.system = js.native
    
    var unit: Name = js.native
  }
  object Abbr {
    
    @scala.inline
    def apply[T /* <: unit */](abbr: T, measure: measure, system: system, unit: Name): Abbr[T] = {
      val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abbr[T]]
    }
    
    @scala.inline
    implicit class AbbrMutableBuilder[Self <: Abbr[_], T /* <: unit */] (val x: Self with Abbr[T]) extends AnyVal {
      
      @scala.inline
      def setAbbr(value: T): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasure(value: measure): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystem(value: system): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit(value: Name): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CutOffNumber extends StObject {
    
    var cutOffNumber: js.UndefOr[Double] = js.native
    
    var exclude: js.UndefOr[js.Array[unit]] = js.native
  }
  object CutOffNumber {
    
    @scala.inline
    def apply(): CutOffNumber = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CutOffNumber]
    }
    
    @scala.inline
    implicit class CutOffNumberMutableBuilder[Self <: CutOffNumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCutOffNumber(value: Double): Self = StObject.set(x, "cutOffNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCutOffNumberUndefined: Self = StObject.set(x, "cutOffNumber", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[unit]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: unit*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Measure[T /* <: unit */] extends StObject {
    
    var abbr: T = js.native
    
    var measure: typings.convertUnits.mod.measure = js.native
    
    var plural: String = js.native
    
    var singular: String = js.native
    
    var system: typings.convertUnits.mod.system = js.native
  }
  object Measure {
    
    @scala.inline
    def apply[T /* <: unit */](abbr: T, measure: measure, plural: String, singular: String, system: system): Measure[T] = {
      val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
      __obj.asInstanceOf[Measure[T]]
    }
    
    @scala.inline
    implicit class MeasureMutableBuilder[Self <: Measure[_], T /* <: unit */] (val x: Self with Measure[T]) extends AnyVal {
      
      @scala.inline
      def setAbbr(value: T): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasure(value: measure): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystem(value: system): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: Singular = js.native
    
    var to_anchor: Double = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: Singular, to_anchor: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], to_anchor = to_anchor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Singular): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo_anchor(value: Double): Self = StObject.set(x, "to_anchor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Plural extends StObject {
    
    var plural: String = js.native
    
    var singular: String = js.native
    
    var unit: String = js.native
    
    var `val`: Double = js.native
  }
  object Plural {
    
    @scala.inline
    def apply(plural: String, singular: String, unit: String, `val`: Double): Plural = {
      val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plural]
    }
    
    @scala.inline
    implicit class PluralMutableBuilder[Self <: Plural] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVal(value: Double): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Singular extends StObject {
    
    var plural: String = js.native
    
    var singular: String = js.native
  }
  object Singular {
    
    @scala.inline
    def apply(plural: String, singular: String): Singular = {
      val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
      __obj.asInstanceOf[Singular]
    }
    
    @scala.inline
    implicit class SingularMutableBuilder[Self <: Singular] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait System extends StObject {
    
    var abbr: unit = js.native
    
    var measure: typings.convertUnits.mod.measure = js.native
    
    var plural: String = js.native
    
    var singular: String = js.native
    
    var system: typings.convertUnits.mod.system = js.native
  }
  object System {
    
    @scala.inline
    def apply(abbr: unit, measure: measure, plural: String, singular: String, system: system): System = {
      val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], measure = measure.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
      __obj.asInstanceOf[System]
    }
    
    @scala.inline
    implicit class SystemMutableBuilder[Self <: System] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbr(value: unit): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasure(value: measure): Self = StObject.set(x, "measure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystem(value: system): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    }
  }
}
