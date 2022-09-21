package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockManagerSnapshot extends StObject {
  
  var held: js.UndefOr[Array[LockInfo]] = js.undefined
  
  var pending: js.UndefOr[Array[LockInfo]] = js.undefined
}
object LockManagerSnapshot {
  
  inline def apply(): LockManagerSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockManagerSnapshot]
  }
  
  extension [Self <: LockManagerSnapshot](x: Self) {
    
    inline def setHeld(value: Array[LockInfo]): Self = StObject.set(x, "held", value.asInstanceOf[js.Any])
    
    inline def setHeldUndefined: Self = StObject.set(x, "held", js.undefined)
    
    inline def setPending(value: Array[LockInfo]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
  }
}
