package typings.dateFns

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmIsEqualMod {
  
  object default {
    
    @scala.inline
    def apply(dateLeft: Double, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(dateLeft: Double, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(dateLeft: Date, dateRight: Double): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def apply(dateLeft: Date, dateRight: Date): Boolean = (^.asInstanceOf[js.Dynamic].apply(dateLeft.asInstanceOf[js.Any], dateRight.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("date-fns/esm/isEqual", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
