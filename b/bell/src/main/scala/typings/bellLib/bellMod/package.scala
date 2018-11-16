package typings
package bellLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bellMod {
  type AuthedRequest = js.Function2[
    /* uri */ java.lang.String, 
    /* params */ js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]], 
    stdLib.Promise[js.Object]
  ]
  type BellOptions = CustomProviderOptions | KnownProviderOptions
  type ProfileGetter[C /* <: Credentials */] = js.ThisFunction3[
    /* this */ CustomProviderOptions, 
    /* credentials */ C, 
    /* params */ ScalablyTyped.runtime.StringDictionary[java.lang.String], 
    /* get */ AuthedRequest, 
    stdLib.Promise[scala.Unit]
  ]
  type Provider = bellLib.bellLibStrings.arcgisonline | bellLib.bellLibStrings.auth0 | bellLib.bellLibStrings.azuread | bellLib.bellLibStrings.bitbucket | bellLib.bellLibStrings.digitalocean | bellLib.bellLibStrings.discord | bellLib.bellLibStrings.dropbox | bellLib.bellLibStrings.dropboxV2 | bellLib.bellLibStrings.facebook | bellLib.bellLibStrings.fitbit | bellLib.bellLibStrings.foursquare | bellLib.bellLibStrings.github | bellLib.bellLibStrings.gitlab | bellLib.bellLibStrings.google | bellLib.bellLibStrings.googleplus | bellLib.bellLibStrings.instagram | bellLib.bellLibStrings.linkedin | bellLib.bellLibStrings.live | bellLib.bellLibStrings.medium | bellLib.bellLibStrings.meetup | bellLib.bellLibStrings.mixer | bellLib.bellLibStrings.nest | bellLib.bellLibStrings.office365 | bellLib.bellLibStrings.okta | bellLib.bellLibStrings.phabricator | bellLib.bellLibStrings.pingfed | bellLib.bellLibStrings.pinterest | bellLib.bellLibStrings.reddit | bellLib.bellLibStrings.salesforce | bellLib.bellLibStrings.slack | bellLib.bellLibStrings.spotify | bellLib.bellLibStrings.stripe | bellLib.bellLibStrings.trakt | bellLib.bellLibStrings.tumblr | bellLib.bellLibStrings.twitch | bellLib.bellLibStrings.twitter | bellLib.bellLibStrings.vk | bellLib.bellLibStrings.wordpress | bellLib.bellLibStrings.yahoo
  type RequestPassThrough = js.Function1[
    /* request */ hapiLib.hapiMod.Request, 
    stdLib.PromiseLike[hapiLib.hapiMod.AuthCredentials] | hapiLib.hapiMod.AuthCredentials
  ]
}
