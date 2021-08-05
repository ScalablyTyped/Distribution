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
  
  inline def apply(): DescribeConversionTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConversionTasksResult]
  }
  
  extension [Self <: DescribeConversionTasksResult](x: Self) {
    
    inline def setConversionTasks(value: DescribeConversionTaskList): Self = StObject.set(x, "ConversionTasks", value.asInstanceOf[js.Any])
    
    inline def setConversionTasksUndefined: Self = StObject.set(x, "ConversionTasks", js.undefined)
    
    inline def setConversionTasksVarargs(value: ConversionTask*): Self = StObject.set(x, "ConversionTasks", js.Array(value :_*))
  }
}
