package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeContent extends StObject {
  
  /**
    * Information about the Amazon S3 bucket containing the application code.
    */
  var S3ContentLocation: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.S3ContentLocation] = js.native
  
  /**
    * The text-format code for a Flink-based Kinesis Data Analytics application.
    */
  var TextContent: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.TextContent] = js.native
  
  /**
    * The zip-format code for a Flink-based Kinesis Data Analytics application.
    */
  var ZipFileContent: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.ZipFileContent] = js.native
}
object CodeContent {
  
  @scala.inline
  def apply(): CodeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeContent]
  }
  
  @scala.inline
  implicit class CodeContentMutableBuilder[Self <: CodeContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3ContentLocation(value: S3ContentLocation): Self = StObject.set(x, "S3ContentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ContentLocationUndefined: Self = StObject.set(x, "S3ContentLocation", js.undefined)
    
    @scala.inline
    def setTextContent(value: TextContent): Self = StObject.set(x, "TextContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentUndefined: Self = StObject.set(x, "TextContent", js.undefined)
    
    @scala.inline
    def setZipFileContent(value: ZipFileContent): Self = StObject.set(x, "ZipFileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipFileContentUndefined: Self = StObject.set(x, "ZipFileContent", js.undefined)
  }
}
