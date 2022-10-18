package typings.cypress.anon

import typings.cypress.Cypress.Encodings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.Cypress.WriteFileOptions & cypress.Cypress.Timeoutable> */
trait PartialWriteFileOptionsTi extends StObject {
  
  var encoding: js.UndefOr[Encodings] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
  
  var log: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PartialWriteFileOptionsTi {
  
  inline def apply(): PartialWriteFileOptionsTi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWriteFileOptionsTi]
  }
  
  extension [Self <: PartialWriteFileOptionsTi](x: Self) {
    
    inline def setEncoding(value: Encodings): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
