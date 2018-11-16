package typings
package chaynsLib.chaynsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Environmental Variables
     * chayns.env
     */
@JSGlobal("chayns.env")
@js.native
object envNs extends js.Object {
  var _parameters: js.Any = js.native
  var apiVersion: scala.Double = js.native
  var appVersion: scala.Double = js.native
  var debugMode: scala.Boolean = js.native
  var isAndroid: scala.Boolean = js.native
  var isApp: scala.Boolean = js.native
  var isBrowser: scala.Boolean = js.native
  var isChaynsParent: scala.Boolean = js.native
  var isChaynsWeb: scala.Boolean = js.native
  var isChaynsWebDesktop: scala.Boolean = js.native
  var isChaynsWebLight: scala.Boolean = js.native
  var isChaynsWebMobile: scala.Boolean = js.native
  var isDesktop: scala.Boolean = js.native
  var isIOS: scala.Boolean = js.native
  var isInFacebookFrame: scala.Boolean = js.native
  var isInFrame: scala.Boolean = js.native
  var isMobile: scala.Boolean = js.native
  var isTablet: scala.Boolean = js.native
  var isWP: scala.Boolean = js.native
  var isWidget: scala.Boolean = js.native
  var language: java.lang.String = js.native
  var os: java.lang.String = js.native
  var parameters: js.Any = js.native
  /**
           * Environmental Variables
           * chayns.env.app
           */
  @JSName("app")
  @js.native
  object appNs extends js.Object {
    var flavor: java.lang.String = js.native
    var languageId: java.lang.String = js.native
    var model: java.lang.String = js.native
    var name: java.lang.String = js.native
    var uid: java.lang.String = js.native
    var version: java.lang.String = js.native
  }
  
  /**
           * Environmental Variables
           * chayns.env.browser
           */
  @JSName("browser")
  @js.native
  object browserNs extends js.Object {
    var name: java.lang.String = js.native
    var version: java.lang.String = js.native
  }
  
  /**
           * Environmental Variables
           * chayns.env.device
           */
  @JSName("device")
  @js.native
  object deviceNs extends js.Object {
    var fontScale: js.Any = js.native
    var imei: java.lang.String = js.native
    var languageId: java.lang.String = js.native
    var model: java.lang.String = js.native
    var systemName: java.lang.String = js.native
    var systemVersion: scala.Double = js.native
    var uid: java.lang.String = js.native
  }
  
  /**
           * Environmental Variables
           * chayns.env.site
           */
  @JSName("site")
  @js.native
  object siteNs extends js.Object {
    var color: java.lang.String = js.native
    var colorMode: scala.Double = js.native
    var colorScheme: scala.Double = js.native
    var domain: java.lang.String = js.native
    var facebookAppId: java.lang.String = js.native
    var facebookPageId: java.lang.String = js.native
    var id: java.lang.String = js.native
    var isAdEnabled: scala.Boolean = js.native
    var isArEnabled: scala.Boolean = js.native
    var language: java.lang.String = js.native
    var locationId: scala.Double = js.native
    var locationPersonId: java.lang.String = js.native
    var tapps: js.Array[chaynsLib.SiteTapp] = js.native
    var title: java.lang.String = js.native
    var url: java.lang.String = js.native
    var version: java.lang.String = js.native
    /**
                 * Environmental Variables
                 * chayns.env.site.tapp
                 */
    @JSName("tapp")
    @js.native
    object tappNs extends js.Object {
      var customUrl: java.lang.String = js.native
      var id: scala.Double = js.native
      var internalName: java.lang.String = js.native
      var isExclusiveView: scala.Boolean = js.native
      var isKioskMode: scala.Boolean = js.native
      var isSubTapp: scala.Boolean = js.native
      var showName: java.lang.String = js.native
      var sortId: scala.Double = js.native
      var userGroupIds: js.Array[scala.Double] = js.native
    }
    
  }
  
  /**
           * Environmental Variables
           * chayns.env.user
           */
  @JSName("user")
  @js.native
  object userNs extends js.Object {
    var facebookAccessToken: java.lang.String = js.native
    var facebookId: java.lang.String = js.native
    var groups: js.Array[chaynsLib.UserGroup] = js.native
    var id: scala.Double = js.native
    var isAuthenticated: scala.Boolean = js.native
    var language: java.lang.String = js.native
    var name: java.lang.String = js.native
    var personId: java.lang.String = js.native
    var tobitAccessToken: java.lang.String = js.native
  }
  
}

