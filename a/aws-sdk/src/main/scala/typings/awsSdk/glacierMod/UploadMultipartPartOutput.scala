package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadMultipartPartOutput extends StObject {
  
  /**
    * The SHA256 tree hash that Amazon S3 Glacier computed for the uploaded part.
    */
  var checksum: js.UndefOr[String] = js.undefined
}
object UploadMultipartPartOutput {
  
  @scala.inline
  def apply(): UploadMultipartPartOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadMultipartPartOutput]
  }
  
  @scala.inline
  implicit class UploadMultipartPartOutputMutableBuilder[Self <: UploadMultipartPartOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
  }
}
