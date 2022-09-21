package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageDeclaration extends StObject {
  
  /**
    * The actions included in a stage.
    */
  var actions: StageActionDeclarationList
  
  /**
    * Reserved for future use.
    */
  var blockers: js.UndefOr[StageBlockerDeclarationList] = js.undefined
  
  /**
    * The name of the stage.
    */
  var name: StageName
}
object StageDeclaration {
  
  inline def apply(actions: StageActionDeclarationList, name: StageName): StageDeclaration = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageDeclaration]
  }
  
  extension [Self <: StageDeclaration](x: Self) {
    
    inline def setActions(value: StageActionDeclarationList): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: ActionDeclaration*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setBlockers(value: StageBlockerDeclarationList): Self = StObject.set(x, "blockers", value.asInstanceOf[js.Any])
    
    inline def setBlockersUndefined: Self = StObject.set(x, "blockers", js.undefined)
    
    inline def setBlockersVarargs(value: BlockerDeclaration*): Self = StObject.set(x, "blockers", js.Array(value*))
    
    inline def setName(value: StageName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
