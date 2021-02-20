package typings.c3.anon

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxMin extends StObject {
  
  var max: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typings.c3.c3Strings.MaxMin with TopLevel[js.Any] = js.native
  
  var min: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typings.c3.c3Strings.MaxMin with TopLevel[js.Any] = js.native
}
object MaxMin {
  
  @scala.inline
  def apply(
    max: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typings.c3.c3Strings.MaxMin with TopLevel[js.Any],
    min: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]: number}
    */ typings.c3.c3Strings.MaxMin with TopLevel[js.Any]
  ): MaxMin = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxMin]
  }
  
  @scala.inline
  implicit class MaxMinMutableBuilder[Self <: MaxMin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]: number}
      */ typings.c3.c3Strings.MaxMin with TopLevel[js.Any]
    ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]: number}
      */ typings.c3.c3Strings.MaxMin with TopLevel[js.Any]
    ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
