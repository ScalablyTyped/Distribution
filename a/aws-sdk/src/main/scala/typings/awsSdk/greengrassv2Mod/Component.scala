package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  /**
    * The ARN of the component version.
    */
  var arn: js.UndefOr[ComponentARN] = js.undefined
  
  /**
    * The name of the component.
    */
  var componentName: js.UndefOr[ComponentNameString] = js.undefined
  
  /**
    * The latest version of the component and its details.
    */
  var latestVersion: js.UndefOr[ComponentLatestVersion] = js.undefined
}
object Component {
  
  inline def apply(): Component = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setArn(value: ComponentARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComponentName(value: ComponentNameString): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setLatestVersion(value: ComponentLatestVersion): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionUndefined: Self = StObject.set(x, "latestVersion", js.undefined)
  }
}
