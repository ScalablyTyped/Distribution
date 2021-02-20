package typings.chayns

import typings.chayns.chayns.dialog.buttonType
import typings.chayns.chayns.storage.accessMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object chayns {
    
    @JSGlobal("chayns")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chayns.addErrorListener")
    @js.native
    def addErrorListener(logFn: js.Function1[/* error */ js.Any, js.Promise[js.Object]], appName: String): Unit = js.native
    
    // TODO check passbock parameter
    @JSGlobal("chayns.addScrollListener")
    @js.native
    def addScrollListener(callback: js.Function1[/* data */ js.Any, _]): js.Promise[_] = js.native
    @JSGlobal("chayns.addScrollListener")
    @js.native
    def addScrollListener(callback: js.Function1[/* data */ js.Any, _], throttle: Double): js.Promise[_] = js.native
    
    @JSGlobal("chayns.addToWallet")
    @js.native
    def addToWallet(passbook: String): js.Promise[_] = js.native
    
    @JSGlobal("chayns.allowRefreshScroll")
    @js.native
    def allowRefreshScroll(): js.Promise[_] = js.native
    
    @JSGlobal("chayns.closeUrl")
    @js.native
    def closeUrl(): Unit = js.native
    
    // TODO interface for promise result
    @JSGlobal("chayns.createQRCode")
    @js.native
    def createQRCode(text: String): js.Promise[String] = js.native
    
    @JSGlobal("chayns.createTappShortcut")
    @js.native
    def createTappShortcut(name: String, imageUrl: String): js.Promise[_] = js.native
    
    /**
      * UI Functions
      * chayns.dialog
      */
    object dialog {
      
      @JSGlobal("chayns.dialog.alert")
      @js.native
      def alert(title: String): js.Promise[buttonType] = js.native
      @JSGlobal("chayns.dialog.alert")
      @js.native
      def alert(title: String, message: String): js.Promise[buttonType] = js.native
      
      @JSGlobal("chayns.dialog.buttonText")
      @js.native
      object buttonText extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.chayns.chayns.dialog.buttonText with String] = js.native
        
        /* "Abbrechen" */ val CANCEL: typings.chayns.chayns.dialog.buttonText.CANCEL with String = js.native
        
        /* "Nein" */ val NO: typings.chayns.chayns.dialog.buttonText.NO with String = js.native
        
        /* "OK" */ val OK: typings.chayns.chayns.dialog.buttonText.OK with String = js.native
        
        /* "Ja" */ val YES: typings.chayns.chayns.dialog.buttonText.YES with String = js.native
      }
      
      @JSGlobal("chayns.dialog.buttonType")
      @js.native
      object buttonType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.chayns.chayns.dialog.buttonType with Double] = js.native
        
        /* -1 */ val CANCEL: typings.chayns.chayns.dialog.buttonType.CANCEL with Double = js.native
        
        /* 0 */ val NEGATIVE: typings.chayns.chayns.dialog.buttonType.NEGATIVE with Double = js.native
        
        /* 1 */ val POSITIVE: typings.chayns.chayns.dialog.buttonType.POSITIVE with Double = js.native
      }
      
      @JSGlobal("chayns.dialog.confirm")
      @js.native
      def confirm(title: String): js.Promise[buttonType] = js.native
      @JSGlobal("chayns.dialog.confirm")
      @js.native
      def confirm(title: String, message: js.UndefOr[scala.Nothing], buttons: js.Array[DialogButton]): js.Promise[buttonType] = js.native
      @JSGlobal("chayns.dialog.confirm")
      @js.native
      def confirm(title: String, message: String): js.Promise[buttonType] = js.native
      @JSGlobal("chayns.dialog.confirm")
      @js.native
      def confirm(title: String, message: String, buttons: js.Array[DialogButton]): js.Promise[buttonType] = js.native
      
      @JSGlobal("chayns.dialog.date")
      @js.native
      def date(config: DialogDateConfig): js.Promise[DialogDateResult] = js.native
      
      @JSGlobal("chayns.dialog.dateType")
      @js.native
      object dateType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.chayns.chayns.dialog.dateType with Double] = js.native
        
        /* 0 */ val DATE: typings.chayns.chayns.dialog.dateType.DATE with Double = js.native
        
        /* 2 */ val DATE_TIME: typings.chayns.chayns.dialog.dateType.DATE_TIME with Double = js.native
        
        /* 1 */ val TIME: typings.chayns.chayns.dialog.dateType.TIME with Double = js.native
      }
      
      @JSGlobal("chayns.dialog.facebook")
      @js.native
      def facebook(options: DialogFacebookOptions): js.Promise[DialogFacebookResult] = js.native
      
      @JSGlobal("chayns.dialog.input")
      @js.native
      def input(config: DialogInputConfig): js.Promise[DialogInputResult] = js.native
      
      @JSGlobal("chayns.dialog.inputType")
      @js.native
      object inputType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.chayns.chayns.dialog.inputType with Double] = js.native
        
        /* 0 */ val DEFAULT: typings.chayns.chayns.dialog.inputType.DEFAULT with Double = js.native
        
        /* 1 */ val PASSWORD: typings.chayns.chayns.dialog.inputType.PASSWORD with Double = js.native
      }
      
      @JSGlobal("chayns.dialog.select")
      @js.native
      def select(config: DialogSelectConfig): js.Promise[DialogSelectResult] = js.native
    }
    
    @JSGlobal("chayns.disableDisplayTimeout")
    @js.native
    def disableDisplayTimeout(): js.Promise[_] = js.native
    
    @JSGlobal("chayns.disallowRefreshScroll")
    @js.native
    def disallowRefreshScroll(): js.Promise[_] = js.native
    
    @JSGlobal("chayns.enableDisplayTimeout")
    @js.native
    def enableDisplayTimeout(): js.Promise[_] = js.native
    
    /**
      * Environmental Variables
      * chayns.env
      */
    object env {
      
      @JSGlobal("chayns.env")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chayns.env._parameters")
      @js.native
      def _parameters: js.Any = js.native
      @scala.inline
      def _parameters_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_parameters")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.apiVersion")
      @js.native
      def apiVersion: Double = js.native
      @scala.inline
      def apiVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(x.asInstanceOf[js.Any])
      
      /**
        * Environmental Variables
        * chayns.env.app
        */
      object app {
        
        @JSGlobal("chayns.env.app")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("chayns.env.app.flavor")
        @js.native
        def flavor: String = js.native
        @scala.inline
        def flavor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flavor")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.app.languageId")
        @js.native
        def languageId: String = js.native
        @scala.inline
        def languageId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languageId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.app.model")
        @js.native
        def model: String = js.native
        @scala.inline
        def model_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("model")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.app.name")
        @js.native
        def name: String = js.native
        @scala.inline
        def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.app.uid")
        @js.native
        def uid: String = js.native
        @scala.inline
        def uid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.app.version")
        @js.native
        def version: String = js.native
        @scala.inline
        def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("chayns.env.appVersion")
      @js.native
      def appVersion: Double = js.native
      @scala.inline
      def appVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(x.asInstanceOf[js.Any])
      
      /**
        * Environmental Variables
        * chayns.env.browser
        */
      object browser {
        
        @JSGlobal("chayns.env.browser")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("chayns.env.browser.name")
        @js.native
        def name: String = js.native
        @scala.inline
        def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.browser.version")
        @js.native
        def version: String = js.native
        @scala.inline
        def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("chayns.env.debugMode")
      @js.native
      def debugMode: Boolean = js.native
      @scala.inline
      def debugMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(x.asInstanceOf[js.Any])
      
      /**
        * Environmental Variables
        * chayns.env.device
        */
      object device {
        
        @JSGlobal("chayns.env.device")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("chayns.env.device.fontScale")
        @js.native
        def fontScale: js.Any = js.native
        @scala.inline
        def fontScale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontScale")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.imei")
        @js.native
        def imei: String = js.native
        @scala.inline
        def imei_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imei")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.languageId")
        @js.native
        def languageId: String = js.native
        @scala.inline
        def languageId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languageId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.model")
        @js.native
        def model: String = js.native
        @scala.inline
        def model_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("model")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.systemName")
        @js.native
        def systemName: String = js.native
        @scala.inline
        def systemName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemName")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.systemVersion")
        @js.native
        def systemVersion: Double = js.native
        @scala.inline
        def systemVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemVersion")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.uid")
        @js.native
        def uid: String = js.native
        @scala.inline
        def uid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("chayns.env.isAndroid")
      @js.native
      def isAndroid: Boolean = js.native
      @scala.inline
      def isAndroid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAndroid")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isApp")
      @js.native
      def isApp: Boolean = js.native
      @scala.inline
      def isApp_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isApp")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isBrowser")
      @js.native
      def isBrowser: Boolean = js.native
      @scala.inline
      def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isChaynsParent")
      @js.native
      def isChaynsParent: Boolean = js.native
      @scala.inline
      def isChaynsParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChaynsParent")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isChaynsWeb")
      @js.native
      def isChaynsWeb: Boolean = js.native
      
      @JSGlobal("chayns.env.isChaynsWebDesktop")
      @js.native
      def isChaynsWebDesktop: Boolean = js.native
      @scala.inline
      def isChaynsWebDesktop_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChaynsWebDesktop")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isChaynsWebLight")
      @js.native
      def isChaynsWebLight: Boolean = js.native
      @scala.inline
      def isChaynsWebLight_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChaynsWebLight")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isChaynsWebMobile")
      @js.native
      def isChaynsWebMobile: Boolean = js.native
      @scala.inline
      def isChaynsWebMobile_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChaynsWebMobile")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def isChaynsWeb_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChaynsWeb")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isDesktop")
      @js.native
      def isDesktop: Boolean = js.native
      @scala.inline
      def isDesktop_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDesktop")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isIOS")
      @js.native
      def isIOS: Boolean = js.native
      @scala.inline
      def isIOS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isIOS")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isInFacebookFrame")
      @js.native
      def isInFacebookFrame: Boolean = js.native
      @scala.inline
      def isInFacebookFrame_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInFacebookFrame")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isInFrame")
      @js.native
      def isInFrame: Boolean = js.native
      @scala.inline
      def isInFrame_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInFrame")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isMobile")
      @js.native
      def isMobile: Boolean = js.native
      @scala.inline
      def isMobile_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isTablet")
      @js.native
      def isTablet: Boolean = js.native
      @scala.inline
      def isTablet_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTablet")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isWP")
      @js.native
      def isWP: Boolean = js.native
      @scala.inline
      def isWP_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWP")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isWidget")
      @js.native
      def isWidget: Boolean = js.native
      @scala.inline
      def isWidget_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWidget")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.language")
      @js.native
      def language: String = js.native
      @scala.inline
      def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.os")
      @js.native
      def os: String = js.native
      @scala.inline
      def os_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.parameters")
      @js.native
      def parameters: js.Any = js.native
      @scala.inline
      def parameters_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
      
      /**
        * Environmental Variables
        * chayns.env.site
        */
      object site {
        
        @JSGlobal("chayns.env.site")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("chayns.env.site.color")
        @js.native
        def color: String = js.native
        
        @JSGlobal("chayns.env.site.colorMode")
        @js.native
        def colorMode: Double = js.native
        @scala.inline
        def colorMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorMode")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.colorScheme")
        @js.native
        def colorScheme: Double = js.native
        @scala.inline
        def colorScheme_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorScheme")(x.asInstanceOf[js.Any])
        
        @scala.inline
        def color_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.domain")
        @js.native
        def domain: String = js.native
        @scala.inline
        def domain_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domain")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.facebookAppId")
        @js.native
        def facebookAppId: String = js.native
        @scala.inline
        def facebookAppId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("facebookAppId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.facebookPageId")
        @js.native
        def facebookPageId: String = js.native
        @scala.inline
        def facebookPageId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("facebookPageId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.id")
        @js.native
        def id: String = js.native
        @scala.inline
        def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.isAdEnabled")
        @js.native
        def isAdEnabled: Boolean = js.native
        @scala.inline
        def isAdEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAdEnabled")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.isArEnabled")
        @js.native
        def isArEnabled: Boolean = js.native
        @scala.inline
        def isArEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isArEnabled")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.language")
        @js.native
        def language: String = js.native
        @scala.inline
        def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.locationId")
        @js.native
        def locationId: Double = js.native
        @scala.inline
        def locationId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locationId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.locationPersonId")
        @js.native
        def locationPersonId: String = js.native
        @scala.inline
        def locationPersonId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locationPersonId")(x.asInstanceOf[js.Any])
        
        /**
          * Environmental Variables
          * chayns.env.site.tapp
          */
        object tapp {
          
          @JSGlobal("chayns.env.site.tapp")
          @js.native
          val ^ : js.Any = js.native
          
          @JSGlobal("chayns.env.site.tapp.customUrl")
          @js.native
          def customUrl: String = js.native
          @scala.inline
          def customUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customUrl")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.id")
          @js.native
          def id: Double = js.native
          @scala.inline
          def id_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.internalName")
          @js.native
          def internalName: String = js.native
          @scala.inline
          def internalName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("internalName")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.isExclusiveView")
          @js.native
          def isExclusiveView: Boolean = js.native
          @scala.inline
          def isExclusiveView_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isExclusiveView")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.isKioskMode")
          @js.native
          def isKioskMode: Boolean = js.native
          @scala.inline
          def isKioskMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isKioskMode")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.isSubTapp")
          @js.native
          def isSubTapp: Boolean = js.native
          @scala.inline
          def isSubTapp_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSubTapp")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.showName")
          @js.native
          def showName: String = js.native
          @scala.inline
          def showName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showName")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.sortId")
          @js.native
          def sortId: Double = js.native
          @scala.inline
          def sortId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortId")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.userGroupIds")
          @js.native
          def userGroupIds: js.Array[Double] = js.native
          @scala.inline
          def userGroupIds_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userGroupIds")(x.asInstanceOf[js.Any])
        }
        
        @JSGlobal("chayns.env.site.tapps")
        @js.native
        def tapps: js.Array[SiteTapp] = js.native
        @scala.inline
        def tapps_=(x: js.Array[SiteTapp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tapps")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.title")
        @js.native
        def title: String = js.native
        @scala.inline
        def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.url")
        @js.native
        def url: String = js.native
        @scala.inline
        def url_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.version")
        @js.native
        def version: String = js.native
        @scala.inline
        def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
      }
      
      /**
        * Environmental Variables
        * chayns.env.user
        */
      object user {
        
        @JSGlobal("chayns.env.user")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("chayns.env.user.facebookAccessToken")
        @js.native
        def facebookAccessToken: String = js.native
        @scala.inline
        def facebookAccessToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("facebookAccessToken")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.facebookId")
        @js.native
        def facebookId: String = js.native
        @scala.inline
        def facebookId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("facebookId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.groups")
        @js.native
        def groups: js.Array[UserGroup] = js.native
        @scala.inline
        def groups_=(x: js.Array[UserGroup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groups")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.id")
        @js.native
        def id: Double = js.native
        @scala.inline
        def id_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.isAuthenticated")
        @js.native
        def isAuthenticated: Boolean = js.native
        @scala.inline
        def isAuthenticated_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAuthenticated")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.language")
        @js.native
        def language: String = js.native
        @scala.inline
        def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.name")
        @js.native
        def name: String = js.native
        @scala.inline
        def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.personId")
        @js.native
        def personId: String = js.native
        @scala.inline
        def personId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("personId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.tobitAccessToken")
        @js.native
        def tobitAccessToken: String = js.native
        @scala.inline
        def tobitAccessToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tobitAccessToken")(x.asInstanceOf[js.Any])
      }
    }
    
    @JSGlobal("chayns.findSite")
    @js.native
    def findSite(name: String): js.Promise[js.Array[Site]] = js.native
    @JSGlobal("chayns.findSite")
    @js.native
    def findSite(name: String, skip: js.UndefOr[scala.Nothing], take: Double): js.Promise[js.Array[Site]] = js.native
    @JSGlobal("chayns.findSite")
    @js.native
    def findSite(name: String, skip: Double): js.Promise[js.Array[Site]] = js.native
    @JSGlobal("chayns.findSite")
    @js.native
    def findSite(name: String, skip: Double, take: Double): js.Promise[js.Array[Site]] = js.native
    
    // TODO interface for promise result
    @JSGlobal("chayns.getAvailableSharingServices")
    @js.native
    def getAvailableSharingServices(): js.Promise[js.Array[Double]] = js.native
    
    @JSGlobal("chayns.getBaseColor")
    @js.native
    def getBaseColor(): String = js.native
    @JSGlobal("chayns.getBaseColor")
    @js.native
    def getBaseColor(color: js.UndefOr[scala.Nothing], colorMode: Double): String = js.native
    @JSGlobal("chayns.getBaseColor")
    @js.native
    def getBaseColor(color: String): String = js.native
    @JSGlobal("chayns.getBaseColor")
    @js.native
    def getBaseColor(color: String, colorMode: Double): String = js.native
    
    @JSGlobal("chayns.getBeaconHistory")
    @js.native
    def getBeaconHistory(): js.Promise[js.Array[BeaconHistory]] = js.native
    @JSGlobal("chayns.getBeaconHistory")
    @js.native
    def getBeaconHistory(subNumber: Double): js.Promise[js.Array[BeaconHistory]] = js.native
    
    @JSGlobal("chayns.getGeoLocation")
    @js.native
    def getGeoLocation(): js.Promise[GeoLocationResult] = js.native
    
    @JSGlobal("chayns.getGlobalData")
    @js.native
    def getGlobalData(): GlobalData = js.native
    
    @JSGlobal("chayns.getLocationBeacons")
    @js.native
    def getLocationBeacons(forceReload: Boolean): js.Promise[js.Array[LocationBeacon]] = js.native
    
    @JSGlobal("chayns.getUacGroups")
    @js.native
    def getUacGroups(siteId: Double): js.Promise[js.Array[UacGroup]] = js.native
    @JSGlobal("chayns.getUacGroups")
    @js.native
    def getUacGroups(siteId: Double, updateCache: Boolean): js.Promise[js.Array[UacGroup]] = js.native
    
    @JSGlobal("chayns.getUser")
    @js.native
    def getUser(config: GetUserConfig): js.Promise[User] = js.native
    
    @JSGlobal("chayns.hideFloatingButton")
    @js.native
    def hideFloatingButton(): Unit = js.native
    
    @JSGlobal("chayns.hideTitleImage")
    @js.native
    def hideTitleImage(): js.Promise[_] = js.native
    
    @JSGlobal("chayns.hideWaitCursor")
    @js.native
    def hideWaitCursor(): js.Promise[_] = js.native
    
    /**
      * Basic Functions
      * chayns.intercom
      */
    object intercom {
      
      // TODO set interface for promise result
      @JSGlobal("chayns.intercom.sendMessageToGroup")
      @js.native
      def sendMessageToGroup(groupId: Double, config: IntercomConfig): js.Promise[_] = js.native
      
      // TODO set interface for promise result
      @JSGlobal("chayns.intercom.sendMessageToPage")
      @js.native
      def sendMessageToPage(config: IntercomConfig): js.Promise[_] = js.native
      
      @JSGlobal("chayns.intercom.sendMessageToUser")
      @js.native
      def sendMessageToUser(userId: Double, config: IntercomConfig): js.Promise[_] = js.native
    }
    
    /**
      * Basic Functions
      * chayns
      */
    @JSGlobal("chayns.login")
    @js.native
    def login(): js.Promise[_] = js.native
    @JSGlobal("chayns.login")
    @js.native
    def login(parameters: js.Array[String]): js.Promise[_] = js.native
    
    @JSGlobal("chayns.navigateBack")
    @js.native
    def navigateBack(): js.Promise[_] = js.native
    
    /**
      * Media Functions
      * Image
      * chayns
      */
    @JSGlobal("chayns.openImage")
    @js.native
    def openImage(urls: js.Array[String]): js.Promise[_] = js.native
    @JSGlobal("chayns.openImage")
    @js.native
    def openImage(urls: js.Array[String], start: Double): js.Promise[_] = js.native
    
    @JSGlobal("chayns.openUrl")
    @js.native
    def openUrl(config: OpenUrlConfig): Unit = js.native
    
    @JSGlobal("chayns.openUrlInBrowser")
    @js.native
    def openUrlInBrowser(url: String): Unit = js.native
    
    /**
      * Media Functions
      * Miscellaneous
      * chayns
      */
    @JSGlobal("chayns.openVideo")
    @js.native
    def openVideo(url: String): js.Promise[_] = js.native
    
    /**
      * Basic Functions
      * chayns.passKit
      */
    object passKit {
      
      @JSGlobal("chayns.passKit.getInstalled")
      @js.native
      def getInstalled(): js.Promise[_] = js.native
      
      // TODO interface for promise result
      @JSGlobal("chayns.passKit.isInstalled")
      @js.native
      def isInstalled(identifier: String): js.Promise[_] = js.native
    }
    
    @JSGlobal("chayns.playSound")
    @js.native
    def playSound(url: String): js.Promise[_] = js.native
    @JSGlobal("chayns.playSound")
    @js.native
    def playSound(url: String, playOnMute: Boolean): js.Promise[_] = js.native
    
    /**
      * Getting Started
      * chayns
      *
      */
    @JSGlobal("chayns.ready")
    @js.native
    def ready: js.Promise[js.Any] = js.native
    @scala.inline
    def ready_=(x: js.Promise[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ready")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chayns.register")
    @js.native
    def register(config: RegisterConfig): Unit = js.native
    
    @JSGlobal("chayns.removeNfcCallback")
    @js.native
    def removeNfcCallback(): js.Promise[_] = js.native
    
    @JSGlobal("chayns.removeSubTapp")
    @js.native
    def removeSubTapp(config: RemoveSubTappConfig): Unit = js.native
    
    @JSGlobal("chayns.saveAppointment")
    @js.native
    def saveAppointment(config: SaveAppointmentConfig): js.Promise[_] = js.native
    
    @JSGlobal("chayns.scanQRCode")
    @js.native
    def scanQRCode(): js.Promise[_] = js.native
    @JSGlobal("chayns.scanQRCode")
    @js.native
    def scanQRCode(cameryType: js.UndefOr[scala.Nothing], timeout: Double): js.Promise[_] = js.native
    @JSGlobal("chayns.scanQRCode")
    @js.native
    def scanQRCode(cameryType: Double): js.Promise[_] = js.native
    @JSGlobal("chayns.scanQRCode")
    @js.native
    def scanQRCode(cameryType: Double, timeout: Double): js.Promise[_] = js.native
    
    @JSGlobal("chayns.scrollToY")
    @js.native
    def scrollToY(position: Double): js.Promise[_] = js.native
    
    @JSGlobal("chayns.selectTapp")
    @js.native
    def selectTapp(tapp: SelectTappConfig): js.Promise[_] = js.native
    @JSGlobal("chayns.selectTapp")
    @js.native
    def selectTapp(tapp: SelectTappConfig, parameter: js.Array[String]): js.Promise[_] = js.native
    
    @JSGlobal("chayns.setHeight")
    @js.native
    def setHeight(config: SetHeightConfig): js.Promise[_] = js.native
    
    @JSGlobal("chayns.setNetworkChangeCallback")
    @js.native
    def setNetworkChangeCallback(callback: js.Function1[/* result */ NetworkChangeResult, _], ongoing: Boolean): js.Promise[_] = js.native
    
    @JSGlobal("chayns.setNfcCallback")
    @js.native
    def setNfcCallback(callback: js.Function1[/* rfid */ String, _]): js.Promise[_] = js.native
    
    @JSGlobal("chayns.setOnActivateCallback")
    @js.native
    def setOnActivateCallback(callback: js.Function1[/* tappEvent */ Double, _]): js.Promise[_] = js.native
    
    // TODO interface for callback data
    @JSGlobal("chayns.setScreenOrientation")
    @js.native
    def setScreenOrientation(orientation: Double): js.Promise[_] = js.native
    
    @JSGlobal("chayns.setSpeechToText")
    @js.native
    def setSpeechToText(callback: js.Function1[/* result */ SpeechToTextResult, _]): js.Promise[_] = js.native
    @JSGlobal("chayns.setSpeechToText")
    @js.native
    def setSpeechToText(callback: js.Function1[/* result */ SpeechToTextResult, _], title: String): js.Promise[_] = js.native
    
    @JSGlobal("chayns.setSubTapp")
    @js.native
    def setSubTapp(config: SubTappConfig): Unit = js.native
    
    @JSGlobal("chayns.share")
    @js.native
    def share(config: ShareConfig): js.Promise[_] = js.native
    
    @JSGlobal("chayns.showFinetradingQRCode")
    @js.native
    def showFinetradingQRCode(): js.Promise[_] = js.native
    
    /**
      * UI Functions
      * Floating Button
      * chayns
      */
    @JSGlobal("chayns.showFloatingButton")
    @js.native
    def showFloatingButton(config: FloatingConfig, callback: js.Function0[_]): Unit = js.native
    
    @JSGlobal("chayns.showTitleImage")
    @js.native
    def showTitleImage(): js.Promise[_] = js.native
    
    /**
      * UI Functions
      * Waitcursor
      * chayns
      */
    @JSGlobal("chayns.showWaitCursor")
    @js.native
    def showWaitCursor(): js.Promise[_] = js.native
    @JSGlobal("chayns.showWaitCursor")
    @js.native
    def showWaitCursor(text: js.UndefOr[scala.Nothing], timeout: Double): js.Promise[_] = js.native
    @JSGlobal("chayns.showWaitCursor")
    @js.native
    def showWaitCursor(text: String): js.Promise[_] = js.native
    @JSGlobal("chayns.showWaitCursor")
    @js.native
    def showWaitCursor(text: String, timeout: Double): js.Promise[_] = js.native
    
    /**
      * chayns.smartShop
      */
    @JSGlobal("chayns.smartShop")
    @js.native
    def smartShop: js.Any = js.native
    @scala.inline
    def smartShop_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartShop")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chayns.startInteractionIdentification")
    @js.native
    def startInteractionIdentification(config: InteractionIdentificationConfig): js.Promise[_] = js.native
    
    @JSGlobal("chayns.startNfcDetection")
    @js.native
    def startNfcDetection(callback: js.Function1[/* result */ NfcDetectionResult, _], interval: Double, vibrate: Boolean): js.Promise[_] = js.native
    
    @JSGlobal("chayns.stopInteractionIdentification")
    @js.native
    def stopInteractionIdentification(): js.Promise[_] = js.native
    
    @JSGlobal("chayns.stopNfcDetection")
    @js.native
    def stopNfcDetection(): js.Promise[_] = js.native
    
    /**
      * chayns.storage
      */
    object storage {
      
      @JSGlobal("chayns.storage.accessMode")
      @js.native
      object accessMode extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.chayns.chayns.storage.accessMode with Double] = js.native
        
        /* 2 */ val PRIVATE: typings.chayns.chayns.storage.accessMode.PRIVATE with Double = js.native
        
        /* 1 */ val PROTECTED: typings.chayns.chayns.storage.accessMode.PROTECTED with Double = js.native
        
        /* 0 */ val PUBLIC: typings.chayns.chayns.storage.accessMode.PUBLIC with Double = js.native
      }
      
      @JSGlobal("chayns.storage.get")
      @js.native
      def get(key: String): js.Any = js.native
      @JSGlobal("chayns.storage.get")
      @js.native
      def get(key: String, accessMode: accessMode): js.Any = js.native
      
      @JSGlobal("chayns.storage.remove")
      @js.native
      def remove(key: String): js.Promise[_] = js.native
      @JSGlobal("chayns.storage.remove")
      @js.native
      def remove(key: String, accessMode: accessMode): js.Promise[_] = js.native
      
      @JSGlobal("chayns.storage.set")
      @js.native
      def set(key: String, value: js.Any): js.Promise[_] = js.native
      @JSGlobal("chayns.storage.set")
      @js.native
      def set(key: String, value: js.Any, accessMode: js.UndefOr[scala.Nothing], tappIds: js.Array[Double]): js.Promise[_] = js.native
      @JSGlobal("chayns.storage.set")
      @js.native
      def set(key: String, value: js.Any, accessMode: accessMode): js.Promise[_] = js.native
      @JSGlobal("chayns.storage.set")
      @js.native
      def set(key: String, value: js.Any, accessMode: accessMode, tappIds: js.Array[Double]): js.Promise[_] = js.native
    }
    
    /**
      * chayns.ui
      */
    object ui {
      
      /**
        * Media Functions
        * chayns.ui.gallery
        */
      object gallery {
        
        @JSGlobal("chayns.ui.gallery.addUrl")
        @js.native
        def addUrl(id: String, url: String): Unit = js.native
        
        @JSGlobal("chayns.ui.gallery.create")
        @js.native
        def create(id: String, urls: js.Array[String]): Unit = js.native
        
        @JSGlobal("chayns.ui.gallery.getUrls")
        @js.native
        def getUrls(id: String): js.Array[String] = js.native
        
        @JSGlobal("chayns.ui.gallery.removeUrl")
        @js.native
        def removeUrl(id: String, url: String): Unit = js.native
        
        @JSGlobal("chayns.ui.gallery.setUrls")
        @js.native
        def setUrls(id: String, urls: js.Array[String]): Unit = js.native
      }
      
      /**
        * UI Functions
        * chayns.ui.modeSwitch
        */
      object modeSwitch {
        
        @JSGlobal("chayns.ui.modeSwitch.add")
        @js.native
        def add(): Unit = js.native
        
        @JSGlobal("chayns.ui.modeSwitch.addItem")
        @js.native
        def addItem(item: ModeSwitchItem): Unit = js.native
        @JSGlobal("chayns.ui.modeSwitch.addItem")
        @js.native
        def addItem(item: ModeSwitchItem, index: Double): Unit = js.native
        
        @JSGlobal("chayns.ui.modeSwitch.changeMode")
        @js.native
        def changeMode(item: Double): Unit = js.native
        @JSGlobal("chayns.ui.modeSwitch.changeMode")
        @js.native
        def changeMode(item: ModeSwitchItem): Unit = js.native
        
        @JSGlobal("chayns.ui.modeSwitch.init")
        @js.native
        def init(config: ModeSwitchConfig): Unit = js.native
        
        @JSGlobal("chayns.ui.modeSwitch.remove")
        @js.native
        def remove(): Unit = js.native
      }
      
      /**
        * chayns.ui.slider
        */
      object slider {
        
        @JSGlobal("chayns.ui.slider.refreshTrack")
        @js.native
        def refreshTrack(): Unit = js.native
      }
      
      /**
        * chayns.ui.tooltip
        */
      object tooltip {
        
        @JSGlobal("chayns.ui.tooltip.init")
        @js.native
        def init(config: UiTooltipInitConfig, rootElement: js.Any): js.Promise[Boolean] = js.native
      }
    }
    
    @JSGlobal("chayns.updateNavigation")
    @js.native
    def updateNavigation(): js.Promise[_] = js.native
    @JSGlobal("chayns.updateNavigation")
    @js.native
    def updateNavigation(tappId: js.UndefOr[scala.Nothing], config: UpdateNavigationConfig): js.Promise[_] = js.native
    @JSGlobal("chayns.updateNavigation")
    @js.native
    def updateNavigation(tappId: Double): js.Promise[_] = js.native
    @JSGlobal("chayns.updateNavigation")
    @js.native
    def updateNavigation(tappId: Double, config: UpdateNavigationConfig): js.Promise[_] = js.native
    
    @JSGlobal("chayns.uploadImage")
    @js.native
    def uploadImage(): js.Promise[String] = js.native
    
    /**
      * Utility Functions
      * chayns.utils
      */
    object utils {
      
      /**
        * Utility Functions
        * Miscellaneous
        * chayns.utils
        */
      @JSGlobal("chayns.utils.getJwtPayload")
      @js.native
      def getJwtPayload(token: String): JwtPaylod = js.native
      
      @JSGlobal("chayns.utils.isArray")
      @js.native
      def isArray(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isBLEAdress")
      @js.native
      def isBLEAdress(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isBlank")
      @js.native
      def isBlank(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isDate")
      @js.native
      def isDate(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isDeferred")
      @js.native
      def isDeferred(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isDefined")
      @js.native
      def isDefined(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isFormData")
      @js.native
      def isFormData(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isFunction")
      @js.native
      def isFunction(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isGUID")
      @js.native
      def isGUID(parameter: js.Any): Boolean = js.native
      
      /**
        * Utility Functions
        * Check Types
        * chayns.utils
        */
      @JSGlobal("chayns.utils.isHex")
      @js.native
      def isHex(parameter: js.Any, shorthand: Boolean): Boolean = js.native
      
      @JSGlobal("chayns.utils.isJwt")
      @js.native
      def isJwt(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isMacAdress")
      @js.native
      def isMacAdress(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isNumber")
      @js.native
      def isNumber(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isObject")
      @js.native
      def isObject(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isPresent")
      @js.native
      def isPresent(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isPromise")
      @js.native
      def isPromise(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isString")
      @js.native
      def isString(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isUUID")
      @js.native
      def isUUID(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isUndefined")
      @js.native
      def isUndefined(parameter: js.Any): Boolean = js.native
      
      @JSGlobal("chayns.utils.isUrl")
      @js.native
      def isUrl(parameter: js.Any): Boolean = js.native
      
      object lang {
        
        @JSGlobal("chayns.utils.lang.get")
        @js.native
        def get(textString: String): String = js.native
        
        @JSGlobal("chayns.utils.lang.init")
        @js.native
        def init(config: js.Any): Unit = js.native
        
        @JSGlobal("chayns.utils.lang.renderTextStrings")
        @js.native
        def renderTextStrings(): Unit = js.native
        
        @JSGlobal("chayns.utils.lang.translateDomStrings")
        @js.native
        def translateDomStrings(): Unit = js.native
      }
      
      /**
        * Utility Functions
        * Local Storage
        * chayns.utils.ls
        */
      object ls {
        
        @JSGlobal("chayns.utils.ls.get")
        @js.native
        def get(key: String): String = js.native
        
        @JSGlobal("chayns.utils.ls.remove")
        @js.native
        def remove(key: String): Unit = js.native
        
        @JSGlobal("chayns.utils.ls.removeAll")
        @js.native
        def removeAll(): Unit = js.native
        
        @JSGlobal("chayns.utils.ls.set")
        @js.native
        def set(key: String, value: String): Unit = js.native
      }
      
      // TODO set interface for parameters
      @JSGlobal("chayns.utils.mixColor")
      @js.native
      def mixColor(color1: String, color2: String, saturation: Double): String = js.native
      
      @JSGlobal("chayns.utils.mod")
      @js.native
      def mod(number: Double, modulo: Double): Double = js.native
      
      @JSGlobal("chayns.utils.replacePlaceholder")
      @js.native
      def replacePlaceholder(text: String, parameters: js.Array[_]): String = js.native
      
      @JSGlobal("chayns.utils.setLevel")
      @js.native
      def setLevel(level: Double): Unit = js.native
      
      @JSGlobal("chayns.utils.trim")
      @js.native
      def trim(test: String): String = js.native
    }
    
    @JSGlobal("chayns.vibrate")
    @js.native
    def vibrate(ms: js.Array[Double]): js.Promise[_] = js.native
  }
}
