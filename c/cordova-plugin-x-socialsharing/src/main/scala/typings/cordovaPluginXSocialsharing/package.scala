package typings.cordovaPluginXSocialsharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type SocialSharingErrorCallback = js.Function1[/* msg */ js.UndefOr[String], Unit]

type SocialSharingSuccessCallback[T] = js.Function1[/* result */ T, Unit]

type SocialSharingW3C = js.Function1[/* shareData */ SocialSharingW3CData, js.Promise[SocialSharingResult]]
