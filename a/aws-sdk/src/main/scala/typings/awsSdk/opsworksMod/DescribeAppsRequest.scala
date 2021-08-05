package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppsRequest extends StObject {
  
  /**
    * An array of app IDs for the apps to be described. If you use this parameter, DescribeApps returns a description of the specified apps. Otherwise, it returns a description of every app.
    */
  var AppIds: js.UndefOr[Strings] = js.undefined
  
  /**
    * The app stack ID. If you use this parameter, DescribeApps returns a description of the apps in the specified stack.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object DescribeAppsRequest {
  
  inline def apply(): DescribeAppsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppsRequest]
  }
  
  extension [Self <: DescribeAppsRequest](x: Self) {
    
    inline def setAppIds(value: Strings): Self = StObject.set(x, "AppIds", value.asInstanceOf[js.Any])
    
    inline def setAppIdsUndefined: Self = StObject.set(x, "AppIds", js.undefined)
    
    inline def setAppIdsVarargs(value: String*): Self = StObject.set(x, "AppIds", js.Array(value :_*))
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
