package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewOptions[TModel /* <: backboneLib.backboneMod.Model */]
  extends backboneLib.backboneMod.BackboneNs.ViewOptions[TModel]
     with ViewMixinOptions {
  /**
    * The events attribute binds DOM events to actions to perform on the
    * view. It takes DOM event key and a mapping to the handler.
    */
  @JSName("events")
  var events_ViewOptions: js.UndefOr[EventsHash] = js.undefined
  /**
    * If you've created a custom region class, you can use it to define
    * your region.
    */
  var regionClass: js.UndefOr[js.Any] = js.undefined
  /**
    * Add regions to this View.
    */
  var regions: js.UndefOr[js.Any] = js.undefined
  /**
    * Set the template of this View.
    */
  var template: js.UndefOr[js.Any] = js.undefined
  /**
    * The templateContext attribute can be used to add extra information to
    * your templates
    */
  var templateContext: js.UndefOr[js.Any] = js.undefined
}

