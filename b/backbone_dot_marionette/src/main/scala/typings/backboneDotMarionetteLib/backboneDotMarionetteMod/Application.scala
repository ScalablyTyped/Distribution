package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.marionette", "Application")
@js.native
class Application () extends Object {
  def this(options: ApplicationOptions) = this()
  /**
    * Root entry point for the View tree of your Application.
    */
  var region: java.lang.String = js.native
  /**
    * Return the attached region object for the Application.
    */
  def getRegion(): Region = js.native
  /**
    * Return the view currently being displayed in the Application's
    * attached region. If the Application is not currently displaying a
    * view, this method returns undefined.
    */
  def getView(): View[_] = js.native
  /**
    * Called immediately after the Application has been instantiated, and
    * is invoked with the same arguments that the constructor received.
    */
  def initialize(options: ApplicationOptions): scala.Unit = js.native
  /**
    * Fired just before the application is started.
    */
  def onBeforeStart(options: ApplicationOptions): scala.Unit = js.native
  /**
    * Fired as part of the application startup.
    */
  def onStart(options: ApplicationOptions): scala.Unit = js.native
  /**
    * Display View in the region attached to the Application. This runs the
    * View lifecycle.
    */
  def showView(view: View[_]): scala.Unit = js.native
  /**
    * Once you have your application configured, you can kick everything
    * off by calling this method.
    */
  def start(): scala.Unit = js.native
  def start(options: js.Any): scala.Unit = js.native
}

