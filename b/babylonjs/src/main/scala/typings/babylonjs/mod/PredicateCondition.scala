package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PredicateCondition")
@js.native
open class PredicateCondition protected ()
  extends typings.babylonjs.legacyLegacyMod.PredicateCondition {
  /**
    * Creates a new PredicateCondition
    * @param actionManager manager for the action the condition applies to
    * @param predicate defines the predicate function used to validate the condition
    */
  def this(
    actionManager: typings.babylonjs.actionsActionManagerMod.ActionManager,
    /** defines the predicate function used to validate the condition */
  predicate: js.Function0[Boolean]
  ) = this()
}
