package typings.chromeApps.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.dns
/////////
// DNS //
/////////
/**
  * @requires(CrOS) Only Chrome OS. Crashes app on Windows.
  * @requires Permissions: 'diagnostics'
  * @description
  * Use the *chrome.dns* API for dns resolution.
  */
object dns {
  
  @js.native
  trait ResolveCallbackResolveInfo extends StObject {
    
    /**
      * A string representing the IP address literal.
      * Supplied only if resultCode indicates success.
      * Note that we presently return only IPv4 addresses.
      */
    var address: js.UndefOr[String] = js.native
    
    /** The result code. Zero indicates success. */
    var resultCode: integer = js.native
  }
  object ResolveCallbackResolveInfo {
    
    @scala.inline
    def apply(resultCode: integer): ResolveCallbackResolveInfo = {
      val __obj = js.Dynamic.literal(resultCode = resultCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveCallbackResolveInfo]
    }
    
    @scala.inline
    implicit class ResolveCallbackResolveInfoMutableBuilder[Self <: ResolveCallbackResolveInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setResultCode(value: integer): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    }
  }
}
