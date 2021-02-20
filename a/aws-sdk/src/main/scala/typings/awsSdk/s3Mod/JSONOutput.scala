package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONOutput extends StObject {
  
  /**
    * The value used to separate individual records in the output. If no value is specified, Amazon S3 uses a newline character ('\n').
    */
  var RecordDelimiter: js.UndefOr[typings.awsSdk.s3Mod.RecordDelimiter] = js.native
}
object JSONOutput {
  
  @scala.inline
  def apply(): JSONOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONOutput]
  }
  
  @scala.inline
  implicit class JSONOutputMutableBuilder[Self <: JSONOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecordDelimiter(value: RecordDelimiter): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
  }
}
