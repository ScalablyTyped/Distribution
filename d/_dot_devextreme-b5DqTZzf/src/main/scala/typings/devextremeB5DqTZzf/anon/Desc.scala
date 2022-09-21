package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desc extends StObject {
  
  var desc: js.UndefOr[Boolean] = js.undefined
}
object Desc {
  
  inline def apply(): Desc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desc]
  }
  
  extension [Self <: Desc](x: Self) {
    
    inline def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
  }
}
