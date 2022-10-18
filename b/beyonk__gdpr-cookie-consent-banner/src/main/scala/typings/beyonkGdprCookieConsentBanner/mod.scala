package typings.beyonkGdprCookieConsentBanner

import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@beyonk/gdpr-cookie-consent-banner", JSImport.Default)
  @js.native
  val default: js.Function2[/* bodyElement */ HTMLElement, /* options */ js.UndefOr[Options], Unit] = js.native
  
  type _To = js.Function2[/* bodyElement */ HTMLElement, /* options */ js.UndefOr[Options], Unit]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Function2[/* bodyElement */ HTMLElement, /* options */ js.UndefOr[Options], Unit] = default
}
