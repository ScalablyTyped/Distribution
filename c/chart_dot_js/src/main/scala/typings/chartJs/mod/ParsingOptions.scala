package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.chartJsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsingOptions extends StObject {
  
  /**
    * Chart.js is fastest if you provide data with indices that are unique, sorted, and consistent across datasets and provide the normalized: true option to let Chart.js know that you have done so.
    */
  var normalized: Boolean
  
  /**
    * How to parse the dataset. The parsing can be disabled by specifying parsing: false at chart options or dataset. If parsing is disabled, data must be sorted and in the formats the associated chart type and scales use internally.
    */
  var parsing: StringDictionary[String] | `false`
}
object ParsingOptions {
  
  inline def apply(normalized: Boolean, parsing: StringDictionary[String] | `false`): ParsingOptions = {
    val __obj = js.Dynamic.literal(normalized = normalized.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsingOptions]
  }
  
  extension [Self <: ParsingOptions](x: Self) {
    
    inline def setNormalized(value: Boolean): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setParsing(value: StringDictionary[String] | `false`): Self = StObject.set(x, "parsing", value.asInstanceOf[js.Any])
  }
}
