package typings
package chromeDashAppsLib.chromeNs.certificateProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SignRequest extends js.Object {
  /**
               * The DER encoding of a X.509 certificate. The app must sign
               * *digest* using the associated private key.
               */
  var certificate: stdLib.ArrayBuffer
  /** The digest that must be signed */
  var digest: stdLib.ArrayBuffer
  /** Refers to the hash algorithm that was used to create *digest*. */
  var hash: Hash
  /**
               * The unique ID to be used by the app should it need to call a method
               * that requires it, e.g. requestPin.
               */
  var signRequestId: chromeDashAppsLib.chromeNs.integer
}

