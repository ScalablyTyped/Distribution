package typings
package bellLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bellMod {
  type AuthedRequest = js.Function2[
    /* uri */ java.lang.String, 
    /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]], 
    js.Promise[js.Object]
  ]
  type ProfileGetter[C /* <: Credentials */] = js.ThisFunction3[
    /* this */ CustomProviderOptions, 
    /* credentials */ C, 
    /* params */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
    /* get */ AuthedRequest, 
    js.Promise[scala.Unit]
  ]
  type RequestPassThrough = js.Function1[
    /* request */ hapiLib.hapiMod.Request, 
    js.Thenable[hapiLib.hapiMod.AuthCredentials] | hapiLib.hapiMod.AuthCredentials
  ]
}
