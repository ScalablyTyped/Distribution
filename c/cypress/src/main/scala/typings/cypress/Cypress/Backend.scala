package typings.cypress.Cypress

import typings.cypress.cypressStrings.firefoxColonforceColongc
import typings.cypress.cypressStrings.net
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backend extends StObject {
  
  /**
    * Firefox only: Force Cypress to run garbage collection routines.
    * No-op if not running in Firefox.
    *
    * @see https://on.cypress.io/firefox-gc-issue
    */
  def apply(task: firefoxColonforceColongc): js.Promise[Unit] = js.native
  def apply(task: net, eventName: String, frame: Any): js.Promise[Unit] = js.native
}
