package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.V_1
import typings.awsSdkClientS3Browser.typesAnalyticsExportDestinationMod.AnalyticsExportDestination
import typings.awsSdkClientS3Browser.typesAnalyticsExportDestinationMod.UnmarshalledAnalyticsExportDestination
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStorageClassAnalysisDataExportMod {
  
  @js.native
  trait StorageClassAnalysisDataExport extends StObject {
    
    /**
      * <p>The place to store the data for an analysis.</p>
      */
    var Destination: AnalyticsExportDestination = js.native
    
    /**
      * <p>The version of the output schema to use when exporting data. Must be V_1.</p>
      */
    var OutputSchemaVersion: V_1 | String = js.native
  }
  object StorageClassAnalysisDataExport {
    
    @scala.inline
    def apply(Destination: AnalyticsExportDestination, OutputSchemaVersion: V_1 | String): StorageClassAnalysisDataExport = {
      val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageClassAnalysisDataExport]
    }
    
    @scala.inline
    implicit class StorageClassAnalysisDataExportMutableBuilder[Self <: StorageClassAnalysisDataExport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: AnalyticsExportDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputSchemaVersion(value: V_1 | String): Self = StObject.set(x, "OutputSchemaVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledStorageClassAnalysisDataExport extends StorageClassAnalysisDataExport {
    
    /**
      * <p>The place to store the data for an analysis.</p>
      */
    @JSName("Destination")
    var Destination_UnmarshalledStorageClassAnalysisDataExport: UnmarshalledAnalyticsExportDestination = js.native
  }
  object UnmarshalledStorageClassAnalysisDataExport {
    
    @scala.inline
    def apply(Destination: UnmarshalledAnalyticsExportDestination, OutputSchemaVersion: V_1 | String): UnmarshalledStorageClassAnalysisDataExport = {
      val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], OutputSchemaVersion = OutputSchemaVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledStorageClassAnalysisDataExport]
    }
    
    @scala.inline
    implicit class UnmarshalledStorageClassAnalysisDataExportMutableBuilder[Self <: UnmarshalledStorageClassAnalysisDataExport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestination(value: UnmarshalledAnalyticsExportDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    }
  }
}
