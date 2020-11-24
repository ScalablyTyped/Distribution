package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeContentDescription extends js.Object {
  
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
  implicit class CodeContentDescriptionOps[Self <: CodeContentDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCodeMD5(value: CodeMD5): Self = this.set("CodeMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeMD5: Self = this.set("CodeMD5", js.undefined)
    
    @scala.inline
    def setCodeSize(value: CodeSize): Self = this.set("CodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeSize: Self = this.set("CodeSize", js.undefined)
    
    @scala.inline
    def setS3ApplicationCodeLocationDescription(value: S3ApplicationCodeLocationDescription): Self = this.set("S3ApplicationCodeLocationDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3ApplicationCodeLocationDescription: Self = this.set("S3ApplicationCodeLocationDescription", js.undefined)
    
    @scala.inline
    def setTextContent(value: TextContent): Self = this.set("TextContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextContent: Self = this.set("TextContent", js.undefined)
  }
}
