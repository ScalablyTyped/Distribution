package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minutesToSecondsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/minutesToSeconds", JSImport.Default)
    @js.native
    val ^ : CurriedFn1[Double, Double] = js.native
    
    type _To = CurriedFn1[Double, Double]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn1[Double, Double] = ^
  }
}
