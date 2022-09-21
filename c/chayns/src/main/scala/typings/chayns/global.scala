package typings.chayns

import typings.chayns.chayns.dialog.buttonType
import typings.chayns.chayns.storage.accessMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object chayns {
    
    @JSGlobal("chayns")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addErrorListener(logFn: js.Function1[/* error */ Any, js.Promise[js.Object]], appName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addErrorListener")(logFn.asInstanceOf[js.Any], appName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    // TODO check passbock parameter
    inline def addScrollListener(callback: js.Function1[/* data */ Any, Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addScrollListener")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def addScrollListener(callback: js.Function1[/* data */ Any, Any], throttle: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("addScrollListener")(callback.asInstanceOf[js.Any], throttle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def addToWallet(passbook: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("addToWallet")(passbook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def allowRefreshScroll(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("allowRefreshScroll")().asInstanceOf[js.Promise[Any]]
    
    inline def closeUrl(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeUrl")().asInstanceOf[Unit]
    
    // TODO interface for promise result
    inline def createQRCode(text: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createQRCode")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    inline def createTappShortcut(name: String, imageUrl: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTappShortcut")(name.asInstanceOf[js.Any], imageUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      * UI Functions
      * chayns.dialog
      */
    object dialog {
      
      @JSGlobal("chayns.dialog")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * This dialog allows the user to select a date, a time or both.
        * This call accepts only the config parameter, which is an object.
        * You can call this dialog using chayns.dialog.advancedDate.
        *
        * This date dialog will return on each platform the same values.
        * This is a big advantage of this call and there are some more features like:
        *  - multiselect
        *  - multiple preselects
        *  - disabled days
        *  - disabled intervals
        *  - disabled intervals for weekdays
        *  - selection of year and month to make it easier to select a date which is far away.
        * @param config
        */
      inline def advancedDate(config: AdvancedDateDialogConfig): js.Promise[AdvancedDateDialogResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("advancedDate")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AdvancedDateDialogResult]]
      
      inline def alert(title: String): js.Promise[buttonType] = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any]).asInstanceOf[js.Promise[buttonType]]
      inline def alert(title: String, message: String): js.Promise[buttonType] = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[buttonType]]
      
      @JSGlobal("chayns.dialog.buttonText")
      @js.native
      object buttonText extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.chayns.chayns.dialog.buttonText & String] = js.native
        
        /* "Abbrechen" */ val CANCEL: typings.chayns.chayns.dialog.buttonText.CANCEL & String = js.native
        
        /* "Nein" */ val NO: typings.chayns.chayns.dialog.buttonText.NO & String = js.native
        
        /* "OK" */ val OK: typings.chayns.chayns.dialog.buttonText.OK & String = js.native
        
        /* "Ja" */ val YES: typings.chayns.chayns.dialog.buttonText.YES & String = js.native
      }
      
      @JSGlobal("chayns.dialog.buttonType")
      @js.native
      object buttonType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.chayns.chayns.dialog.buttonType & Double] = js.native
        
        /* -1 */ val CANCEL: typings.chayns.chayns.dialog.buttonType.CANCEL & Double = js.native
        
        /* 0 */ val NEGATIVE: typings.chayns.chayns.dialog.buttonType.NEGATIVE & Double = js.native
        
        /* 1 */ val POSITIVE: typings.chayns.chayns.dialog.buttonType.POSITIVE & Double = js.native
      }
      
      inline def confirm(title: String): js.Promise[buttonType] = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any]).asInstanceOf[js.Promise[buttonType]]
      inline def confirm(title: String, message: String): js.Promise[buttonType] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[buttonType]]
      inline def confirm(title: String, message: String, buttons: js.Array[DialogButton]): js.Promise[buttonType] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], buttons.asInstanceOf[js.Any])).asInstanceOf[js.Promise[buttonType]]
      inline def confirm(title: String, message: Unit, buttons: js.Array[DialogButton]): js.Promise[buttonType] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(title.asInstanceOf[js.Any], message.asInstanceOf[js.Any], buttons.asInstanceOf[js.Any])).asInstanceOf[js.Promise[buttonType]]
      
      inline def date(config: DialogDateConfig): js.Promise[DialogDateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DialogDateResult]]
      
      @JSGlobal("chayns.dialog.dateType")
      @js.native
      object dateType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.chayns.chayns.dialog.dateType & Double] = js.native
        
        /* 0 */ val DATE: typings.chayns.chayns.dialog.dateType.DATE & Double = js.native
        
        /* 2 */ val DATE_TIME: typings.chayns.chayns.dialog.dateType.DATE_TIME & Double = js.native
        
        /* 1 */ val TIME: typings.chayns.chayns.dialog.dateType.TIME & Double = js.native
      }
      
      inline def facebook(options: DialogFacebookOptions): js.Promise[DialogFacebookResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("facebook")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DialogFacebookResult]]
      
      inline def input(config: DialogInputConfig): js.Promise[DialogInputResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DialogInputResult]]
      
      @JSGlobal("chayns.dialog.inputType")
      @js.native
      object inputType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.chayns.chayns.dialog.inputType & Double] = js.native
        
        /* 0 */ val DEFAULT: typings.chayns.chayns.dialog.inputType.DEFAULT & Double = js.native
        
        /* 1 */ val PASSWORD: typings.chayns.chayns.dialog.inputType.PASSWORD & Double = js.native
      }
      
      inline def select(config: DialogSelectConfig): js.Promise[DialogSelectResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DialogSelectResult]]
    }
    
    inline def disableDisplayTimeout(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("disableDisplayTimeout")().asInstanceOf[js.Promise[Any]]
    
    inline def disallowRefreshScroll(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowRefreshScroll")().asInstanceOf[js.Promise[Any]]
    
    inline def enableDisplayTimeout(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enableDisplayTimeout")().asInstanceOf[js.Promise[Any]]
    
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
      def _parameters: Any = js.native
      inline def _parameters_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_parameters")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.apiVersion")
      @js.native
      def apiVersion: Double = js.native
      inline def apiVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(x.asInstanceOf[js.Any])
      
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
        inline def flavor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flavor")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.app.languageId")
        @js.native
        def languageId: String = js.native
        inline def languageId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languageId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.app.model")
        @js.native
        def model: String = js.native
        inline def model_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("model")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.app.name")
        @js.native
        def name: String = js.native
        inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.app.uid")
        @js.native
        def uid: String = js.native
        inline def uid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.app.version")
        @js.native
        def version: String = js.native
        inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("chayns.env.appVersion")
      @js.native
      def appVersion: Double = js.native
      inline def appVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(x.asInstanceOf[js.Any])
      
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
        inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.browser.version")
        @js.native
        def version: String = js.native
        inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("chayns.env.debugMode")
      @js.native
      def debugMode: Boolean = js.native
      inline def debugMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(x.asInstanceOf[js.Any])
      
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
        def fontScale: Any = js.native
        inline def fontScale_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontScale")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.imei")
        @js.native
        def imei: String = js.native
        inline def imei_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imei")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.languageId")
        @js.native
        def languageId: String = js.native
        inline def languageId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("languageId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.model")
        @js.native
        def model: String = js.native
        inline def model_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("model")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.systemName")
        @js.native
        def systemName: String = js.native
        inline def systemName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemName")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.systemVersion")
        @js.native
        def systemVersion: Double = js.native
        inline def systemVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("systemVersion")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.device.uid")
        @js.native
        def uid: String = js.native
        inline def uid_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uid")(x.asInstanceOf[js.Any])
      }
      
      @JSGlobal("chayns.env.isAndroid")
      @js.native
      def isAndroid: Boolean = js.native
      inline def isAndroid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAndroid")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isApp")
      @js.native
      def isApp: Boolean = js.native
      inline def isApp_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isApp")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isBrowser")
      @js.native
      def isBrowser: Boolean = js.native
      inline def isBrowser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isBrowser")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isChaynsParent")
      @js.native
      def isChaynsParent: Boolean = js.native
      inline def isChaynsParent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChaynsParent")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isChaynsWeb")
      @js.native
      def isChaynsWeb: Boolean = js.native
      
      @JSGlobal("chayns.env.isChaynsWebDesktop")
      @js.native
      def isChaynsWebDesktop: Boolean = js.native
      inline def isChaynsWebDesktop_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChaynsWebDesktop")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isChaynsWebLight")
      @js.native
      def isChaynsWebLight: Boolean = js.native
      inline def isChaynsWebLight_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChaynsWebLight")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isChaynsWebMobile")
      @js.native
      def isChaynsWebMobile: Boolean = js.native
      inline def isChaynsWebMobile_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChaynsWebMobile")(x.asInstanceOf[js.Any])
      
      inline def isChaynsWeb_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChaynsWeb")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isDesktop")
      @js.native
      def isDesktop: Boolean = js.native
      inline def isDesktop_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDesktop")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isIOS")
      @js.native
      def isIOS: Boolean = js.native
      inline def isIOS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isIOS")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isInFacebookFrame")
      @js.native
      def isInFacebookFrame: Boolean = js.native
      inline def isInFacebookFrame_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInFacebookFrame")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isInFrame")
      @js.native
      def isInFrame: Boolean = js.native
      inline def isInFrame_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isInFrame")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isMobile")
      @js.native
      def isMobile: Boolean = js.native
      inline def isMobile_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMobile")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isTablet")
      @js.native
      def isTablet: Boolean = js.native
      inline def isTablet_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTablet")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isWP")
      @js.native
      def isWP: Boolean = js.native
      inline def isWP_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWP")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.isWidget")
      @js.native
      def isWidget: Boolean = js.native
      inline def isWidget_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWidget")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.language")
      @js.native
      def language: String = js.native
      inline def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.os")
      @js.native
      def os: String = js.native
      inline def os_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("os")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chayns.env.parameters")
      @js.native
      def parameters: Any = js.native
      inline def parameters_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parameters")(x.asInstanceOf[js.Any])
      
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
        inline def colorMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorMode")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.colorScheme")
        @js.native
        def colorScheme: Double = js.native
        inline def colorScheme_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorScheme")(x.asInstanceOf[js.Any])
        
        inline def color_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.domain")
        @js.native
        def domain: String = js.native
        inline def domain_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domain")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.facebookAppId")
        @js.native
        def facebookAppId: String = js.native
        inline def facebookAppId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("facebookAppId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.facebookPageId")
        @js.native
        def facebookPageId: String = js.native
        inline def facebookPageId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("facebookPageId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.id")
        @js.native
        def id: String = js.native
        inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.isAdEnabled")
        @js.native
        def isAdEnabled: Boolean = js.native
        inline def isAdEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAdEnabled")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.isArEnabled")
        @js.native
        def isArEnabled: Boolean = js.native
        inline def isArEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isArEnabled")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.language")
        @js.native
        def language: String = js.native
        inline def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.locationId")
        @js.native
        def locationId: Double = js.native
        inline def locationId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locationId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.locationPersonId")
        @js.native
        def locationPersonId: String = js.native
        inline def locationPersonId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locationPersonId")(x.asInstanceOf[js.Any])
        
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
          inline def customUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customUrl")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.id")
          @js.native
          def id: Double = js.native
          inline def id_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.internalName")
          @js.native
          def internalName: String = js.native
          inline def internalName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("internalName")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.isExclusiveView")
          @js.native
          def isExclusiveView: Boolean = js.native
          inline def isExclusiveView_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isExclusiveView")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.isKioskMode")
          @js.native
          def isKioskMode: Boolean = js.native
          inline def isKioskMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isKioskMode")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.isSubTapp")
          @js.native
          def isSubTapp: Boolean = js.native
          inline def isSubTapp_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSubTapp")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.showName")
          @js.native
          def showName: String = js.native
          inline def showName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showName")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.sortId")
          @js.native
          def sortId: Double = js.native
          inline def sortId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortId")(x.asInstanceOf[js.Any])
          
          @JSGlobal("chayns.env.site.tapp.userGroupIds")
          @js.native
          def userGroupIds: js.Array[Double] = js.native
          inline def userGroupIds_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("userGroupIds")(x.asInstanceOf[js.Any])
        }
        
        @JSGlobal("chayns.env.site.tapps")
        @js.native
        def tapps: js.Array[SiteTapp] = js.native
        inline def tapps_=(x: js.Array[SiteTapp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tapps")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.title")
        @js.native
        def title: String = js.native
        inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.url")
        @js.native
        def url: String = js.native
        inline def url_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("url")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.site.version")
        @js.native
        def version: String = js.native
        inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
      }
      
      /**
        * Environmental Variables
        * chayns.env.user
        */
      object user {
        
        @JSGlobal("chayns.env.user")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("chayns.env.user.adminMode")
        @js.native
        def adminMode: Boolean = js.native
        inline def adminMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adminMode")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.facebookAccessToken")
        @js.native
        def facebookAccessToken: String = js.native
        inline def facebookAccessToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("facebookAccessToken")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.facebookId")
        @js.native
        def facebookId: String = js.native
        inline def facebookId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("facebookId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.groups")
        @js.native
        def groups: js.Array[UserGroup] = js.native
        inline def groups_=(x: js.Array[UserGroup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groups")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.id")
        @js.native
        def id: Double = js.native
        inline def id_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.isAuthenticated")
        @js.native
        def isAuthenticated: Boolean = js.native
        inline def isAuthenticated_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAuthenticated")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.language")
        @js.native
        def language: String = js.native
        inline def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.name")
        @js.native
        def name: String = js.native
        inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.personId")
        @js.native
        def personId: String = js.native
        inline def personId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("personId")(x.asInstanceOf[js.Any])
        
        @JSGlobal("chayns.env.user.tobitAccessToken")
        @js.native
        def tobitAccessToken: String = js.native
        inline def tobitAccessToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tobitAccessToken")(x.asInstanceOf[js.Any])
      }
    }
    
    inline def findSite(name: String): js.Promise[js.Array[Site]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findSite")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Site]]]
    inline def findSite(name: String, skip: Double): js.Promise[js.Array[Site]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findSite")(name.asInstanceOf[js.Any], skip.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Site]]]
    inline def findSite(name: String, skip: Double, take: Double): js.Promise[js.Array[Site]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findSite")(name.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], take.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Site]]]
    inline def findSite(name: String, skip: Unit, take: Double): js.Promise[js.Array[Site]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findSite")(name.asInstanceOf[js.Any], skip.asInstanceOf[js.Any], take.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Site]]]
    
    // TODO interface for promise result
    inline def getAvailableSharingServices(): js.Promise[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableSharingServices")().asInstanceOf[js.Promise[js.Array[Double]]]
    
    inline def getBaseColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseColor")().asInstanceOf[String]
    inline def getBaseColor(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getBaseColor(color: String, colorMode: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseColor")(color.asInstanceOf[js.Any], colorMode.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getBaseColor(color: Unit, colorMode: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseColor")(color.asInstanceOf[js.Any], colorMode.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getBeaconHistory(): js.Promise[js.Array[BeaconHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBeaconHistory")().asInstanceOf[js.Promise[js.Array[BeaconHistory]]]
    inline def getBeaconHistory(subNumber: Double): js.Promise[js.Array[BeaconHistory]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBeaconHistory")(subNumber.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[BeaconHistory]]]
    
    inline def getGeoLocation(): js.Promise[GeoLocationResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getGeoLocation")().asInstanceOf[js.Promise[GeoLocationResult]]
    
    inline def getGlobalData(): GlobalData = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalData")().asInstanceOf[GlobalData]
    
    inline def getLocationBeacons(forceReload: Boolean): js.Promise[js.Array[LocationBeacon]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocationBeacons")(forceReload.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LocationBeacon]]]
    
    inline def getUacGroups(siteId: Double): js.Promise[js.Array[UacGroup]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUacGroups")(siteId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[UacGroup]]]
    inline def getUacGroups(siteId: Double, updateCache: Boolean): js.Promise[js.Array[UacGroup]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUacGroups")(siteId.asInstanceOf[js.Any], updateCache.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[UacGroup]]]
    
    inline def getUser(config: GetUserConfig): js.Promise[User] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[User]]
    
    inline def hideFloatingButton(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideFloatingButton")().asInstanceOf[Unit]
    
    inline def hideTitleImage(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hideTitleImage")().asInstanceOf[js.Promise[Any]]
    
    inline def hideWaitCursor(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("hideWaitCursor")().asInstanceOf[js.Promise[Any]]
    
    /**
      * Basic Functions
      * chayns.intercom
      */
    object intercom {
      
      @JSGlobal("chayns.intercom")
      @js.native
      val ^ : js.Any = js.native
      
      // TODO set interface for promise result
      inline def sendMessageToGroup(groupId: Double, config: IntercomConfig): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageToGroup")(groupId.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      
      // TODO set interface for promise result
      inline def sendMessageToPage(config: IntercomConfig): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageToPage")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def sendMessageToUser(userId: Double, config: IntercomConfig): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessageToUser")(userId.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    }
    
    /**
      * Basic Functions
      * chayns
      */
    inline def login(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("login")().asInstanceOf[js.Promise[Any]]
    inline def login(parameters: js.Array[String]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("login")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def navigateBack(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("navigateBack")().asInstanceOf[js.Promise[Any]]
    
    /**
      * Media Functions
      * Image
      * chayns
      */
    inline def openImage(urls: js.Array[String]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("openImage")(urls.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def openImage(urls: js.Array[String], start: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("openImage")(urls.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def openUrl(config: OpenUrlConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openUrl")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def openUrlInBrowser(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("openUrlInBrowser")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Media Functions
      * Miscellaneous
      * chayns
      */
    inline def openVideo(url: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("openVideo")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    /**
      * Basic Functions
      * chayns.passKit
      */
    object passKit {
      
      @JSGlobal("chayns.passKit")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getInstalled(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstalled")().asInstanceOf[js.Promise[Any]]
      
      // TODO interface for promise result
      inline def isInstalled(identifier: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstalled")(identifier.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    }
    
    inline def playSound(url: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("playSound")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def playSound(url: String, playOnMute: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("playSound")(url.asInstanceOf[js.Any], playOnMute.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      * Getting Started
      * chayns
      *
      */
    @JSGlobal("chayns.ready")
    @js.native
    def ready: js.Promise[Any] = js.native
    inline def ready_=(x: js.Promise[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ready")(x.asInstanceOf[js.Any])
    
    inline def register(config: RegisterConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def removeNfcCallback(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNfcCallback")().asInstanceOf[js.Promise[Any]]
    
    inline def removeSubTapp(config: RemoveSubTappConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSubTapp")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def saveAppointment(config: SaveAppointmentConfig): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAppointment")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def scanQRCode(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("scanQRCode")().asInstanceOf[js.Promise[Any]]
    inline def scanQRCode(cameryType: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("scanQRCode")(cameryType.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def scanQRCode(cameryType: Double, timeout: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanQRCode")(cameryType.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def scanQRCode(cameryType: Unit, timeout: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("scanQRCode")(cameryType.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def scrollToY(position: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollToY")(position.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def selectTapp(tapp: SelectTappConfig): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectTapp")(tapp.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def selectTapp(tapp: SelectTappConfig, parameter: js.Array[String]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectTapp")(tapp.asInstanceOf[js.Any], parameter.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def setHeight(config: SetHeightConfig): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setHeight")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def setNetworkChangeCallback(callback: js.Function1[/* result */ NetworkChangeResult, Any], ongoing: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setNetworkChangeCallback")(callback.asInstanceOf[js.Any], ongoing.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def setNfcCallback(callback: js.Function1[/* rfid */ String, Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setNfcCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def setOnActivateCallback(callback: js.Function1[/* tappEvent */ Double, Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnActivateCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    // TODO interface for callback data
    inline def setScreenOrientation(orientation: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setScreenOrientation")(orientation.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def setSpeechToText(callback: js.Function1[/* result */ SpeechToTextResult, Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSpeechToText")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def setSpeechToText(callback: js.Function1[/* result */ SpeechToTextResult, Any], title: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setSpeechToText")(callback.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def setSubTapp(config: SubTappConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSubTapp")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def share(config: ShareConfig): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("share")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def showFinetradingQRCode(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("showFinetradingQRCode")().asInstanceOf[js.Promise[Any]]
    
    /**
      * UI Functions
      * Floating Button
      * chayns
      */
    inline def showFloatingButton(config: FloatingConfig, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showFloatingButton")(config.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def showTitleImage(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("showTitleImage")().asInstanceOf[js.Promise[Any]]
    
    /**
      * UI Functions
      * Waitcursor
      * chayns
      */
    inline def showWaitCursor(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("showWaitCursor")().asInstanceOf[js.Promise[Any]]
    inline def showWaitCursor(text: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("showWaitCursor")(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def showWaitCursor(text: String, timeout: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitCursor")(text.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def showWaitCursor(text: Unit, timeout: Double): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("showWaitCursor")(text.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      * chayns.smartShop
      */
    @JSGlobal("chayns.smartShop")
    @js.native
    def smartShop: Any = js.native
    inline def smartShop_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smartShop")(x.asInstanceOf[js.Any])
    
    inline def startInteractionIdentification(config: InteractionIdentificationConfig): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("startInteractionIdentification")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    
    inline def startNfcDetection(callback: js.Function1[/* result */ NfcDetectionResult, Any], interval: Double, vibrate: Boolean): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("startNfcDetection")(callback.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], vibrate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def stopInteractionIdentification(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopInteractionIdentification")().asInstanceOf[js.Promise[Any]]
    
    inline def stopNfcDetection(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("stopNfcDetection")().asInstanceOf[js.Promise[Any]]
    
    /**
      * chayns.storage
      */
    object storage {
      
      @JSGlobal("chayns.storage")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chayns.storage.accessMode")
      @js.native
      object accessMode extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.chayns.chayns.storage.accessMode & Double] = js.native
        
        /* 2 */ val PRIVATE: typings.chayns.chayns.storage.accessMode.PRIVATE & Double = js.native
        
        /* 1 */ val PROTECTED: typings.chayns.chayns.storage.accessMode.PROTECTED & Double = js.native
        
        /* 0 */ val PUBLIC: typings.chayns.chayns.storage.accessMode.PUBLIC & Double = js.native
      }
      
      inline def get(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
      inline def get(key: String, accessMode: accessMode): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any], accessMode.asInstanceOf[js.Any])).asInstanceOf[Any]
      
      inline def remove(key: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      inline def remove(key: String, accessMode: accessMode): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any], accessMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      
      inline def set(key: String, value: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      inline def set(key: String, value: Any, accessMode: Unit, tappIds: js.Array[Double]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], accessMode.asInstanceOf[js.Any], tappIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      inline def set(key: String, value: Any, accessMode: accessMode): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], accessMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      inline def set(key: String, value: Any, accessMode: accessMode, tappIds: js.Array[Double]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], accessMode.asInstanceOf[js.Any], tappIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
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
        
        @JSGlobal("chayns.ui.gallery")
        @js.native
        val ^ : js.Any = js.native
        
        inline def addUrl(id: String, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addUrl")(id.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def create(id: String, urls: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(id.asInstanceOf[js.Any], urls.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def getUrls(id: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrls")(id.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
        
        inline def removeUrl(id: String, url: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeUrl")(id.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def setUrls(id: String, urls: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUrls")(id.asInstanceOf[js.Any], urls.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
      
      /**
        * UI Functions
        * chayns.ui.modeSwitch
        */
      object modeSwitch {
        
        @JSGlobal("chayns.ui.modeSwitch")
        @js.native
        val ^ : js.Any = js.native
        
        inline def add(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[Unit]
        
        inline def addItem(item: ModeSwitchItem): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addItem")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def addItem(item: ModeSwitchItem, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addItem")(item.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
        
        inline def changeMode(item: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("changeMode")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
        inline def changeMode(item: ModeSwitchItem): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("changeMode")(item.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def init(config: ModeSwitchConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def remove(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[Unit]
      }
      
      /**
        * chayns.ui.slider
        */
      object slider {
        
        @JSGlobal("chayns.ui.slider")
        @js.native
        val ^ : js.Any = js.native
        
        inline def refreshTrack(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("refreshTrack")().asInstanceOf[Unit]
      }
      
      /**
        * chayns.ui.tooltip
        */
      object tooltip {
        
        @JSGlobal("chayns.ui.tooltip")
        @js.native
        val ^ : js.Any = js.native
        
        inline def init(config: UiTooltipInitConfig, rootElement: Any): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(config.asInstanceOf[js.Any], rootElement.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
      }
    }
    
    inline def updateNavigation(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateNavigation")().asInstanceOf[js.Promise[Any]]
    inline def updateNavigation(tappId: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateNavigation")(tappId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def updateNavigation(tappId: Double, config: UpdateNavigationConfig): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateNavigation")(tappId.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def updateNavigation(tappId: Unit, config: UpdateNavigationConfig): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateNavigation")(tappId.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def uploadCloudImage(): js.Promise[UploadCloudImageResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadCloudImage")().asInstanceOf[js.Promise[UploadCloudImageResult]]
    
    inline def uploadImage(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadImage")().asInstanceOf[js.Promise[String]]
    
    /**
      * Utility Functions
      * chayns.utils
      */
    object utils {
      
      @JSGlobal("chayns.utils")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Utility Functions
        * Miscellaneous
        * chayns.utils
        */
      inline def getJwtPayload(token: String): JwtPaylod = ^.asInstanceOf[js.Dynamic].applyDynamic("getJwtPayload")(token.asInstanceOf[js.Any]).asInstanceOf[JwtPaylod]
      
      inline def isArray(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isBLEAdress(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBLEAdress")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isBlank(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlank")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isDate(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isDeferred(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeferred")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isDefined(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isFormData(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormData")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isFunction(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isGUID(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGUID")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      /**
        * Utility Functions
        * Check Types
        * chayns.utils
        */
      inline def isHex(parameter: Any, shorthand: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHex")(parameter.asInstanceOf[js.Any], shorthand.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def isJwt(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJwt")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isMacAdress(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacAdress")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isNumber(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isObject(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isPresent(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isPromise(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isString(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isUUID(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isUndefined(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def isUrl(parameter: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")(parameter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      object lang {
        
        @JSGlobal("chayns.utils.lang")
        @js.native
        val ^ : js.Any = js.native
        
        inline def get(textString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(textString.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def init(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def renderTextStrings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTextStrings")().asInstanceOf[Unit]
        
        inline def translateDomStrings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("translateDomStrings")().asInstanceOf[Unit]
      }
      
      /**
        * Utility Functions
        * Local Storage
        * chayns.utils.ls
        */
      object ls {
        
        @JSGlobal("chayns.utils.ls")
        @js.native
        val ^ : js.Any = js.native
        
        inline def get(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[String]
        
        inline def remove(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
        
        inline def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
        
        inline def set(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
      }
      
      // TODO set interface for parameters
      inline def mixColor(color1: String, color2: String, saturation: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mixColor")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def mod(number: Double, modulo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(number.asInstanceOf[js.Any], modulo.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      inline def replacePlaceholder(text: String, parameters: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replacePlaceholder")(text.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def setLevel(level: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def trim(test: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trim")(test.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    inline def vibrate(ms: js.Array[Double]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("vibrate")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  }
}
