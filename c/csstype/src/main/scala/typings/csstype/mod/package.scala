package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdvancedPseudos = (/* :-moz-any() */ String) | ":-moz-dir" | "::cue" | "::cue-region" | "::part" | "::slotted" | ":dir" | ":has" | ":host" | ":host-context" | ":is" | ":lang" | ":not" | ":nth-child" | ":nth-last-child" | ":nth-last-of-type" | ":nth-of-type" | ":where"

type AtRules = "@charset" | "@counter-style" | "@document" | "@font-face" | "@font-feature-values" | "@import" | "@keyframes" | "@layer" | "@media" | "@namespace" | "@page" | "@property" | "@scroll-timeline" | "@supports" | "@viewport"

type Globals = "-moz-initial" | "inherit" | "initial" | "revert" | "revert-layer" | "unset"

type HtmlAttributes = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 207, starting with "[abbr]", "[accept-charset]", "[accept]" */ String

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  TValue extends std.Array<infer AValue> ? std.Array<AValue extends infer TUnpacked & {} ? TUnpacked : AValue> : TValue extends infer TUnpacked & {} ? TUnpacked : TValue
  }}}
  */
type PropertyValue[TValue] = TValue

type Pseudos = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 125, starting with / * :-moz-any() * / java.lang.String, ":-moz-dir", "::cue" */ Any

type SimplePseudos = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109, starting with ":-khtml-any-link", ":-moz-any-link", ":-moz-focusring" */ String

type SvgAttributes = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 237, starting with "[accent-height]", "[alignment-baseline]", "[allowReorder]" */ String
