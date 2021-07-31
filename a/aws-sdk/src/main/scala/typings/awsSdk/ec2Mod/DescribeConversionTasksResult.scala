package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConversionTasksResult extends StObject {
  
  /**
    * Information about the conversion tasks.
    */
  var ConversionTasks: js.UndefOr[DescribeConversionTaskList] = js.undefined
}
object DescribeConversionTasksResult {
  
  @scala.inline
  def apply(): DescribeConversionTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConversionTasksResult]
  }
  
  @scala.inline
  implicit class DescribeConversionTasksResultMutableBuilder[Self <: DescribeConversionTasksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionTasks(value: DescribeConversionTaskList): Self = StObject.set(x, "ConversionTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionTasksUndefined: Self = StObject.set(x, "ConversionTasks", js.undefined)
    
    @scala.inline
    def setConversionTasksVarargs(value: ConversionTask*): Self = StObject.set(x, "ConversionTasks", js.Array(value :_*))
  }
}
