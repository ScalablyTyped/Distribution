package typings.highlightJsY75vKsj1

import typings.std.Record
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AutoHighlightResult = HighlightResult

type CompilerExt = js.Function2[/* mode */ Mode, /* parent */ Mode | Language | Null, Unit]

type KeywordData = js.Tuple2[String, Double]

type KeywordDict = Record[String, KeywordData]

type LanguageFn = js.Function1[/* hljs */ js.UndefOr[HLJSApi], Language]

type ModeCallback = js.Function2[/* match */ RegExpMatchArray, /* response */ CallbackResponse, Unit]
