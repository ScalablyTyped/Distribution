package typings.codemirrorState.mod

import org.scalablytyped.runtime.TopLevel
import typings.codemirrorState.anon.Dispatch
import typings.codemirrorState.codemirrorStateInts.`1`
import typings.codemirrorState.codemirrorStateInts.`2`
import typings.codemirrorState.mod.^
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
Find the code point at the given position in a string (like the
[`codePointAt`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/codePointAt)
string method).
*/
inline def codePointAt(str: String, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("codePointAt")(str.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]

/**
The amount of positions a character takes up a JavaScript string.
*/
inline def codePointSize(code: Double): `1` | `2` = ^.asInstanceOf[js.Dynamic].applyDynamic("codePointSize")(code.asInstanceOf[js.Any]).asInstanceOf[`1` | `2`]

/**
Utility function for combining behaviors to fill in a config
object from an array of provided configs. `defaults` should hold
default values for all optional fields in `Config`.
The function will, by default, error
when a field gets two values that aren't `===`-equal, but you can
provide combine functions per field to do something else.
*/
inline def combineConfig[Config /* <: js.Object */](configs: js.Array[Partial[Config]], defaults: Partial[Config]): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("combineConfig")(configs.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[Config]
inline def combineConfig[Config /* <: js.Object */](
  configs: js.Array[Partial[Config]],
  defaults: Partial[Config],
  // Should hold only the optional properties of Config, but I haven't managed to express that
combine: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof Config ]:? (first : Config[P], second : Config[P]): Config[P]}
  */ typings.codemirrorState.codemirrorStateStrings.combineConfig & TopLevel[Any]
): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("combineConfig")(configs.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[Config]

/**
Count the column position at the given offset into the string,
taking extending characters and tab size into account.
*/
inline def countColumn(string: String, tabSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countColumn")(string.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def countColumn(string: String, tabSize: Double, to: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countColumn")(string.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]

/**
Returns a next grapheme cluster break _after_ (not equal to)
`pos`, if `forward` is true, or before otherwise. Returns `pos`
itself if no further cluster break is available in the string.
Moves across surrogate pairs, extending characters (when
`includeExtending` is true), characters joined with zero-width
joiners, and flag emoji.
*/
inline def findClusterBreak(str: String, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findClusterBreak")(str.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def findClusterBreak(str: String, pos: Double, forward: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findClusterBreak")(str.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], forward.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def findClusterBreak(str: String, pos: Double, forward: Boolean, includeExtending: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findClusterBreak")(str.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], forward.asInstanceOf[js.Any], includeExtending.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def findClusterBreak(str: String, pos: Double, forward: Unit, includeExtending: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findClusterBreak")(str.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], forward.asInstanceOf[js.Any], includeExtending.asInstanceOf[js.Any])).asInstanceOf[Double]

/**
Find the offset that corresponds to the given column position in a
string, taking extending characters and tab size into account. By
default, the string length is returned when it is too short to
reach the column. Pass `strict` true to make it return -1 in that
situation.
*/
inline def findColumn(string: String, col: Double, tabSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findColumn")(string.asInstanceOf[js.Any], col.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def findColumn(string: String, col: Double, tabSize: Double, strict: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findColumn")(string.asInstanceOf[js.Any], col.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Double]

/**
Given a Unicode codepoint, return the JavaScript string that
respresents it (like
[`String.fromCodePoint`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String/fromCodePoint)).
*/
inline def fromCodePoint(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCodePoint")(code.asInstanceOf[js.Any]).asInstanceOf[String]

/**
This type is used as argument to
[`EditorState.changes`](https://codemirror.net/6/docs/ref/#state.EditorState.changes) and in the
[`changes` field](https://codemirror.net/6/docs/ref/#state.TransactionSpec.changes) of transaction
specs to succinctly describe document changes. It may either be a
plain object describing a change (a deletion, insertion, or
replacement, depending on which fields are present), a [change
set](https://codemirror.net/6/docs/ref/#state.ChangeSet), or an array of change specs.
*/
/* Rewritten from type alias, can be one of: 
  - typings.codemirrorState.anon.From
  - typings.codemirrorState.mod.ChangeSet
  - js.Array[scala.Any]
*/
type ChangeSpec = _ChangeSpec | js.Array[Any]

/**
Extension values can be
[provided](https://codemirror.net/6/docs/ref/#state.EditorStateConfig.extensions) when creating a
state to attach various kinds of configuration and behavior
information. They can either be built-in extension-providing
objects, such as [state fields](https://codemirror.net/6/docs/ref/#state.StateField) or [facet
providers](https://codemirror.net/6/docs/ref/#state.Facet.of), or objects with an extension in its
`extension` property. Extensions can be nested in arrays
arbitrarily deep—they will be flattened when processed.
*/
type Extension = typings.codemirrorState.anon.Extension | js.Array[Any]

/* Rewritten from type alias, can be one of: 
  - typings.codemirrorState.mod.Facet[scala.Any, T]
  - typings.codemirrorState.mod.StateField[T]
  - typings.codemirrorState.codemirrorStateStrings.doc
  - typings.codemirrorState.codemirrorStateStrings.selection
*/
type Slot[T] = _Slot[T] | (Facet[Any, T])

/**
Subtype of [`Command`](https://codemirror.net/6/docs/ref/#view.Command) that doesn't require access
to the actual editor view. Mostly useful to define commands that
can be run and tested outside of a browser environment.
*/
type StateCommand = js.Function1[/* target */ Dispatch, Boolean]
