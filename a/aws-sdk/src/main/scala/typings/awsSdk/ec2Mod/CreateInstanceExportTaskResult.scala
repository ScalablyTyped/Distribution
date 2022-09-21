package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceExportTaskResult extends StObject {
  
  /**
    * Information about the export instance task.
    */
  var ExportTask: js.UndefOr[typings.awsSdk.ec2Mod.ExportTask] = js.undefined
}
object CreateInstanceExportTaskResult {
  
  inline def apply(): CreateInstanceExportTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceExportTaskResult]
  }
  
  extension [Self <: CreateInstanceExportTaskResult](x: Self) {
    
    inline def setExportTask(value: ExportTask): Self = StObject.set(x, "ExportTask", value.asInstanceOf[js.Any])
    
    inline def setExportTaskUndefined: Self = StObject.set(x, "ExportTask", js.undefined)
  }
}
