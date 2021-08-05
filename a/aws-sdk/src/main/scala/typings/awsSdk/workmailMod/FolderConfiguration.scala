package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderConfiguration extends StObject {
  
  /**
    * The action to take on the folder contents at the end of the folder configuration period.
    */
  var Action: RetentionAction
  
  /**
    * The folder name.
    */
  var Name: FolderName
  
  /**
    * The period of time at which the folder configuration action is applied.
    */
  var Period: js.UndefOr[RetentionPeriod] = js.undefined
}
object FolderConfiguration {
  
  inline def apply(Action: RetentionAction, Name: FolderName): FolderConfiguration = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderConfiguration]
  }
  
  extension [Self <: FolderConfiguration](x: Self) {
    
    inline def setAction(value: RetentionAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setName(value: FolderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: RetentionPeriod): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
  }
}
