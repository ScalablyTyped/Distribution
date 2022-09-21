package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of one or more available refactoring actions, grouped under a parent refactoring.
  */
trait ApplicableRefactorInfo extends StObject {
  
  var actions: Array[RefactorActionInfo]
  
  /**
    * A description of this refactoring category to show to the user.
    * If the refactoring gets inlined (see below), this text will not be visible.
    */
  var description: String
  
  /**
    * Inlineable refactorings can have their actions hoisted out to the top level
    * of a context menu. Non-inlineanable refactorings should always be shown inside
    * their parent grouping.
    *
    * If not specified, this value is assumed to be 'true'
    */
  var inlineable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The programmatic name of the refactoring
    */
  var name: String
}
object ApplicableRefactorInfo {
  
  inline def apply(actions: Array[RefactorActionInfo], description: String, name: String): ApplicableRefactorInfo = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicableRefactorInfo]
  }
  
  extension [Self <: ApplicableRefactorInfo](x: Self) {
    
    inline def setActions(value: Array[RefactorActionInfo]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setInlineable(value: Boolean): Self = StObject.set(x, "inlineable", value.asInstanceOf[js.Any])
    
    inline def setInlineableUndefined: Self = StObject.set(x, "inlineable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
