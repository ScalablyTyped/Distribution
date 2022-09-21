package typings.gitlabNBHG3ede.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  todoId :number | undefined} & .gitlab-nBHG3ede..gitlab-nBHG3ede/dist/types/core/infrastructure/index.d.ts.Sudo */
trait todoIdnumberundefinedSudo extends StObject {
  
  var sudo: js.UndefOr[String | Double] = js.undefined
  
  var todoId: js.UndefOr[Double] = js.undefined
}
object todoIdnumberundefinedSudo {
  
  inline def apply(): todoIdnumberundefinedSudo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[todoIdnumberundefinedSudo]
  }
  
  extension [Self <: todoIdnumberundefinedSudo](x: Self) {
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
    
    inline def setTodoId(value: Double): Self = StObject.set(x, "todoId", value.asInstanceOf[js.Any])
    
    inline def setTodoIdUndefined: Self = StObject.set(x, "todoId", js.undefined)
  }
}
