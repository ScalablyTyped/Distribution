package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cordovaPluginXSocialsharing {
  
  type SocialSharingErrorCallback = js.Function1[/* msg */ js.UndefOr[java.lang.String], scala.Unit]
  
  type SocialSharingSuccessCallback[T] = js.Function1[/* result */ T, scala.Unit]
  
  type SocialSharingW3C = js.Function1[
    /* shareData */ typings.cordovaPluginXSocialsharing.SocialSharingW3CData, 
    js.Promise[typings.cordovaPluginXSocialsharing.SocialSharingResult]
  ]
}
