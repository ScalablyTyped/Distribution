package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationCodeConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to the code content type.
    */
  var CodeContentTypeUpdate: js.UndefOr[CodeContentType] = js.native
  
  /**
    * Describes updates to the code content of an application.
    */
  var CodeContentUpdate: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.CodeContentUpdate] = js.native
}
object ApplicationCodeConfigurationUpdate {
  
  @scala.inline
  def apply(): ApplicationCodeConfigurationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationCodeConfigurationUpdate]
  }
  
  @scala.inline
  implicit class ApplicationCodeConfigurationUpdateMutableBuilder[Self <: ApplicationCodeConfigurationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeContentTypeUpdate(value: CodeContentType): Self = StObject.set(x, "CodeContentTypeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeContentTypeUpdateUndefined: Self = StObject.set(x, "CodeContentTypeUpdate", js.undefined)
    
    @scala.inline
    def setCodeContentUpdate(value: CodeContentUpdate): Self = StObject.set(x, "CodeContentUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeContentUpdateUndefined: Self = StObject.set(x, "CodeContentUpdate", js.undefined)
  }
}
