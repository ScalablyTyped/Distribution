package typings.c3.anon

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxMin extends StObject {
  
  var max: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typings.c3.c3Strings.MaxMin & TopLevel[Any]
  
  var min: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typings.c3.c3Strings.MaxMin & TopLevel[Any]
}
object MaxMin {
  
  inline def apply(
    max: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typings.c3.c3Strings.MaxMin & TopLevel[Any],
    min: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typings.c3.c3Strings.MaxMin & TopLevel[Any]
  ): MaxMin = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxMin]
  }
  
  extension [Self <: MaxMin](x: Self) {
    
    inline def setMax(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]: number}
      */ typings.c3.c3Strings.MaxMin & TopLevel[Any]
    ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]: number}
      */ typings.c3.c3Strings.MaxMin & TopLevel[Any]
    ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
