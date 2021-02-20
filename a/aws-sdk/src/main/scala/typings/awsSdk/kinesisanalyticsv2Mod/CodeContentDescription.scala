package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeContentDescription extends StObject {
  
  /**
    * The checksum that can be used to validate zip-format code.
    */
  var CodeMD5: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CodeMD5] = js.native
  
  /**
    * The size in bytes of the application code. Can be used to validate zip-format code.
    */
  var CodeSize: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CodeSize] = js.native
  
  /**
    * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in Amazon S3.
    */
  var S3ApplicationCodeLocationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.S3ApplicationCodeLocationDescription] = js.native
  
  /**
    * The text-format code
    */
  var TextContent: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.TextContent] = js.native
}
object CodeContentDescription {
  
  @scala.inline
  def apply(): CodeContentDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeContentDescription]
  }
  
  @scala.inline
  implicit class CodeContentDescriptionMutableBuilder[Self <: CodeContentDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeMD5(value: CodeMD5): Self = StObject.set(x, "CodeMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeMD5Undefined: Self = StObject.set(x, "CodeMD5", js.undefined)
    
    @scala.inline
    def setCodeSize(value: CodeSize): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
    
    @scala.inline
    def setS3ApplicationCodeLocationDescription(value: S3ApplicationCodeLocationDescription): Self = StObject.set(x, "S3ApplicationCodeLocationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ApplicationCodeLocationDescriptionUndefined: Self = StObject.set(x, "S3ApplicationCodeLocationDescription", js.undefined)
    
    @scala.inline
    def setTextContent(value: TextContent): Self = StObject.set(x, "TextContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentUndefined: Self = StObject.set(x, "TextContent", js.undefined)
  }
}
