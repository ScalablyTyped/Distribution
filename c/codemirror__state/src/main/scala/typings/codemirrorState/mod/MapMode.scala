package typings.codemirrorState.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MapMode extends StObject
/**
Distinguishes different ways in which positions can be mapped.
*/
@JSImport("@codemirror/state", "MapMode")
@js.native
object MapMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapMode & Double] = js.native
  
  /**
    Map a position to a valid new position, even when its context
    was deleted.
    */
  @js.native
  sealed trait Simple
    extends StObject
       with MapMode
  /* 0 */ val Simple: typings.codemirrorState.mod.MapMode.Simple & Double = js.native
  
  /**
    Return null if the character _after_ the position is deleted.
    */
  @js.native
  sealed trait TrackAfter
    extends StObject
       with MapMode
  /* 3 */ val TrackAfter: typings.codemirrorState.mod.MapMode.TrackAfter & Double = js.native
  
  /**
    Return null if the character _before_ the position is deleted.
    */
  @js.native
  sealed trait TrackBefore
    extends StObject
       with MapMode
  /* 2 */ val TrackBefore: typings.codemirrorState.mod.MapMode.TrackBefore & Double = js.native
  
  /**
    Return null if deletion happens across the position.
    */
  @js.native
  sealed trait TrackDel
    extends StObject
       with MapMode
  /* 1 */ val TrackDel: typings.codemirrorState.mod.MapMode.TrackDel & Double = js.native
}
