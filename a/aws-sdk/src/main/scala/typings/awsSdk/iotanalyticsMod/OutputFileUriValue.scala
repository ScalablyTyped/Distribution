package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputFileUriValue extends StObject {
  
  /**
    * The URI of the location where dataset contents are stored, usually the URI of a file in an S3 bucket.
    */
  var fileName: OutputFileName
}
object OutputFileUriValue {
  
  @scala.inline
  def apply(fileName: OutputFileName): OutputFileUriValue = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFileUriValue]
  }
  
  @scala.inline
  implicit class OutputFileUriValueMutableBuilder[Self <: OutputFileUriValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: OutputFileName): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
