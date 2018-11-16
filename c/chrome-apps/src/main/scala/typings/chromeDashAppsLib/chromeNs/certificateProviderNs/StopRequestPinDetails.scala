package typings
package chromeDashAppsLib.chromeNs.certificateProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StopRequestPinDetails extends js.Object {
  /**
               * The error template. If present it is displayed to user. Intended to
               * contain the reason for stopping the flow if it was caused by an error,
               * e.g. MAX_ATTEMPTS_EXCEEDED.
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
               * The ID given by Chrome in SignRequest
               */
  var signRequestId: scala.Double
}

