package typings
package chromeDashAppsLib.chromeNs.certificateProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestPinDetails extends js.Object {
  /**
               * The number of attempts left. This is provided so that any UI can present
               * this information to the user. Chrome is not expected to enforce this,
               * instead stopPinRequest should be called by the app with
               * errorType = MAX_ATTEMPTS_EXCEEDED when the number of pin requests is
               * exceeded.
               */
  var attemptsLeft: js.UndefOr[scala.Double] = js.undefined
  /**
               * The error template displayed to the user. This should be set if the
               * previous request failed, to notify the user of the failure reason.
               * @see PinRequestErrorType
               */
  var errorType: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_INVALIDPIN, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_INVALIDPIN))),List()),Left(TsIdentSimple(K))) */js.Any
      ]
    ]
  ] = js.undefined
  /**
               * The type of code requested. Default is PIN.
               * @see PinRequestType
               */
  var requestType: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_PUK, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_PUK))),List()),Left(TsIdentSimple(K))) */js.Any
      ]
    ]
  ] = js.undefined
  /**
               * The ID given by Chrome in SignRequest.
               */
  var signRequestId: scala.Double
}

