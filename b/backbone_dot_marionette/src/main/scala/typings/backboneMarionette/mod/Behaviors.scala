package typings.backboneMarionette.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Behaviors {
  
  @JSImport("backbone.marionette", "Behaviors")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This method defines where your behavior classes are stored. Override this to provide another lookup.
    */
  @scala.inline
  def behaviorsLookup(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("behaviorsLookup")().asInstanceOf[js.Any]
  
  /**
    * This method has a default implementation that is simple to override. It
    * is responsible for the lookup of single behavior from within the
    * Behaviors.behaviorsLookup or elsewhere. Note that it should return the type of the
    * class to instantiate, not an instance of that class.
    */
  @scala.inline
  def getBehaviorClass(options: js.Any, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBehaviorClass")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
