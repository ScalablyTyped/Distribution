package typings.cordovaPluginAppVersion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait GetAppName extends StObject {
    
    def getAppName(): js.Promise[String] = js.native
    
    def getPackageName(): js.Promise[String] = js.native
    
    def getVersionCode(): js.Promise[String] = js.native
    
    def getVersionNumber(): js.Promise[String] = js.native
  }
  object GetAppName {
    
    @scala.inline
    def apply(
      getAppName: () => js.Promise[String],
      getPackageName: () => js.Promise[String],
      getVersionCode: () => js.Promise[String],
      getVersionNumber: () => js.Promise[String]
    ): GetAppName = {
      val __obj = js.Dynamic.literal(getAppName = js.Any.fromFunction0(getAppName), getPackageName = js.Any.fromFunction0(getPackageName), getVersionCode = js.Any.fromFunction0(getVersionCode), getVersionNumber = js.Any.fromFunction0(getVersionNumber))
      __obj.asInstanceOf[GetAppName]
    }
    
    @scala.inline
    implicit class GetAppNameMutableBuilder[Self <: GetAppName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAppName(value: () => js.Promise[String]): Self = StObject.set(x, "getAppName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPackageName(value: () => js.Promise[String]): Self = StObject.set(x, "getPackageName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVersionCode(value: () => js.Promise[String]): Self = StObject.set(x, "getVersionCode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVersionNumber(value: () => js.Promise[String]): Self = StObject.set(x, "getVersionNumber", js.Any.fromFunction0(value))
    }
  }
}
