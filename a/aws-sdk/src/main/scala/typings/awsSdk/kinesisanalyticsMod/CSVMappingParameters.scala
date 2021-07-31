package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSVMappingParameters extends StObject {
  
  /**
    * Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
    */
  var RecordColumnDelimiter: typings.awsSdk.kinesisanalyticsMod.RecordColumnDelimiter
  
  /**
    * Row delimiter. For example, in a CSV format, '\n' is the typical row delimiter.
    */
  var RecordRowDelimiter: typings.awsSdk.kinesisanalyticsMod.RecordRowDelimiter
}
object CSVMappingParameters {
  
  @scala.inline
  def apply(RecordColumnDelimiter: RecordColumnDelimiter, RecordRowDelimiter: RecordRowDelimiter): CSVMappingParameters = {
    val __obj = js.Dynamic.literal(RecordColumnDelimiter = RecordColumnDelimiter.asInstanceOf[js.Any], RecordRowDelimiter = RecordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVMappingParameters]
  }
  
  @scala.inline
  implicit class CSVMappingParametersMutableBuilder[Self <: CSVMappingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordColumnDelimiter(value: RecordColumnDelimiter): Self = StObject.set(x, "RecordColumnDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordRowDelimiter(value: RecordRowDelimiter): Self = StObject.set(x, "RecordRowDelimiter", value.asInstanceOf[js.Any])
  }
}
