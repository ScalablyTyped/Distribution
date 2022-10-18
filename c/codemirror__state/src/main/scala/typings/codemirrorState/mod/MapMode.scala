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
  
  /**
    Map a position to a valid new position, even when its context
    was deleted.
    */
  @js.native
  sealed trait Simple
    extends StObject
       with MapMode
  
  /**
    Return null if the character _after_ the position is deleted.
    */
  @js.native
  sealed trait TrackAfter
    extends StObject
       with MapMode
  
  /**
    Return null if the character _before_ the position is deleted.
    */
  @js.native
  sealed trait TrackBefore
    extends StObject
       with MapMode
  
  /**
    Return null if deletion happens across the position.
    */
  @js.native
  sealed trait TrackDel
    extends StObject
       with MapMode
}
