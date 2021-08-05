package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesStorageClassAnalysisDataExportMod.StorageClassAnalysisDataExport
import typings.awsSdkClientS3Node.typesStorageClassAnalysisDataExportMod.UnmarshalledStorageClassAnalysisDataExport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStorageClassAnalysisMod {
  
  trait StorageClassAnalysis extends StObject {
    
    /**
      * <p>A container used to describe how data related to the storage class analysis should be exported.</p>
      */
    var DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.undefined
  }
  object StorageClassAnalysis {
    
    inline def apply(): StorageClassAnalysis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageClassAnalysis]
    }
    
    extension [Self <: StorageClassAnalysis](x: Self) {
      
      inline def setDataExport(value: StorageClassAnalysisDataExport): Self = StObject.set(x, "DataExport", value.asInstanceOf[js.Any])
      
      inline def setDataExportUndefined: Self = StObject.set(x, "DataExport", js.undefined)
    }
  }
  
  trait UnmarshalledStorageClassAnalysis
    extends StObject
       with StorageClassAnalysis {
    
    /**
      * <p>A container used to describe how data related to the storage class analysis should be exported.</p>
      */
    @JSName("DataExport")
    var DataExport_UnmarshalledStorageClassAnalysis: js.UndefOr[UnmarshalledStorageClassAnalysisDataExport] = js.undefined
  }
  object UnmarshalledStorageClassAnalysis {
    
    inline def apply(): UnmarshalledStorageClassAnalysis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledStorageClassAnalysis]
    }
    
    extension [Self <: UnmarshalledStorageClassAnalysis](x: Self) {
      
      inline def setDataExport(value: UnmarshalledStorageClassAnalysisDataExport): Self = StObject.set(x, "DataExport", value.asInstanceOf[js.Any])
      
      inline def setDataExportUndefined: Self = StObject.set(x, "DataExport", js.undefined)
    }
  }
}
