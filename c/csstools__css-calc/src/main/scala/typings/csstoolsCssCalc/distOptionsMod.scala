package typings.csstoolsCssCalc

import typings.csstoolsCssCalc.distUtilGlobalsMod.GlobalsWithStrings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptionsMod {
  
  trait conversionOptions extends StObject {
    
    /**
      * Pass global values as a map of key value pairs.
      */
    var globals: js.UndefOr[GlobalsWithStrings] = js.undefined
    
    /**
      * The default precision is fairly high.
      * It aims to be high enough to make rounding unnoticeable in the browser.
      * You can set it to a lower number to suite your needs.
      */
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * By default this package will try to preserve units.
      * The heuristic to do this is very simplistic.
      * We take the first unit we encounter and try to convert other dimensions to that unit.
      *
      * This better matches what users expect from a CSS dev tool.
      *
      * If you want to have outputs that are closes to CSS serialized values you can set `true`.
      */
    var toCanonicalUnits: js.UndefOr[Boolean] = js.undefined
  }
  object conversionOptions {
    
    inline def apply(): conversionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[conversionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: conversionOptions] (val x: Self) extends AnyVal {
      
      inline def setGlobals(value: GlobalsWithStrings): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
      
      inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setToCanonicalUnits(value: Boolean): Self = StObject.set(x, "toCanonicalUnits", value.asInstanceOf[js.Any])
      
      inline def setToCanonicalUnitsUndefined: Self = StObject.set(x, "toCanonicalUnits", js.undefined)
    }
  }
}
