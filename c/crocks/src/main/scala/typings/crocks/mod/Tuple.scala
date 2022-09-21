package typings.crocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tuple {
  
  @JSImport("crocks", "Tuple.default")
  @js.native
  open class default ()
    extends typings.crocks.tupleMod.default
  /* static members */
  object default {
    
    inline def apply(val1: scala.Any, val2: scala.Any): typings.crocks.tupleTupleMod.Tuple = (^.asInstanceOf[js.Dynamic].apply(val1.asInstanceOf[js.Any], val2.asInstanceOf[js.Any])).asInstanceOf[typings.crocks.tupleTupleMod.Tuple]
    
    @JSImport("crocks", "Tuple.default")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): typings.crocks.tupleTupleMod.Tuple = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typings.crocks.tupleTupleMod.Tuple]
    
    inline def of(`val`: scala.Any): typings.crocks.tupleTupleMod.Tuple = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.crocks.tupleTupleMod.Tuple]
  }
}
