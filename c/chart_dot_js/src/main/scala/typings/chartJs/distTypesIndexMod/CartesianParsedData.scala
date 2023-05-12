package typings.chartJs.distTypesIndexMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.distTypesGeometricMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CartesianParsedData
  extends StObject
     with Point {
  
  // Only specified when stacked bars are enabled
  var _stacks: js.UndefOr[
    // Key is the stack ID which is generally the axis ID
  StringDictionary[// Inner key is the datasetIndex
  NumberDictionary[Double]]
  ] = js.undefined
}
object CartesianParsedData {
  
  inline def apply(x: Double, y: Double): CartesianParsedData = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CartesianParsedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CartesianParsedData] (val x: Self) extends AnyVal {
    
    inline def set_stacks(
      value: // Key is the stack ID which is generally the axis ID
    StringDictionary[// Inner key is the datasetIndex
    NumberDictionary[Double]]
    ): Self = StObject.set(x, "_stacks", value.asInstanceOf[js.Any])
    
    inline def set_stacksUndefined: Self = StObject.set(x, "_stacks", js.undefined)
  }
}
