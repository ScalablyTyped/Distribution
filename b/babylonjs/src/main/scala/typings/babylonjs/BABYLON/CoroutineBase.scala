package typings.babylonjs.BABYLON

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Coroutine<T> is the intersection of:
  * 1. An Iterator that yields void, returns a T, and is not passed values with calls to next.
  * 2. An IterableIterator of void (since it only yields void).
  */
@js.native
trait CoroutineBase[TStep, TReturn]
  extends StObject
     with IterableIterator[TStep]
