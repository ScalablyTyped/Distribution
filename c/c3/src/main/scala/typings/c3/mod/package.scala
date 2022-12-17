package typings.c3.mod

import org.scalablytyped.runtime.StringDictionary
import typings.c3.anon.ValueOf
import typings.c3.anon.`0`
import typings.c3.c3Strings.x
import typings.c3.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def generate(config: ChartConfiguration): ChartAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(config.asInstanceOf[js.Any]).asInstanceOf[ChartAPI]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type ArrayOrSingle[T /* <: Any */] = T | js.Array[T]

type ArrayOrString = ArrayOrSingle[String]

type AxisName = XAxisName | YAxisName

type Domain = js.Tuple2[Double, Double]

type ExpandOptions = Boolean | `0`

type FormatFunction = js.Function4[/* v */ Double | ValueOf, /* id */ String, /* i */ Double, /* j */ Double, String]

type Primitive = String | Boolean | Double | js.Date | Null

type PrimitiveArray = js.Array[Primitive]

type RedrawOptions = StringDictionary[Boolean]

type UpdateAndRedrawOptions = StringDictionary[Boolean]

type XAxisName = x
