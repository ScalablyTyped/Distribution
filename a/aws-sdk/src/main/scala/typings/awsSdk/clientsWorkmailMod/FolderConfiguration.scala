package typings.awsSdk.clientsWorkmailMod

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
    * The number of days for which the folder-configuration action applies.
    */
  var Period: js.UndefOr[RetentionPeriod] = js.undefined
}
object FolderConfiguration {
  
  inline def apply(Action: RetentionAction, Name: FolderName): FolderConfiguration = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FolderConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAction(value: RetentionAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setName(value: FolderName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: RetentionPeriod): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
  }
}
