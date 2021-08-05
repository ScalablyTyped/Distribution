package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeContentDescription extends StObject {
  
  /**
    * The checksum that can be used to validate zip-format code.
    */
  var CodeMD5: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CodeMD5] = js.undefined
  
  /**
    * The size in bytes of the application code. Can be used to validate zip-format code.
    */
  var CodeSize: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CodeSize] = js.undefined
  
  /**
    * The S3 bucket Amazon Resource Name (ARN), file key, and object version of the application code stored in Amazon S3.
    */
  var S3ApplicationCodeLocationDescription: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.S3ApplicationCodeLocationDescription] = js.undefined
  
  /**
    * The text-format code
    */
  var TextContent: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.TextContent] = js.undefined
}
object CodeContentDescription {
  
  inline def apply(): CodeContentDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeContentDescription]
  }
  
  extension [Self <: CodeContentDescription](x: Self) {
    
    inline def setCodeMD5(value: CodeMD5): Self = StObject.set(x, "CodeMD5", value.asInstanceOf[js.Any])
    
    inline def setCodeMD5Undefined: Self = StObject.set(x, "CodeMD5", js.undefined)
    
    inline def setCodeSize(value: CodeSize): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
    
    inline def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
    
    inline def setS3ApplicationCodeLocationDescription(value: S3ApplicationCodeLocationDescription): Self = StObject.set(x, "S3ApplicationCodeLocationDescription", value.asInstanceOf[js.Any])
    
    inline def setS3ApplicationCodeLocationDescriptionUndefined: Self = StObject.set(x, "S3ApplicationCodeLocationDescription", js.undefined)
    
    inline def setTextContent(value: TextContent): Self = StObject.set(x, "TextContent", value.asInstanceOf[js.Any])
    
    inline def setTextContentUndefined: Self = StObject.set(x, "TextContent", js.undefined)
  }
}
