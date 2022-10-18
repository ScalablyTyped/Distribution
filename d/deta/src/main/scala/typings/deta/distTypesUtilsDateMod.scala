package typings.deta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsDateMod {
  
  @JSImport("deta/dist/types/utils/date", "Day")
  @js.native
  open class Day () extends StObject {
    def this(date: js.Date) = this()
    
    def addSeconds(seconds: Double): Day = js.native
    
    /* private */ var date: Any = js.native
    
    def getEpochSeconds(): Double = js.native
  }
}
