package typings.cathoQuantum.breakpointsMod

import typings.cathoQuantum.anon.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breakpoints extends js.Object {
  
  var large: Columns = js.native
  
  var medium: Columns = js.native
  
  var small: Columns = js.native
  
  var xlarge: Columns = js.native
  
  var xsmall: Columns = js.native
}
object Breakpoints {
  
  @scala.inline
  def apply(large: Columns, medium: Columns, small: Columns, xlarge: Columns, xsmall: Columns): Breakpoints = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], xlarge = xlarge.asInstanceOf[js.Any], xsmall = xsmall.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breakpoints]
  }
  
  @scala.inline
  implicit class BreakpointsOps[Self <: Breakpoints] (val x: Self) extends AnyVal {
    
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
    def setLarge(value: Columns): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: Columns): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmall(value: Columns): Self = this.set("small", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlarge(value: Columns): Self = this.set("xlarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXsmall(value: Columns): Self = this.set("xsmall", value.asInstanceOf[js.Any])
  }
}
