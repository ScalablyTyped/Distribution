package typings.devextremeB5DqTZzf.mod.default

import typings.devextremeB5DqTZzf.anon.Animation
import typings.devextremeB5DqTZzf.mod.DevExpress.AnimationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationPresets {
  
  @JSImport(".devextreme-b5DqTZzf", "default.animationPresets")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Applies the changes made in the animation repository.
    */
  inline def applyChanges(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("applyChanges")().asInstanceOf[Unit]
  
  /**
    * Removes all animations from the repository.
    */
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  /**
    * Deletes an animation with a specific name.
    */
  inline def clear(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Gets the configuration of an animation with a specific name.
    */
  inline def getPreset(name: String): AnimationConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreset")(name.asInstanceOf[js.Any]).asInstanceOf[AnimationConfig]
  
  /**
    * Registers predefined animations in the animation repository.
    */
  inline def registerDefaultPresets(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerDefaultPresets")().asInstanceOf[Unit]
  
  /**
    * Adds an animation with a specific name to the animation repository.
    */
  inline def registerPreset(name: String, config: Animation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPreset")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Deletes all custom animations.
    */
  inline def resetToDefaults(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetToDefaults")().asInstanceOf[Unit]
}
