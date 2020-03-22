package typings.c3

import typings.c3.mod.Primitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
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

object AnonName {
  @scala.inline
  def apply(
    name: (/* name */ String, /* ratio */ js.UndefOr[Double], /* id */ String, /* index */ Double) => String = null,
    title: (/* x */ Primitive, /* index */ Double) => String = null,
    value: (/* value */ Primitive, /* ratio */ js.UndefOr[Double], /* id */ String, /* index */ Double) => js.UndefOr[String] = null
  ): AnonName = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(js.Any.fromFunction4(name))
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction2(title))
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction4(value))
    __obj.asInstanceOf[AnonName]
  }
}

