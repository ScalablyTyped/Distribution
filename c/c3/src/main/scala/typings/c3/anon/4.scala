package typings.c3.anon

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var max: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]:? number}
    */ typings.c3.c3Strings.`4` & TopLevel[js.Any])
  ] = js.undefined
  
  var min: js.UndefOr[
    Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in c3.c3.AxisName ]:? number}
    */ typings.c3.c3Strings.`4` & TopLevel[js.Any])
  ] = js.undefined
}
object `4` {
  
  @scala.inline
  def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(
      value: Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]:? number}
      */ typings.c3.c3Strings.`4` & TopLevel[js.Any])
    ): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(
      value: Double | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]:? number}
      */ typings.c3.c3Strings.`4` & TopLevel[js.Any])
    ): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
