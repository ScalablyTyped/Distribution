package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  /**
    * Lists commands in a tab.
    */
  var commands: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 53 */ Any
    ]
  ] = js.undefined
  
  /**
    * Contains an array of command groups in the tab.
    */
  var groups: js.UndefOr[js.Array[Title]] = js.undefined
  
  /**
    * Specifies the tab&apos;s title.
    */
  var title: js.UndefOr[String] = js.undefined
}
object Groups {
  
  inline def apply(): Groups = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Groups]
  }
  
  extension [Self <: Groups](x: Self) {
    
    inline def setCommands(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 53 */ Any
        ]
    ): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    inline def setCommandsVarargs(value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 53 */ Any)*): Self = StObject.set(x, "commands", js.Array(value*))
    
    inline def setGroups(value: js.Array[Title]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: Title*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
