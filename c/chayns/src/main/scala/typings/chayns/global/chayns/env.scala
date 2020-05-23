package typings.chayns.global.chayns

import typings.chayns.SiteTapp
import typings.chayns.UserGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Environmental Variables
  * chayns.env
  */
@JSGlobal("chayns.env")
@js.native
object env extends js.Object {
  var _parameters: js.Any = js.native
  var apiVersion: Double = js.native
  var appVersion: Double = js.native
  var debugMode: Boolean = js.native
  var isAndroid: Boolean = js.native
  var isApp: Boolean = js.native
  var isBrowser: Boolean = js.native
  var isChaynsParent: Boolean = js.native
  var isChaynsWeb: Boolean = js.native
  var isChaynsWebDesktop: Boolean = js.native
  var isChaynsWebLight: Boolean = js.native
  var isChaynsWebMobile: Boolean = js.native
  var isDesktop: Boolean = js.native
  var isIOS: Boolean = js.native
  var isInFacebookFrame: Boolean = js.native
  var isInFrame: Boolean = js.native
  var isMobile: Boolean = js.native
  var isTablet: Boolean = js.native
  var isWP: Boolean = js.native
  var isWidget: Boolean = js.native
  var language: String = js.native
  var os: String = js.native
  var parameters: js.Any = js.native
  /**
    * Environmental Variables
    * chayns.env.app
    */
  @js.native
  object app extends js.Object {
    var flavor: String = js.native
    var languageId: String = js.native
    var model: String = js.native
    var name: String = js.native
    var uid: String = js.native
    var version: String = js.native
  }
  
  /**
    * Environmental Variables
    * chayns.env.browser
    */
  @js.native
  object browser extends js.Object {
    var name: String = js.native
    var version: String = js.native
  }
  
  /**
    * Environmental Variables
    * chayns.env.device
    */
  @js.native
  object device extends js.Object {
    var fontScale: js.Any = js.native
    var imei: String = js.native
    var languageId: String = js.native
    var model: String = js.native
    var systemName: String = js.native
    var systemVersion: Double = js.native
    var uid: String = js.native
  }
  
  /**
    * Environmental Variables
    * chayns.env.site
    */
  @js.native
  object site extends js.Object {
    var color: String = js.native
    var colorMode: Double = js.native
    var colorScheme: Double = js.native
    var domain: String = js.native
    var facebookAppId: String = js.native
    var facebookPageId: String = js.native
    var id: String = js.native
    var isAdEnabled: Boolean = js.native
    var isArEnabled: Boolean = js.native
    var language: String = js.native
    var locationId: Double = js.native
    var locationPersonId: String = js.native
    var tapps: js.Array[SiteTapp] = js.native
    var title: String = js.native
    var url: String = js.native
    var version: String = js.native
    /**
      * Environmental Variables
      * chayns.env.site.tapp
      */
    @js.native
    object tapp extends js.Object {
      var customUrl: String = js.native
      var id: Double = js.native
      var internalName: String = js.native
      var isExclusiveView: Boolean = js.native
      var isKioskMode: Boolean = js.native
      var isSubTapp: Boolean = js.native
      var showName: String = js.native
      var sortId: Double = js.native
      var userGroupIds: js.Array[Double] = js.native
    }
    
  }
  
  /**
    * Environmental Variables
    * chayns.env.user
    */
  @js.native
  object user extends js.Object {
    var facebookAccessToken: String = js.native
    var facebookId: String = js.native
    var groups: js.Array[UserGroup] = js.native
    var id: Double = js.native
    var isAuthenticated: Boolean = js.native
    var language: String = js.native
    var name: String = js.native
    var personId: String = js.native
    var tobitAccessToken: String = js.native
  }
  
}

