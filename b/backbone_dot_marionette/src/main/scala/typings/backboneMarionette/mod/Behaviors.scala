package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Behaviors {
  
  /**
    * This method defines where your behavior classes are stored. Override this to provide another lookup.
    */
  @JSImport("backbone.marionette", "Behaviors.behaviorsLookup")
  @js.native
  def behaviorsLookup(): js.Any = js.native
  
  /**
    * This method has a default implementation that is simple to override. It
    * is responsible for the lookup of single behavior from within the
    * Behaviors.behaviorsLookup or elsewhere. Note that it should return the type of the
    * class to instantiate, not an instance of that class.
    */
  @JSImport("backbone.marionette", "Behaviors.getBehaviorClass")
  @js.native
  def getBehaviorClass(options: js.Any, key: String): js.Any = js.native
}
