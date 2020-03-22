package typings.cypress.cypressMod.Cypress

import typings.cypress.cypressStrings.afterColonscreenshot
import typings.cypress.cypressStrings.beforeColonbrowserColonlaunch
import typings.cypress.cypressStrings.fileColonpreprocessor
import typings.cypress.cypressStrings.task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginEvents extends js.Object {
  def apply(
    action: afterColonscreenshot,
    fn: js.Function1[
      /* details */ ScreenshotDetails, 
      Unit | AfterScreenshotReturnObject | js.Promise[AfterScreenshotReturnObject]
    ]
  ): Unit = js.native
  def apply(
    action: beforeColonbrowserColonlaunch,
    fn: js.Function2[
      /* browser */ Browser, 
      /* browserLaunchOptions */ BrowserLaunchOptions, 
      Unit | BrowserLaunchOptions | js.Promise[BrowserLaunchOptions]
    ]
  ): Unit = js.native
  def apply(
    action: fileColonpreprocessor,
    fn: js.Function1[/* file */ FileObject, String | js.Promise[String]]
  ): Unit = js.native
  def apply(action: task, tasks: Tasks): Unit = js.native
}

