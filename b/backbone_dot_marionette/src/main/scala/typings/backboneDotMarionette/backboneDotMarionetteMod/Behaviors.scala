package typings.backboneDotMarionette.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.marionette", "Behaviors")
@js.native
object Behaviors extends js.Object {
  /**
    * This method defines where your behavior classes are stored. Override this to provide another lookup.
    */
  def behaviorsLookup(): js.Any = js.native
  /**
    * This method has a default implementation that is simple to override. It
    * is responsible for the lookup of single behavior from within the
    * Behaviors.behaviorsLookup or elsewhere. Note that it should return the type of the
    * class to instantiate, not an instance of that class.
    */
  def getBehaviorClass(options: js.Any, key: String): js.Any = js.native
}

