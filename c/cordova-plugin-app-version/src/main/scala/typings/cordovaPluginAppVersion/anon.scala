package typings.cordovaPluginAppVersion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GetAppName extends StObject {
    
    def getAppName(): js.Promise[String]
    
    def getPackageName(): js.Promise[String]
    
    def getVersionCode(): js.Promise[String]
    
    def getVersionNumber(): js.Promise[String]
  }
  object GetAppName {
    
    inline def apply(
      getAppName: () => js.Promise[String],
      getPackageName: () => js.Promise[String],
      getVersionCode: () => js.Promise[String],
      getVersionNumber: () => js.Promise[String]
    ): GetAppName = {
      val __obj = js.Dynamic.literal(getAppName = js.Any.fromFunction0(getAppName), getPackageName = js.Any.fromFunction0(getPackageName), getVersionCode = js.Any.fromFunction0(getVersionCode), getVersionNumber = js.Any.fromFunction0(getVersionNumber))
      __obj.asInstanceOf[GetAppName]
    }
    
    extension [Self <: GetAppName](x: Self) {
      
      inline def setGetAppName(value: () => js.Promise[String]): Self = StObject.set(x, "getAppName", js.Any.fromFunction0(value))
      
      inline def setGetPackageName(value: () => js.Promise[String]): Self = StObject.set(x, "getPackageName", js.Any.fromFunction0(value))
      
      inline def setGetVersionCode(value: () => js.Promise[String]): Self = StObject.set(x, "getVersionCode", js.Any.fromFunction0(value))
      
      inline def setGetVersionNumber(value: () => js.Promise[String]): Self = StObject.set(x, "getVersionNumber", js.Any.fromFunction0(value))
    }
  }
}
