package typings.colord.typesMod

import typings.colord.anon.A
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyColor = String | ObjectColor

type Input = String | InputObject

type InputObject = Record[String, Any]

type ParseFunction[I /* <: Input */] = js.Function1[/* input */ I, RgbaColor | Null]

type ParseResult = js.Tuple2[RgbaColor, Format]

type Parser[I /* <: Input */] = js.Tuple2[ParseFunction[I], Format]

type WithAlpha[O] = O & A
