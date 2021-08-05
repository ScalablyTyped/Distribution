package typings.c3.anon

import typings.c3.mod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  /**
    * Set format for the name of each data in tooltip.
    * @param ratio Will be `undefined` if the chart is not donut/pie/gauge.
    */
  var name: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* ratio */ js.UndefOr[Double], 
      /* id */ String, 
      /* index */ Double, 
      String
    ]
  ] = js.undefined
  
  /**
    * Set format for the title of tooltip.
    * @param x Value of the data point to show.
    * @param index Index of the data point to show.
    */
  var title: js.UndefOr[js.Function2[/* x */ Primitive, /* index */ Double, String]] = js.undefined
  
  /**
    * Set format for the value of each data in tooltip.
    * @param ratio Will be `undefined` if the chart is not donut/pie/gauge.
    * @returns If `undefined` returned, the row of that value will be skipped.
    */
  var value: js.UndefOr[
    js.Function4[
      /* value */ Primitive, 
      /* ratio */ js.UndefOr[Double], 
      /* id */ String, 
      /* index */ Double, 
      js.UndefOr[String]
    ]
  ] = js.undefined
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setName(
      value: (/* name */ String, /* ratio */ js.UndefOr[Double], /* id */ String, /* index */ Double) => String
    ): Self = StObject.set(x, "name", js.Any.fromFunction4(value))
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: (/* x */ Primitive, /* index */ Double) => String): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValue(
      value: (/* value */ Primitive, /* ratio */ js.UndefOr[Double], /* id */ String, /* index */ Double) => js.UndefOr[String]
    ): Self = StObject.set(x, "value", js.Any.fromFunction4(value))
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
