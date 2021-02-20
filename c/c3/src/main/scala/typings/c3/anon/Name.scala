package typings.c3.anon

import typings.c3.mod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  ] = js.native
  
  /**
    * Set format for the title of tooltip.
    * @param x Value of the data point to show.
    * @param index Index of the data point to show.
    */
  var title: js.UndefOr[js.Function2[/* x */ Primitive, /* index */ Double, String]] = js.native
  
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
  ] = js.native
}
object Name {
  
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: (/* name */ String, /* ratio */ js.UndefOr[Double], /* id */ String, /* index */ Double) => String
    ): Self = StObject.set(x, "name", js.Any.fromFunction4(value))
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTitle(value: (/* x */ Primitive, /* index */ Double) => String): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValue(
      value: (/* value */ Primitive, /* ratio */ js.UndefOr[Double], /* id */ String, /* index */ Double) => js.UndefOr[String]
    ): Self = StObject.set(x, "value", js.Any.fromFunction4(value))
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
