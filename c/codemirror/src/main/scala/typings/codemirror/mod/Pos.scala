package typings.codemirror.mod

import typings.codemirror.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("codemirror", "Pos")
@js.native
class Pos protected ()
  extends StObject
     with Position {
  def this(line: Double) = this()
  def this(line: Double, ch: Double) = this()
  def this(line: Double, ch: Double, sticky: String) = this()
  def this(line: Double, ch: Unit, sticky: String) = this()
  
  /* CompleteClass */
  var ch: Double = js.native
  
  /* CompleteClass */
  var line: Double = js.native
}
object Pos {
  
  @scala.inline
  def apply: PositionConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Pos").asInstanceOf[PositionConstructor]
}
