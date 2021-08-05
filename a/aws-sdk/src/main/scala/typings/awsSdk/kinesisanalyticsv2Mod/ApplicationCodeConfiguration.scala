package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationCodeConfiguration extends StObject {
  
  /**
    * The location and type of the application code.
    */
  var CodeContent: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CodeContent] = js.undefined
  
  /**
    * Specifies whether the code content is in text or zip format.
    */
  var CodeContentType: typings.awsSdk.kinesisanalyticsv2Mod.CodeContentType
}
object ApplicationCodeConfiguration {
  
  inline def apply(CodeContentType: CodeContentType): ApplicationCodeConfiguration = {
    val __obj = js.Dynamic.literal(CodeContentType = CodeContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCodeConfiguration]
  }
  
  extension [Self <: ApplicationCodeConfiguration](x: Self) {
    
    inline def setCodeContent(value: CodeContent): Self = StObject.set(x, "CodeContent", value.asInstanceOf[js.Any])
    
    inline def setCodeContentType(value: CodeContentType): Self = StObject.set(x, "CodeContentType", value.asInstanceOf[js.Any])
    
    inline def setCodeContentUndefined: Self = StObject.set(x, "CodeContent", js.undefined)
  }
}
