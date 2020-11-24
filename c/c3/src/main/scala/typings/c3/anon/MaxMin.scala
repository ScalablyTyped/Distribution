package typings.c3.anon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxMin extends js.Object {
  
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
  implicit class MaxMinOps[Self <: MaxMin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMax(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]: number}
      */ typings.c3.c3Strings.MaxMin with TopLevel[js.Any]
    ): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in c3.c3.AxisName ]: number}
      */ typings.c3.c3Strings.MaxMin with TopLevel[js.Any]
    ): Self = this.set("min", value.asInstanceOf[js.Any])
  }
}
