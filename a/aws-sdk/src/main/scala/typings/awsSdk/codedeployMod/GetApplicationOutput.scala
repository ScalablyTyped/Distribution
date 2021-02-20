package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApplicationOutput extends StObject {
  
  /**
    * Information about the application.
    */
  var application: js.UndefOr[ApplicationInfo] = js.native
}
object GetApplicationOutput {
  
  @scala.inline
  def apply(): GetApplicationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationOutput]
  }
  
  @scala.inline
  implicit class GetApplicationOutputMutableBuilder[Self <: GetApplicationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: ApplicationInfo): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
  }
}
