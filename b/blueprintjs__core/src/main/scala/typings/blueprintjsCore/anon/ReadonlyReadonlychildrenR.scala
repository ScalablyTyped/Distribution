package typings.blueprintjsCore.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{}> & std.Readonly<{  children :react.react.ReactNode | undefined}> */
trait ReadonlyReadonlychildrenR extends StObject {
  
  val children: js.UndefOr[ReactNode] = js.undefined
}
object ReadonlyReadonlychildrenR {
  
  inline def apply(): ReadonlyReadonlychildrenR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyReadonlychildrenR]
  }
  
  extension [Self <: ReadonlyReadonlychildrenR](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
