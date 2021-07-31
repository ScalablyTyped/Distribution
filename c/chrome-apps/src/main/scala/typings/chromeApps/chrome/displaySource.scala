package typings.chromeApps.chrome

import typings.chromeApps.anon.CAPABILITIESNEGOTIATIONERROR
import typings.chromeApps.anon.CONNECTED
import typings.chromeApps.anon.PBC
import typings.chromeApps.chromeAppsStrings.CAPABILITIES_NEGOTIATION_ERROR
import typings.chromeApps.chromeAppsStrings.CONNECTING
import typings.chromeApps.chromeAppsStrings.CONNECTION_ERROR
import typings.chromeApps.chromeAppsStrings.Connected_
import typings.chromeApps.chromeAppsStrings.Connecting_
import typings.chromeApps.chromeAppsStrings.DISCONNECTED
import typings.chromeApps.chromeAppsStrings.Disconnected_
import typings.chromeApps.chromeAppsStrings.MEDIA_PIPELINE_ERROR
import typings.chromeApps.chromeAppsStrings.PIN
import typings.chromeApps.chromeAppsStrings.TIMEOUT_ERROR
import typings.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import typings.chromeApps.chromeAppsStrings.capabilities_negotiation_error_
import typings.chromeApps.chromeAppsStrings.connection_error_
import typings.chromeApps.chromeAppsStrings.media_pipeline_error_
import typings.chromeApps.chromeAppsStrings.timeout_error_
import typings.chromeApps.chromeAppsStrings.unknown_error_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.displaySource
////////////////////
// Display Source //
////////////////////
/**
  * @requires(dev) Development versions only
  * @requires Permissions: 'displaySource'
  * The *chrome.displaySource* API creates a Display session using WebMediaStreamTrack as sources.
  * @todo TODO Finish documentation and typings
  */
object displaySource {
  
  trait AuthenticationInfo extends StObject {
    
    /**
      * Authentication data (e.g. PIN value).
      */
    var data: js.UndefOr[String] = js.undefined
    
    /**
      * Authentication method.
      * @see AuthenticationMethod
      */
    var method: js.UndefOr[
        ToStringLiteral[
          PBC, 
          /* keyof chrome-apps.anon.PBC */ typings.chromeApps.chromeAppsStrings.PBC | PIN, 
          Exclude[
            /* keyof chrome-apps.anon.PBC */ typings.chromeApps.chromeAppsStrings.PBC | PIN, 
            typings.chromeApps.chromeAppsStrings.PBC | PIN
          ]
        ]
      ] = js.undefined
  }
  object AuthenticationInfo {
    
    @scala.inline
    def apply(): AuthenticationInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticationInfo]
    }
    
    @scala.inline
    implicit class AuthenticationInfoMutableBuilder[Self <: AuthenticationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMethod(
        value: ToStringLiteral[
              PBC, 
              /* keyof chrome-apps.anon.PBC */ typings.chromeApps.chromeAppsStrings.PBC | PIN, 
              Exclude[
                /* keyof chrome-apps.anon.PBC */ typings.chromeApps.chromeAppsStrings.PBC | PIN, 
                typings.chromeApps.chromeAppsStrings.PBC | PIN
              ]
            ]
      ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  trait ErrorInfo extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    /** @see ErrorType */
    var `type`: ToStringLiteral[
        CAPABILITIESNEGOTIATIONERROR, 
        /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
        Exclude[
          /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
          unknown_error_ | media_pipeline_error_ | connection_error_ | capabilities_negotiation_error_ | timeout_error_
        ]
      ]
  }
  object ErrorInfo {
    
    @scala.inline
    def apply(
      `type`: ToStringLiteral[
          CAPABILITIESNEGOTIATIONERROR, 
          /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
          Exclude[
            /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
            unknown_error_ | media_pipeline_error_ | connection_error_ | capabilities_negotiation_error_ | timeout_error_
          ]
        ]
    ): ErrorInfo = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorInfo]
    }
    
    @scala.inline
    implicit class ErrorInfoMutableBuilder[Self <: ErrorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setType(
        value: ToStringLiteral[
              CAPABILITIESNEGOTIATIONERROR, 
              /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
              Exclude[
                /* keyof chrome-apps.anon.CAPABILITIESNEGOTIATIONERROR */ CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
                unknown_error_ | media_pipeline_error_ | connection_error_ | capabilities_negotiation_error_ | timeout_error_
              ]
            ]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SinkInfo extends StObject {
    
    /** Id of the sink. It is guaranteed to be unique during the browser session. */
    var id: integer
    
    /** Human readable name of the sink. */
    var name: String
    
    /**
      * State of the sink.
      * @see SinkState
      */
    var state: ToStringLiteral[
        CONNECTED, 
        /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
        Exclude[
          /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
          Connected_ | Connecting_ | Disconnected_
        ]
      ]
  }
  object SinkInfo {
    
    @scala.inline
    def apply(
      id: integer,
      name: String,
      state: ToStringLiteral[
          CONNECTED, 
          /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
          Exclude[
            /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
            Connected_ | Connecting_ | Disconnected_
          ]
        ]
    ): SinkInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[SinkInfo]
    }
    
    @scala.inline
    implicit class SinkInfoMutableBuilder[Self <: SinkInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: integer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(
        value: ToStringLiteral[
              CONNECTED, 
              /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
              Exclude[
                /* keyof chrome-apps.anon.CONNECTED */ typings.chromeApps.chromeAppsStrings.CONNECTED | CONNECTING | DISCONNECTED, 
                Connected_ | Connecting_ | Disconnected_
              ]
            ]
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartSessionInfo extends StObject {
    
    var audioTrack: js.UndefOr[js.Object] = js.undefined
    
    var authenticationInfo: js.UndefOr[AuthenticationInfo] = js.undefined
    
    var sinkId: integer
    
    var videoTrack: js.UndefOr[js.Object] = js.undefined
  }
  object StartSessionInfo {
    
    @scala.inline
    def apply(sinkId: integer): StartSessionInfo = {
      val __obj = js.Dynamic.literal(sinkId = sinkId.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartSessionInfo]
    }
    
    @scala.inline
    implicit class StartSessionInfoMutableBuilder[Self <: StartSessionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioTrack(value: js.Object): Self = StObject.set(x, "audioTrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioTrackUndefined: Self = StObject.set(x, "audioTrack", js.undefined)
      
      @scala.inline
      def setAuthenticationInfo(value: AuthenticationInfo): Self = StObject.set(x, "authenticationInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticationInfoUndefined: Self = StObject.set(x, "authenticationInfo", js.undefined)
      
      @scala.inline
      def setSinkId(value: integer): Self = StObject.set(x, "sinkId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoTrack(value: js.Object): Self = StObject.set(x, "videoTrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoTrackUndefined: Self = StObject.set(x, "videoTrack", js.undefined)
    }
  }
}
