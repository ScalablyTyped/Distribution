package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryNs {
  type AnimationHook[TElement] = js.Function1[/* fx */ Tween[TElement], scala.Unit]
  // Workaround for TypeScript 2.3 which does not have support for weak types handling.
  type CoordinatesPartial = (stdLib.Pick[Coordinates, cypressLib.cypressLibStrings.left]) | (stdLib.Pick[Coordinates, cypressLib.cypressLibStrings.top]) | org.scalablytyped.runtime.StringDictionary[scala.Nothing]
  // endregion
  // region Effects
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - cypressLib.cypressLibStrings.fast
    - cypressLib.cypressLibStrings.slow
  */
  type Duration = _Duration | scala.Double
  // endregion
  type EventHandler[TCurrentTarget, TData] = EventHandlerBase[TCurrentTarget, Event[TCurrentTarget, TData]]
  type EventHandlerBase[TContext, T] = js.ThisFunction2[
    /* this */ TContext, 
    /* t */ T, 
    /* repeated */ js.Any, 
    scala.Unit | cypressLib.cypressLibNumbers.`false` | js.Any
  ]
  type Node = stdLib.Element | stdLib.Text | stdLib.Comment | stdLib.DocumentFragment
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
  type Queue[TElement] = cypressLib.Anon_0 with js.Array[QueueFunction[TElement]]
  type QueueFunction[TElement] = js.ThisFunction1[/* this */ TElement, /* next */ js.Function0[scala.Unit], scala.Unit]
  /**
    * A selector is used in jQuery to select DOM elements from a DOM document. That document is, in most
    * cases, the DOM document present in all browsers, but can also be an XML document received via Ajax.
    */
  type Selector = java.lang.String
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
  type htmlString = java.lang.String
}
