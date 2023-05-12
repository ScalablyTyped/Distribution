package typings.bitcoinComputerLib.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Class = Instantiable1[/* args */ Any, Any]

type JArray = js.Array[Json]

type JBasic = JUndefined | JNull | JBoolean | JNumber | JString

type JBoolean = Boolean

type JNull = Null

type JNumber = Double

type JString = String

type JUndefined = Unit

/** 
NOTE: Rewritten from type alias:
{{{
type Json = @bitcoin-computer/lib.@bitcoin-computer/lib.JBasic | @bitcoin-computer/lib.@bitcoin-computer/lib.JObject | @bitcoin-computer/lib.@bitcoin-computer/lib.JArray
}}}
to avoid circular code involving: 
- @bitcoin-computer/lib.@bitcoin-computer/lib.JArray
- @bitcoin-computer/lib.@bitcoin-computer/lib.Json
*/
type Json = JBasic | JObject | Any

type SJArray = js.Array[SJson]

/** 
NOTE: Rewritten from type alias:
{{{
type SJson = @bitcoin-computer/lib.@bitcoin-computer/lib.JBasic | @bitcoin-computer/lib.@bitcoin-computer/lib.SJObject | @bitcoin-computer/lib.@bitcoin-computer/lib.SJArray
}}}
to avoid circular code involving: 
- @bitcoin-computer/lib.@bitcoin-computer/lib.SJArray
- @bitcoin-computer/lib.@bitcoin-computer/lib.SJson
*/
type SJson = JBasic | SJObject | Any
