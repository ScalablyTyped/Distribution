package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSVMappingParameters extends StObject {
  
  /**
    * The column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
    */
  var RecordColumnDelimiter: typings.awsSdk.kinesisanalyticsv2Mod.RecordColumnDelimiter
  
  /**
    * The row delimiter. For example, in a CSV format, '\n' is the typical row delimiter.
    */
  var RecordRowDelimiter: typings.awsSdk.kinesisanalyticsv2Mod.RecordRowDelimiter
}
object CSVMappingParameters {
  
  inline def apply(RecordColumnDelimiter: RecordColumnDelimiter, RecordRowDelimiter: RecordRowDelimiter): CSVMappingParameters = {
    val __obj = js.Dynamic.literal(RecordColumnDelimiter = RecordColumnDelimiter.asInstanceOf[js.Any], RecordRowDelimiter = RecordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVMappingParameters]
  }
  
  extension [Self <: CSVMappingParameters](x: Self) {
    
    inline def setRecordColumnDelimiter(value: RecordColumnDelimiter): Self = StObject.set(x, "RecordColumnDelimiter", value.asInstanceOf[js.Any])
    
    inline def setRecordRowDelimiter(value: RecordRowDelimiter): Self = StObject.set(x, "RecordRowDelimiter", value.asInstanceOf[js.Any])
  }
}
