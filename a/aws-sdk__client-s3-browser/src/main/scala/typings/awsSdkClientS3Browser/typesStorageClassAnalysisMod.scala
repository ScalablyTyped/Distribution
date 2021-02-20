package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesStorageClassAnalysisDataExportMod.StorageClassAnalysisDataExport
import typings.awsSdkClientS3Browser.typesStorageClassAnalysisDataExportMod.UnmarshalledStorageClassAnalysisDataExport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStorageClassAnalysisMod {
  
  @js.native
  trait StorageClassAnalysis extends StObject {
    
    /**
      * <p>A container used to describe how data related to the storage class analysis should be exported.</p>
      */
    var DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.native
  }
  object StorageClassAnalysis {
    
    @scala.inline
    def apply(): StorageClassAnalysis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StorageClassAnalysis]
    }
    
    @scala.inline
    implicit class StorageClassAnalysisMutableBuilder[Self <: StorageClassAnalysis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataExport(value: StorageClassAnalysisDataExport): Self = StObject.set(x, "DataExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataExportUndefined: Self = StObject.set(x, "DataExport", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledStorageClassAnalysis extends StorageClassAnalysis {
    
    /**
      * <p>A container used to describe how data related to the storage class analysis should be exported.</p>
      */
    @JSName("DataExport")
    var DataExport_UnmarshalledStorageClassAnalysis: js.UndefOr[UnmarshalledStorageClassAnalysisDataExport] = js.native
  }
  object UnmarshalledStorageClassAnalysis {
    
    @scala.inline
    def apply(): UnmarshalledStorageClassAnalysis = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledStorageClassAnalysis]
    }
    
    @scala.inline
    implicit class UnmarshalledStorageClassAnalysisMutableBuilder[Self <: UnmarshalledStorageClassAnalysis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataExport(value: UnmarshalledStorageClassAnalysisDataExport): Self = StObject.set(x, "DataExport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataExportUndefined: Self = StObject.set(x, "DataExport", js.undefined)
    }
  }
}
