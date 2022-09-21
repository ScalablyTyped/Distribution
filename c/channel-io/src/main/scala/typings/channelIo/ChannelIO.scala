package typings.channelIo

import typings.channelIo.anon.PartialUpdateUserOption
import typings.std.Parameters
import typings.std.Partial
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChannelIO {
  
  trait APIError extends StObject {
    
    var errors: js.Array[ErrorReason]
    
    var language: String
    
    var status: Double
    
    var `type`: String
  }
  object APIError {
    
    inline def apply(errors: js.Array[ErrorReason], language: String, status: Double, `type`: String): APIError = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIError]
    }
    
    extension [Self <: APIError](x: Self) {
      
      inline def setErrors(value: js.Array[ErrorReason]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ErrorReason*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An object that contains information for ChannelIO boot
    *
    * @see https://developers.channel.io/docs/web-boot-option
    */
  trait BootOption extends StObject {
    
    /**
      * Css selector for custom button. Use it with `hideChannelButtonOnBoot` set to `true`
      *
      * @see https://developers.channel.io/docs/web-boot-option#customlauncherselector-optional
      */
    var customLauncherSelector: js.UndefOr[String] = js.undefined
    
    /**
      * Flag to decide whether to hide the default button.
      *
      * @see https://developers.channel.io/docs/web-boot-option#hidechannelbuttononboot-optional
      */
    var hideChannelButtonOnBoot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set whether to hide marketing and message notification pop-up
      *
      * @see https://developers.channel.io/docs/web-boot-option#hidepopup-optional
      */
    var hidePopup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set default language. Only (en, ko, ja) available.
      * It does not change for users who have already been created.
      *
      * @see https://developers.channel.io/docs/web-boot-option#language-optional
      */
    var language: js.UndefOr[String] = js.undefined
    
    /**
      * the hashed value of `memberId` using SHA256
      *
      * @see https://developers.channel.io/docs/web-boot-option#memberhash-optional
      */
    var memberHash: js.UndefOr[String] = js.undefined
    
    /**
      * member (user) identification id used by your company
      *
      * @see https://developers.channel.io/docs/web-boot-option#memberid-optional
      */
    var memberId: js.UndefOr[String] = js.undefined
    
    /**
      * Set chat ux. Only (newTab, iframe) available.
      *
      * @see https://developers.channel.io/docs/web-boot-option#mobilemessengermode-optional
      */
    var mobileMessengerMode: js.UndefOr[String] = js.undefined
    
    /**
      * Channel plugin's key
      *
      * @see https://developers.channel.io/docs/web-boot-option#pluginkey-require
      */
    var pluginKey: String
    
    /**
      * Profile object contains user information.
      * If this property is present, it will be used when boot is get called
      *
      * @see https://developers.channel.io/docs/web-boot-option#profile-optional
      */
    var profile: js.UndefOr[Profile] = js.undefined
    
    /**
      * Whether to send default events (usually PageView).
      * Default value is `true`
      *
      * @see https://developers.channel.io/docs/web-boot-option#trackdefaultevent-optional
      */
    var trackDefaultEvent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Flag to decide whether to track UTM source and referrer or not.
      * Default value is `true`
      *
      * @see https://developers.channel.io/docs/web-boot-option#trackutmsource-optional
      */
    var trackUtmSource: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a value of whether or not to accept marketing email
      *
      * @see https://developers.channel.io/docs/web-boot-option#unsubscribeemail
      */
    var unsubscribeEmail: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a value of whether or not to accept marketing SMS
      *
      * @see https://developers.channel.io/docs/web-boot-option#unsubscribetexting
      */
    var unsubscribeTexting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a value of whether or not to accept marketing
      *
      * @deprecated Recommend to use unsubscribeEmail and unsubscribeTexting instead.
      * @see https://developers.channel.io/docs/web-boot-option#unsubscribed-optional
      */
    var unsubscribed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom plugin button's z-index
      *
      * @see https://developers.channel.io/docs/web-boot-option#zindex-optional
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object BootOption {
    
    inline def apply(pluginKey: String): BootOption = {
      val __obj = js.Dynamic.literal(pluginKey = pluginKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[BootOption]
    }
    
    extension [Self <: BootOption](x: Self) {
      
      inline def setCustomLauncherSelector(value: String): Self = StObject.set(x, "customLauncherSelector", value.asInstanceOf[js.Any])
      
      inline def setCustomLauncherSelectorUndefined: Self = StObject.set(x, "customLauncherSelector", js.undefined)
      
      inline def setHideChannelButtonOnBoot(value: Boolean): Self = StObject.set(x, "hideChannelButtonOnBoot", value.asInstanceOf[js.Any])
      
      inline def setHideChannelButtonOnBootUndefined: Self = StObject.set(x, "hideChannelButtonOnBoot", js.undefined)
      
      inline def setHidePopup(value: Boolean): Self = StObject.set(x, "hidePopup", value.asInstanceOf[js.Any])
      
      inline def setHidePopupUndefined: Self = StObject.set(x, "hidePopup", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setMemberHash(value: String): Self = StObject.set(x, "memberHash", value.asInstanceOf[js.Any])
      
      inline def setMemberHashUndefined: Self = StObject.set(x, "memberHash", js.undefined)
      
      inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
      
      inline def setMemberIdUndefined: Self = StObject.set(x, "memberId", js.undefined)
      
      inline def setMobileMessengerMode(value: String): Self = StObject.set(x, "mobileMessengerMode", value.asInstanceOf[js.Any])
      
      inline def setMobileMessengerModeUndefined: Self = StObject.set(x, "mobileMessengerMode", js.undefined)
      
      inline def setPluginKey(value: String): Self = StObject.set(x, "pluginKey", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setTrackDefaultEvent(value: Boolean): Self = StObject.set(x, "trackDefaultEvent", value.asInstanceOf[js.Any])
      
      inline def setTrackDefaultEventUndefined: Self = StObject.set(x, "trackDefaultEvent", js.undefined)
      
      inline def setTrackUtmSource(value: Boolean): Self = StObject.set(x, "trackUtmSource", value.asInstanceOf[js.Any])
      
      inline def setTrackUtmSourceUndefined: Self = StObject.set(x, "trackUtmSource", js.undefined)
      
      inline def setUnsubscribeEmail(value: Boolean): Self = StObject.set(x, "unsubscribeEmail", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeEmailUndefined: Self = StObject.set(x, "unsubscribeEmail", js.undefined)
      
      inline def setUnsubscribeTexting(value: Boolean): Self = StObject.set(x, "unsubscribeTexting", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeTextingUndefined: Self = StObject.set(x, "unsubscribeTexting", js.undefined)
      
      inline def setUnsubscribed(value: Boolean): Self = StObject.set(x, "unsubscribed", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribedUndefined: Self = StObject.set(x, "unsubscribed", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type CallbackParams[T] = js.Tuple2[(/* error */ APIError) | (/* error */ Null), (/* data */ Null) | (/* data */ T)]
  
  @js.native
  trait CommandSignature extends StObject {
    
    /**
      * Add tags.
      *
      * @param tags - Tags to be added. Duplicate values are maintained. Combined tag list cannot exceed 10. Null or empty list is not allowed. Always lower case.
      * @see https://developers.channel.io/docs/web-channel-io#addtags
      */
    def addTags(tags: Tags): Unit = js.native
    def addTags(tags: Tags, callback: js.Function1[/* params */ CallbackParams[User], Unit]): Unit = js.native
    
    /**
      * Boot up channel plugin(button) to make it ready to use
      *
      * @param option - a Boot Option object contains informations to initialize Channel IO plugin
      * @param callback - a callback function which will be called after boot.
      * @see https://developers.channel.io/docs/web-channel-io#boot
      */
    def boot(option: BootOption): Unit = js.native
    def boot(option: BootOption, callback: js.Function1[/* params */ CallbackParams[User], Unit]): Unit = js.native
    
    /**
      * Clear all callbacks registered.
      *
      * @see https://developers.channel.io/docs/web-channel-io#clearcallbacks
      */
    def clearCallbacks(): Unit = js.native
    def clearCallbacks(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Hide plugin messenger
      *
      * @deprecated Recommend to use hideMessenger instead.
      * @see https://developers.channel.io/docs/web-channel-io#hide
      */
    def hide(): Unit = js.native
    
    /**
      * Hide channel button.
      *
      * @see https://developers.channel.io/docs/web-channel-io#hidechannelbutton
      */
    def hideChannelButton(): Unit = js.native
    
    /**
      * Hide plugin messenger
      *
      * @see https://developers.channel.io/docs/web-channel-io#hidemessenger
      */
    def hideMessenger(): Unit = js.native
    
    /**
      * Go to the lounge view.
      *
      * @deprecated lounge API won't work in all mobile environments.
      * @see https://developers.channel.io/docs/web-channel-io#lounge
      */
    def lounge(): Unit = js.native
    
    /**
      * Register a callback when `unreadCount` is changed.
      *
      * @see https://developers.channel.io/docs/web-channel-io#onbadgechanged
      */
    def onBadgeChanged(callback: js.Function1[/* unreadCount */ Double, Unit]): Unit = js.native
    
    /**
      * Register a callback function when boot was completed.
      * Returns a user if `boot` was succeeded.
      * `user` is `undefined` when `boot` failed.
      *
      * @deprecated Recommend to use boot callback instead.
      * @see https://developers.channel.io/docs/web-channel-io#onboot
      */
    def onBoot(callback: js.Function1[/* user */ js.UndefOr[User], Unit]): Unit = js.native
    
    /**
      * Register a callback when `unreadCount` is changed.
      *
      * @see https://developers.channel.io/docs/web-channel-io#onchangebadge
      */
    def onChangeBadge(callback: js.Function1[/* unreadCount */ Double, Unit]): Unit = js.native
    
    /**
      * Register a callback when a user success to change their profile in the settings page and chats.
      * `profile` is an object of the user's profile.
      *
      * @deprecated Recommend to use onProfileChanged instead.
      * @see https://developers.channel.io/docs/web-channel-io#onchangeprofile
      */
    def onChangeProfile(callback: js.Function1[/* profile */ Profile, Unit]): Unit = js.native
    
    /**
      * Register a callback when a user success to create a chat.
      *
      * @see https://developers.channel.io/docs/web-channel-io#onchatcreated
      */
    def onChatCreated(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Register a callback when a user clicks redirect images or buttons.
      * We pass the redirect url to a function.
      *
      * @deprecated Recommend to use onUrlClicked instead.
      * @see https://developers.channel.io/docs/web-channel-io#onclickredirect
      */
    def onClickRedirect(callback: js.Function1[/* url */ String, Unit]): Unit = js.native
    
    /**
      * @deprecated Recommend to use onChatCreated instead.
      */
    def onCreateChat(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Register a callback when a user success to change their profile in the settings page or the follow-up form.
      * `profile` is an object of the user's profile includes following fields:
      * - `name`
      * - `email`
      * - `mobileNumber`
      *
      * @see https://developers.channel.io/docs/web-channel-io#onfollowupchanged
      */
    def onFollowUpChanged(callback: js.Function1[/* profile */ FollowUpProfile, Unit]): Unit = js.native
    
    /**
      * Register a callback function when the chat list is hidden.
      *
      * @deprecated Recommend to use onHideMessenger instead.
      * @see https://developers.channel.io/docs/web-channel-io#onhide
      */
    def onHide(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Register a callback function when the chat list is hidden.
      *
      * @see https://developers.channel.io/docs/web-channel-io#onhidemessenger
      */
    def onHideMessenger(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Register a callback when a user success to change their profile in the settings page and chats.
      * `profile` is an object of the user's profile.
      *
      * @see https://developers.channel.io/docs/web-channel-io#onchangeprofile
      */
    def onProfileChanged(callback: js.Function1[/* profile */ Profile, Unit]): Unit = js.native
    
    /**
      * Register a callback function when the chat list is shown.
      *
      * @deprecated Recommend to use onShowMessenger instead.
      * @see https://developers.channel.io/docs/web-channel-io#onshow
      */
    def onShow(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Register a callback function when the chat list is shown.
      *
      * @see https://developers.channel.io/docs/web-channel-io#onshowmessenger
      */
    def onShowMessenger(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Register a callback when a user clicks redirect images or buttons.
      * We pass the redirect url to a function.
      *
      * @see https://developers.channel.io/docs/web-channel-io#onurlclicked
      */
    def onUrlClicked(callback: js.Function1[/* url */ String, Unit]): Unit = js.native
    
    /**
      * Open a chat with the given chat id and message.
      * If the given chat id exists, appropriate chat will be opened.
      * If not, lounge will be opened.
      * In this case, the message will be ignored.
      * If chat id is empty and message is given, new chat will be opened and the given message will be put in the input box.
      * In this case, if the support bot is enable, support bot will run.
      * if chat id and message is both empty, new chat will be opened.
      *
      * @param chatId - The id of the chat
      * @param message - The message which will be put in the input box on messenger when new chat is opened
      * @see https://developers.channel.io/docs/web-channel-io#openchat
      */
    def openChat(): Unit = js.native
    def openChat(chatId: String): Unit = js.native
    def openChat(chatId: String, message: String): Unit = js.native
    def openChat(chatId: Double): Unit = js.native
    def openChat(chatId: Double, message: String): Unit = js.native
    def openChat(chatId: Unit, message: String): Unit = js.native
    
    /**
      * Remove tags.
      *
      * @param tags Tags to be erased. If there is no match tag value, it is ignored. Null or empty list is not allowed.
      * @see https://developers.channel.io/docs/web-channel-io#removetags
      */
    def removeTags(tags: Tags): Unit = js.native
    def removeTags(tags: Tags, callback: js.Function1[/* params */ CallbackParams[User], Unit]): Unit = js.native
    
    /**
      * Reset page data customized by developer.
      * If you call resetPage, page data will fill with canonical url .
      *
      * @see https://developers.channel.io/docs/web-channel-io#resetpage
      */
    def resetPage(): Unit = js.native
    
    /**
      * Set page to be used instead of canonical url .
      * setPage with null or undefined is different from resetPage. (that will send page data with null)
      *
      * @param page - Page data to replace default page value
      * @see https://developers.channel.io/docs/web-channel-io#setpage
      */
    def setPage(): Unit = js.native
    def setPage(page: String): Unit = js.native
    
    /**
      * Show plugin messenger
      *
      * @deprecated Recommend to use showMessenger instead.
      * @see https://developers.channel.io/docs/web-channel-io#showmessenger
      */
    def show(): Unit = js.native
    
    /**
      * Show channel button.
      *
      * @see https://developers.channel.io/docs/web-channel-io#showchannelbutton
      */
    def showChannelButton(): Unit = js.native
    
    /**
      * Show plugin messenger
      *
      * @see https://developers.channel.io/docs/web-channel-io#showmessenger
      */
    def showMessenger(): Unit = js.native
    
    /**
      * Shutdown channel plugin
      *
      * @see https://developers.channel.io/docs/web-channel-io#shutdown
      */
    def shutdown(): Unit = js.native
    
    /**
      * Track an event
      *
      * @param eventName - name of event, its length should be less than 30
      * @param eventProperty - an object contains key/value information
      * @see https://developers.channel.io/docs/web-channel-io#track
      */
    def track(eventName: String): Unit = js.native
    def track(eventName: String, eventProperty: String): Unit = js.native
    def track(eventName: String, eventProperty: Profile): Unit = js.native
    
    /**
      * Update user information.
      *
      * @see https://developers.channel.io/docs/web-channel-io#updateuser
      */
    def updateUser(profile: PartialUpdateUserOption): Unit = js.native
    def updateUser(profile: PartialUpdateUserOption, callback: js.Function1[/* params */ CallbackParams[User], Unit]): Unit = js.native
  }
  
  /* keyof channel-io.ChannelIO.CommandSignature */ /* Rewritten from type alias, can be one of: 
    - typings.channelIo.channelIoStrings.boot
    - typings.channelIo.channelIoStrings.shutdown
    - typings.channelIo.channelIoStrings.showMessenger
    - typings.channelIo.channelIoStrings.show
    - typings.channelIo.channelIoStrings.hideMessenger
    - typings.channelIo.channelIoStrings.hide
    - typings.channelIo.channelIoStrings.lounge
    - typings.channelIo.channelIoStrings.openChat
    - typings.channelIo.channelIoStrings.track
    - typings.channelIo.channelIoStrings.onBoot
    - typings.channelIo.channelIoStrings.onShowMessenger
    - typings.channelIo.channelIoStrings.onShow
    - typings.channelIo.channelIoStrings.onHideMessenger
    - typings.channelIo.channelIoStrings.onHide
    - typings.channelIo.channelIoStrings.onBadgeChanged
    - typings.channelIo.channelIoStrings.onChangeBadge
    - typings.channelIo.channelIoStrings.onChatCreated
    - typings.channelIo.channelIoStrings.onFollowUpChanged
    - typings.channelIo.channelIoStrings.onCreateChat
    - typings.channelIo.channelIoStrings.onProfileChanged
    - typings.channelIo.channelIoStrings.onChangeProfile
    - typings.channelIo.channelIoStrings.onUrlClicked
    - typings.channelIo.channelIoStrings.onClickRedirect
    - typings.channelIo.channelIoStrings.clearCallbacks
    - typings.channelIo.channelIoStrings.updateUser
    - typings.channelIo.channelIoStrings.addTags
    - typings.channelIo.channelIoStrings.removeTags
    - typings.channelIo.channelIoStrings.setPage
    - typings.channelIo.channelIoStrings.resetPage
    - typings.channelIo.channelIoStrings.showChannelButton
    - typings.channelIo.channelIoStrings.hideChannelButton
  */
  trait Commands extends StObject
  
  trait ErrorReason extends StObject {
    
    var message: String
  }
  object ErrorReason {
    
    inline def apply(message: String): ErrorReason = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorReason]
    }
    
    extension [Self <: ErrorReason](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @see https://developers.channel.io/docs/web-channel-io#onfollowupchanged
    */
  trait FollowUpProfile extends StObject {
    
    var email: String
    
    var mobileNumber: String
    
    var name: String
  }
  object FollowUpProfile {
    
    inline def apply(email: String, mobileNumber: String, name: String): FollowUpProfile = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], mobileNumber = mobileNumber.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FollowUpProfile]
    }
    
    extension [Self <: FollowUpProfile](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setMobileNumber(value: String): Self = StObject.set(x, "mobileNumber", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Profile = Partial[Record[String, Boolean | Double | String]]
  
  type Singleton = js.Function2[
    /* command */ Commands, 
    /* params */ Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: channel-io.ChannelIO.CommandSignature[channel-io.ChannelIO.Commands] */ js.Any
    ], 
    ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: channel-io.ChannelIO.CommandSignature[channel-io.ChannelIO.Commands] */ js.Any
    ]
  ]
  
  type Tags = Array[String]
  
  /**
    * @see https://developers.channel.io/docs/web-channel-io#updateuser
    */
  trait UpdateUserOption extends StObject {
    
    /**
      * Set user's language.
      * When language is 'ko' or 'ja', interface is change to these languages.
      * Else case, interface language is set to english.
      * When set invalid language, user's language field is set to null
      */
    var language: String
    
    /**
      * Profile map to overwrite.
      * Set null to reset.
      * Set null for profile value to reset profile value.
      * Empty map is not allowed.
      * Always lower case.
      */
    var profile: Profile | Null
    
    /**
      * Map of profile to be added if there is no each profile values.
      */
    var profileOnce: Profile | Null
    
    /**
      * Tags to overwrite.
      * Max 10 tags are allowed.
      * Set null to reset.
      * Empty list is not allowed.
      */
    var tags: Tags | Null
    
    /**
      * Terminates the user's marketing email subscription.
      */
    var unsubscribeEmail: Boolean
    
    /**
      * Terminates the user's marketing SMS subscription.
      */
    var unsubscribeTexting: Boolean
  }
  object UpdateUserOption {
    
    inline def apply(language: String, unsubscribeEmail: Boolean, unsubscribeTexting: Boolean): UpdateUserOption = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], unsubscribeEmail = unsubscribeEmail.asInstanceOf[js.Any], unsubscribeTexting = unsubscribeTexting.asInstanceOf[js.Any], profile = null, profileOnce = null, tags = null)
      __obj.asInstanceOf[UpdateUserOption]
    }
    
    extension [Self <: UpdateUserOption](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileNull: Self = StObject.set(x, "profile", null)
      
      inline def setProfileOnce(value: Profile): Self = StObject.set(x, "profileOnce", value.asInstanceOf[js.Any])
      
      inline def setProfileOnceNull: Self = StObject.set(x, "profileOnce", null)
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsNull: Self = StObject.set(x, "tags", null)
      
      inline def setUnsubscribeEmail(value: Boolean): Self = StObject.set(x, "unsubscribeEmail", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeTexting(value: Boolean): Self = StObject.set(x, "unsubscribeTexting", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An object that contains information about user
    *
    * @see https://developers.channel.io/docs/web-user-object
    */
  trait User extends StObject {
    
    /**
      * user's alert count
      *
      * @see https://developers.channel.io/docs/web-user-object#alert
      */
    var alert: Double
    
    /**
      * user's avatar url if exist
      *
      * @see https://developers.channel.io/docs/web-user-object#avatarurl
      */
    var avatarUrl: String
    
    /**
      * a user id used inside channel
      *
      * @see https://developers.channel.io/docs/web-user-object#id
      */
    var id: String
    
    /**
      * user's language
      *
      * @see https://developers.channel.io/docs/web-user-object#language
      */
    var language: String
    
    /**
      * member (user) identification id used by your company
      *
      * @see https://developers.channel.io/docs/web-user-object#memberid
      */
    var memberId: String
    
    /**
      * a user name
      *
      * @see https://developers.channel.io/docs/web-user-object#name
      */
    var name: String
    
    /**
      * an object contains user's key/value profile information
      *
      * @see https://developers.channel.io/docs/web-user-object#profile
      */
    var profile: Record[String, String]
    
    /**
      * user tags
      *
      * @see https://developers.channel.io/docs/web-user-object#tags
      */
    var tags: js.Array[String]
    
    /**
      * a value of whether or not to accept marketing email
      *
      * @see https://developers.channel.io/docs/web-user-object#unsubscribeemail
      */
    var unsubscribeEmail: Boolean
    
    /**
      * a value of whether or not to accept marketing SMS
      *
      * @see https://developers.channel.io/docs/web-user-object#unsubscribetexting
      */
    var unsubscribeTexting: Boolean
  }
  object User {
    
    inline def apply(
      alert: Double,
      avatarUrl: String,
      id: String,
      language: String,
      memberId: String,
      name: String,
      profile: Record[String, String],
      tags: js.Array[String],
      unsubscribeEmail: Boolean,
      unsubscribeTexting: Boolean
    ): User = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], avatarUrl = avatarUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], memberId = memberId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], unsubscribeEmail = unsubscribeEmail.asInstanceOf[js.Any], unsubscribeTexting = unsubscribeTexting.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setAlert(value: Double): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: Record[String, String]): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setUnsubscribeEmail(value: Boolean): Self = StObject.set(x, "unsubscribeEmail", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeTexting(value: Boolean): Self = StObject.set(x, "unsubscribeTexting", value.asInstanceOf[js.Any])
    }
  }
}
