package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
A range set builder is a data structure that helps build up a
[range set](https://codemirror.net/6/docs/ref/#state.RangeSet) directly, without first allocating
an array of [`Range`](https://codemirror.net/6/docs/ref/#state.Range) objects.
*/
@JSImport("@codemirror/state", "RangeSetBuilder")
@js.native
/**
  Create an empty builder.
  */
open class RangeSetBuilder[T /* <: RangeValue */] () extends StObject {
  
  /**
    Add a range. Ranges should be added in sorted (by `from` and
    `value.startSide`) order.
    */
  def add(from: Double, to: Double, value: T): Unit = js.native
  
  /* private */ var chunkPos: Any = js.native
  
  /* private */ var chunkStart: Any = js.native
  
  /* private */ var chunks: Any = js.native
  
  /**
    Finish the range set. Returns the new set. The builder can't be
    used anymore after this has been called.
    */
  def finish(): RangeSet[T] = js.native
  
  /* private */ var finishChunk: Any = js.native
  
  /* private */ var from: Any = js.native
  
  /* private */ var last: Any = js.native
  
  /* private */ var lastFrom: Any = js.native
  
  /* private */ var lastTo: Any = js.native
  
  /* private */ var maxPoint: Any = js.native
  
  /* private */ var nextLayer: Any = js.native
  
  /* private */ var setMaxPoint: Any = js.native
  
  /* private */ var to: Any = js.native
  
  /* private */ var value: Any = js.native
}
