package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpClosestIndexToMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/closestIndexTo", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[js.Array[js.Date | Double], js.Date | Double, js.UndefOr[Double]] = js.native
    
    type _To = CurriedFn2[js.Array[js.Date | Double], js.Date | Double, js.UndefOr[Double]]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[js.Array[js.Date | Double], js.Date | Double, js.UndefOr[Double]] = ^
  }
}
