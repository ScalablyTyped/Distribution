package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConversionTasksResult extends js.Object {
  
  /**
    * Information about the conversion tasks.
    */
  var ConversionTasks: js.UndefOr[DescribeConversionTaskList] = js.native
}
object DescribeConversionTasksResult {
  
  @scala.inline
  def apply(): DescribeConversionTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConversionTasksResult]
  }
  
  @scala.inline
  implicit class DescribeConversionTasksResultOps[Self <: DescribeConversionTasksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConversionTasksVarargs(value: ConversionTask*): Self = this.set("ConversionTasks", js.Array(value :_*))
    
    @scala.inline
    def setConversionTasks(value: DescribeConversionTaskList): Self = this.set("ConversionTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionTasks: Self = this.set("ConversionTasks", js.undefined)
  }
}
