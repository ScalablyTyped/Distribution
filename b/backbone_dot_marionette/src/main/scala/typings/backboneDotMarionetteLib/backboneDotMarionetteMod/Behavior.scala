package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.marionette", "Behavior")
@js.native
class Behavior () extends Object {
  def this(options: js.Any) = this()
  /**
       * $el is a direct proxy of the view's el cached as a jQuery selector.
       */
  @JSName("$el")
  var $el: jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
       * The behaviors key allows a behavior to group multiple behaviors
       * together.
       */
  var behaviors: js.Array[Behavior] | (org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.Instantiable1[/* options */ js.UndefOr[/* options */ js.Any], Behavior]
  ]) | js.Array[backboneDotMarionetteLib.Anon_Index] = js.native
  /**
       * collectionEvents will respond to the view's collection events.
       */
  var collectionEvents: EventsHash = js.native
  /**
       * defaults can be a hash or function to define the default options for
       * your behavior. The default options will be overridden depending on
       * what you set as the options per behavior (this works just like a
       * backbone.model).
       */
  var defaults: js.Any = js.native
  /**
       * el is a direct proxy of the view's el
       */
  var el: js.Any = js.native
  /**
       * modelEvents will respond to the view's model events.
       */
  var modelEvents: EventsHash = js.native
  var options: js.Any = js.native
  /**
       * Any triggers you define on the Behavior will be triggered in response to the appropriate event on the view.
       */
  var triggers: EventsHash = js.native
  /**
       * Behaviors can have their own ui hash, which will be mixed into the ui
       * hash of its associated View instance. ui elements defined on either the
       * Behavior or the View will be made available within events and triggers.
       * They also are attached directly to the Behavior and can be accessed within
       * Behavior methods as this.ui.
       */
  var ui: js.Any = js.native
  /**
       * The View that this behavior is attached to.
       */
  var view: View[_] = js.native
  /**
       * $ is a direct proxy of the views $ lookup method.
       */
  @JSName("$")
  def $(selector: js.Any): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
       * Get handle on UI element defined in ui hash
       */
  def getUI(ui: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
}

