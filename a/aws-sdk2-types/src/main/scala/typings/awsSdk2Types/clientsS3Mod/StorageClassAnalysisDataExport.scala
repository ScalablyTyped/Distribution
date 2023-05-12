package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageClassAnalysisDataExport extends StObject {
  
  /**
    * The place to store the data for an analysis.
    */
  var Destination: AnalyticsExportDestination
  
  /**
    * The version of the output schema to use when exporting data. Must be V_1.
    */
  var OutputSchemaVersion: StorageClassAnalysisSchemaVersion
}
object StorageClassAnalysisDataExport {
  
  inline def apply(Destination: AnalyticsExportDestination, OutputSchemaVersion: StorageClassAnalysisSchemaVersion): StorageClassAnalysisDataExport = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageClassAnalysisDataExport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StorageClassAnalysisDataExport] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: AnalyticsExportDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setOutputSchemaVersion(value: StorageClassAnalysisSchemaVersion): Self = StObject.set(x, "OutputSchemaVersion", value.asInstanceOf[js.Any])
  }
}
