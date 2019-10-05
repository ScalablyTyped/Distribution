package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQuery {
  import org.scalablytyped.runtime.StringDictionary
  import typings.cypress.Anon_0
  import typings.cypress.cypressNumbers.`false`
  import typings.cypress.cypressStrings.left
  import typings.cypress.cypressStrings.top
  import typings.std.Comment
  import typings.std.DocumentFragment
  import typings.std.Element
  import typings.std.Pick
  import typings.std.Text

  type AnimationHook[TElement] = js.Function1[/* fx */ Tween[TElement], Unit]
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type CoordinatesPartial = (Pick[Coordinates, left | top]) | StringDictionary[scala.Nothing]
  // endregion
  // region Effects
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.cypress.cypressStrings.fast
    - typings.cypress.cypressStrings.slow
  */
  type Duration = _Duration | Double
  // endregion
  type EventHandler[TCurrentTarget, TData] = EventHandlerBase[TCurrentTarget, Event[TCurrentTarget, TData]]
  type EventHandlerBase[TContext, T] = js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ js.Any, Unit | `false` | js.Any]
  type Node = Element | Text | Comment | DocumentFragment
  /**
    * The PlainObject type is a JavaScript object containing zero or more key-value pairs. The plain
    * object is, in other words, an Object object. It is designated "plain" in jQuery documentation to
    * distinguish it from other kinds of JavaScript objects: for example, null, user-defined arrays, and
    * host objects such as document, all of which have a typeof value of "object."
    */
  type PlainObject[T] = StringDictionary[T]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always,
    * pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    *
    * @see \`{@link http://api.jquery.com/Types/#Promise }\`
    */
  type Promise[TR, TJ, TN] = PromiseBase[TR, TJ, TN, TR, TJ, TN, TR, TJ, TN, TR, TJ, TN]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always,
    * pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    *
    * @see \`{@link http://api.jquery.com/Types/#Promise }\`
    */
  type Promise2[TR, TJ, TN, UR, UJ, UN] = PromiseBase[
    TR, 
    TJ, 
    TN, 
    UR, 
    UJ, 
    UN, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing, 
    scala.Nothing
  ]
  /**
    * This object provides a subset of the methods of the Deferred object (then, done, fail, always,
    * pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
    *
    * @see \`{@link http://api.jquery.com/Types/#Promise }\`
    */
  type Promise3[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN] = PromiseBase[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, scala.Nothing, scala.Nothing, scala.Nothing]
  // TODO: Is the first element always a string or is that specific to the 'fx' queue?
  type Queue[TElement] = Anon_0 with js.Array[QueueFunction[TElement]]
  type QueueFunction[TElement] = js.ThisFunction1[/* this */ TElement, /* next */ js.Function0[Unit], Unit]
  /**
    * A selector is used in jQuery to select DOM elements from a DOM document. That document is, in most
    * cases, the DOM document present in all browsers, but can also be an XML document received via Ajax.
    */
  type Selector = String
  // endregion
  // region Deferred
  /**
    * Any object that has a then method.
    */
  type Thenable[T] = js.Thenable[T]
  type TypeOrArray[T] = T | js.Array[T]
  /**
    * A string is designated htmlString in jQuery documentation when it is used to represent one or more
    * DOM elements, typically to be created and inserted in the document. When passed as an argument of
    * the jQuery() function, the string is identified as HTML if it starts with <tag ... >) and is parsed
    * as such until the final > character. Prior to jQuery 1.9, a string was considered to be HTML if it
    * contained <tag ... > anywhere within the string.
    */
  type htmlString = String
}
