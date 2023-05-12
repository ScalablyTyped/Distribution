package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type JObject = {[x: string] : @bitcoin-computer/lib.@bitcoin-computer/lib.Json}
}}}
to avoid circular code involving: 
- @bitcoin-computer/lib.@bitcoin-computer/lib.JArray
- @bitcoin-computer/lib.@bitcoin-computer/lib.JObject
- @bitcoin-computer/lib.@bitcoin-computer/lib.Json
*/
trait JObject
  extends StObject
     with /* x */ StringDictionary[Json]
object JObject {
  
  inline def apply(): JObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JObject]
  }
}
