package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdIndex extends js.Object {
  /**
    * Set format for the name of each data in tooltip. Specified function receives name, ratio, id and index of the data point to show. ratio will be undefined if the chart is not
    * donut/pie/gauge.
    */
  var name: js.UndefOr[
    js.Function4[
      /* name */ java.lang.String, 
      /* ratio */ scala.Double, 
      /* id */ java.lang.String, 
      /* index */ scala.Double, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * Set format for the title of tooltip. Specified function receives x of the data point to show.
    */
  var title: js.UndefOr[js.Function1[/* x */ js.Any, java.lang.String]] = js.undefined
  /**
    * Set format for the value of each data in tooltip.
    * Specified function receives name, ratio, id and index of the data point to show. ratio will be undefined if the chart is not donut/pie/gauge.
    * If undefined returned, the row of that value will be skipped.
    */
  var value: js.UndefOr[
    js.Function4[
      /* value */ js.Any, 
      /* ratio */ scala.Double, 
      /* id */ java.lang.String, 
      /* index */ scala.Double, 
      java.lang.String
    ]
  ] = js.undefined
}

object Anon_IdIndex {
  @scala.inline
  def apply(
    name: js.Function4[
      /* name */ java.lang.String, 
      /* ratio */ scala.Double, 
      /* id */ java.lang.String, 
      /* index */ scala.Double, 
      java.lang.String
    ] = null,
    title: js.Function1[/* x */ js.Any, java.lang.String] = null,
    value: js.Function4[
      /* value */ js.Any, 
      /* ratio */ scala.Double, 
      /* id */ java.lang.String, 
      /* index */ scala.Double, 
      java.lang.String
    ] = null
  ): Anon_IdIndex = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_IdIndex]
  }
}

