package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoUpdateParentTasks extends StObject {
  
  /**
    * Specifies whether to recalculate the parent task&apos;s duration and progress when its child tasks are modified.
    */
  var autoUpdateParentTasks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether users can move or resize a predecessor to change a gap before a successor according to the dependency rules.
    */
  var enablePredecessorGap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables task dependencies validation.
    */
  var validateDependencies: js.UndefOr[Boolean] = js.undefined
}
object AutoUpdateParentTasks {
  
  inline def apply(): AutoUpdateParentTasks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoUpdateParentTasks]
  }
  
  extension [Self <: AutoUpdateParentTasks](x: Self) {
    
    inline def setAutoUpdateParentTasks(value: Boolean): Self = StObject.set(x, "autoUpdateParentTasks", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateParentTasksUndefined: Self = StObject.set(x, "autoUpdateParentTasks", js.undefined)
    
    inline def setEnablePredecessorGap(value: Boolean): Self = StObject.set(x, "enablePredecessorGap", value.asInstanceOf[js.Any])
    
    inline def setEnablePredecessorGapUndefined: Self = StObject.set(x, "enablePredecessorGap", js.undefined)
    
    inline def setValidateDependencies(value: Boolean): Self = StObject.set(x, "validateDependencies", value.asInstanceOf[js.Any])
    
    inline def setValidateDependenciesUndefined: Self = StObject.set(x, "validateDependencies", js.undefined)
  }
}
