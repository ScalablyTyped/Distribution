package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def generate(config: typings.c3.mod.ChartConfiguration): typings.c3.mod.ChartAPI = typings.c3.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate")(config.asInstanceOf[js.Any]).asInstanceOf[typings.c3.mod.ChartAPI]

inline def version: java.lang.String = typings.c3.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]

type ArrayOrSingle[T /* <: js.Any */] = T | js.Array[T]

type ArrayOrString = typings.c3.mod.ArrayOrSingle[java.lang.String]

type AxisName = typings.c3.mod.XAxisName | typings.c3.mod.YAxisName

type Domain = js.Tuple2[scala.Double, scala.Double]

type ExpandOptions = scala.Boolean | typings.c3.anon.`0`

type FormatFunction = js.Function4[
/* v */ scala.Double | typings.c3.anon.ValueOf, 
/* id */ java.lang.String, 
/* i */ scala.Double, 
/* j */ scala.Double, 
java.lang.String]

type Primitive = java.lang.String | scala.Boolean | scala.Double | typings.std.Date | scala.Null

type PrimitiveArray = js.Array[typings.c3.mod.Primitive]

type RedrawOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean]

type UpdateAndRedrawOptions = org.scalablytyped.runtime.StringDictionary[scala.Boolean]

type XAxisName = typings.c3.c3Strings.x
