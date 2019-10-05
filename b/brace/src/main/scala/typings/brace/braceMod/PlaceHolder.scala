package typings.brace.braceMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceHolder extends js.Object {
  /**
    * PlaceHolder.cancel()
    * TODO
    **/
  def cancel(): Unit
  /**
    * PlaceHolder.detach()
    * TODO
    **/
  def detach(): Unit
  /**
    * PlaceHolder.hideOtherMarkers()
    * Hides all over markers in the [[EditSession `EditSession`]] that are not the currently selected one.
    **/
  def hideOtherMarkers(): Unit
  def on(event: String, fn: js.Function1[/* e */ js.Any, _]): Unit
  /**
    * PlaceHolder@onCursorChange(e)
    * Emitted when the cursor changes.
    **/
  def onCursorChange(): Unit
  /**
    * PlaceHolder@onUpdate(e)
    * Emitted when the place holder updates.
    **/
  def onUpdate(): Unit
  /**
    * PlaceHolder.setup()
    * TODO
    **/
  def setup(): Unit
  /**
    * PlaceHolder.showOtherMarkers()
    * TODO
    **/
  def showOtherMarkers(): Unit
}

@JSImport("brace", "PlaceHolder")
@js.native
object PlaceHolder
  extends /**
  * - @param session (Document): The document to associate with the anchor
  * - @param length (Number): The starting row position
  * - @param pos (Number): The starting column position
  * - @param others (String):
  * - @param mainClass (String):
  * - @param othersClass (String):
  **/
Instantiable6[
      /* session */ Document, 
      /* length */ Double, 
      /* pos */ Double, 
      /* others */ String, 
      /* mainClass */ String, 
      /* othersClass */ String, 
      PlaceHolder
    ]
     with Instantiable4[
      /* session */ IEditSession, 
      /* length */ Double, 
      /* pos */ Position, 
      /* positions */ js.Array[Position], 
      PlaceHolder
    ]

